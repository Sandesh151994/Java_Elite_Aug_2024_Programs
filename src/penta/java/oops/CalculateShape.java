package penta.java.oops;

abstract class Shape
{
	abstract double getArea();
	abstract double getPerimeter();

}

class Rectangle extends Shape
{

	double length;
	double width;
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	@Override
	double getArea() {

		return length*width;
	}

	@Override
	double getPerimeter() {
		return 2*(length+width);
	}	
}
class Circle extends Shape
{
	float radius;
	final float PI=3.142f;

	Circle(float radius)
	{
		this.radius=radius;
	}
	@Override
	double getArea() {

		return PI*radius*radius;
	}

	@Override
	double getPerimeter() {

		return 2*PI*radius;
	}

}
public class CalculateShape {

	public static void main(String[] args) {


		Shape rectangle=new Rectangle(15,20);

		System.out.println("Area Of Rectangle : "+rectangle.getArea());

		System.out.println("Perimeter of Rectangle : "+rectangle.getPerimeter());

		Shape circle=new Circle(20.5f);

		System.out.println("Area Of Rectangle : "+circle.getArea());

		System.out.println("Perimeter of Rectangle : "+rectangle.getPerimeter());
	}

}
