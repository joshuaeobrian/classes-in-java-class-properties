/**
 * This class should model a planet in our solar system. Your job is to create
 * the properties described below. Remember that properties are effectively
 * variables defined in the body of a class.
 */
public class Planet {

    // todo: create a property named "name" that can hold a planet's name. EG: mercury
    String name;
    /*
        A planet's distance from the sun is measured in Astronomical Units (AU).
        One AU is the distance from the Sun to Earth.

        EG: Mercury's distance from the sun is 0.4 AU.
     */
    // todo: create a property named "distanceFromSun" that holds a planet's distance from the sun in Astronomical Units.
    double distanceFromSun;
    // todo: create a property "satellites" that holds the number of moons a planet has. EG: Mercury has 0 satellites
    int satellites;
    // todo: create a property "supportsLife" that indicates whether or not a planet supports life. EG: Mercury does not support life.
    boolean supportsLife;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDistanceFromSun() {
		return distanceFromSun;
	}

	public void setDistanceFromSun(Double distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}

	public int getSatellites() {
		return satellites;
	}

	public void setSatellites(int satellites) {
		this.satellites = satellites;
	}

	public boolean isSupportsLife() {
		return supportsLife;
	}

	public void setSupportsLife(boolean supportsLife) {
		this.supportsLife = supportsLife;
	}
}
