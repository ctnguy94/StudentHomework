public class Student {
    private String firstname;
    private String lastname;
    private int peopleID;
    private String classStanding;
    private String emailID;
    private String address;
    private String city;
    private int zip;
    private int array;

    public void getInfo(String first, String last, int ID, String stand, String email, String addy, String cityAddress, int zipcode){
        firstname = first;
        lastname = last;
        peopleID = ID;
        classStanding = stand;
        emailID = email;
        address=addy;
        city = cityAddress;
        zip = zipcode;
    }
    public void setArray(int arr){
        array = arr;
    }
    public int getArray(){
        return array;
    }
    public void displayInfo(){
        System.out.println("\n==Student Details | Department of ILT==");
        System.out.println(firstname + "\t" + lastname + "\t" + peopleID
        + classStanding + "\t" + peopleID + "\t" + emailID + "\t" + address + "\t" + city +"\t"+zip+"\n");
    }

}
