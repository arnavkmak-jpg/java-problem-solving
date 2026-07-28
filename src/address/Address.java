package address;

public class Address {
    String city;
    String zipCode;

    Address(String city, String zipCode){
        this.city=city;
        this.zipCode=zipCode;
    }
    @Override
    public String toString(){
        return this.city+" with zip code "+this.zipCode;
    }
}
