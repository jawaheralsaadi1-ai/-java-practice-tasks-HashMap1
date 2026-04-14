import java.util.HashMap;




public class EmployeeHashMapDemo {
    public static void main(String[] args) {
     HashMap<Integer, String > empMap = new HashMap<>();
     empMap.put(101,"Ali");
        empMap.put(102,"Maha");
        empMap.put(103,"Wala");
        empMap.put(104,"Omar");
        empMap.put(105,"Majid");
        System.out.println("Origin Employees : " + empMap);
        empMap.put(106,"Mona");
        System.out.println("Update Employees : " + empMap);

    }
}
