package biomes;

public class Biomes {
	
	private static int typeNumber;//typeNumber in Biomes creates other objects.
	
	public Biomes(){
		typeNumber = 0;
	}
	
	public int getType() {
		return typeNumber;
	}
	
	public void setType(int x) {
		typeNumber = x;
		createObject();
	}
	
	private static Biomes createObject() {
		Biomes temp = null;
		switch (typeNumber) {
		case 1:
			temp = new Tundra();
			break;
		case 2:
			temp = new Taiga();
			break;
		case 3:
			temp = new TemperateDeciduousForest();
			break;
		case 4:
			temp = new TropicalRainforest();
			break;
		case 5:
			temp = new Savanna();
			break;
		case 6:
			temp = new Grasslands();
			break;
		case 7:
			temp = new Dessert();
			break;
		default:
			break;
		}
		return temp;
	}
}

