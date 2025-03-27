class Tab{

String brand;
String model;
int Price;
String mfdDate;
int id;
double ScreenSize;
int batteryCapacity;
 double weight;
 String color;
boolean isWaterResistant;
  boolean supports5G;
      boolean hasFastCharging;
    int ramSize;
	 boolean hasFaceUnlock;
	  boolean hasFingerprintSensor;
	  
 boolean supportsWiFi6;
   boolean hasPinUnlock;

boolean supportsExpandableStorage;
String warrantyOfTable;

 public Tab(String brand,String model,int Price,String mfdDate,int id,double ScreenSize,int batteryCapacity,double weight,String color,boolean isWaterResistant,boolean supports5G,boolean hasFastCharging,int ramSize,boolean hasFaceUnlock,boolean hasFingerprintSensor,boolean supportsWiFi6,boolean hasPinUnlock,boolean supportsExpandableStorage,String warrantyOsTable)
{
System.out.println("tab details");

 this.brand=brand;
this.model=model;
this.Price=Price;
this.mfdDate=mfdDate;
this.id=id;
this.ScreenSize=ScreenSize;
this.batteryCapacity=batteryCapacity;
this.weight=weight;
this.color=color;
this.isWaterResistant = isWaterResistant;
this.supports5G = supports5G;
        this.hasFastCharging = hasFastCharging;
        this.ramSize = ramSize;
        this.hasFaceUnlock = hasFaceUnlock;
        this.hasFingerprintSensor = hasFingerprintSensor;
        this.supportsWiFi6 = supportsWiFi6;
        this.hasPinUnlock = hasPinUnlock;
        this.supportsExpandableStorage = supportsExpandableStorage;
        this.warrantyOfTable = warrantyOfTable;
}

}