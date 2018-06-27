package biomes;

public class Biomes {
	
	private static int typeNumber;//typeNumber in Biomes creates other objects.
	
	public Biomes(int x){
		typeNumber = x;
	}
	
	public int getType() {
		return typeNumber;
	}
	
	public void setType(int x) {
		typeNumber = x;
		createObject();
	}
	
	public void getBiome() {
		switch (typeNumber) {
		case 0:
			System.out.println("Nothing...");
			break;
		case 1:
			System.out.println("Tundra");
			break;
		case 2:
			System.out.println("Taiga");
			break;
		case 3:
			System.out.println("Temperate Decideos Forest");
			break;
		case 4:
			System.out.println("Tropical Rain Forest");
			break;
		case 5:
			System.out.println("Savanna");
			break;
		case 6:
			System.out.println("Grasslands");
			break;
		case 7:
			System.out.println("Dessert");
			break;
		default:
			break;
		}
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

