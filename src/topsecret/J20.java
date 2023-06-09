package topsecret;

public  class J20 implements fighter {
	 private int speed;
	  private int power;
	  private boolean stealth;
	  private String radar;
	  private String weapon;
	  private String engine;
	  private int range;
	  private int climbValue;
	  private String avionics;
	public J20(int speed, int power, boolean stealth, String radar, String weapon, String engine, int range,
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

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public boolean isStealth() {
		return stealth;
	}

	public void setStealth(boolean stealth) {
		this.stealth = stealth;
	}

	public String getRadar() {
		return radar;
	}

	public void setRadar(String radar) {
		this.radar = radar;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getClimbValue() {
		return climbValue;
	}

	public void setClimbValue(int climbValue) {
		this.climbValue = climbValue;
	}

	public String getAvionics() {
		return avionics;
	}

	public void setAvionics(String avionics) {
		this.avionics = avionics;
	}

	public void Speed(int speed) {
		
	    System.out.println("The 's speed is " + speed + "  2 mach ");
	  }
	  public void EnginePower(int power) {
	    System.out.println("The  J20's engine power is " + power + " 142–147 knot");
	  }
	  public void Stealth(boolean stealth) {
	    if (stealth) {
	      System.out.println("The  J20 is stealthy.");
	    } else {
	      System.out.println("The  J20 is not stealthy.");
	    }
	  }
	  public void Radar(String radar) {
	    System.out.println("The  J20's radar is " + radar + ". Type 1475 (KLJ-5) AESA Radar");
	  }
	  public void Weapon(String weapon) {
	    System.out.println("The  J20's weapon is " + weapon + ".");
	  }
	  public void engine(String engine) {
	    System.out.println("The  J20's engine is " + engine + ".: 2 × Shenyang WS-10C afterburning turbofan,");
	  }
	  public void maxRange(int range) {
	    System.out.println("The  J20's maximum range is " + range + " 3400 miles.");
	  }
	 
	  public void Avionics(String avionics ) {
	    System.out.println("The  J20's avionics are " + avionics + ".");
	  }
	@Override
	public void climbvalue(int climbValue) {
		// TODO Auto-generated method stub
		
	}
	

}
