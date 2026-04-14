
import java.util.HashMap;


public class EmployeeCheckDemo {


   public static void main(String[] args) {
        HashMap<Integer, String> empIDsWithNamesMap = new HashMap<>();
       empIDsWithNamesMap.put(101,"Ali");
        empIDsWithNamesMap.put(102, "Maha");
        empIDsWithNamesMap.put(103, "Wala");
        empIDsWithNamesMap.put(104, "Omar");
        empIDsWithNamesMap.put(105, "Majid");
        System.out.println(" Full Employees List : " + empIDsWithNamesMap);
        boolean ID1 = empIDsWithNamesMap.containsKey("102");
        System.out.println("check if  ID  with number '102' is exists: Result :  " + ID1);
        boolean ID2 = empIDsWithNamesMap.containsKey(105);
       System.out.println("check if second ID  with number '105' is exists: Result :  " + ID2);
       boolean name1= empIDsWithNamesMap.containsValue("Maha");
       System.out.println("check if  name  'Maha' is exists: Result :  " + name1);
       boolean name2= empIDsWithNamesMap.containsValue("Hajer");
       System.out.println("check if  name  'Omar' is exists: Result :  " + name2);






   }
}