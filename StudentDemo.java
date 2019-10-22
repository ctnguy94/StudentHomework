import java.util.Scanner;
public class StudentDemo {
    public static void main(String[] arg){
        int dataNum;
        int[] data;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many students are in the data?");
        dataNum = keyboard.nextInt();
        data = new int[dataNum];
        Student per = new Student();
        for (int index = 0; index < data.length; index++){
            per.getInfo(eachStudents(),eachStudents2(),eachStudents3(),eachStudents4(),eachStudents5(),eachStudents6(),eachStudents7(),eachStudents8());
            per.displayInfo();
        }
        per.setArray(dataNum);
        System.out.println("The number of student count: " + per.getArray());

    }
    public static String eachStudents(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the first name? ");
        String fname = keyboard.nextLine();

        if (fname.matches(".*\\d.*")){           //resource: https://stackoverflow.com/questions/6344867/checking-whether-a-string-contains-a-number-value-in-java
            System.out.println("Non-valid Name Entered/ No numbers!");
            fname= keyboard.nextLine();

        }else{
            System.out.println(fname);
        }
        return fname;
    }
    public static String eachStudents2(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the last name? ");
        String lname = keyboard.nextLine();

        if (lname.matches(".*\\d.*")){           //resource: https://stackoverflow.com/questions/6344867/checking-whether-a-string-contains-a-number-value-in-java
            System.out.println("Non-valid Name Entered/ No numbers!");
            lname = keyboard.nextLine();
        }else{
            System.out.println(lname);
        }
        return lname;
    }
    public static int eachStudents3(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the PeopleSoft ID? (No Letters!)");
        int pID = keyboard.nextInt();
        int len = String.valueOf(pID).length();  //resource: https://www.guvi.in/qa/227/how-to-find-the-integer-length-in-java
        if(len<=7){
            System.out.println(pID);
        }else{
            System.out.println("Non-valid PeopleSoftID/ Please enter up to 7 digits");
            pID = keyboard.nextInt();
        }
        return pID;

    }
    public static String eachStudents4(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the Class Standing? ");
        String sclass = keyboard.nextLine();  //resource: https://stackoverflow.com/questions/32167807/checking-if-a-string-contains-a-dot
        String Fman ="Freshman", Sm ="Sophomore", Jr= "Junior", S = "Senior", fman="freshman", sm = "sophomore", jr = "junior", s = "senior";
        if (sclass.contains(Fman)||sclass.contains(fman)||sclass.contains(Sm)||sclass.contains(sm)||sclass.contains(Jr)||sclass.contains(jr)
                ||sclass.contains(S)||sclass.contains(s)){
            System.out.println(sclass);
        }else{
            System.out.println("Non-valid / Please re-enter (Freshman, Sophomore, Junior, Senior, freshman, sophomore, junior, senior)");
            sclass = keyboard.nextLine();
        }
        return sclass;
    }
    public static String eachStudents5() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the Email? ");
        String email = keyboard.nextLine();
        if(email.contains("@") && email.contains(".com")){
            System.out.println(email);
        }else if(email.contains("@") && email.contains(".org")){
            System.out.println(email);
        }else if(email.contains("@") && email.contains(".edu")){
            System.out.println(email);
        }else{
            System.out.println("Non-valid email/ Please re-enter (EX: name@gmail.com)");
            email = keyboard.nextLine();
        }
        return email;
    }
    public static String eachStudents6(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the Address? ");
        String address = keyboard.nextLine();

        if(address.contains(" ")){
            System.out.println(address);
        }else{
            System.out.println("Non-valid address/ Please re-enter (EX: 13 Windsor Street)");
            address = keyboard.nextLine();
        }
        return address;
    }
    public static String eachStudents7(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the State? ");
        String state = keyboard.nextLine();
        //AK, AL, AR, AZ, CA, CO, CT, DC, DE, FL, GA, HI, IA, ID, IL, IN, KS, KY, LA, MA, MD, ME, MI, MN,
        // MO, MS, MT, NC, ND, NE, NH, NJ, NM, NV, NY, OH, OK, OR, PA, RI, SC, SD, TN, TX, UT, VA, VT,
        // WA, WI, WV, WY
        if (state.contains("AK")||state.contains("AL")||state.contains("AR")||state.contains("AZ")||state.contains("CA")||state.contains("CO")||state.contains("CT")
                ||state.contains("DC")||state.contains("ME")||state.contains("DE")||state.contains("FL")||state.contains("GA")||state.contains("HI")
                ||state.contains("IA")||state.contains("ID")||state.contains("IL")||state.contains("IN")||state.contains("KS")||state.contains("KY")
                ||state.contains("LA")||state.contains("MA")||state.contains("MD")||state.contains("MI")||state.contains("MN")||state.contains("MO")
                ||state.contains("MS")||state.contains("MT")||state.contains("NC")||state.contains("ND")||state.contains("NE")||state.contains("NH")
                ||state.contains("NJ")||state.contains("NM")||state.contains("NV")||state.contains("NY")||state.contains("OH")||state.contains("OK")
                ||state.contains("OR")||state.contains("PA")||state.contains("RI")||state.contains("SC")||state.contains("SD")||state.contains("TN")
                ||state.contains("TX")||state.contains("UT")||state.contains("VA")||state.contains("VT")||state.contains("WA")||state.contains("WI")
                ||state.contains("WV")||state.contains("WY")){
            System.out.println(state);
        }else{

            System.out.println("Non-valid state/ Please re-enter (AK, AL, AR, AZ, CA, CO, CT, DC, DE, FL, GA, HI, " +
                    "IA, ID, IL, IN, KS, KY, LA, MA,\nMD, ME, MI, MN, MO, MS, MT, NC, ND, NE, NH, NJ, NM, NV, NY, OH, OK, OR, PA,\nRI, SC, SD, TN, TX, UT, VA, VT," +
                    "WA, WI, WV, or WY.)");
            state = keyboard.nextLine();

        }
        return state;
    }
    public static int eachStudents8(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the zip code? (No Letters!)");
        int zipc = keyboard.nextInt();
        int len = String.valueOf(zipc).length();
        if(len==9){
            System.out.println(zipc);
        }else{
            System.out.println("Non-valid zip code/ Please re-enter (9 digits!)");
            zipc = keyboard.nextInt();
        }

        return zipc;
    }
}
