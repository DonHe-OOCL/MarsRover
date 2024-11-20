import org.junit.jupiter.api.Test;
import org.marsRover.MarsRover;
import org.marsRover.action.EastAction;
import org.marsRover.action.NorthAction;
import org.marsRover.action.SouthAction;
import org.marsRover.action.WestAction;
import org.marsRover.common.CommandEnum;
import org.marsRover.handler.MarsRoverHandler;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    public void should_initialize_mars_rover() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new NorthAction());
        assertEquals("0:0:N", rover.showStatus());
    }

    @Test
    public void should_face_west_when_facing_north_and_turn_left() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new NorthAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.L.name());
        String report = rover.showStatus();
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_east_when_facing_north_and_turn_right() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new NorthAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.R.name());
        String report = rover.showStatus();
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_face_north_x_0_y_1_when_facing_north_and_move_forward() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new NorthAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.M.name());
        String report = rover.showStatus();
        assertEquals("0:1:N", report);
    }

    @Test
    public void should_face_east_x_1_y_0_when_facing_east_and_move_forward() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new EastAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.M.name());
        String report = rover.showStatus();
        assertEquals("1:0:E", report);
    }

    @Test
    public void should_face_north_when_facing_east_and_turn_left() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new EastAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.L.name());
        String report = rover.showStatus();
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_face_south_when_facing_east_and_turn_right() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new EastAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.R.name());
        String report = rover.showStatus();
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_south_x_0_y_minus_1_when_facing_south_and_move_forward() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new SouthAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.M.name());
        String report = rover.showStatus();
        assertEquals("0:-1:S", report);
    }

    @Test
    public void should_face_east_when_facing_south_and_turn_left() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new SouthAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.L.name());
        String report = rover.showStatus();
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_face_west_when_facing_south_and_turn_right() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new SouthAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.R.name());
        String report = rover.showStatus();
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_west_x_minus_1_y_0_when_facing_west_and_move_forward() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new WestAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.M.name());
        String report = rover.showStatus();
        assertEquals("-1:0:W", report);
    }

    @Test
    public void should_face_south_when_facing_west_and_turn_left() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new WestAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.L.name());
        String report = rover.showStatus();
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_north_when_facing_west_and_turn_right() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new WestAction());
        MarsRoverHandler.executeCommand(rover, CommandEnum.R.name());
        String report = rover.showStatus();
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_face_south_x_minus_1_y_minus_1_when_facing_north_and_move_forward() {
        MarsRover rover = new MarsRover();
        rover.updateCoordinate(0, 0);
        rover.setAction(new NorthAction());
        MarsRoverHandler.executeCommand(rover, "LMLM");
        String report = rover.showStatus();
        assertEquals("-1:-1:S", report);
    }
}
