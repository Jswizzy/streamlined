package name.smithjn.streamlined.view;

import name.smithjn.streamlined.model.Missile;

import java.util.Scanner;

public class CommandLineRunner implements Runner {

    private static final String GREETING =
            "Welcome! This Program calculates the distance a projectile flies given a launch angle." +
            " Enter an angle of '0' to exit. Fire Away!";
    private static final String PROMPT_ANGLE = "Enter the launch angle to fire your projectile";
    private static final String DISTANCE = "Your projectile lands %.2f meters away.\n";
    private static final String BYE = "Goodbye!";

    private final Scanner scanner = new Scanner(System.in);

    public CommandLineRunner() {
    }

    public void run(Missile missile) {
        double angle = 1;

        System.out.println(GREETING);

        while (angle != 0) {
            System.out.println(PROMPT_ANGLE);
            angle = scanner.nextDouble();

            if (angle != 0) {
                System.out.println(String.format(DISTANCE, missile.range(angle)));
            } else {
                System.out.println(BYE);
            }
        }
    }
}
