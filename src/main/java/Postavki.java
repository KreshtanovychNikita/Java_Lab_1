import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Postavki {
    UUID Idp;
    String Name;
    LocalDate Date;
    UUID IdDetal;

    public Postavki(){

    }

    public static class Builder{
        Postavki Postavki;

        public Builder(){
            Postavki = new Postavki();
        }
        Builder addIdPostavki(){
            addIdPostavki(UUID.randomUUID());
            return this;
        }

        Builder addIdPostavki(UUID id) {
            Postavki.Idp = id;
            return this;
        }
        public Builder addName(String name){
            Postavki.Name = name;
            return this;
        }
        public Builder addDate(){
            addDate(LocalDate.now());
            return this;
        }
        public  Builder addDate(LocalDate date){
            Postavki.Date = date;
            return this;
        }
        public  Builder addIdDetal(UUID id){
            Postavki.IdDetal = id;
            return this;
        }
        public Postavki build(){
            return Postavki;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Postavki)) return false;
        Postavki postavki = (Postavki) o;
        return Objects.equals(Idp, postavki.Idp) && Objects.equals(Name, postavki.Name) && Objects.equals(Date, postavki.Date) && Objects.equals(IdDetal, postavki.IdDetal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Idp, Name, Date, IdDetal);
    }

    @Override
    public String toString() {
        return "Postavki{" +
                "Id=" + Idp +
                ", Name='" + Name + '\'' +
                ", Date=" + Date +
                ", IdDetal=" + IdDetal +
                '}';
    }
    /**
     * Отримання id поставки
     * @return
     */
    public UUID getIdp() {return Idp;}
    /**
     * Отримання назви поставки
     * @return
     */
    public String getName() {return Name;}
    /**
     * Отримання дати поставки
     * @return
     */
    public LocalDate getDate() {return Date;}
    /**
     * Отримання id деталі що містится у поставці
     * @return
     */

    public UUID getIdDetal() {return IdDetal;}
}
