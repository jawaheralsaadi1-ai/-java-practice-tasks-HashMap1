
import java.util.HashMap;

public class EmployeeRemoveDemo
{
    public static void main(String[] args) {
    HashMap<Integer, String> empIDsWithNamesMap = new HashMap<>();

        empIDsWithNamesMap.put(101, "Ali");
        empIDsWithNamesMap.put(102, "Maha");
        empIDsWithNamesMap.put(103, "Wala");
        empIDsWithNamesMap.put(104, "Omar");
        empIDsWithNamesMap.put(105, "Majid");
        System.out.println(" Full Employees List : " + empIDsWithNamesMap);
        String ID1 = empIDsWithNamesMap.remove(102);
        System.out.println(" Update  Employees List after remove '102' : " + empIDsWithNamesMap);
        String ID2 = empIDsWithNamesMap.remove(104);
        System.out.println(" Update  Employees List after remove '104' : " + empIDsWithNamesMap);
        String ID3 = empIDsWithNamesMap.remove(107); //Attempt to remove an ID that does not exist
        System.out.println(" Update  Employees List after remove  ID not exist '107' : " + empIDsWithNamesMap);



    }
}