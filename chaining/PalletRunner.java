class PalletRunner{
public static void main(String[] args){

String palletId="2345";
    String material="wood";
    double lengthCm=12.0;
    double widthCm= 120.0;
    double heightCm= 80.0;
    double weightKg=15.0;
    double maxLoadKg= 1000.0;
    String location="Warehouse A";
    String status="In Use";
    String goodsType= "Electronics";
	
	Pallet pallet1=new Pallet();
	Pallet pallet2=new Pallet(palletId);
	Pallet pallet3=new Pallet(palletId,material);
	Pallet pallet4=new Pallet(palletId,material,lengthCm);
		Pallet pallet5=new Pallet(palletId,material,lengthCm,widthCm);
		Pallet pallet6=new Pallet(palletId,material,lengthCm,widthCm,heightCm);
			Pallet pallet7=new Pallet(palletId,material,lengthCm,widthCm,heightCm,weightKg);
						Pallet pallet8=new Pallet(palletId,material,lengthCm,widthCm,heightCm,weightKg,maxLoadKg);
						Pallet pallet9=new Pallet(palletId,material,lengthCm,widthCm,heightCm,weightKg,maxLoadKg,location);

						Pallet pallet10=new Pallet(palletId,material,lengthCm,widthCm,heightCm,weightKg,maxLoadKg,location,status);
						Pallet pallet11=new Pallet(palletId,material,lengthCm,widthCm,heightCm,weightKg,maxLoadKg,location,status,goodsType);
	
	
pallet1.info();
	
pallet2.info();
	
pallet3.info();
	
pallet4.info();
	
pallet5.info();
	
pallet6.info();
	
pallet7.info();	
pallet8.info();
	
pallet9.info();
	
pallet10.info();
pallet11.info();


}




}