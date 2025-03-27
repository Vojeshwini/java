class Granite{

String color;
String price;
double density;
 boolean polishability;
 String texture; 
    boolean weatheringResistance;
	   double volume;
	double grainSize; 
	   double waterAbsorptionRate;
	    double hardness;
		
		
		public Granite(){
			
		}
		public Granite(String color){
			this.color=color;
		}
		
		public Granite(String color,String price){
			this(color);
			this.price=price;
		}
		
		public Granite(String color,String price,double density){
			this(color,price);
			this.density=density;
		}
		
		public Granite(String color,String price,double density, boolean polishability){
			this(color,price,density);
			this.polishability=polishability;
		}
		
		public Granite(String color,String price,double density, boolean polishability, String texture){
			this(color,price,density,polishability);
			this.texture=texture;
		}
		
		public Granite(String color,String price,double density, boolean polishability, String texture, boolean weatheringResistance){
			this(color,price,density,polishability,texture);
			this.weatheringResistance=weatheringResistance;
		}
		
		public Granite(String color,String price,double density, boolean polishability, String texture, boolean weatheringResistance,   double volume){
			this(color,price,density,polishability,texture,weatheringResistance);
			this.volume=volume;
		}
		
		
		public Granite(String color,String price,double density, boolean polishability, String texture, boolean weatheringResistance,   double volume,	double grainSize){
			this(color,price,density,polishability,texture,weatheringResistance,volume);
			this.grainSize=grainSize;
		}
		
		
		
		public Granite(String color,String price,double density, boolean polishability, String texture, boolean weatheringResistance,   double volume,	double grainSize, double waterAbsorptionRate){
		
			this(color,price,density,polishability,texture,weatheringResistance,volume,grainSize);
			this.waterAbsorptionRate=waterAbsorptionRate;
		}
		
		public Granite(String color,String price,double density, boolean polishability, String texture, boolean weatheringResistance,   double volume,	double grainSize, double waterAbsorptionRate,double hardness){
			
			
			this(color,price,density,polishability,texture,weatheringResistance,volume,grainSize,waterAbsorptionRate);
			this.hardness=hardness;
		
		}
		
		
			public void info(){
	System.out.println("color"+this.color);
	System.out.println("price"+this.price);
	System.out.println("density"+this.density);
	System.out.println("polishability"+this.polishability);
	System.out.println("texture"+this.texture);
	System.out.println("weatheringResistance"+this.weatheringResistance);
	System.out.println("volume"+this.volume);
	System.out.println("grainSize"+this.grainSize);
	System.out.println("waterAbsorptionRate"+this.waterAbsorptionRate);
	System.out.println("hardness"+this.hardness);
	
			
			
			
			}


}