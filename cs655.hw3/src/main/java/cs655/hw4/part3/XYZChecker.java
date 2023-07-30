package cs655.hw4.part3;

public class XYZChecker {
    public static boolean backgroundCheck(String name, String phNo,String Address) {
        if (name == "Alice" && phNo == "222-333-4444" && Address == "123 Main St, Boston, MA") {
            return true;
        }
        return false;
    }
}
