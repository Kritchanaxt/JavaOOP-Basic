public class PrimitiveCasting {
    public static void main(String[] args) {
        int num = 10;
        double dNum = num;  // แปลงจาก int เป็น double (Implicit Casting)

        System.out.println("Integer: " + num);
        System.out.println("Double: " + dNum);

        double dNum2 = 10.99;
        int num2 = (int) dNum;  // แปลงจาก double เป็น int (Explicit Casting)

        System.out.println("Integer: " + num2);
        System.out.println("Double: " + dNum2);
    }
}
