package LMS.entities;

/**
 * A shipping item within the Logistics Management System.<br>
 * <br>
 * 
 * A shipping item consists one or many identical single items with a common
 * description a single item mass and value.
 * 
 *
 */
public class Item {

	private int amount = 1;
	private String description;
	private float mass;
	private long value;

	public Item(String description, int amount, float mass, long value) {
		if(amount > 0) {
			setAmount(amount);
		} else{
			throw new IllegalArgumentException();
		}
		setDescription(description);

		if(mass > 0) {
			setMass(amount);
		} else{
			throw new IllegalArgumentException();
		}

		if(value > 0) {
			setValue(amount);
		} else{
			throw new IllegalArgumentException();
		}

	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public float totalValue(){
		return mass * value;

	}

	public float totalMass(){
		 return mass * amount;
	}

	/**
	 * creates a string representation of this item.<br>
	 *
	 * @ProgrammingProblem.Hint provided
	 *
	 */
	@Override
	public String toString() {
		return String.format("%d x %.15s (%.1fkg EUR %d.%02d, %.1fkg EUR %d.%02d)", amount, description, mass,
				((int) value) / 100, ((int) value) % 100, totalMass(), ((int) totalValue()) / 100,
				((int) totalValue()) % 100);
	}

}
