### **Scanner**

The `Scanner` class ใน Java ใช้สำหรับรับข้อมูลจากผู้ใช้งาน (Input) โดยรองรับข้อมูลในหลายรูปแบบ เช่น **int**, **float**, **double**, และ **String**.

---

### **การใช้งาน `Scanner`**
1. **นำเข้า Scanner Class**
   - ต้องนำเข้า `java.util.Scanner` ก่อนใช้งาน.
   ```java
   import java.util.Scanner;
   ```

2. **สร้าง Object ของ Scanner**
   - ใช้ `Scanner` เพื่อเชื่อมต่อกับแหล่งข้อมูล เช่น `System.in` (รับข้อมูลจากคีย์บอร์ด).
   ```java
   Scanner scanner = new Scanner(System.in);
   ```

---

### **เมธอดสำคัญใน `Scanner`**
| เมธอด        | คำอธิบาย                                       | ตัวอย่าง Input      | ตัวอย่าง Output |
|---------------|------------------------------------------------|---------------------|------------------|
| `nextInt()`   | รับค่าจำนวนเต็ม (Integer).                     | **123**             | `123`            |
| `nextFloat()` | รับค่าทศนิยมแบบ Float.                         | **12.34**           | `12.34`          |
| `nextDouble()`| รับค่าทศนิยมแบบ Double (ละเอียดกว่า Float).     | **45.678**          | `45.678`         |
| `nextLine()`  | รับค่าข้อความ (String) ทั้งบรรทัด.             | **Hello World**     | `"Hello World"`  |

---

### **ตัวอย่างโค้ด**

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // สร้าง Scanner Object
        Scanner scanner = new Scanner(System.in);

        // รับค่า Integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("Integer: " + intValue);

        // รับค่า Float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Float: " + floatValue);

        // รับค่า Double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Double: " + doubleValue);

        // รับค่า String ทั้งบรรทัด
        scanner.nextLine(); // เพื่อเคลียร์ buffer
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("String: " + stringValue);

        // ปิด Scanner
        scanner.close();
    }
}
```

---

### **ตัวอย่างการทำงาน**
#### **Input**
```
Enter an integer: 123
Enter a float: 12.34
Enter a double: 45.678
Enter a string: Hello Java!
```

#### **Output**
```
Integer: 123
Float: 12.34
Double: 45.678
String: Hello Java!
```

---

### **ข้อควรระวังในการใช้ Scanner**
1. **Buffer Issue**: เมื่อใช้ `nextInt()`, `nextFloat()`, หรือ `nextDouble()` แล้วต่อด้วย `nextLine()` จำเป็นต้องใช้ `scanner.nextLine()` เพิ่มเพื่อเคลียร์ buffer.
   ```java
   scanner.nextLine(); // แก้ปัญหาข้ามบรรทัด
   ```

2. **การปิด Scanner**: เมื่อใช้งานเสร็จแล้ว ควรปิด `scanner.close()` เพื่อประหยัดทรัพยากร.
