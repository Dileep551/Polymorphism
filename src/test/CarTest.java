import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void startEngine() {

        //Given
        Car car = new Car(8, "Base car");

        //When
        String carEngin = car.startEngine();

        //Then
        assertEquals("Car -> startEngine()", carEngin);
        
    }

    @Test
    void accelerate() {

        //Given
        Car car = new Car(6, "Base car");

        //When
        String carAccelerate = car.accelerate();

        //Then
        assertEquals("Car -> accelerate()", carAccelerate);

    }

    @Test
    void brake() {
        Car car = new Car(6, "Base car");

        //When
        String carBrake = car.brake();

        //Then
        assertEquals("Car -> brake()", carBrake);
    }
}