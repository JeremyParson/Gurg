package biomes;

public class Tundra extends Biomes {
	
	private static int typeNumber;
	
	public Tundra(){
		super();
		typeNumber = 1;
	}
	
	public int getType() {
		return typeNumber;
	}
}
