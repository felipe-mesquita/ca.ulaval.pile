import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PileTest {
    @Test
    public void pile_InitialementEstVide(){
        Pile pile = new Pile();
        assertTrue(pile.estVide());
    }
}
