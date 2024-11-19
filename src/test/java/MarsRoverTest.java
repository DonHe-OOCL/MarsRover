import org.junit.jupiter.api.Test;
import org.marsRover.MarsRover;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    public void should_initialize_mars_rover() {
        MarsRover rover = new MarsRover();
        rover.showStatus();
        assertEquals("0:0:N", rover.showStatus());
    }

    @Test
    public void should_face_west_when_facing_north_and_turn_left() {
        MarsRover rover = new MarsRover();
        String currentStatus = rover.executeCommand("L");
        String report = rover.showStatus();
        assertEquals("0:0:W", currentStatus);
        assertEquals("0:0:W", report);
    }
}
