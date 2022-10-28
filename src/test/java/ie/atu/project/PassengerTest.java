package ie.atu.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTitlePass(){
        Passenger myPassenger = new Passenger("Mr", "Darragh", 1234334567891L, 1233456789, 123);
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Sir", "Darragh", 1235473822, 1222222223, 19);});
        assertEquals("This is not a valid title", exMessage.getMessage());
    }

    @Test
    void testNamePass(){
        Passenger myPassenger = new Passenger("Mr", "Darragh", 1234567891, 1233456789, 123);
        assertEquals("Darragh", myPassenger.getName());
    }

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mr", "ls", 1235422173822L, 1222222223, 19);});
        assertEquals("This is not a valid name", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}