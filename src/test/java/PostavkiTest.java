import org.testng.annotations.Test;

import java.time.LocalDate;
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
        UUID detalid = UUID.randomUUID();
        LocalDate date = LocalDate.now();
        Postavki postavki = new Postavki.Builder()
                .addIdPostavki(id)
                .addName("c")
                .addDate(date)
                .addIdDetal(detalid)
                .build();

        assertEquals(postavki.getDate(),date);
        assertEquals(postavki.getName(),"c");
        assertEquals(postavki.getIdp(),id);
        assertEquals(postavki.getIdDetal(), detalid);

    }
}
