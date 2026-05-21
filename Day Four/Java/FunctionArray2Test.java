import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    @Test
public static void testThatDuplicatesKeepOrder(){
        int [] arr = {9,5,1,9,4,5,1,7};
        int expected = { 9,5,1,4,7};
        int actual = FunctionArray2.DuplicatesKeepOrder;
        assertEquals(actual,expected);
    }

    @Test
public static void testThatToGetHightestAndLowest(){
        int [] arr = {14,9,6,5,8,10};
        int expected = {5,6,7,8,9,10,11,12,13,14};
        int actual = FunctionArray2.ToGetHightestAndLowest;
        assertEquals(actual,expected);
    }


