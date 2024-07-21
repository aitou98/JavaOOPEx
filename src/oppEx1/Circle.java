package oppEx1;

public class Circle {
	
	private double radius=1.0;
	private String color="red";
	
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
		
	}
	
	public Circle(double radius,String color) {
		
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cercle [radius=" + radius + ", color=" + color + "]";
	}
	
	public double getArea() {
		
		return radius * radius * Math.PI;
	}
	
    public double getCircumference() {
		
    	
    	return 2.0 * radius * Math.PI;
    }
	
	


}
