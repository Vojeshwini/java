class FloorRunner{
	public static void main(String[] args){
		Floor floor=new Floor();
		System.out.println("**************default**********");
		
		System.out.println("color:"+floor.color);
		System.out.println("CostOfFlooring:"+floor.costOfFlooring);
		System.out.println("Material:"+floor.material);
		System.out.println("is Clean:"+floor.isClean);
		
		floor.color="Black";
		floor.costOfFlooring=100000;
		floor.material="tiles";
		floor.isClean=true;
		
		System.out.println("*************updated******************");
		
		System.out.println("updated color:"+floor.color);
		System.out.println("updated CostOfFlooring:"+floor.costOfFlooring);
		System.out.println("updated Material:"+floor.material);
		System.out.println("updated is Clean:"+floor.isClean);
		
		
	
		
	}
		
}