
public class scene {
private String name;
private shape []arr;
private int nbsh;

public scene(String name, int size){
	this.name=name;
 this.arr=new shape[size];
 nbsh=0;
}
public void addshape(shape s){
	if(nbsh<arr.length){
		if(s instanceof square)
			arr[nbsh++]=new square((square)s);
		else
			arr[nbsh++]=new circle((circle)s);
		
	}
}
	public circle[] getcircle (int r){
		circle[] arrc=new circle[nbsh];
		int a=0;
		
			for(int i =0; i<nbsh ;i++){
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
		for(int i =0; i<nbsh ;i++){
			System.out.println(i+i+"-");
			arr[i].display();
			System.out.println("*******************");
			
		}
	}
}



