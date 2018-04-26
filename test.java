
public class test {

	public static void main(String[] args) {
	shape c1=new circle(1,3);
	shape c2=new circle(4,2);
	shape s1=new square(3,6);
	shape s2=new square(4,7);
scene sc=new scene("shape list",4);
sc.addshape(c1);
sc.addshape(c2);
sc.addshape(s1);
sc.addshape(s1);
sc.display();
System.out.println("the index of id 3 is"+sc.search(3,0));
circle[] c = sc.getcircle(2);
int i =0;
while(c[i]!=null){
	c[i].display();
	i++;
}

	}

}
