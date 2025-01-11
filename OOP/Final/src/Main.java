public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.display();

        v.wheels = 6; // Error: ไม่สามารถเปลี่ยนค่าตัวแปร final
    }
}