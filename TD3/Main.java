public class Main{
	public static void affiche(Point p){
		System.out.println("(" + p.abs + ";" + p.ord + ")");
	}
	
	public static void affiche(Segment s){
		System.out.println("[(" + s.ext1.abs + "," + s.ext1.ord + "):("+s.ext2.abs+","+s.ext2.ord+")]");
	}
	
	public static void main(String[] args){
		Point o = new Point();
		Point a = new Point(1);
		Point b = new Point(-1,1);
		
		
		Segment s1 = new Segment(o,a);
		Segment s2 = new Segment(a,b);
		Segment s3 = new Segment(o,b);
		//Segment s3 = new Segment(0,0,-1,1);

		Cercle c1 = new Cercle(a)
		
		affiche(o);
		affiche(a);
		affiche(b);
		
		affiche(s1);
		affiche(s2);
		affiche(s3);

	}
}