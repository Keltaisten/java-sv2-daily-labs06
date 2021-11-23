package layered;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BusinessModelTest {

    @Test
    void testSimpleWord(){
        BusinessModel businessModel = new BusinessModel("aaa",3);
        businessModel.takeGuess("a");
        assertTrue(businessModel.won());
    }

    @Test
    void testSimpleWordFail(){
        BusinessModel businessModel = new BusinessModel("aaa",3);
        businessModel.takeGuess("d");
        assertFalse(businessModel.won());
    }
}
