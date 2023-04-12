package topsecret;

public   class F35 implements fighter {
	public void Speed(int speed) {
	    System.out.println("The F35's speed is " + speed + " km/h.");
	  }
	  public void EnginePower(int power) {
	    System.out.println("The F35's engine power is " + power + " knot");
	  }
	  public void Stealth(boolean stealth) {
	    if (stealth) {
	      System.out.println("The F35 is stealthy.");
	    } else {
	      System.out.println("The F35 is not stealthy.");
	    }
	  }
	  public void Radar(String radar) {
	    System.out.println("The F35's radar is " + radar + ".");
	  }
	  public void Weapon(String weapon) {
	    System.out.println("The F35's weapon is " + weapon + ".");
	  }
	  public void engine(String engine) {
	    System.out.println("The F35's engine is " + engine + ".");
	  }
	  public void maxRange(int range) {
	    System.out.println("The F35's maximum range is " + range + " miles.");
	  }
	  
	  public void Avionics(String avionics ) {
	    System.out.println("The F35's avionics are " + avionics + ".");
	  }
	@Override
	public void climbvalue(int climbValue) {
		// TODO Auto-generated method stub
		
	}}
		
		/*  public F35(String engine, int maxRange, int Climbvalue, int speed, int enginePower, boolean stealth, String radar,String Avinoics,
				String weapon) {
			super();
			this.engine = engine;
			engine ="Pratt & Whitney F135 -PW-100 Afterburner turbofan ";
			this.Avinoics=Avinoics;
			Avinoics="Avionics \r\n"
					+ "Northrop Grumman AN/APG-81 active electronically scanning array ( AESA ) radar\r\n"
					+ "BAE Systems AN/ASQ-239 Barracuda Elektronic war System\r\n"
					+ "Northrop Grumman/Raytheon AN/AAQ-37 Distributed Diaphragm System (DAS)\r\n"
					+ "Lockheed Martin AN/AAQ-40 Electro-Optical Targeting System ( EOTS )\r\n"
					+ "Northrop Grumman AN/ASQ-242 Communications, Positioning and Identification (CNI, Communications, Navigation, and Identification) suite\r\n"
					+ "Harris Corporation Multi-Function Advanced Data Link ( MADL ) communication system";
			this.maxRange = maxRange;
			maxRange=2583;
			this.Climbvalue = Climbvalue;
			Climbvalue=18288;
			this.speed = speed;
			speed=1932;
			this.enginePower = enginePower;
			enginePower=125;
			this.stealth = stealth;
			stealth=true;
			this.radar = radar;
			radar="AN/APG-81 AESA ";
			this.weapon = weapon;
					weapon ="Gun: 1 × General Dynamics GAU-22/A Equalizer, 25 mm (0.984 in), 4-barrel gun, with 180 rounds internal [note 15] [233]\r\n"
							+ "Weapon stations: 6 × external gun turrets (6,800 kg capacity) on the wings [233] and two internal interiors with double gun turrets. Total weapon load of 8,100 kg (18,000 lb) [234] with the following combinations;\r\n"
							+ "Missiles :\r\n"
							+ "Air to Air Missile :\r\n"
							+ "AIM-120 AMRAAM\r\n"
							+ "AIM-9 Sidewinder\r\n"
							+ "IRIS-T\r\n"
							+ "MBDA Meteor\r\n"
							+ "Air-to-surface missiles :\r\n"
							+ "AGM-158 JASSM\r\n"
							+ "Brimstone\r\n"
							+ "Lockheed Martin JAGM\r\n"
							+ "Storm Shadow\r\n"
							+ "AS\r\n"
							+ "Anti-ship missile :\r\n"
							+ "Naval Strike Missile JSM\r\n"
							+ "Long Range Anti-Ship Missile (LRASM)\r\n"
							+ "AS\r\n"
							+ "Bombs :\r\n"
							+ "MK-84 , MK-83 , MK-82 General purpose bombs\r\n"
							+ "CBU-100 cluster bomb\r\n"
							+ "Paveway series laser-guided bombs\r\n"
							+ "GBU-39 SDB small caliber bombs\r\n"
							+ "JDAM series\r\n"
							+ "AGM-154 JSOW";
		}}*/

		
