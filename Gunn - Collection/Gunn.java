package wolk;

public class Gunn {
	private String name;
	private String type;
	private int weight;
	private float cost;
	
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	
	void setType(String type) {
		this.type = type;
	}
	String getType() {
		return type;
	}
	
	void setWeight(int weight) {
		this.weight = weight;
	}
	int getWeight() {
		return weight;
	}
	
	void setCost(float cost) {
		this.cost = cost;
	}
	float getCost() {
		return cost;
	}
}