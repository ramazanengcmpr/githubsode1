package topsecret;

import java.util.Scanner;

public class Warsimulation {

	
	
	
	
	public static void main(String[] args) {
		J20 j20 =new J20(2000,147,true,"Type 1475 (KLJ-5) AESA Radar","Internal weapon bays\r\n"
				+ "PL-10 Short Range AAM[219]\r\n"
				+ "PL-12 Medium Range AAM[220]\r\n"
				+ "PL-15 Long Range AAM\r\n"
				+ "PL-21 Very Long Range AAM (future implementation)[220]\r\n"
				+ "LS-6/50 kg and LS-6/100 kg Small-diameter precision-guided bomb (intended)[80]\r\n"
				+ "Anti-radiation missile[85]","2 × Shenyang WS-10C afterburning turbofan", 5500 ,20000,"Type 1475 (KLJ-5) AESA Radar\r\n"
						+ "EOTS-86 electro-optical targeting system (EOTS)[71]\r\n"
						+ "EORD-31 infrared search and track[71]");
		j20.Speed(1932);
		j20.EnginePower(125);
		j20.Stealth(true);
		j20.climbvalue(16000);
		F22 f22=new F22(2414 ,116,true,"AN/APG-77(V)1 AESA radar." ,"Guns: 1× 20 mm M61A2 Vulcan rotary cannon, 480 rounds\r\n"
				+ "Internal weapons bays:\r\n"
				+ "Air-to-air mission loadout:\r\n"
				+ "6× AIM-120C/D AMRAAM or 4× AIM-120A/B AMRAAM\r\n"
				+ "2× AIM-9M/X Sidewinder\r\n"
				+ "Air-to-ground mission loadout:\r\n"
				+ "2× 1,000 lb (450 kg) JDAM or 8× 250 lb (110 kg) GBU-39 SDB\r\n"
				+ "2× AIM-120 AMRAAM\r\n"
				+ "2× AIM-9 Sidewinder"," Pratt & Whitney F119-PW-100 augmented turbofans",3000 ,20000,"AN/APG-77 or AN/APG-77(V)1 AESA radar: 125–150 miles (201–241 km) against 1 m2 (11 sq ft) targets (estimated range), more than 250 miles (400 km) in narrow beams\r\n"
						+ "AN/AAR-56 Missile Launch Detector (MLD)\r\n"
						+ "AN/ALR-94 electronic warfare system: 250 nautical miles (460 km) or more detection range for radar warning receiver (RWR)\r\n"
						+ "Integrated CNI Avionics\r\n"
						+ "MJU-39/40 flares for protection against IR missiles" );
		f22.Speed(1932);
		f22.EnginePower(125);
		f22.Stealth(true);
		f22.climbvalue(16000);
		
		
		YF23 yf23=new YF23(2335 ,160 ,true,"","1 × 20 mm (0.79 in) M61 Vulcan cannon\r\n"
				+ "4 × AIM-120 AMRAAM or AIM-7 Sparrow medium-range air-to-air missiles[11][56]\r\n"
				+ "2 × AIM-9 Sidewinder short-range air-to-air missiles[5","2 × Pratt & Whitney YF119 or General Electric YF120 afterburning turbofan engines"
				,4489 ,20000,"");
		yf23.Speed(1932);
		yf23.EnginePower(125);
		yf23.Stealth(true);
		yf23.climbvalue(16000);
		F35 f35 =new F35(1932,125,true,"AN/APG-81 AESA","Pratt & Whitney F135 -PW-100 Afterburner turbofan","weapon =\"Gun: 1 × General Dynamics GAU-22/A Equalizer, 25 mm (0.984 in), 4-barrel gun, with 180 rounds internal [note 15] [233]\\r\\n\"\r\n"
				+ "							+ \"Weapon stations: 6 × external gun turrets (6,800 kg capacity) on the wings [233] and two internal interiors with double gun turrets. Total weapon load of 8,100 kg (18,000 lb) [234] with the following combinations;\\r\\n\"\r\n"
				+ "							+ \"Missiles :\\r\\n\"\r\n"
				+ "							+ \"Air to Air Missile :\\r\\n\"\r\n"
				+ "							+ \"AIM-120 AMRAAM\\r\\n\"\r\n"
				+ "							+ \"AIM-9 Sidewinder\\r\\n\"\r\n"
				+ "							+ \"IRIS-T\\r\\n\"\r\n"
				+ "							+ \"MBDA Meteor\\r\\n\"\r\n"
				+ "							+ \"Air-to-surface missiles :\\r\\n\"\r\n"
				+ "							+ \"AGM-158 JASSM\\r\\n\"\r\n"
				+ "							+ \"Brimstone\\r\\n\"\r\n"
				+ "							+ \"Lockheed Martin JAGM\\r\\n\"\r\n"
				+ "							+ \"Storm Shadow\\r\\n\"\r\n"
				+ "							+ \"AS\\r\\n\"\r\n"
				+ "							+ \"Anti-ship missile :\\r\\n\"\r\n"
				+ "							+ \"Naval Strike Missile JSM\\r\\n\"\r\n"
				+ "							+ \"Long Range Anti-Ship Missile (LRASM)\\r\\n\"\r\n"
				+ "							+ \"AS\\r\\n\"\r\n"
				+ "							+ \"Bombs :\\r\\n\"\r\n"
				+ "							+ \"MK-84 , MK-83 , MK-82 General purpose bombs\\r\\n\"\r\n"
				+ "							+ \"CBU-100 cluster bomb\\r\\n\"\r\n"
				+ "							+ \"Paveway series laser-guided bombs\\r\\n\"\r\n"
				+ "							+ \"GBU-39 SDB small caliber bombs\\r\\n\"\r\n"
				+ "							+ \"JDAM series\\r\\n\"\r\n"
				+ "							+ \"AGM-154 JSOW\";",2583,18288,"Avinoics=\"Avionics \\r\\n\"\r\n"
						+ "					+ \"Northrop Grumman AN/APG-81 active electronically scanning array ( AESA ) radar\\r\\n\"\r\n"
						+ "					+ \"BAE Systems AN/ASQ-239 Barracuda Elektronic war System\\r\\n\"\r\n"
						+ "					+ \"Northrop Grumman/Raytheon AN/AAQ-37 Distributed Diaphragm System (DAS)\\r\\n\"\r\n"
						+ "					+ \"Lockheed Martin AN/AAQ-40 Electro-Optical Targeting System ( EOTS )\\r\\n\"\r\n"
						+ "					+ \"Northrop Grumman AN/ASQ-242 Communications, Positioning and Identification (CNI, Communications, Navigation, and Identification) suite\\r\\n\"\r\n");
						f35.Speed(1932);
						f35.EnginePower(125);
						f35.Stealth(true);
						f35.climbvalue(16000);
		                f35.Weapon("AN/APG-82");
		TFX tfx=new TFX(2126,131,true,"AN-APG83 GAN","2 × General Electric F110-GE-129 Turbofan","som missile long range", 690,17000,"AN/ALR-56M RWR");
		tfx.Speed(2625);
		tfx.EnginePower(131);
		tfx.Stealth(true);
		tfx.climbvalue(17000);
		tfx.Weapon("Missiles:"
	    		+ "Air-to-air missiles:\r\n"
	    		+ "GÖKTUĞ missile program:\r\n"
	    		+ "Gökdoğan (Peregrine) BVR active radar homing\r\n"
	    		+ "Gökhan BVR active radar homing\r\n"
	    		+ "Akdoğan (Peregrine) BVR active radar homing\r\n"
	    		+ "Bozdoğan (Merlin) short-range infrared homing\r\n"
	    		+ "MBDA Meteor (BVRAAM)\r\n"
	    		+ "Air-to-surface missiles:\r\n"
	    		+ "SOM Cruise Missile (B1, B2, and J variants)\r\n"
	    		+ "KUZGUN-TJ, Turbojet-powered Air-to-surface missile\r\n"
	    		+ "KUZGUN-KY, Solid fuel Rocket-powered Air-to-surface missile\r\n"
	    		+ "KUZGUN-ER, Turbojet-powered, Air-to-surface missile (According to TUBITAK-SAGE, this missile will be equivalent to Penguin Missiles.)[71]\r\n"
	    		+ "KUZGUN-EW, KUZGUN-EW will be able to carry miniaturised EW payload which will act as a stand-in jammer and suppress enemy air defences to significantly increase the survivability of the aircraft of the Turkish Air Force.[72]\r\n"
	    		+ "AKBABA, Air-to-surface, Anti-radiation Missile (ARM)\r\n"
	    		+ "ROKETSAN ÇAKIR Missile Family, Anti-ship, Air-to-surface, surface-to-surface Cruise Missile.[73]\r\n"
	    		+ "MBDA SPEAR-3\r\n");
		  tfx.engine("F110 GE-129 or  F100 PW229");
		    tfx.maxRange(4200);
		    tfx.climbvalue(15400);
		    tfx.Avionics("IRFS (AESA Radar, Electronic Warfare (EW))\r\n"
    	    		+ "Advanced Navigation Features (ICNI)\r\n"
    	    		+ "Integrated Electro-Optical Systems (IEOS) (Infrared Search and Track (IRST), Electro-Optical Targeting System (EOTS) etc.)\r\n"
    	    		+ "Advanced Cockpit / Human Machine Interface");
		
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
		    	if(tfx.getSpeed()>f15.getSpeed()) {
		    		System.out.println("tfx faster than f15");
		    	}
		    	else if (tfx.getSpeed()<f15.getSpeed()) {
		    		System.out.println("f15 faster than tfx");
		    	}
		    	else {
		    		System.out.println("tfx and f15 have the same speed");
		    	}
		    	 if (f16.getSpeed() > tfx.getSpeed()) {
			    	  System.out.println("F16 is faster than TFX");
			    	} else if (tfx.getSpeed() < f16.getSpeed()) {
			    	  System.out.println("tfx is faster than F16");
			    	} else {
			    	  System.out.println("F16 and TFX have the same speed");
			    	}
		    	 if (f16.getPower() > tfx.getPower()) {
			    	  System.out.println("F16 has more engine power than TFX");
			    	} else if (tfx.getPower() < f16.getPower()) {
			    	  System.out.println("TFX has more engine power than F16");
			    	} else {
			    	  System.out.println("F16 and TFX have the same engine power");
			    	}
		    	 if (f15.getPower() > tfx.getPower()) {
			    	  System.out.println("F15 has more engine power than TFX");
			    	} else if (tfx.getPower() < f15.getPower()) {
			    	  System.out.println("TFX has more engine power than F15");
			    	} else {
			    	  System.out.println("F15 and TFX have the same engine power");
			    	}
		    	 if (f16.getRange() > f15.getRange()) {
			    	  System.out.println("F16 's have range longer  than F15");
			    	} else if (f16.getRange() < f15.getRange()) {
			    	  System.out.println("F15's have range longer than F16");
			    	} else {
			    	  System.out.println("F16 and F15 have the same range");
			    	}
		    	 if (f16.getRange() > tfx.getRange()) {
			    	  System.out.println("F16 's have range longer  than TFX");
			    	} else if (tfx.getRange() < f16.getRange()) {
			    	  System.out.println("TFX's have range longer than F16");
			    	} else {
			    	  System.out.println("F16 and TFX have the same range");
			    	}
		    	 
	
	 if (f15.getRange() > tfx.getRange()) {
   	  System.out.println("F15 's have range longer  than TFX");
   	} else if (tfx.getRange() < f15.getRange()) {
   	  System.out.println("TFX's have range longer than F15");
   	} else {
   	  System.out.println("F15 and TFX have the same range");
   	}
	 if (f35.getSpeed() > tfx.getSpeed()) {
   	  System.out.println("F35 is faster than tfx");
   	} else if (f35.getSpeed() < tfx.getSpeed()) {
   	  System.out.println("F35 is faster than tfx");
   	} else {
   	  System.out.println("F35 and tfx have the same speed");
   	}

   	if (f35.getPower() > tfx.getPower()) {
   	  System.out.println("F35has more engine power than tfx");
   	} else if (f35.getPower() < tfx.getPower()) {
   	  System.out.println("F35 has more engine power than tfx");
   	} else {
   	  System.out.println("F35 and tfx have the same engine power");
   	}
   	
   	if (yf23.getRange() > tfx.getRange()) {
     	  System.out.println("yf23 's have range longer  than TFX");
     	} else if (yf23.getRange() < tfx.getRange()) {
     	  System.out.println("TFX's have range longer than yf23");
     	} else {
     	  System.out.println("yf23 and TFX have the same range");
     	}
  	 if (yf23.getSpeed() > tfx.getSpeed()) {
     	  System.out.println("yf23 is faster than tfx");
     	} else if (yf23.getSpeed() < tfx.getSpeed()) {
     	  System.out.println("yf23 is faster than tfx");
     	} else {
     	  System.out.println("yf23 and tfx have the same speed");
     	}

     	if (yf23.getPower() > tfx.getPower()) {
     	  System.out.println(" yf23 has more engine power than tfx");
     	} else if (yf23.getPower() < tfx.getPower()) {
     	  System.out.println("yf23 has more engine power than tfx");
     	} else {
     	  System.out.println("yf23 and tfx have the same engine power");
     	}
     	
       	if (yf23.getRange() > f22.getRange()) {
         	  System.out.println("yf23 's have range longer  than raptor ");
         	} else if (yf23.getRange() < f22.getRange()) {
         	  System.out.println("yf23's have range longer than raptor ");
         	} else {
         	  System.out.println("yf23 and raptor have the same range");
         	}
      	 if (yf23.getSpeed() > f22.getSpeed()) {
         	  System.out.println("yf23 is faster than tfx");
         	} else if (yf23.getSpeed() < f22.getSpeed()) {
         	  System.out.println("yf23 is faster than tfx");
         	} else {
         	  System.out.println("yf23 and tfx have the same speed");
         	}

         	if (yf23.getPower() > f22.getPower()) {
         	  System.out.println(" yf23 has more engine power than raptor ");
         	} else if (yf23.getPower() < f22.getPower()) {
         	  System.out.println("f22 has more engine power than yf23");
         	} else {
         	  System.out.println("yf23 and raptor have the same engine power");
         	}
         	   	 

           	if (j20.getRange() > f22.getRange()) {
             	  System.out.println("j20 's have range longer  than raptor ");
             	} else if (j20.getRange() < f22.getRange()) {
             	  System.out.println("f22's have range longer than j20 ");
             	} else {
             	  System.out.println("j20 and raptor have the same range");
             	}
          	 if (j20.getSpeed() > f22.getSpeed()) {
             	  System.out.println("j20 is faster than f22");
             	} else if (j20.getSpeed() < f22.getSpeed()) {
             	  System.out.println("raptor is faster than j20 ");
             	} else {
             	  System.out.println("j20  and raptor  have the same speed");
             	}

             	if (j20.getPower() > f22.getPower()) {
             	  System.out.println(" j20 has more engine power than raptor ");
             	} else if (j20.getPower() < f22.getPower()) {
             	  System.out.println("f22 has more engine power than j20");
             	} else {
             	  System.out.println("j20 and raptor have the same engine power");
             	}
             	   	 
		  }
	}


