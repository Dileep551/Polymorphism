import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MitsubishiTest {

    @Test
    void startEngineMitsubishi() {

        //Given
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        //When
        String mitsubishiEngin = mitsubishi.startEngine();

        //Then
        assertEquals("Mitsubishi -> startEngine()", mitsubishiEngin);

    }

    @Test
    void accelerateMitsubishi() {

        //Given
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        //When
        String mitsubishiAccelerate = mitsubishi.accelerate();

        //Then
        assertEquals("Mitsubishi -> accelerate()", mitsubishiAccelerate);

    }

    @Test
    void brakeMitsubishi() {

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        //When
        String mitsubishiBrake = mitsubishi.brake();

        //Then
        assertEquals("Mitsubishi -> brake()", mitsubishiBrake);

    }
}