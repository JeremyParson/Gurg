package gameManager;

import java.util.Random;

import biomes.*;

public class World {

	// Creates different temperature scales to enable world to change as it
	// generates
	// Up means the temperature goes up, Down is vice versa, and Stay keeps the
	// temperature consistent.
	enum genTemperatureChange {
		Up, Down, Stay
	}

	// This creates a 2 dimensional array that holds Biomes in each place
	private static Biomes[][] map;
	private static Biomes[][] mapVis;

	public World(int xSize, int ySize) {
		Biomes[][] worldMap = new Biomes[xSize][ySize];
		map = worldMap;
		System.out.println("World Size Succsefuly Initialized!");
		generateMap();
	}

	// This Begins to generate the actual map of the world by creating a "start
	// biome"
	public void generateMap() {
		// This will create the world via multiplication table generation algorithm
		Random startBiome = new Random();
		Random upDownGen = new Random();
		genTemperatureChange tempChange = genTemperatureChange.Stay;
		int newBiomeTemp;

		// This switch statement will choose what biome will be created first.
		switch (startBiome.nextInt(7)) {
		case 0:
			map[0][0] = new Tundra();
			break;
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

		map[0][0].getBiome();

		for (int x = 1; x < map.length; x++) {
			for (int y = 0; y < map[x].length; y++) {
				int nextInt = upDownGen.nextInt(5);
				// This if statement will decide how the map's biomes will change temperature
				// hence changing what biome shows up next
				if (nextInt == 1) {
					tempChange = genTemperatureChange.Up;
				} else if (nextInt == 5) {
					tempChange = genTemperatureChange.Down;
				} else {
					tempChange = genTemperatureChange.Stay;
				}
				// This if statement will actually manipulate the selected biome based on the
				// surrounding biome's
				// Temperatures
				if (tempChange == genTemperatureChange.Up && y != 0) {
					newBiomeTemp = map[x][y - 1].getType() + 1; // create setType method for Biomes
					switch (newBiomeTemp) {
					case 1:
						map[x][y] = new Tundra();
						break;
					case 2:
						map[x][y] = new Taiga();
						break;
					case 3:
						map[x][y] = new TemperateDeciduousForest();
						break;
					case 4:
						map[x][y] = new TropicalRainforest();
						break;
					case 5:
						map[x][y] = new Savanna();
						break;
					case 6:
						map[x][y] = new Grasslands();
						break;
					case 7:
						map[x][y] = new Dessert();
						break;
					default:
						break;
					}

				} else if (tempChange == genTemperatureChange.Down && y != 0) {
					newBiomeTemp = map[x][y - 1].getType() - 1;
					switch (newBiomeTemp) {
					case 1:
						map[x][y] = new Tundra();
						break;
					case 2:
						map[x][y] = new Taiga();
						break;
					case 3:
						map[x][y] = new TemperateDeciduousForest();
						break;
					case 4:
						map[x][y] = new TropicalRainforest();
						break;
					case 5:
						map[x][y] = new Savanna();
						break;
					case 6:
						map[x][y] = new Grasslands();
						break;
					case 7:
						map[x][y] = new Dessert();
						break;
					default:
						break;
					}

				} else if (tempChange == genTemperatureChange.Stay && y != 0) {
					newBiomeTemp = map[x][y - 1].getType();
					switch (newBiomeTemp) {
					case 1:
						map[x][y] = new Tundra();
						break;
					case 2:
						map[x][y] = new Taiga();
						break;
					case 3:
						map[x][y] = new TemperateDeciduousForest();
						break;
					case 4:
						map[x][y] = new TropicalRainforest();
						break;
					case 5:
						map[x][y] = new Savanna();
						break;
					case 6:
						map[x][y] = new Grasslands();
						break;
					case 7:
						map[x][y] = new Dessert();
						break;
					default:
						break;
					}

				} else if (tempChange == genTemperatureChange.Up && y == 0) {
					newBiomeTemp = map[x - 1][y].getType() + 1;
					switch (newBiomeTemp) {
					case 1:
						map[x][y] = new Tundra();
						break;
					case 2:
						map[x][y] = new Taiga();
						break;
					case 3:
						map[x][y] = new TemperateDeciduousForest();
						break;
					case 4:
						map[x][y] = new TropicalRainforest();
						break;
					case 5:
						map[x][y] = new Savanna();
						break;
					case 6:
						map[x][y] = new Grasslands();
						break;
					case 7:
						map[x][y] = new Dessert();
						break;
					default:
						break;
					}

				} else if (tempChange == genTemperatureChange.Down && y == 0) {
					newBiomeTemp = map[x - 1][y].getType() - 1;
					switch (newBiomeTemp) {
					case 1:
						map[x][y] = new Tundra();
						break;
					case 2:
						map[x][y] = new Taiga();
						break;
					case 3:
						map[x][y] = new TemperateDeciduousForest();
						break;
					case 4:
						map[x][y] = new TropicalRainforest();
						break;
					case 5:
						map[x][y] = new Savanna();
						break;
					case 6:
						map[x][y] = new Grasslands();
						break;
					case 7:
						map[x][y] = new Dessert();
						break;
					default:
						break;
					}

				} else if (tempChange == genTemperatureChange.Stay && y == 0) {
					newBiomeTemp = map[x - 1][y].getType();
					switch (newBiomeTemp) {
					case 1:
						map[x][y] = new Tundra();
						break;
					case 2:
						map[x][y] = new Taiga();
						break;
					case 3:
						map[x][y] = new TemperateDeciduousForest();
						break;
					case 4:
						map[x][y] = new TropicalRainforest();
						break;
					case 5:
						map[x][y] = new Savanna();
						break;
					case 6:
						map[x][y] = new Grasslands();
						break;
					case 7:
						map[x][y] = new Dessert();
						break;
					default:
						break;
					}
				}
			}
		}

	}

	public void showMap() {

	}

	public void regenerateMap() {

	}

	public void getBiome(int x, int y) {
		switch (map[x][y].getType()) {
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
}