class Cement{
String name;
double price;
boolean isExpired;
boolean aluminaContent;
double settingTime ;
String mdf;
double waterCementRatio;
  double heatOfHydration;
 String color;
   double limeContent;



public Cement(){
	
}
public Cement(String name){

this.name=name;
}
   public Cement(String name,double price){
	   this(name);
	   this.price=price;
   }
   public Cement(String name,double price,boolean isExpired){
	   this(name,price);
	   this.isExpired=isExpired;
   }
   public Cement(String name,double price,boolean isExpired,boolean aluminaContent){
	   this(name,price,isExpired);
	   this.aluminaContent=aluminaContent;
   }
   public Cement(String name,double price,boolean isExpired,boolean aluminaContent,double settingTime){
	   	   this(name,price,isExpired,aluminaContent);
		   this.settingTime=settingTime;

   }
   public Cement(String name,double price,boolean isExpired,boolean aluminaContent,double settingTime,String mdf){
	   	   	   this(name,price,isExpired,aluminaContent,settingTime);
               this.mdf=mdf;
   }
   public Cement(String name,double price,boolean isExpired,boolean aluminaContent,double settingTime,String mdf,double waterCementRatio){
	    this(name,price,isExpired,aluminaContent,settingTime,mdf);
		this.waterCementRatio=waterCementRatio;
		
   }
   public Cement(String name,double price,boolean isExpired,boolean aluminaContent,double settingTime,String mdf,double waterCementRatio,double heatOfHydration){
	    this(name,price,isExpired,aluminaContent,settingTime,mdf,waterCementRatio); 
		this.heatOfHydration=heatOfHydration;
   }

public Cement(String name,double price,boolean isExpired,boolean aluminaContent,double settingTime,String mdf,double waterCementRatio,double heatOfHydration,String color){
	    this(name,price,isExpired,aluminaContent,settingTime,mdf,waterCementRatio,heatOfHydration); 
		this.color=color;
   }
   public Cement(String name,double price,boolean isExpired,boolean aluminaContent,double settingTime,String mdf,double waterCementRatio,double heatOfHydration,String color,   double limeContent){
	    this(name,price,isExpired,aluminaContent,settingTime,mdf,waterCementRatio,heatOfHydration,color); 
		this.limeContent=limeContent;
   }

   
   public void info(){
	   
	   System.out.println("name"+this.name);
	      System.out.println("price"+this.price);
		     System.out.println("info"+this.isExpired);
			    System.out.println("aluminaContent"+this.aluminaContent);
				   System.out.println("settingTime"+this.settingTime);
				      System.out.println("mdf"+this.mdf);
					     System.out.println("waterCementRatio"+this.waterCementRatio);
						    System.out.println("heatOfHydration"+this.heatOfHydration);
							   System.out.println("color"+this.color);
							      System.out.println("limeContent"+this.limeContent);
								  
	   
	   
	   
	   
   }

}