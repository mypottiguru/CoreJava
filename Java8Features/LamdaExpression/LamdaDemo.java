package Java8Features.LamdaExpression;

interface Drawable {
	void draw();
}
class DrawableDemo implements Drawable{
	public void draw() {
		System.out.println("Drawing from class.");
	}
}
public class LamdaDemo {

	public static void main(String[] args) {
		//1
		Drawable draw1 = new DrawableDemo();
		draw1.draw();
		
		//2
		Drawable draw2 = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Drawing from ananymous.");

			}
		};
		draw2.draw();
		
		//3
		Drawable draw3 = () -> System.out.println("Drawing from lamda .");
		draw3.draw();
		

	}

}
