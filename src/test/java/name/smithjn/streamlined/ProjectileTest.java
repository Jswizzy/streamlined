package name.smithjn.streamlined;

import name.smithjn.streamlined.model.Projectile;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProjectileTest {
    private static final double GRAVITY = -9.81;
    private static final double VELOCITY = 50.5;

    @Test
    public void testProjectileRange() {
        DecimalFormat df2 = new DecimalFormat(".##");

        Projectile projectile = new Projectile(GRAVITY, VELOCITY);

        assertThat("name.smithjn.streamlined.model.Projectile range works", "45.14", equalTo(df2.format(projectile.range(5))));
    }
}
