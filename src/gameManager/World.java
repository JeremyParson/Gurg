package gameManager;

import java.util.Random;

import biomes.*;

public class World {

	enum genTemperatureChange{
		Up,
		Down,
		Stay
	}
	private static Biomes[][] map;

	public World(int xSize, int ySize) {
		Biomes[][] worldMap = new Biomes[xSize][ySize];
		map = worldMap;
		System.out.println("World Size Succsefuly Initialized!");
	}

	public void generateMap() {
		// This will create the world via multiplication table generation algorithm
		Random startBiome = new Random();
		Random upDownGen = new Random();
		genTemperatureChange tempChange = genTemperatureChange.Stay;
		
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

		for (int x = 1; x < map.length; x++) {
			for (int y = 1; y < map[y].length; y++) {
				int nextInt = upDownGen.nextInt(5);
				if ( nextInt == 1) {
					tempChange = genTemperatureChange.Up;
				} else if(nextInt == 5) {
					tempChange = genTemperatureChange.Down;
				}else {
					tempChange = genTemperatureChange.Stay;
				}
				//Random Biome = new Random();
					if(tempChange == genTemperatureChange.Up) {
						int temp;
						map[x][y] += map[x][y-1]; //create setType method for Biomes
					}
			}
		}

	}

	public void showMap() {

	}

	public void regenerateMap() {

	}
}