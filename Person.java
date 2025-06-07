class Person{

private String name, address, phoneNumber;

public Person(){}

public Person(String name, String address, String phoneNumber){
this.name= name;
this.address= address;
this.phoneNumber= phoneNumber;
}

public String getName(){
return name;
}

public void setName(String name){
this.name= name;
}
public String getAddress(){
return address;
}

public void setAdress(String address){
this.address= address;
}

public String getphoneNumber(){
return phoneNumber;
}

public void setphoneNumber(String phoneNumber){
this.phoneNumber= phoneNumber;
}

}