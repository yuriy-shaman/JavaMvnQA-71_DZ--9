import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNextStations() {
        Radio radio = new Radio();
        radio.setCarrentStation(9);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStations() {
        Radio radio = new Radio();
        radio.setCarrentStation(0);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUpVolume() {
        Radio radio = new Radio();
        radio.setCarrentVolume(100);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDowneVolume() {
        Radio radio = new Radio();

        radio.setCarrentVolume(0);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}


