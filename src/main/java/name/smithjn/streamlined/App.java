package name.smithjn.streamlined;

import name.smithjn.streamlined.model.Missile;
import name.smithjn.streamlined.model.Projectile;
import name.smithjn.streamlined.view.CommandLineRunner;
import name.smithjn.streamlined.view.Runner;

public class App {

    private static final double GRAVITY = -9.81;
    private static final double VELOCITY = 50.5;

    public static void main(String[] args) {
        Runner runner = new CommandLineRunner();
        Missile missile = new Projectile(GRAVITY, VELOCITY);

        runner.run(missile);
    }
}
