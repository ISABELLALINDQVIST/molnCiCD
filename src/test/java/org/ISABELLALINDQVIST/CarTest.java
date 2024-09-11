package org.ISABELLALINDQVIST;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car(0, "grön");
    }

    @Test
    void BilStop() {
        assertEquals(0, car.getVelocity());
    }

    @Test
    void BilAccelererar() {
        car.Accelerate(10);
        assertEquals(10, car.getVelocity());
    }

    @Test
    void BilenSaktarNer() {
        car.setVelocity(50);

        car.Accelerate(-20);
        assertEquals(30, car.getVelocity());

        car.Accelerate(-40);
        assertEquals(-10, car.getVelocity());
    }
}
