package dsalgo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test public void testBoolean() {
        App app = new App();
        assertThat(app.getBoolean()).isEqualTo(false);
    }
}