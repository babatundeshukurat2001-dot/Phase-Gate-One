import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class FacebookTest{

    @Test
public void testThatTheFacebookLikeDoesNotExit(){
   String [] expected = {};
   String [] actual = TheFacebookLikeDoesNotExit;
    assertEquals(actual,expected); 
       }

    @Test
public void testThatNoOneLikesThisFacebookLike(){
    String [] name = {};
    String [] expected = {};
    String actual = NoOneLikesThisFacebookLike(name);
    assertEquals(expected,actual);
     }






}
