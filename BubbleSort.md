### **Bubble Sort with Loop**

### **หลักการทำงานของ Bubble Sort**
1. เปรียบเทียบค่าที่อยู่ติดกัน.
2. ถ้าค่าด้านซ้ายมากกว่าค่าด้านขวา → สลับตำแหน่ง.
3. ทำซ้ำจนกระทั่งข้อมูลเรียงลำดับ.

---

### **โค้ดตัวอย่างใน Java**

```java
public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Before sorting:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    // Method สำหรับ Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;

        // ลูปภายนอก (ควบคุมจำนวนรอบการเปรียบเทียบ)
        for (int i = 0; i < n - 1; i++) {
            // ลูปภายใน (เปรียบเทียบและสลับตำแหน่ง)
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // สลับตำแหน่ง
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Method สำหรับแสดงผล Array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

---

### **อธิบายโค้ด**
1. **Outer Loop**: 
   - กำหนดจำนวนรอบที่ต้องวน (`n - 1` รอบ) เนื่องจากในแต่ละรอบข้อมูลที่ใหญ่สุดจะถูกเลื่อนไปยังตำแหน่งสุดท้าย.
2. **Inner Loop**: 
   - เปรียบเทียบค่าที่อยู่ติดกันใน Array (`array[j]` และ `array[j + 1]`).
   - ถ้าค่าในตำแหน่งซ้าย (`array[j]`) มากกว่าค่าด้านขวา (`array[j + 1]`) ให้สลับตำแหน่ง.
3. **Swapping**:
   - ใช้ตัวแปรชั่วคราว `temp` ในการเก็บค่าชั่วคราวระหว่างการสลับตำแหน่ง.

---

### **ผลลัพธ์**
#### **Before Sorting**
```
64 34 25 12 22 11 90
```

#### **After Sorting**
```
11 12 22 25 34 64 90
```
