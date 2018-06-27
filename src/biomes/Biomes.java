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
	}
	
	private static Biomes createObject() {
		switch (startBiome.nextInt()) {
		case 1:
			map[0][0] = new Tundra();
			break;
		case 2:
			map[0][0] = new Taiga();
			break;
		case 3:
			map[0][0] = new TemperateDeciduousForest();
			break;
		case 4:
			map[0][0] = new TropicalRainforest();
			break;
		case 5:
			map[0][0] = new Savanna();
			break;
		case 6:
			map[0][0] = new Grasslands();
			break;
		case 7:
			map[0][0] = new Dessert();
			break;
		default:
			break;
		}
		return newBiome;
	}
}

