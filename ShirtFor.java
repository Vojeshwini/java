class ShirtFor{
public static void main(String[] args){
	String shirt1="buffalo";
	String shirt2="ramraj";
	String shirt3="puma";
	String shirt4="hoodies";
	String shirt5="zara";
	
	String[] shirts={shirt1,shirt2,shirt3,shirt4,shirt5};
	
	for(int index=0;index<5;index++){
		
		System.out.println("shirts at index:"+index);
		
		String ref=shirts[index];
		
		System.out.println(ref);
		
	}
	
	
	
}

}