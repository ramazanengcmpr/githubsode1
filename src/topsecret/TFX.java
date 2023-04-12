package topsecret;

public abstract class TFX implements fighter {	
public void Speed(int speed) {
    System.out.println("The F16's speed is " + speed + " km/h.");
  }
  public void EnginePower(int power) {
    System.out.println("The F16's engine power is " + power + " knot");
  }
  public void Stealth(boolean stealth) {
    if (stealth) {
      System.out.println("The F16 is stealthy.");
    } else {
      System.out.println("The F16 is not stealthy.");
    }
  }
  public void Radar(String radar) {
    System.out.println("The F16's radar is " + radar + ".");
  }
  public void Weapon(String weapon) {
    System.out.println("The F16's weapon is " + weapon + ".");
  }
  public void engine(String engine) {
    System.out.println("The F16's engine is " + engine + ".");
  }
  public void maxRange(int range) {
    System.out.println("The F16's maximum range is " + range + " miles.");
  }
  public void Climbvalue(int ClimbValue) {
    System.out.println("The F16's climb value is " + ClimbValue + ".");
  }
  public void Avionics(String avionics ) {
    System.out.println("The F16's avionics are " + avionics + ".");
  }}