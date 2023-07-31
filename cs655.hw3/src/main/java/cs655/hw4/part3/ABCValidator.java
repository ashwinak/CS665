package cs655.hw4.part3;

public class ABCValidator {
    public static boolean ValidateCustomer(String name, String phNo) {
        if (name == "Alice" && phNo == "222-333-4444") {
            return true;
        }
        else {
            return false;
        }

    }
}
