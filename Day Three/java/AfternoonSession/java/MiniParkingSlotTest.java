import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


    @Test 
public static testThatThereAreTwentySlot(){    
    int []  slot = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20];
    int expected = 20;
    int actual = MiniParkingSlot.ThereAreTwentySlot;
    assertEquals(expected,actual);
        }

    @Test
public static testThatThereAreEmptySlot(){
    int []  slot = 0;
    int expected = 0;
    int actual = MiniParkingSlot.ThereAreEmptySlot;
    assertEquals(expected,actual);
         }

    @Test
public static testThatACarOccupiesASlot(){
    int [] slot = 1;
    int expected  = 1;
    int actual  = MiniParkingSlot.ACarOccupiesASlot; 
    assertEquals(expected,actual);
        }

    
