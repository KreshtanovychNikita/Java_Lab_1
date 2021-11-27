import java.util.Objects;
import java.util.UUID;

public class Detal {
    UUID Id;
    UUID IdProizvoditel;
    String Name;
    int Articul;
    float Price;

    public Detal(){

    }

    public static class Builder{
        Detal Detal;

        public Builder(){
            Detal = new Detal();
        }

        public Builder addIdDetal(){
           addIdDetal(UUID.randomUUID());
           return this;
        }

        public Builder addIdDetal(UUID id) {
            Detal.Id = id;
            return this;
        }
        public Builder addIdProizvoditel(UUID id){
            Detal.IdProizvoditel = id;
            return this;
        }
        public Builder addName(String name){
            Detal.Name = name;
            return  this;
        }
        public Builder addArticul(int articul){
            Detal.Articul = articul;
            return this;
        }
        public Builder addPrice(float price){
            Detal.Price = price;
            return this;
        }
        public Detal build(){
            return Detal;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Detal)) return false;
        Detal detal = (Detal) o;
        return Articul == detal.Articul && Float.compare(detal.Price, Price) == 0 && Objects.equals(Id, detal.Id) && Objects.equals(IdProizvoditel, detal.IdProizvoditel) && Objects.equals(Name, detal.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, IdProizvoditel, Name, Articul, Price);
    }

    @Override
    public String toString() {
        return "Detal{" +
                "Id=" + Id +
                ", IdProizvoditel=" + IdProizvoditel +
                ", Name='" + Name + '\'' +
                ", Articul=" + Articul +
                ", Price=" + Price +
                '}';
    }
    /**
     * Отримання id деталі
     * @return
     */
    public UUID getId() {return Id;}
    /**
     * Отримання id виробника деталей
     * @return
     */

    public UUID getIdProizvoditel() {return IdProizvoditel;}
    /**
     * Отримання назви деталі
     * @return
     */
    public String getName() {return Name;}
    /**
     * Отримання артикулу деталі
     * @return
     */

    public int getArticul() {return Articul;}
    /**
     * Отримання ціни деталі
     * @return
     */

    public float getPrice() {return Price;}
}
