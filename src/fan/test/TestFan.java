package fan.test;

import fan.model.Fan;

public class TestFan {
  public static void main(String[] args) {
    Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
    Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");

    System.out.println(fan1);
    System.out.println(fan2);
  }
}
