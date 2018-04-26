
public abstract class shape {
private int id;


public shape(int id){
	this.id=id;
}
public shape(shape s){
	this.id=s.id;
}
public abstract double calculatearea();

public void display (){
	System.out.println("id"+this.id);
	System.out.println("the shape name is "+this.getClass().getName());
	System.out.println("the area is "+this.calculatearea());
}
public int getid(){
	return id ;
}

}
