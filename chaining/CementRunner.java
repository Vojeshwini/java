class CementRunner{
public static void main(String[] args){
String name = "ACC";
    double price = 350.0;
    boolean isExpired = false;
    boolean aluminaContent = true;
    double settingTime = 30.0;
    String mdf = "25-03-2025";
    double waterCementRatio = 0.45;
    double heatOfHydration = 300.0;
    String color = "Gray";
    double limeContent = 63.0;
	
Cement cement=new Cement();
Cement cement1=new Cement(name);
Cement cement2=new Cement(name,price);
Cement cement3=new Cement(name,price,isExpired);
Cement cement5=new Cement(name,price,isExpired,aluminaContent);
Cement cement6=new Cement(name,price,isExpired,aluminaContent,settingTime);
Cement cement7=new Cement(name,price,isExpired,aluminaContent,settingTime,mdf);
Cement cement8=new Cement(name,price,isExpired,aluminaContent,settingTime,mdf,waterCementRatio);
Cement cement9=new Cement(name,price,isExpired,aluminaContent,settingTime,mdf,waterCementRatio,heatOfHydration);
Cement cement10=new Cement(name,price,isExpired,aluminaContent,settingTime,mdf,waterCementRatio,heatOfHydration,color);
Cement cement11=new Cement(name,price,isExpired,aluminaContent,settingTime,mdf,waterCementRatio,heatOfHydration,color,limeContent);

cement.info();
cement1.info();

cement2.info();

cement3.info();



cement5.info();

cement6.info();

cement7.info();

cement8.info();

cement9.info();

cement10.info();

cement11.info();





}



	
	
	
	
}









