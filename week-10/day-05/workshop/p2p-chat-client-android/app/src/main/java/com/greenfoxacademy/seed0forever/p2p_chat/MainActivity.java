package com.greenfoxacademy.seed0forever.p2p_chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.greenfoxacademy.seed0forever.p2p_chat.adapter.MessageAdapter;
import com.greenfoxacademy.seed0forever.p2p_chat.model.Message;
import com.greenfoxacademy.seed0forever.p2p_chat.model.rest.MessageResponse;
import com.greenfoxacademy.seed0forever.p2p_chat.service.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ApiService service;
    private MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageAdapter = new MessageAdapter(this);

        Button sendButton = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.editText);
        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(messageAdapter);

        sendButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                messageAdapter.add(new Message("Aze", editText.getText().toString()));
            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://p2p-chat-seed0forever.herokuapp.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        service = retrofit.create(ApiService.class);


        service.getMessages().enqueue(new Callback<MessageResponse>() {

            @Override
            public void onResponse(Call<MessageResponse> call, Response<MessageResponse> response) {

                MessageResponse messageResponse = response.body();
                messageAdapter.clear();
                messageAdapter.addAll(messageResponse.getMessages());

            }

            @Override
            public void onFailure(Call<MessageResponse> call, Throwable t) {
            }
        });
    }
}
