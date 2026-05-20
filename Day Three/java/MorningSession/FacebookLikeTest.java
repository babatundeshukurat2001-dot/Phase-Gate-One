import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacebookLikeTest {

    @Test
    public void testThatTheFacebookLikeDoesNotExist(){
        String[] expected = {};
        String[] actual = FacebookLike.TheFacebookLikeDoesNotExist(); 
        assertEquals(expected, actual);
    }


    //@Test
//public void testThatNoOneLikesThisFacebookLike(){
   // String [] name = {};
    //String [] expected = {};
   // String actual = NoOneLikesThisFacebookLike(name);
    //assertEquals(expected,actual);
    // }






}
