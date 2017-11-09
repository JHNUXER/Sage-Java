package sagejava.ini;

import java.util.*;

public class INIObject {
  private ArrayList<ArmorSet> armorSets = new ArrayList<ArmorSet>();
  
  private HashMap<String,Behavior> behaviors = new HashMap<String,Behavior>
  private HashMap<String,Body> bodys = new HashMap<String,Body>();
  public boolean buildable;
  public String buildCompletion
  public int buildCost;
  public int buildTime;
  public String buttonImage;
  public String camoflageDetectionMultiplayer;
  public int campnessValue;
  public int campnessValueRadius;
  public String deploy;
  public String disguiseRevealedFailure;
  public String disguiseRevealedSuccess;
  public String disguiseStarted;
  public String displayColor;
  private HashMap<String,Draw> draws = new HashMap<String,Draw>();
//  public String editorSorting;
  public int energyProduction;
  public String experienceScalarTable;
  public String geometry;
  public float geometryHeight;
  public boolean geometryIsSmall;
  public float geometryMajorRadius;
  public float geometryMinorRadius;
  
  public ArrayList<InheritableModule> inheritableModules = new ArrayList<InheritableModule>();
  public boolean isBridge;
  public boolean isForbidden;
  public boolean isPrerequisite;

  public String kindOf;

  public float placementViewAngle;
  
  public String radarPriority;
  public int refundValue;
  
  public float scale;
  public String selectPortrait;
  public String shadow;
//  public String side;
  public String soundAmbientBattle;
  public String soundAmbientDamaged;
  public String soundAmbientReallyDamaged;
  public String soundAmbientRubble;
  public String soundEnter;
  public String soundExit;
  public String soundCreated;
  public String soundCrushing;
  public String soundFallingFromPlane;
  public String soundImpact;
  public String soundImpactCyclonic;
  public String soundMoveLoop;
  public String soundMoveLoopDamaged;
  public String soundMoveStart;
  public String soundMoveStartDamaged;
  public String soundOnDamaged;
  public String soundOnReallyDamaged;
  public String soundPromotedElite;
  public String soundPromotedHero;
  public String soundPromotedVeteran;
  public String soundStealthOn;
  public String soundStealthOff;
  
  public int transportSlotCount;
  public String turretMoveLoop;

  public String undeploy;
  public String underconstruction;
  public String underRepairFromDamage;
  public String underRepairFromRubble;
  public String upgradeCameo1;
  public String upgradeCameo2;
  public String upgradeCameo3;
  public String upgradeCameo4;
  public String upgradeCameo5;

  public float visionRange;
  public String voiceAlert;
  public String voiceAttack;
  public String voiceAttackAir;
  public String voiceAttackCharge;
  public String voiceAttackMachine;
  public String voiceAttackStructure;
  private HashMap<String,String> voiceAttackUnit = new HashMap<String,String>();
  public String voiceBombard;
  public String voiceBuildResponse;
  public String voiceCaptureBuildingComplete;
  public String voiceCombatDrop;
  public String voiceCombinedWithHorde;
  public String voiceCreated;
  public String voiceCrush;
  public String voiceDefect;
  public String voiceDeliverRing;
  public String voiceEnter;
  public String voiceEnterHostile;
  public String voiceEnterStateAttack;
  public String voiceEnterStateAttackAir;
  public String voiceEnterStateAttackCharge;
  public String voiceEnterStateAttackMachine;
  public String voiceEnterStateAttackStructure;
  public String voiceEnterStateInitiateCaptureBuilding;
  public String voiceEnterStateMove;
  public String voiceEnterStateMoveToHigherGround;
  public String voiceEnterStateMoveToCamp;
  public String voiceEnterStateMoveWhileAttacking;
  public String voiceEnterStateRetreatToCastle;
  private HashMap<String,String> voiceEnterUnit = new HashMap<String,String>();
  public String voiceFullyCreated;
  public String voiceFear;
  public String voiceGarrison;
  public String voiceGetHealed;
  public String voiceGuard;
  public String voice InitiateCaptureBuilding;
  public String voiceMove;
  public String voiceMoveOverWalls;
  public String voiceMoveToCamp;
  public String voiceMoveToHigherGround;
  public String voiceMoveWhileAttacking;
  public String voiceNoBuild;
  public String voicePrimaryWeaponMode;
  public int voicePriority;
  public String voiceRapidFire;
  public String voiceRepair;
  public String voiceRetreatToCastle;
  public String voiceSalvage;
  public String voiceSecondaryWeaponMode;
  public String voiceSelect;
  public String voiceSelectBattle;
  public String voiceSendToSlaughterHouse;
  public String voiceSupply;
  public String voiceTaskComplete;
  public String voiceTertiaryWeaponMode;
  public String voiceUnload;

  private ArrayList<WeaponSet> weaponSets = new List<WeaponSet>();
  
  public void addArmorSet(ArmorSet set) {
    armorSets.add(set);
  }

  public void addBehavior(String name,Behavior b) {
    behaviors.put(name,b);
  }
  public void addBody(String name,Body b) {
    bodys.put(name,b);
  }
  public void addDraw(String name,Draw d) {
    draws.put(name,d);
  }
  
  class Animation {
    public int animationBlendTime;
    public String animationMode;
    public boolean //Stopped Here
  }
}
