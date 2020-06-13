import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryStatement() {
        //frlanje na iskluchok vo sluchaj na vnesuvanje na prazna lista, ili null
        /*IllegalArgumentException ex;
        ex = (IllegalArgumentException.class, ()->SILab2.function(null));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));*/
        //ochekuvame da dobieme string od tipot # # # # # # # soodvetno zatoa shto zadadenata lista od stringovi e konkretno samo # # # # # # # # #
        assertEquals("[#, #, #, #, #, #, #, #, #]",SILab2.function(createList("#", "#", "#", "#", "#", "#", "#", "#", "#")));
        /*treba da dobieme na izlez String od tipot # # # 2 # # 1 1 # zatoa shto vo konkretnata lista od stringovi imame 3 0, i soodvetno ednata se naogja izmegju dva # /
        izmegju 1 # i ushte edna 0, i istoto e i za poslednata*/
        assertEquals("[#, #, #, 2, #, #, 1, 1, #]",SILab2.function(createList("#", "#", "#", "0", "#", "#", "0", "0", "#")));
    }
    @Test
    void testEveryBranch(){
        //frlanje na iskluchok vo sluchaj na vnesuvanje na prazna lista, ili null
        /*IllegalArgumentException ex;
        ex = (IllegalArgumentException.class, ()->SILab2.function(null));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));*/

        //ochekuvaniot rezultat koj shto treba da go vrati e string od tipot # # # # # #, zatoa shto vo listata od stringovi koja shto ja zadavame soodvetno nema 0
        assertEquals("0", SILab2.function(createList("#","#","#","#")));
        //ochekuvame da vrati [#, #, #, #, 1, 1, #, #, 1, 1, #, 1, 1, #, 2, #] string od vakov tip zatoa shto vo listata od stringovi ima 7 nuli od koi shto pred 6
        //od niv imame samo po edna # pred, ili zad niv soodvetno i samo okolu edna 0 ima dve #
        assertEquals("[#, #, #, #, 1, 1, #, #, 1, 1, #, 1, 1, #, 2, #]"SILab2.function(createList("#","#","#","#","0","0","#","#","0","0","#","0","0","#","0","#")));

}
