package StatelessUnitTesting.src.test.java.com.tsg.unittesting;

import org.junit.jupiter.api.Test;

import static com.tsg.unittesting.DogBuddy.howManyWoofs;
import static org.junit.jupiter.api.Assertions.*;

class DogBuddyTest {

    public DogBuddyTest() {
    }

    @Test
    public void test2(){
        int bones = 2;
        String result = howManyWoofs(2);
        String expectedWoofs = "Woof! Woof! Woof!";
        assertEquals(expectedWoofs, result, "an even number of bones, your dog will bark three times");
    }
    @Test
    public void test22(){
        int bones = 22;
        String result = howManyWoofs(22);
        String expectedWoofs = "Woof! Woof! Woof!";
        assertEquals(expectedWoofs, result, "an even number of bones, your dog will bark three times");
    }
    @Test
    public void test1(){
        int bones = 1;
        String result = howManyWoofs(1);
        String expectedWoofs = "Woof! Woof!";
        assertEquals(expectedWoofs, result, "an odd number of bones, your dog will bark two times");
    }
    @Test
    public void test0(){
        int bones = 0;
        String result = howManyWoofs(0);
        String expectedWoofs = "...";
        assertEquals(expectedWoofs, result, "an odd number of bones, your dog will bark two times");
    }
    @Test
    public void testNegative(){
        int bones = -3;
        String result = howManyWoofs(-3);
        String expectedWoofs = "...";
        assertEquals(expectedWoofs, result, "an odd number of bones, your dog will bark two times");
    }

}