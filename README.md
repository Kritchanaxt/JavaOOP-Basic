# Java OOP Concepts

## สารบัญ (Table of Contents)

1. [Getter and Setter](#getter-and-setter)  
2. [Static Keyword](#static-keyword)  
3. [Encapsulation](#encapsulation)  
4. [Abstract](#abstract)  
5. [Interface](#interface)  
6. [Final](#final)  
7. [Polymorphism](#polymorphism)  
   - [Overloading](#overloading)  
   - [Overriding](#overriding)  
8. [Constructor](#constructor)  
9. [Casting](#casting)  
   - [Primitive Casting](#primitive-casting)  
   - [Object Casting](#object-casting)  

---

### **Getter and Setter**
- **Getter**: Method ที่มี `return` ใช้สำหรับรับค่าเพื่อแสดงผล โดยไม่มีการกำหนดค่าใน parameter 
```java
//Getter 
public String getName() { 
   return name; 
}
```
- **Setter**: Method ที่มี parameter ใช้สำหรับกำหนดค่าให้ตัวแปร  
```java
// Setter สำหรับ name  
public void setName(String name) { 
   this.name = name; 
}
```
---

### **Static Keyword**
#### **Static** เป็นคีย์เวิร์ดที่ใช้กำหนดสมาชิกในคลาส (ตัวแปรหรือเมธอด) ให้มีพฤติกรรมร่วมกันในทุก object ของคลาส  
- **Static Variable**: ตัวแปรที่ใช้ร่วมกันทุก object  
  ```java
  public class Example {
      public static int count = 0; // Static Variable
  }
  ```
- **Static Method**: Method ที่สามารถเรียกใช้ได้โดยไม่ต้องสร้าง object  
  ```java
  public class Example {
      public static void display() {
          System.out.println("Static Method");
      }
  }
  ```
  การเรียกใช้งาน:
  ```java
  Example.display(); // เรียกใช้ Static Method โดยตรง
  ```

**คุณสมบัติของ Static**:
1. Static Variable และ Static Method ถูกสร้างขึ้นในหน่วยความจำเพียงครั้งเดียว
2. Static Method ไม่สามารถเข้าถึงตัวแปรหรือ method ที่เป็น non-static ได้โดยตรง  

---

### **Encapsulation**
#### **Encapsulation** เป็นหลักการซ่อนข้อมูล (Data Hiding) และอนุญาตให้เข้าถึงข้อมูลผ่าน Getter และ Setter เท่านั้น  

- **คุณสมบัติของ Encapsulation**:  
  1. ตัวแปรในคลาสกำหนดเป็น `private`  
  2. ใช้ Getter และ Setter เพื่อเข้าถึงตัวแปร  

- **ตัวอย่าง**:
  ```java
  public class Person {
      private String name; // ซ่อนข้อมูลด้วย private
      private int age;

      // Getter
      public String getName() {
          return name;
      }

      // Setter
      public void setName(String name) {
          this.name = name;
      }
  }
  ```

**ข้อดีของ Encapsulation**:
1. เพิ่มความปลอดภัยให้กับข้อมูล (Data Security)  
2. ควบคุมการเข้าถึงตัวแปรในคลาส  
3. ช่วยให้โค้ดสามารถบำรุงรักษา (Maintainability) ได้ง่าย  

---

### **Abstract**
- ใช้เมื่อต้องการกำหนดเมธอดล่วงหน้า แต่ยังไม่กำหนดการทำงาน  
- **เงื่อนไข**:  
  - คลาสต้องเป็น `abstract`  
  - ต้องมี `abstract method` อย่างน้อย 1 ตัว  

```java
// Abstract Class  
abstract  class  Animal { 
   private String name; 

   // Constructor  
   public  Animal(String name) {   
      this.name = name; 
   } 
   
   // Non-Abstract Method (มี implementation)  
   public  void  display() { 
      System.out.println("This is an animal named: " + name); 
   }

   // Abstract Method (ไม่มี implementation)   
   public  abstract  voidsound();
}
```
---

### **Interface**
- Interface มองเมธอดทุกตัวเป็น `abstract` โดยไม่จำเป็นต้องระบุ `abstract` ชัดเจน  
  ```java
  public abstract void jumping(String jump); // หรือ
  public void jumping(String jump);
  ```
- **เงื่อนไข**:  
  - คลาสที่ใช้งานต้อง implement ทุกเมธอดใน interface  

---

### **Final**
#### **บริบทและผลกระทบ**:  
| บริบท  | ผลกระทบ |
|--------|----------|
| ตัวแปร | ค่าของตัวแปรเปลี่ยนแปลงไม่ได้หลังจากกำหนดค่า |
| เมธอด | เมธอดไม่สามารถถูก Override ได้ |
| คลาส  | คลาสไม่สามารถถูกสืบทอดได้ |

**ข้อดีของ `final`**:
1. ป้องกันไม่ให้ตัวแปรสำคัญถูกเปลี่ยนค่า  
2. รักษาความปลอดภัยของเมธอดสำคัญจากการถูก Override  
3. ป้องกันการสืบทอดคลาสที่ไม่ควรแก้ไข  

---

### **Polymorphism**
#### Polymorphism แบ่งออกเป็น 2 แบบ:
1. **Overloading**:  
   - เมธอดที่มีชื่อเหมือนกัน แต่ parameter หรือการทำงานต่างกัน  
   - **ตัวอย่าง**:
     ```java
     public void calculate(int a);
     public void calculate(int a, int b);
     ```
2. **Overriding**:  
   - การเขียนทับเมธอดในคลาสลูก โดยเมธอดต้องมีชื่อและ signature เหมือนกับเมธอดในคลาสแม่  
   - **ตัวอย่าง**:
     ```java
     @Override
     public void display() {
         System.out.println("Overridden Method");
     }
     ```

**สรุป**: Overloading และ Overriding เป็นส่วนหนึ่งของ Polymorphism  

---

### **Constructor**
- Constructor เป็น method พิเศษในคลาสที่ทำงานอัตโนมัติเมื่อสร้าง object  
- ใช้สำหรับกำหนดค่าเริ่มต้นให้กับตัวแปรในคลาส  

```java
public class Student {
   private String name;
   private int phone;
  
   // Constructor  
   public  Student(String name, int phone) {   
      this.name = name; 
      this.phone = phone;
   } 
}
```

---

### **Casting**
#### Primitive Casting:
- **Implicit Casting**: แปลงชนิดข้อมูลขนาดเล็ก → ขนาดใหญ่ (อัตโนมัติ)  
  ```java
  int a = 5;
  double b = a; // Implicit Casting
  ```
- **Explicit Casting**: แปลงชนิดข้อมูลขนาดใหญ่ → ขนาดเล็ก (ต้องระบุเอง)  
  ```java
  double a = 5.5;
  int b = (int) a; // Explicit Casting
  ```

#### Object Casting:
- **Upcasting**: แปลงจาก Subclass → Superclass (อัตโนมัติ)  
  ```java
  Animal animal = new Dog(); // Upcasting
  ```
- **Downcasting**: แปลงจาก Superclass → Subclass (ต้องระบุเอง)  
  ```java
  Animal animal = new Dog();
  Dog dog = (Dog) animal; // Downcasting
  ```

---
