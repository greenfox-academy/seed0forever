package com.greenfox.seed0forever.caloriecounter.model.rest.status;

import com.greenfox.seed0forever.caloriecounter.model.rest.RestMessage;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
@Data
public class ErrorRestMessage implements RestMessage {

  private final String status;

  @NonNull
  private String message;

  public ErrorRestMessage() {
    this.status = "error";
  }

}
