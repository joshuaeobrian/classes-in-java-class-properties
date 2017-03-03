/**
 * In this exercise you will add properties to the provided Planet class and
 * then use that class in the main method, as instructed below.
 * <p>
 * You should first follow the instructions in the Planet class.
 */
public class Main {

    public static void main(String[] args) {

        // todo: create a new variable "planet1" and set it to a new instance of the Planet class
        Planet planet1 = new Planet();
        // todo: set all four properties of the Planet class on the planet1 instance: name, distanceFromSun, satellites, and supportsLife.
        planet1.name = "Mercury";
        planet1.distanceFromSun=0.4;
        planet1.satellites=3;
        planet1.supportsLife=false;
        // todo: create another new variable named "planet2" and set it to a new instance of the Planet class
        Planet planet2 = new Planet();
        // todo: set all four properties of the Planet class on the planet2 instance
        planet2.name="Earth";
        planet2.distanceFromSun=3.4;
        planet2.satellites=200;
        planet2.supportsLife=false;
        // todo: Use println() to print a String description of planet1 using string concatenation
        /*
            Example output: "Name: Earth, Distance from Sun: 1 AU, Satellites: 1 moon(s), Supports Life: true"

         */
        System.out.println("Name: "+planet1.name+", Distance from Sun: "+planet1.distanceFromSun+
                " AU, Satellites: "+planet1.satellites+" moon(s), Supports Life: "+planet1.supportsLife);

        // todo: Use println() to print a String description of planet2, just like above

        /*
            Next, we're going to demonstrate that properties of an object can be
            changed. This change impacts only that one property on that one
            instance of the object.
         */
        System.out.println("Name: "+planet2.name+", Distance from Sun: "+planet2.distanceFromSun+
                " AU, Satellites: "+planet2.satellites+" moon(s), Supports Life: "+planet2.supportsLife);
        // todo: change a single property on your planet1 instance
            planet1.satellites=26;
        // todo: change a different property on your planet2 instance
            planet2.supportsLife=true;
        // todo: Use println() to print a String description of planet1 again.
        /*
            Note that the property you changed on planet1 is reflected in the
            output. The property you changed on planet2 is NOT reflected. This
            shows that these two instances are distinct and separate from each
            other.
         */
        System.out.println("Name: "+planet1.name+", Distance from Sun: "+planet1.distanceFromSun+
                " AU, Satellites: "+planet1.satellites+" moon(s), Supports Life: "+planet1.supportsLife);

        // todo: Use println() to print a String description of planet2, again.  Note that the property you changed on planet2 is reflected in the output.
        System.out.println("Name: "+planet2.name+", Distance from Sun: "+planet2.distanceFromSun+
                " AU, Satellites: "+planet2.satellites+" moon(s), Supports Life: "+planet2.supportsLife);
    }

}
