public class Main {
    public static void main(String[] args) {
        int intValue = DataInputValidator.getInt("Nhập số nguyên: ");
        double doubleValue = DataInputValidator.getDouble("Nhập số thực: ");
        String stringValue = DataInputValidator.getString("Nhập chuỗi: ");

        System.out.println("Số nguyên: " + intValue);
        System.out.println("Số thực: " + doubleValue);
        System.out.println("Chuỗi: " + stringValue);
    }
}