package com.greenfox.seed0forever.interviewpractice;

import com.greenfox.seed0forever.interviewpractice.trickyquestions.overriding.Overrider;
import com.greenfox.seed0forever.interviewpractice.trickyquestions.overriding.WhatIsOverridable;

public class MainApp {

  public static void main(String[] args) {
    WhatIsOverridable whatIsOverridable = new WhatIsOverridable();
    Overrider overrider = new Overrider();

    executeZeroDivisionExperiment();


    String cats = "My cat";
    System.out.println(cats == "My cat");

    String myString = new String("How many objects?");
    System.out.println(myString);
    System.out.println(myString == "How many objects?");
  }

  private static void executeZeroDivisionExperiment() {
    System.out.println(1.0 / 0.0);

    Object zeroDivisionExperiment = -1.0 / 0.0;
    System.out.println(zeroDivisionExperiment.getClass().getTypeName());
    System.out.println((Double) zeroDivisionExperiment * 5);
  }
}
