import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.testng.Assert.*;
public class DetalTest {
    @Test
    public void goodCreateDetal(){
        Detal detal = new Detal.Builder()
                .addIdDetal()
                .addName("b")
                .addIdProizvoditel(UUID.randomUUID())
                .addArticul('5')
                .addPrice(1589)
                .build();
    }

    @Test
    public void UnmutableDataAfterCreating(){
        UUID id = UUID.randomUUID();
        UUID proizvid = UUID.randomUUID();
        Detal detal = new Detal.Builder()
                .addIdDetal(id)
                .addName("b")
                .addArticul('5')
                .addPrice(1589)
                .addIdProizvoditel(proizvid)
                .build();

        assertEquals(detal.getId(),id);
        assertEquals(detal.getName(),"b");
        assertEquals(detal.getArticul(),'5');
        assertEquals(detal.getPrice(),1589);
        assertEquals(detal.getIdProizvoditel(),proizvid);
    }



}

