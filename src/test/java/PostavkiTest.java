import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.testng.Assert.*;
public class PostavkiTest {

    @Test
    public void goodCreatePostavki(){
        Postavki postavki = new Postavki.Builder()
                .addIdPostavki()
                .addName("c")
                .addDate()
                .addIdDetal(UUID.randomUUID())
                .build();

    }

    @Test
    public void UnmutableDataAfterCreating(){
        UUID id = UUID.randomUUID();
        Postavki postavki = new Postavki.Builder()
                .addIdPostavki(id)
                .addName("c")
                .addDate()
                .build();

       // assertEquals(postavki.getDate(),"2021");
        assertEquals(postavki.getName(),"c");
        assertEquals(postavki.getIdp(),id);
        //assertEquals(postavki.getIdDetal(), id);

    }
}
