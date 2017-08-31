public class Projectile implements Missile {

    private final double gravity;
    private final double velocity;

    public Projectile(double gravity, double velocity) {
        this.gravity = gravity;
        this.velocity = velocity;
    }

    public double range(double angle) {
        return Math.pow(velocity, 2) * Math.sin(2 * (angle/180*Math.PI)) / Math.abs(gravity);
    }
}
