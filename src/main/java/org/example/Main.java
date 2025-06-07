package org.example;
//
////public class Main implements Drawable {
////    public void draw(){
////        System.out.println("in tao lai lan nuwa ne");
////    }
//
//import javax.sound.midi.Soundbank;
//import java.util.List;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class Main extends Second {
//
//
//
//    public static void main(String args[]) {
//        int n;
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap so phan tu trong mang: ");
//        n= input.nextInt();
//        int chuoi[] = new int[n];
//        for(int i=0; i <n;i++){
//            System.out.println("nhap phan tu thu " + i + " : ");
//            chuoi[i] = input.nextInt();
//        }
//
//
//        System.out.println(Second.toggleWords("cUONg BAns LAanh Lam lUON "));
//    }
//
//}

import java.util.*;

public class Main {

    public static void main(String[] args){
        int[] arr = new int[]{3,5,6,6,3,4,3};
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }

}
//        Map<Integer, Student> hashMap = new HashMap<>();
//
//        hashMap.put(1001, new Student(101, "cuongg", "le van sy"));
//        hashMap.put(1002, new Student(102, "cuongg", "le van sy"));
//        hashMap.put(1003, new Student(103, "cuongg", "le van sy"));
//        hashMap.put(1004, new Student(104, "cuongg", "le van sy"));
//        hashMap.put(1001, new Student(101, "cuongg", "le van sy"));
//        hashMap.put(1006, new Student(106, "cuongg", "le van sy"));
//
//
//        Student stu = hashMap.get(1003);
//        System.out.println("detail laf: " + stu.ID);
//        for (Map.Entry<Integer, Student> entry : hashMap.entrySet()) {
//            Student s = entry.getValue();
//            System.out.println("tat ca cac hash la:" + s.getID() + s.getName() + s.getAddress());
//        }
//
//
//        HashSet<Integer> ngu = new HashSet<>();
//        ngu.add(123);
//        ngu.add(234);
//        ngu.add(422);
//        ngu.add(123);
//
//        System.out.println(ngu);
//
//        Iterator<Integer> iterator = ngu.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//
//    }
//    }
//    class Student{
//    int ID;
//    String Name;
//    String Address;
//
//    public Student(int ID, String Name, String Address){
//        this.ID = ID;
//        this.Name = Name;
//        this.Address = Address;
//    }
//
//    public int getID(){
//        return ID;
//    }
//    public String getName(){
//        return Name;
//    }
//    public String getAddress(){
//        return Address;
//    }
//
//    }






