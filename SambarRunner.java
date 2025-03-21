class SambarRunner{
	public static void main(String[] args){
		
		String[] ref1=Sambar.vegetable();
		for(String i:ref1){
			
System.out.println("vegetables:"+i);		
}
		
		
		int ref2=Sambar.quantity(100);
		System.out.println("quantity:"+ref2);
		
		boolean ref3=Sambar.hotOrCold();
		System.out.println("hot or cold:"+ref3);
		
		boolean ref4=Sambar.goodOrBad();
		System.out.println("good or bad:"+ref4);
		
		
	}
	
	
	
	
}