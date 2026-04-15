import java.util.HashMap;
import java.util.Map;

public class EmployeeCompareUpdateDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> empIDsWithNamesMap = new HashMap<>();

//Add at least 5 employee records using the put() method
        empIDsWithNamesMap.put(101, "Ali\n");
        empIDsWithNamesMap.put(102, "Maha\n");
        empIDsWithNamesMap.put(103, "Wala\n");
        empIDsWithNamesMap.put(104, "Omar\n");
        empIDsWithNamesMap.put(105, "Majid\n");

        // Display the full HashMap
        System.out.println(" Full Employees List : \n" + empIDsWithNamesMap);
    // display the current value of (103)
        System.out.println(" The name of employee with ID of (103) : " + empIDsWithNamesMap.get(103));
//Update the name of  ID 103 (Wala -> Reem)
      empIDsWithNamesMap.put(103, "Reem\n");
      //Show the new updated value
        System.out.println(" The current  name of employee with ID of (105) : " + empIDsWithNamesMap.get(105));
        // display the current value of (105)
        System.out.println(" The name of employee with ID of (105) : " + empIDsWithNamesMap.get(105));
//Update the name of  ID 105 (Majid -> Nasser)
        empIDsWithNamesMap.put(105, "Nasser\n");
        //Show the new updated value
        System.out.println(" The current  name of employee with ID of (105) : " + empIDsWithNamesMap.get(105));
//Display the full HashMap after all updates
        System.out.println(" Full Employees List After All update:\n " + empIDsWithNamesMap);
    }

}
