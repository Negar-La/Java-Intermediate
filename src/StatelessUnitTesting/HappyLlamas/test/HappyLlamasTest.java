package StatelessUnitTesting.HappyLlamas.test;

import org.junit.jupiter.api.Test;

import static StatelessUnitTesting.HappyLlamas.main.HappyLlamas.areTheLlamasHappy;
import static org.junit.jupiter.api.Assertions.*;

class HappyLlamasTest {

    public HappyLlamasTest() {
    }

    //Test plan: areTheLlamasHappy(false, 10) → false
    @Test
    public void testNormalTrampoline10() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = false;
        int numTrampolines = 10;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertFalse(result, "10 Llamas w/ Normal Trampolines should be Unhappy!");
    }

    //Test plan: areTheLlamasHappy(false, 24) → true
    @Test
    public void testNormalTrampoline24() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = false;
        int numTrampolines = 24;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertTrue(result, "24 Llamas w/ Normal Trampolines should be happy!");
    }

    //Test plan: areTheLlamasHappy(false, 30) → true
    @Test
    public void testNormalTrampoline30() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = false;
        int numTrampolines = 30;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertTrue(result, "30 Llamas w/ Normal Trampolines should be happy!");
    }

    //Test plan: areTheLlamasHappy(false, 42) → true
    @Test
    public void testNormalTrampoline42() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = false;
        int numTrampolines = 42;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertTrue(result, "42 Llamas w/ Normal Trampolines should be happy!");
    }

    //Test plan: areTheLlamasHappy(false, 50) → false
    @Test
    public void testNormalTrampoline50() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = false;
        int numTrampolines = 50;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertFalse(result, "50 Llamas w/ Normal Trampolines should be unhappy!");
    }

    //areTheLlamasHappy(true, 10) → false
    @Test
    public void testUltraTrampoline10() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = true;
        int numTrampolines = 10;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertFalse(result, "10 Llamas w/ UltraBouncy Trampolines should be unhappy!");
    }

    //areTheLlamasHappy(true, 24) → true
    @Test
    public void testUltraTrampoline24() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = true;
        int numTrampolines = 24;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertTrue(result, "24 Llamas w/ UltraBouncy Trampolines should be happy!");
    }

    //areTheLlamasHappy(true, 30) → true
    @Test
    public void testUltraTrampoline30() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = true;
        int numTrampolines = 30;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertTrue(result, "30 Llamas w/ UltraBouncy Trampolines should be happy!");
    }

    //areTheLlamasHappy(true, 42) → true
    @Test
    public void testUltraTrampoline42() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = true;
        int numTrampolines = 42;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertTrue(result, "42 Llamas w/ UltraBouncy Trampolines should be happy!");
    }

    //areTheLlamasHappy(true, 50) → true
    @Test
    public void testUltraTrampoline50() {
        //Arrange - set up the parameters.
        boolean isNasaFabric = true;
        int numTrampolines = 50;

        //Act - call the method and capture the result.
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        //Assert - a method/conditional that proves the result is what you expected.
        assertTrue(result, "50 Llamas w/ UltraBouncy Trampolines should be happy!");
    }
}