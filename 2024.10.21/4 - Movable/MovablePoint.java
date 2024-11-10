public class MovablePoint implements Movable{
	private int x;
	private int y ;
	
	public MovablePoint(int x,int y){
		this.x = x;
		this.y = y;
	}
	public MovablePoint(){
		this.x = 0;
		this.y = 0;
	} 
	public void moveUp(){
		this.y++;
	}
	
	public void moveDown(){
		this.y--;
	}
	
	public void moveRight(){
		this.x++;
	}
	
	public void moveL(){
		this.x--;
	}
	
	public void moveUp(){
		this.y++;
	}
	
	Public String toString(){
		return ("Current position of x is "+this.x+", and Y is "this.y);
	}
}