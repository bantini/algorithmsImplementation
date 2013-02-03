package recursion;
import java.util.*;
class Point{
	private int x;
	private int y;
	
	

	public Point(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	
	public String toString()
	{
		
		return "x: "+x+"y: "+y;
	}
	
}
public class PathProblem {
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		Point p = new Point(x,y);
		ArrayList<Point> path = new ArrayList<Point>();
		Hashtable<Point, Boolean> cache = new Hashtable<Point, Boolean>();
		System.out.println(getPoint(x,y,path,cache));
		for(Point point :path)
			System.out.println(point);
		
		// TODO Auto-generated method stub

	}
	static boolean getPoint(int x,int y,ArrayList<Point> path, Hashtable<Point, Boolean> cache){
		
		Point p = new Point(x,y);
		if(cache.containsKey(p)){
			return cache.get(p);
			
		}
		path.add(p);
		if(x==0 && y==0)
			return true;
		boolean success= false;
		if(x>=1 && cache.containsKey(new Point(x-1,y))){
			success=getPoint(x-1,y,path,cache);
			path.add(p);
			}
		if(!success && y>=1 && cache.containsKey(new Point(x-1,y))){
			success=getPoint(x,y-1,path,cache);
			path.add(p);
		}
		if(!success|| x<0 || y<0)
			path.remove(p);
		cache.put(p, success);
		return success;
	}
	static boolean isFree(int x,int y, Hashtable<Point, Boolean> cache){
		Point p = new Point(x,y);
		if(cache.containsKey(p))
			return true;
		else
			return false;
		}
	}
