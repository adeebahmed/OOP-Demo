
public class Thing {

	private String name;
	
	public Thing(String aName) {
		
		name = aName;
	}
	
	@Override
	public String toString() {
		if(this.getClass().getSimpleName().equals("Thing"))
			return name;
		
		return name + " " + this.getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
