public class Segment{
	Point ext1;
	Point ext2;
	
	public Segment(Point p1, Point p2){
		ext1 = p1;
		ext2 = p2;
	}
	
	public Segment(int x1,int y1, int x2, int y2){
		ext1 = new Point(x1,y1);
		ext2 = new Point(x2,y2);
	}
}