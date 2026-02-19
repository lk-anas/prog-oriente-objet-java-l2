public class Rectangle{
	private Point ext1;
	private Point ext2;
	
	public Rectangle (Point a, Point b){
		ext1=a;
		ext2=b;
	}
	
	public double getPPabs(){
		return Math.min(ext1.getAbs(),ext2.getAbs());
	}
	public double getPGord(){
		return Math.max(ext1.getOrd(),ext2.getOrd());
	}
	public double getPPord(){
		return Math.min(ext1.getAbs(),ext2.getAbs());
	}
	public double getPGabs(){
		return Math.max(ext1.getOrd(),ext2.getOrd());
	}
	
	public void translate(double x, double y){
		ext1.translate(x,b);
		ext2.translate(x,y);
	}
	
	public void symetrie(){
		ext1.symetrie;
		ext2.symetrie;
	}
	
	public double surface(){
		return ((getPGabs() - getPGabs()) * (getPPord() - getPGabs()) )
	}
	
	public String info(){
		return ext1.name + ext2.name() + "[" + ext1.info() + ","  + ext2.info() + "]";
		//deconseille de mettre des sop dans des classe
	}
	
	
	
	
}