
public class scene {
private String name;
private shape []arr;
private int nbShape;

public scene(String name, int size){
	this.name=name;
 this.arr=new shape[size];
 nbShape=0;
}
public void addshape(shape s){
	if(nbsh<arr.length){
		if(s instanceof square)
			arr[nbShape++]=new square((square)s);
		else
			arr[nbShape++]=new circle((circle)s);
		
	}
}
	public circle[] getcircle (int r){
		circle[] arrc=new circle[nbShape];
		int a=0;
		
			for(int i =0; i<nbShape ;i++){
				if(arr[i] instanceof circle)
					if( ((circle)arr[i]).getradius()>r)
						arrc[a++]=(circle)arr[i];
			
			
			
			}
		return arrc;
		
	
	}
	public int search(int id ,int i){
		if(i>=arr.length)
			return -1;
		if(arr[i].getid()==id)
			return i;
		
		return search(id,i+1);
	}
	public void display(){
		System.out.println("the scene name is :"+name);
		for(int i =0; i<nbShape ;i++){
			System.out.println(i+i+"-");
			arr[i].display();
			System.out.println("*******************");
			
		}
	}
}



