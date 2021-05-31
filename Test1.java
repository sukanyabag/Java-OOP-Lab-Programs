import java.util.Scanner;
class Shape{
   double length, breadth;
   Shape(double l, double b){  
      length = l;
      breadth= b;
    }
  Shape(double len){    
     length = breadth = len;
   }
  double calculate(){  
    return length * breadth ;
  }
}
public class Test1 extends Shape{    
double height;
Test1(double l,double h)
{
 super(l);
 this.length = l;
 this.height = h;
}
Test1(double l,double b,double h)
{
  super(l,b);
  this.length=l;
  this.breadth=b;
  this.height=h;
}
@Override
double calculate()
{
 return length*breadth*height; 
}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);                                                          
	Test1 shape1 = new Test1(2.0,4.0);
	Test1 shape2 = new Test1(2.0,3.0,4.0);
	double vol1;
	double vol2;
	vol1 = shape1.calculate();
	vol2= shape2.calculate();
	System.out.println(vol1);
	System.out.println(vol2);
  sc.close();
	}
}
