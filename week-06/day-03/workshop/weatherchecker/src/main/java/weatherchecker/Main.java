package weatherchecker;

import weatherchecker.controller.ArgumentHandler;

public class Main {

  public static void main(String[] args) {
    ArgumentHandler argumentHandler = new ArgumentHandler();
    argumentHandler.handleArguments(args);
  }
}
