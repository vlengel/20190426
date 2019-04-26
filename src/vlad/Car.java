package vlad;

public class Car {
	private String color;
	private String brand;
	private String horsePower;
	
	public void drive() {
		System.out.println("car can drive...");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		// Bsp. - das Attribut soll nur gesetztet werden, wenn es aus min 5 Buchstaben besteht
		//		- oder das wort rot oder gelb ist
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(String horsePower) {
		this.horsePower = horsePower;
	}
	
}
