class Poster{
	
int width;
int length;
String content;
String material;


public Poster(){
	
		
}
public Poster(int width){
	this.width=width;
	
}


public Poster(int width,int length){
	this.width=width;
	this.length=length;
		
}

public Poster(int width,int length,String content){
	this.width=width;
	this.length=length;
	this.content=content;
		
}

public Poster(int width,int length,String content,String material){
	this.width=width;
	this.length=length;
	this.content=content;
	this.material=material;
		
}

public void info(){
	System.out.println("****************************");
	System.out.println("poster information");
	System.out.println("width="+this.width);
	System.out.println("height="+this.length);
	System.out.println("content="+this.content);
	System.out.println("material="+this.material);
	
	
}



}