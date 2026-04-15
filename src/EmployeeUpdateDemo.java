import java.util.HashMap;
public class EmployeeUpdateDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> empIDsWithNamesMap = new HashMap<>();

//Add at least 5 employee records using the put() method
        empIDsWithNamesMap.put(101, "Ali");
        empIDsWithNamesMap.put(102, "Maha");
        empIDsWithNamesMap.put(103, "Wala");
        empIDsWithNamesMap.put(104, "Omar");
        empIDsWithNamesMap.put(105, "Majid");

        // Display all elements in the HashMap
        System.out.println(" Full Employees List : " + empIDsWithNamesMap);
//Update the name of one ID 101 (Ali -> Fahad)
        empIDsWithNamesMap.put(101, "Fahad");
        // Display the updated HashMap
        System.out.println(" Update Employees List : " + empIDsWithNamesMap);
// Use the get() method to show the updated value for that key
        System.out.println(" Update name of 101  : " + empIDsWithNamesMap.get(101));
//Update another employee(102) (Maha -> Fatma)
           empIDsWithNamesMap.put(102, "Fatma");
           //Display the map again after the second update
        System.out.println(" Final Update Map  : " + empIDsWithNamesMap);


}

}
