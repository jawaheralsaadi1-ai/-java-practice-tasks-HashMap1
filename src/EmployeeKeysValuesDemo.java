
import java.util.HashMap;


public class EmployeeKeysValuesDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> empIDsWithNamesMap = new HashMap<>();

//Add at least 5 employee records using the put() method
        empIDsWithNamesMap.put(101, "Ali");
        empIDsWithNamesMap.put(102, "Maha");
        empIDsWithNamesMap.put(103, "Wala");
        empIDsWithNamesMap.put(104, "Omar");
        empIDsWithNamesMap.put(105, "Majid");

        //  Display all employee IDs
        System.out.println(" Full Employees ID List : " + empIDsWithNamesMap.keySet());
        // Display all employee names
        System.out.println(" Full Employees Name List : " + empIDsWithNamesMap.values());

// Add one more employee record
        empIDsWithNamesMap.put(106, "Fahad");
        //  Display all employee IDs
        System.out.println(" Update Employees ID List : " + empIDsWithNamesMap.keySet());
        // Display all employee names
        System.out.println(" Update Employees Name List : " + empIDsWithNamesMap.values());


}

}
