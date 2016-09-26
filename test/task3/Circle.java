package task3;

public class Circle implements Comparable<Circle> {
	private Double radius;
	
	public Circle() {
		radius = 0.0;
	}
	
	public Circle(Double radius) {
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}
	
	@Override
	public int compareTo(Circle o) {
		return radius.compareTo(o.getRadius());
	}
 
}
