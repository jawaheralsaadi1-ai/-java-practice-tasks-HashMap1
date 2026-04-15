import java.util.HashMap;
import java.util.Map;

public class EmployeeIterateDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> empIDsWithNamesMap = new HashMap<>();

//Add at least 5 employee records using the put() method
        empIDsWithNamesMap.put(101, "Ali");
        empIDsWithNamesMap.put(102, "Maha");
        empIDsWithNamesMap.put(103, "Wala");
        empIDsWithNamesMap.put(104, "Omar");
        empIDsWithNamesMap.put(105, "Majid");

       // Display the full HashMap
        System.out.println(" Full Employees List : " + empIDsWithNamesMap);
        System.out.println(" Full Employees List separately : " );
        // Display each employee record separately using loop
        for(Map.Entry<Integer, String> entry : empIDsWithNamesMap.entrySet()){
            // Print each key and value
            System.out.println(" ID: " + entry.getKey() + " , Name:" + entry.getValue());
        }
        //Add one more employee record
        empIDsWithNamesMap.put(106, "Fahad");
        System.out.println(" Updet Employees List After add (106,'Fahad') : " );
        // Display each employee record separately using loop
        for(Map.Entry<Integer, String> entry : empIDsWithNamesMap.entrySet()){
            // Print each key and value
            System.out.println(" ID: " + entry.getKey() + " , Name:" + entry.getValue());



}

} }
