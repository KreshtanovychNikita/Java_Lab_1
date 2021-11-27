import java.util.Objects;
import java.util.UUID;

public class Proizvoditel {
    UUID Id;
    String name;
    String phoneNumber;
    String country;


    public Proizvoditel() {


    }

    public static class Builder{
        Proizvoditel Proizvoditel;

        public Builder(){
            Proizvoditel = new Proizvoditel();

        }
        public Builder addIdProizvoditel(){
            addIdProizvoditel(UUID.randomUUID());
            return this;
        }
        public Builder addIdProizvoditel(UUID id){
            Proizvoditel.Id = id;
            return this;
        }
        public Builder addName(String name){
            Proizvoditel.name = name;
            return  this;
        }
        public  Builder addPhoneNumber(String number){
            Proizvoditel.phoneNumber = number;
            return  this;
        }
        public Builder addCountry(String country){
            Proizvoditel.country = country;
            return this;
        }
        public Proizvoditel build(){
            return Proizvoditel;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proizvoditel)) return false;
        Proizvoditel that = (Proizvoditel) o;
        return Objects.equals(Id, that.Id) && Objects.equals(name, that.name) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(country, that.country);
    }

    @Override
    public String toString() {
        return "Proizvoditel{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, phoneNumber, country);
        
        
        
    }

    /**
     * Отримання id виробника
     * @return
     */
    public UUID getId() {
        return Id;
    }
    /**
     * Отримання назви виробника
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Отримання телефонного номеру виробника
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Отримання країни виробника
     * @return
     */
    public String getCountry() {
        return country;
    }
}