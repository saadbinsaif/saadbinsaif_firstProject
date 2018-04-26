
public class circle extends shape{
private int radius;

public circle(int id , int radius){
	super(id);
	this.radius=radius;
}
public circle(circle c){
	super(c);
	this.radius=c.radius;
}
public double calculatearea(){
	return radius*radius*3.14; 
}
public int getradius(){
	return radius;
			
}
public void display (){
	super.display();
	

	System.out.println("radius"+this.radius);
	

}
}
