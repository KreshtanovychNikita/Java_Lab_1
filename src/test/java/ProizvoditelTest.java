import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.testng.Assert.*;
public class ProizvoditelTest {
    @Test
    public void goodCreateProizvoditel(){
        Proizvoditel proizvoditel = new Proizvoditel.Builder()
                .addIdProizvoditel()
                .addName("a")
                .addCountry("ua").addPhoneNumber("+123")
                .build();
    }

    @Test
    public void UnmutableDataAfterCreating(){
        UUID id = UUID.randomUUID();
        Proizvoditel proizvoditel = new Proizvoditel.Builder()
                .addIdProizvoditel(id)
                .addName("a")
                .addCountry("ua").addPhoneNumber("+123")
                .build();

        assertEquals(proizvoditel.getCountry(),"ua");
        assertEquals(proizvoditel.getName(),"a");
        assertEquals(proizvoditel.getPhoneNumber(),"+123");
        assertEquals(proizvoditel.getId(),id);
    }



}