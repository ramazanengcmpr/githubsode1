package topsecret;

public   class F15  implements fighter{
	 private int speed;
	  private int power;
	  private boolean stealth;
	  private String radar;
	  private String weapon;
	  private String engine;
	  private int range;
	  private int climbValue;
	  private String avionics;
	public F15(int speed, int power, boolean stealth, String radar, String weapon, String engine, int range,
			int climbValue, String avionics) {
		super();
		this.speed = speed;
		this.power = power;
		this.stealth = stealth;
		this.radar = radar;
		this.weapon = weapon;
		this.engine = engine;
		this.range = range;
		this.climbValue = climbValue;
		this.avionics = avionics;
	}
	
	public int getSpeed() {
		return speed;
	}

	public int getPower() {
		return power;
	}

	public boolean isStealth() {
		return stealth;
	}

	public String getRadar() {
		return radar;
	}

	public String getWeapon() {
		return weapon;
	}

	public String getEngine() {
		return engine;
	}

	public int getRange() {
		return range;
	}

	public int getClimbValue() {
		return climbValue;
	}

	public String getAvionics() {
		return avionics;
	}

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
	 
	  public void Avionics(String avionics ) {
	    System.out.println("The F16's avionics are " + avionics + ".");
	  }

	@Override
	public void climbvalue(int climbValue) {
		// TODO Auto-generated method stub
		
	}}
