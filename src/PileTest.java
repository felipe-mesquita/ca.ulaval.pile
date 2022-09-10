import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PileTest {
    @Test
    public void tester_Pile_InitialementEstVide(){
        Pile pile = new Pile();
        assertTrue(pile.estVide());
    }

    @Test
    public void tester_Empilage_AvecUnElement_PileNestPlusVide(){
        Pile pile = new Pile();
        pile.empiler(5);
        assertFalse(pile.estVide());
    }

    @Test
    public void tester_EmpilageEtDepilage_AvecUnElement_DoitRetournerElementDepile(){
        int element = 5;
        Pile pile = new Pile();
        pile.empiler(element);
        int elementRetourne = pile.depiler();

        assertEquals(element, elementRetourne);
    }

    @Test
    public void tester_EmpilageEtDepilage_AvecPlusieursElements_DoitDepilerOrdreInverse() {
        Pile pile = new Pile();
        pile.empiler(25);
        pile.empiler(5);

        int premierDepile = pile.depiler();
        int deuxiemeDepile = pile.depiler();

        assertEquals(premierDepile, 5);
        assertEquals(deuxiemeDepile,25);
    }
}
