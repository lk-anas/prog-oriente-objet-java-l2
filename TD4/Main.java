public class Main{
	public static void main(String[] args){
		Point a = new Point(3,3,"a");
		Point b = new Point(0,5,"b");
		Point c = new Point(1,1,"c");
		System.out.println(a.info());
		System.out.println(b.info());	
		System.out.println(c.info());	
		a.translate(1,5);
		System.out.println(a.info());
		c.symetry();
		System.out.println(c.info());	

		Rectangle rect1 = new Rectangle(a,b);
		Rectangle rect2 = new Rectangle(b,c);
		Rectangle rect2 = new Rectangle(a,c);
		System.out.println(rect1.info() + " " + rect1.surface());
		System.out.println(rect2.info() + " " +  rect2.surface());
		System.out.println(rect3.info() + " " +rect3.surface());


		c.origine = b; // <=> à faire a.origine = b, b.origine = b, Point.origine = b
	}
}

//d'abord declaration de partie static
//il l'a fait qu'une seul fois apres plus du tout 