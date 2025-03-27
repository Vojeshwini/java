class PosterRunner{

public static void main(String[] args){

int width=21;
int length=36;
String content="new movie";
String material="A4";


Poster poster1=new Poster();
Poster poster2=new Poster(width);
Poster poster3=new Poster(width,length);
Poster poster4=new Poster(width,length,content);
Poster poster5=new Poster(width,length,content,material);


poster1.info();
poster2.info();
poster3.info();
poster4.info();
poster5.info();



 



}


}