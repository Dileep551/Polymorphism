import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoldenTest {

    @Test
    void startEngineHolden() {

        //Given
        Holden holden = new Holden(6, "Holden Commodore");

        //When
        String holdenEngin = holden.startEngine();

        //Then
        assertEquals("Holden-> startEngine()", holdenEngin);

    }

    @Test
    void accelerateHolden() {

        //Given
        Holden holden = new Holden(6, "Holden Commodore");

        //When
        String holdenAccelerate = holden.accelerate();

        //Then
        assertEquals("Holden -> accelerate()", holdenAccelerate);

    }

    @Test
    void brakeHolden() {

        Holden holden = new Holden(6, "Holden Commodore");

        //When
        String holdenBrake = holden.brake();

        //Then
        assertEquals("Holden -> brake()", holdenBrake);

    }
}