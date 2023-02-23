import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = SolarSystem.valueOf(new Scanner(System.in).nextLine());
        switch (solarSystem){
            case MARS -> System.out.println(SolarSystem.MARS.getFutures());
            case EARTH -> System.out.println(SolarSystem.EARTH.getFutures());
            case VENUS -> System.out.println(SolarSystem.VENUS.getFutures());
            case SATURN -> System.out.println(SolarSystem.SATURN.getFutures());
            case URANUS -> System.out.println(SolarSystem.URANUS.getFutures());
            case JUPITER -> System.out.println(SolarSystem.JUPITER.getFutures());
            case MERCURY -> System.out.println(SolarSystem.MERCURY.getFutures());
            case NEPTUNE -> System.out.println(SolarSystem.NEPTUNE.getFutures());
            default -> System.out.println("Invalid command");
        }
    }
}