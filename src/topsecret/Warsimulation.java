package topsecret;

public class Warsimulation {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		F15 f15 = new F15(2655, 129, false, "AN/APG-82", "Guns: 1× 20 mm (0.787 in) M61A1 Vulcan 6-barreled Gatling cannon, 500 rounds of either M-56 or PGU-28 ammunition,Missiles:\r\n"
				+ "Air-to-air missiles:\r\n"
				+ "4× AIM-7 Sparrow\r\n"
				+ "4× AIM-9 Sidewinder\r\n"
				+ "8× AIM-120 AMRAAM\r\n"
				+ "AIM-260 JATM (To be integrated)\r\n"
				+ "Air-to-surface missiles:\r\n"
				+ "6× AGM-65 Maverick\r\n"
				+ "2× AGM-84 Harpoon\r\n"
				+ "2× AGM-84H/K SLAM-ER\r\n"
				+ "AGM-88 HARM\r\n"
				+ "AGM-130\r\n"
				+ "AGM-154 JSOW\r\n"+ "AGM-158 JASSM\r\n", "2 × F100-PW-229", 2400, 15000, "Radar:\r\n"
						+ "Raytheon AN/APG-70 or AN/APG-82\r\n"
						+ "AN/ASQ-236 Radar Pod[196]\r\n"
						+ "Targeting pods:\r\n"
						+ "LANTIRN or Lockheed Martin Sniper XR or AN/AAQ-28(V) Litening targeting pods\r\n"
						+ "Countermeasures:\r\n"
						+ "Northrop Grumman Electronic Systems AN/ALQ-131 electronic countermeasures pod[197]\r\n"
						+ "Hazeltine AN/APX-76 or Raytheon AN/APX-119 Identify Friend/Foe (IFF) interrogator[198]\r\n"
						+ "Magnavox AN/ALQ-128 Electronic Warfare Warning Set (EWWS) – part of Tactical Electronic Warfare Systems (TEWS)[197]\r\n"
						+ "Loral AN/ALR-56 Radar warning receivers (RWR) – part of TEWS[199]\r\n"
						+ "Northrop Grumman Electronic Systems ALQ-135 Internal Countermeasures System (ICS) – part of TEWS[197]\r\n"
						+ "Marconi AN/ALE-45 Chaff/Flares dispenser system – part of TEWS[200]\r\n");
						f15.Speed(2655);
						f15.EnginePower(129);
						f15.Stealth(false);
						f15.climbvalue(16000);
		                f15.Weapon("AN/APG-82");
		                
		F16 f16 = new F16(1500, 3000, false, "APG-80", "AIM-120 AMRAAM", "F100-PW-220", 2950, 50, "AN/APG-68(V)9");
		    f16.Speed(2100);
		    f16.EnginePower(106);
		    f16.Stealth(false);
		    f16.Radar("APG 83 AESA");
		    f16.Weapon("AIM-120 AMRAAM,gun : 20 mm M61A1 Vulcan\"\r\n"
		    		+ "		+ \"6 x AIM-9 Sidewinder\"\r\n"
		    		+ "		+ \"6 x AIM-120 AMRAAM\"\r\n"
		    		+ "		+ \"6 x Python-4\"\r\n"
		    		+ "		+ \"4 x R.550 Magic II\"\r\n"
		    		+ "		+ \"4 x IRIS-T\"\r\n"
		    		+ "		+ \"Air-to-Terrain Assault Missiles\"\r\n"
		    		+ "		+ \"6 × AGM-65 Maverick\"\r\n"
		    		+ "		+ \"4 × AGM-88 HARM\"\r\n"
		    		+ "		+ \"2 × AGM-154 JSOW\"\r\n"
		    		+ "		+ \"2 × AGM-158 JASSM\"\r\n"
		    		+ "		+ \"4 × BLU-107 Durandal\"\r\n"
		    		+ "		+ \"2 × AS-30L\"\r\n"
		    		+ "		+ \"2 × AGM-142 Have Nap (Popeye II)\"\r\n"
		    		+ "		+ \"2 x SOM A/B1/B2\"\r\n"
		    		+ "		+ \"ship attack missiles\"\r\n"
		    		+ "		+ \"AGM-119A Penguin\"\r\n"
		    		+ "		+ \"2 × AGM-84 Harpoon\"\r\n"
		    		+ "		+ \"2 × AGM-84K SLAM-ER\"\r\n"
		    		+ "		+ \"2 × SOM-J\"\r\n"
		    		+ "		+ \"Bombs\"\r\n"
		    		+ "		+ \"GBU-10 Paveway II, GBU-12 Paveway II, GBU-24 Paveway III laser guided bombs\"\r\n"
		    		+ "		+ \"Mk-20 Rockeye, CBU-52/58/71/87/89/97 bunch bombs\"\r\n"
		    		+ "		+ \"CBU-103, CBU-105 WCMD\"\r\n"
		    		+ "		+ \"BLU-109\"\r\n"
		    		+ "		+ \"MK-81, MK-82, MK-83, MK-84 general purpose bombs\"\r\n"
		    		+ "		+ \"BLU-109, GBU-3\"\r\n"
		    		+ "		+ \"GAU-3A 70 mm (2.76 inç) Rockets pod\"\r\n"
		    		+ "		+ \"Nucleer Bomb\"");
		    f16.engine("F110 GE-129 or  F100 PW229");
		    f16.maxRange(4200);
		    f16.climbvalue(15400);
		    f16.Avionics("AN/ALR-56M RWR");
		    if (f16.getSpeed() > f15.getSpeed()) {
		    	  System.out.println("F16 is faster than F15");
		    	} else if (f16.getSpeed() < f15.getSpeed()) {
		    	  System.out.println("F15 is faster than F16");
		    	} else {
		    	  System.out.println("F16 and F15 have the same speed");
		    	}

		    	if (f16.getPower() > f15.getPower()) {
		    	  System.out.println("F16 has more engine power than F15");
		    	} else if (f16.getPower() < f15.getPower()) {
		    	  System.out.println("F15 has more engine power than F16");
		    	} else {
		    	  System.out.println("F16 and F15 have the same engine power");
		    	}
		    	
		  }}


