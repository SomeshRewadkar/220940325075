package Answers;

class Shape
{
	void draw ()
	{
		System.out.println("Draw method from Shape is called ");
	}
	
    void erase()
    {
    	System.out.println("Erase method from Shape is called ");
    }
}
class Triangle extends Shape
{
	void draw ()
	{
		System.out.println("Draw method from Triangle is called ");
	}
	
    void erase()
    {
    	System.out.println("Erase method from Triangle is called ");
    }
}
class Circle extends Shape
{
	void draw ()
	{
		System.out.println("Draw method from Circle is called ");
	}
	
    void erase()
    {
    	System.out.println("Erase method from Circle is called ");
    }
}
class Square extends Shape
{
	void draw ()
	{
		System.out.println("Draw method from Square is called ");
	}
	
    void erase()
    {
    	System.out.println("Erase method from Square is called ");
    }
}
public class Q3 {
	public static void main(String[] args)
	{
		System.out.println("Program started exceuting \n");
		// Creating objects of each class
        Shape sh = new Shape();
        Triangle tr = new Triangle();
        Circle ci = new Circle();
        Square sq = new Square();
        // Calling function of same name with each of its class object
        sh.draw();
        tr.draw();
        ci.draw();
        sq.draw();
        System.out.println("\n");
        sh.erase();
        tr.erase();
        ci.erase();
        sq.erase(); } }
