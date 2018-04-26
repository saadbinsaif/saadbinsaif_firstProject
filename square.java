
public class square extends shape {
private int side ;

public square(int id, int side){
	super(id);
	this.side=side;

}
public square(square s){
	super(s);
	this.side=s.side;
	}
public double calculatearea(){
	return side*side;
}
public int getside(){
	return side;
}
public void display (){
	super.display();

	System.out.println("side"+this.side);
}	

}
