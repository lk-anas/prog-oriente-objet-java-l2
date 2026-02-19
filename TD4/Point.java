public class Point{
	private double abs;
	private double ord;
	String name;
	static Point origine = new Point(0,0,"o");
	
	public Point(double x,double y, String n){
		abs = x;
		ord = y;
		name = n;
	}
	
	public double getAbs(){
		return abs;
	}
	
	public double getOrd(){
		return ord;
	}
	
	public void setAbs(double x){
		abs = x;
	}
	
	public void setOrd(double y){
		ord = y;
	}
	
	public String info(){
		return name + "(" + abs + "," + ord + ")";
	}
	
		
	public double getX(){
		return abs - origine.abs;
	}
	
	public double getY(){
		return ord - origine.ord;
	}
	
	public boolean pegX(Point p){
		return abs <= p.abs;
		//attribut on doit pouvoir y acceder à l'interieur de la classe
	}
	
	public boolean pegY(Point p){
		return ord <= p.ord;
	}
	
	public void translate (int x, int y){
		abs += x;
		ord += y;
	}
	
	public void symetrie(){
		abs = origine.abs - getX();
		ord = origine.ord - getY();
	}
	
	
	
	
}




