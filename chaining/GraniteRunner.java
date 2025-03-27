class GraniteRunner{
public static void main(String[] args){
String color="Black";
 String price = "80 rs per m ";
        double density = 8.9;
        boolean polishability = true;
        String texture = "Coarse-grained";
        boolean weatheringResistance = true;
        double volume = 9.5;
        double grainSize = 65.0;
        double waterAbsorptionRate = 0.1;
        double hardness = 13.0;
    


Granite granite1=new Granite();

Granite granite2=new Granite(color);

Granite granite3=new Granite(color,price);
Granite granite4=new Granite(color,price,density);
Granite granite5=new Granite(color,price,density,polishability);

Granite granite6=new Granite(color,price,density,polishability,texture);
Granite granite7=new Granite(color,price,density,polishability,texture,weatheringResistance);
Granite granite8=new Granite(color,price,density,polishability,texture,weatheringResistance,volume);
Granite granite9=new Granite(color,price,density,polishability,texture,weatheringResistance,volume,grainSize);
Granite granite10=new Granite(color,price,density,polishability,texture,weatheringResistance,volume,grainSize,waterAbsorptionRate);

Granite granite11=new Granite(color,price,density,polishability,texture,weatheringResistance,volume,grainSize,waterAbsorptionRate,hardness);

granite1.info();

granite2.info();

granite3.info();

granite4.info();

granite5.info();

granite6.info();

granite7.info();

granite8.info();

granite9.info();

granite10.info();

granite11.info();
}




}