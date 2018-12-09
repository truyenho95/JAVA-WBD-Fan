package fan.model;

public class Fan {
  public static final Object SLOW = 1;
  public static final Object MEDIUM = 2;
  public static final Object FAST = 3;

  private Object speed;
  private boolean on;
  private double radius;
  private String color;

  public Fan() {
    this.speed = SLOW;
    this.on = false;
    this.radius = 5;
    this.color = "blue";
  }

  public Fan(Object speed, boolean on, double radius, String color) {
    this.speed = speed;
    this.on = on;
    this.radius = radius;
    this.color = color;
  }

  public Object getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    if (isOn())
      return "Fan {Speed: "+getSpeed()+", Color: "+getColor()+", Radius: "+getRadius()+"}.\nFan is on";
    else
      return "Fan {Color: "+getColor()+", Radius: "+getRadius()+"}.\nFan is off";
  }
}
