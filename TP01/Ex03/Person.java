//Roberto Rodrigues da Silva Junior Cb3000419
//Rafael Costa Teles Cb1640844

package tp01;

abstract class Person {
    protected String name;
    protected String address;

    protected String getName() {
        return name;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }
        
    protected Person(String name, String address){
        this.name = name;
        this.address = address;
    }
        
    public String toString(){
        return "Person[ name = " + name + ", address = " + address + " ]";
    }
}
