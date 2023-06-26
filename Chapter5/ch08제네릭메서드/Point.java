package Chapter5.ch08제네릭메서드;

public class Point<T, V> {
  T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public  T getX() {
			return x;
	}

	public V getY() {
		return y;
    }

}
