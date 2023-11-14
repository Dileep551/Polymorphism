import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FordTest {

    @Test
    void startEngineFord() {

        //Given
        Ford ford = new Ford(6, "Ford Falcon");

        //When
        String fordEngin = ford.startEngine();

        //Then
        assertEquals("Ford-> startEngine()", fordEngin);

    }

    @Test
    void accelerateFord() {

        //Given
        Ford ford = new Ford(6, "Ford Falcon");

        //When
        String fordAccelerate = ford.accelerate();

        //Then
        assertEquals("Ford -> accelerate()", fordAccelerate);

    }

    @Test
    void brakeFord() {

        Ford ford = new Ford(6, "Ford Falcon");

        //When
        String fordBrake = ford.brake();

        //Then
        assertEquals("Ford -> brake()", fordBrake);

    }
}