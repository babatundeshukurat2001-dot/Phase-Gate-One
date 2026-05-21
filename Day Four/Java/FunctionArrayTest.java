import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


     @Test 
public static void testThatFunctioArrayExit(){
    int [] Array = {}; 
    int expected = {};
    int actual = FunctionArray.FunctioArrayDoesNotExit;
    assertEquals(actual,expected);
        }



     @Test 
public static testToGetNumber(){
    int [] number = {8,6,12,4,-2};
    int expected = {8};
    int actual = FunctionArray.ToGetNumber;
    assertEquals(actual,expected);
        }

 
    @Test 
public static testToGetSumOfNumber(){
    int [] number = {8,6,12,4,-2};
    int expected = {6};
    int actual = FunctionArray.ToGetSumOfNumber;
    assertEquals(actual,expected);
    }

