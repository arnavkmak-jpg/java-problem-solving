package address;

public class Person {
    String name;
    Address address;

    Person(String name, Address address){
        this.name=name;
        this.address=address;
    }

    @Override
    public String toString(){
        return this.name+" lives in "+this.address;
    }


}
