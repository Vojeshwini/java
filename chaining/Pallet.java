class Pallet{
    String palletId;
    String material;
    double lengthCm;
    double widthCm;
    double heightCm;
    double weightKg;
    double maxLoadKg;
    String location;
    String status;
    String goodsType;
	
	
	public Pallet(){
		System.out.println("no argument constructr");
		
	}
	
	public Pallet(String palletId){
		this.palletId=palletId;
	}

	public Pallet(String palletId,String material){
		this(palletId);
		this.material=material;
	}
	public Pallet(String palletId,String material,double lengthCm){
		
		this(palletId,material);
		this.lengthCm=lengthCm;
		
		
	}
	
	public Pallet(String palletId,String material,double lengthCm,double widthCm){
		
		this(palletId,material,lengthCm);
		this.widthCm=widthCm	;	
	}
	
	
	public Pallet(String palletId,String material,double lengthCm,double widthCm,double heightCm){
		
		this(palletId,material,lengthCm,widthCm);
		this.heightCm=heightCm	;	
	}
	
	
	public Pallet(String palletId,String material,double lengthCm,double widthCm,double heightCm,double weightKg){
		
		this(palletId,material,lengthCm,widthCm,heightCm);
		this.weightKg=weightKg	;	
		
	}
	
	public Pallet(String palletId,String material,double lengthCm,double widthCm,double heightCm,double weightKg,double maxLoadKg){
		
		this(palletId,material,lengthCm,widthCm,heightCm,weightKg);
		this.maxLoadKg=maxLoadKg	;	
		
	}
	
	
	
	public Pallet(String palletId,String material,double lengthCm,double widthCm,double heightCm,double weightKg,double maxLoadKg,String location){
		
		this(palletId,material,lengthCm,widthCm,heightCm,weightKg,maxLoadKg);
		this.location=location	;	
	}
	
	
	public Pallet(String palletId,String material,double lengthCm,double widthCm,double heightCm,double weightKg,double maxLoadKg,String location,String status){
		
		this(palletId,material,lengthCm,widthCm,heightCm,weightKg,maxLoadKg,location);
		this.status=status	;	
	}
	
	public Pallet(String palletId,String material,double lengthCm,double widthCm,double heightCm,double weightKg,double maxLoadKg,String location,String status,String goodsType){
		
		this(palletId,material,lengthCm,widthCm,heightCm,weightKg,maxLoadKg,location,status);
		this.goodsType=goodsType	;	
	}
	
	
	
public void info(){
	System.out.println("Pallet Id="+this.palletId);
	System.out.println("material="+this.material);
		System.out.println("lengthCm="+this.lengthCm);

			System.out.println("widthCm="+this.widthCm);
				System.out.println("heightCm="+this.heightCm);

					System.out.println("weightKg="+this.weightKg);
	System.out.println("maxLoadKg="+this.maxLoadKg);
	System.out.println("location="+this.location);
	System.out.println("status="+this.status);
	System.out.println("goodsType="+this.goodsType);


	
	
	
}




}