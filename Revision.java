package CoreJavaQuickRevision;

import CoreJavaQuickRevision.persons.Teacher;
import CoreJavaQuickRevision.shapes.Shape;
import CoreJavaQuickRevision.shapes.Triangle;
import June_12.C;

import java.util.*;
import java.util.stream.Collectors;

public class Revision {
    public static void main(String[] args) {
        //System.out.println(p1(23));
        //p2(44);
        //p3(6);
        //p4(43872.32);
        //System.out.println(p5(12.21));
        //p6(7);
        //p7(4273.623);
        //p8(423.12);
        //p9();
        //p10();
        //p11();
        //p12();
        //p13();
        //p14();
        //p15();
        //p16();
        //p17();
        //p18();
        //p19();
        //p20("hello world");
        //p21("hello","world");
        //p22("hello","Hello");
        //p23("aabbcc");
        //p24("racecar");
        //p25("racecarr");
        //p26("hello world");
        //p27("HeLlO WoRlD");
        //p28("hello qorld", 6, 'w');
        //p29("hello world", "world"); ***
        //p30();
        //p31();
        //p32();
        //p33();
        //p34();
        //p35();
        //p36();
        //p37();
        //p38();
        //p39();
        //p40();
        //p41();
        //p42();
        //p43();
        //p44();
        //p45();
        //p46();
        //p47();
        //p48();
        //p49();
        //p50();
        //p51();
        //p52();
        //p53();
        //p54();
        //p59();
        //p60();
        p61();
    }

    //Write a program to check if a number is prime.
    public static boolean p1(int value) {
        if(value == 0 || value == 1) return false;
        if(value == 2) return true;

        for(int i = 2; i <= value/2; ++i) {
            if(value%i == 0) return false;
        }
        return true;
    }

    //Write a program to print the Fibonacci series up to a given number.
    public static void p2(int value) {
        int num1=0;
        int num2=1;
        for(int i = 0; i < value; ++i) {
            if(num1 <= value) {
                System.out.println(num1 + " ");
                int num3 = num1+num2;
                num1 = num2;
                num2 = num3;
            }
        }
    }

    //Write a program to find the factorial of a number.
    public static void p3(int value) {
        int result = 1;
        for(int i = value; i > 1; --i) {
            result = result * i;
        }
        System.out.println("Factorial of " + value + " is: " + result);
    }

    //Write a program to reverse a number.
    public static <N extends Number> void p4(N num) {
        StringBuilder sb = new StringBuilder(num.toString());
        sb.reverse();
        System.out.println(sb);
    }

    //Write a program to check if a number is a palindrome.
    public static <N extends Number> boolean p5(N num) {
        StringBuilder sb = new StringBuilder(num.toString());
        for(int i = 0; i < sb.length(); ++i) {
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    //Write a program to print the multiplication table of a given number.
    public static void p6(int value) {
        for(int i = 1; i <= 12; ++i) {
            System.out.println(value + "*" + i + "=" + (value*i));
        }
    }

    //Write a program to count the number of digits in a number.
    public static <N extends Number> void p7(N num) {
        StringBuilder sb = new StringBuilder(num.toString());
        int count = 0;
        for(int i = 0; i < sb.length(); ++i) {
            if(sb.charAt(i) != '.') ++count;
        }
        System.out.println("This number has " + count + " digits.");
    }

    //Write a program to find the sum of the digits of a number.
    public static <N extends Number> void p8(N num) {
        StringBuilder sb = new StringBuilder(num.toString());
        int sum = 0;
        for(int i = 0; i < sb.length(); ++i) {
            if(sb.charAt(i) != '.') {
                sum+=Integer.valueOf(sb.charAt(i));
                System.out.println(sum);
            }
        }
        System.out.println("Sum of the digits in " + num + " is " + sum);
    }

    //Write a program to find the largest element in an array.
    public static void p9() {
        int[] ints = {1,432,7,54324,423,1,321,5};
        int max = Arrays.stream(ints).max().getAsInt();
        System.out.println("Largest element in array is: " + max);
    }

    //Write a program to find the second largest element in an array.
    public static void p10() {
        int[] ints = {1,432,7,54324,423,1,321,5};
        Arrays.sort(ints);
        System.out.println("Second largest element is " + ints[ints.length-2]);
    }

    //Write a program to find the smallest element in an array.
    public static void p11() {
        int[] ints = {19,432,7,54324,423,11,321,5,63};
        Arrays.sort(ints);
        System.out.println("Smallest element is " + ints[0]);
    }

    //Write a program to find the sum of all elements in an array.
    public static void p12() {
        int[] ints = {19,432,7,54324,423,11,321,5,63};
        int sum = 0;
        for(int i = 0; i < ints.length; ++i) {
            sum+=ints[i];
        }
        System.out.println("Sum of all elements is " + sum);
    }

    //Write a program to find the average of all elements in an array.
    public static void p13() {
        int[] ints = {19,432,7,54324,423,11,321,5,63};
        int sum = 0;
        for(int i = 0; i < ints.length; ++i) {
            sum+=ints[i];
        }
        System.out.println("Average of all elements is " + ((double)sum/ints.length));
    }

    //Write a program to reverse an array.
    public static void p14() {
        int[] ints = {19,432,7,54324,423,11,321,5,63};
        for(int i = 0; i < ints.length/2; ++i) {
            int temp = ints[i];
            ints[i] = ints[ints.length-1-i];
            ints[ints.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(ints));
    }

    //Write a program to find the frequency of each element in an array.
    public static void p15() {
        int[] ints = {19,432,7,54324,423,11,321,5,63,5,123,19,7,7,432};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < ints.length; ++i) {
            if(map.containsKey(ints[i])) {
                map.put(ints[i],map.get(ints[i])+1);
            } else {
                map.put(ints[i], 1);
            }
        }
        System.out.println(map);
    }

    //Write a program to sort an array in ascending order.
    public static void p16() {
        int[] ints = {19,432,7,54324,423,11,321,5,63,5,123,19,7,7,432};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }

    //Write a program to sort an array in descending order.
    public static void p17() {
        int[] ints = {19,432,7,54324,423,11,321,5,63,5,123,19,7,7,432};
        Arrays.sort(ints);
        int[] results = new int[ints.length];
        for(int i = 0; i < results.length; ++i) {
            results[i] = ints[ints.length-1-i];
        }
        System.out.println(Arrays.toString(results));
    }

    //Write a program to remove duplicate elements from an array.
    public static void p18() {
        int[] ints = {19,432,7,54324,423,11,321,5,63,5,123,19,7,7,432};
        ints = Arrays.stream(ints).distinct().toArray();
        System.out.println(Arrays.toString(ints));
    }

    //Write a program to merge two arrays.
    public static void p19() {
        int[] ints1 = {19,432,7,54324,423,11};
        int[] ints2 = {321,5,63,5,123,19,7,7,432};
        int[] ints3 = new int[ints1.length + ints2.length];
        for(int i = 0; i < ints1.length; ++i) {
            ints3[i] = ints1[i];
        }
        int j = 0;
        for(int i = ints1.length; i < ints3.length; ++i) {
            ints3[i] = ints2[j];
            ++j;
        }
        System.out.println(Arrays.toString(ints3));
    }

    //Write a program to find the length of a string.
    public static void p20(String str) {
        System.out.println("Length of " + str + " is " + str.length());
    }

    //Write a program to concatenate two strings.
    public static void p21(String str1, String str2) {
        System.out.println(str1+str2);
    }

    //Write a program to compare two strings.
    public static void p22(String str1, String str2) {
        if(str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
    }

    //Write a program to reverse a string.
    public static void p23(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

    //Write a program to check if a string is a palindrome.
    public static void p24(String str) {
        for(int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("Not a palindrome.");
                return;
            }
        }
        System.out.println("Palindrome.");
    }

    //Write a program to find the frequency of each character in a string.
    public static void p25(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); ++i) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }

    //Write a program to count the number of vowels and consonants in a string.
    public static void p26(String str) {
        Character[] vowels = {'a','e','i','o','u'};
        Character[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        int numVowels = 0;
        int numConsonants = 0;
        for(int i = 0; i < str.length(); ++i) {
            for(Character v:vowels) {
                if(str.charAt(i) == v) {
                    ++numVowels;
                }
            }

            for(Character c:consonants) {
                if(str.charAt(i) == c) {
                    ++numConsonants;
                }
            }
        }
        System.out.println("Vowels: " + numVowels);
        System.out.println("Consonants: " + numConsonants);
    }

    //Write a program to convert a string to uppercase and lowercase.
    public static void p27(String str) {
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    //Write a program to replace a character in a string.
    public static void p28(String str, int index, char c) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < sb.length(); ++i) {
            if(i == index) {
                result.append(c);
            } else {
                result.append(sb.charAt(i));
            }
        }
        System.out.println(result);
    }

    //Write a program to find a substring in a string.
    public static void p29(String str, String subStr) {
//        for(int i = 0; i < str.length(); ++i) {
//
//        }
    }

    //Define a class Person with attributes like name, age, and address. Create and display objects of this class.
    public static void p30() {
        Person p1 = new Person("Tyler", 33, "123 home st.");
        Person p2 = new Person("Tommy", 29, "321 north st.");
        System.out.println(p1);
        System.out.println(p2);
    }

    //Define a class Rectangle with attributes length and breadth and methods to calculate area and perimeter. Create and display objects of this class.
    public static void p31() {
        Rectangle r1 = new Rectangle(3.5, 8.0);
        System.out.println("Area of r1: " + r1.calcArea());
        System.out.println("Perimeter of r1: " + r1.calcPerimeter());
        System.out.println(r1);
    }

    //Define a class Circle with an attribute radius and methods to calculate area and circumference. Create and display objects of this class.
    public static void p32() {
        Circle c1 = new Circle(5.5);
        System.out.println("Area of c1: " + c1.calcArea());
        System.out.println("Circumference of c1: " + c1.calcCircumference());
        System.out.println(c1);
    }

    //Define a class Employee with attributes like name, id, and salary. Create and display objects of this class.
    public static void p33() {
        Employee e1 = new Employee("Tyler",31941, 75000.0);
        Employee e2 = new Employee("Tommy", 48521, 85000.00);
        System.out.println(e1);
        System.out.println(e2);
    }

    //Define a class Student with attributes like name, roll number, and marks. Create and display objects of this class.
    public static void p34() {
        Student s1 = new Student("Tyler", 4431, 78.5);
        Student s2 = new Student("Tommy", 1329, 81.2);
        System.out.println(s1);
        System.out.println(s2);
    }

    //Define a superclass Animal with a method makeSound(). Create subclasses Dog and Cat that override the makeSound() method.
    public static void p35() {
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }

    //Define a superclass Shape with a method draw(). Create subclasses Circle, Rectangle, and Triangle that override the draw() method.
    public static void p36() {
        CoreJavaQuickRevision.shapes.Circle c1 = new CoreJavaQuickRevision.shapes.Circle();
        c1.draw();
        CoreJavaQuickRevision.shapes.Rectangle r1 = new CoreJavaQuickRevision.shapes.Rectangle();
        r1.draw();
        Triangle t1 = new Triangle();
        t1.draw();
    }

    //Define a superclass Vehicle with attributes like make and model. Create subclasses Car and Bike with additional attributes and methods.
    public static void p37() {
        Car car = new Car("Honda", "Accord", 4);
        System.out.println(car);
        Bike bike = new Bike("Toyota", "Bike", 140);
        System.out.println(bike);
    }

    //Define a superclass Person with attributes like name and age. Create subclasses Teacher and Student with additional attributes and methods.
    public static void p38() {
        CoreJavaQuickRevision.persons.Student student = new CoreJavaQuickRevision.persons.Student("Tyler", 28, "computer science");
        student.study();
        Teacher teacher = new Teacher("Timothy", 56, "Science");
        teacher.gradePapers();
    }

    //Demonstrate method overloading with a class Calculator that has multiple add() methods for different parameter types.
    public static void p39() {
        Calculator calculator = new Calculator();
        calculator.add(2,4);
        calculator.add(3,6,7);
        calculator.add(2.7, 3.2);
    }

    //Demonstrate method overriding with a superclass Shape and its subclasses Circle, Rectangle, and Triangle.
    public static void p40() {
        Shape shape = new Shape();
        shape.draw();
        CoreJavaQuickRevision.shapes.Circle circle = new CoreJavaQuickRevision.shapes.Circle();
        circle.draw();
        CoreJavaQuickRevision.shapes.Rectangle rectangle = new CoreJavaQuickRevision.shapes.Rectangle();
        rectangle.draw();
        Triangle triangle = new Triangle();
        triangle.draw();
    }

    //Define an abstract class Animal with an abstract method makeSound(). Create subclasses Dog and Cat that implement the makeSound() method.
    public static void p41() {
        CoreJavaQuickRevision.animals.Dog dog = new CoreJavaQuickRevision.animals.Dog();
        dog.makeSound();
        CoreJavaQuickRevision.animals.Cat cat = new CoreJavaQuickRevision.animals.Cat();
        cat.makeSound();
    }

    //Define an interface Shape with methods calculateArea() and calculatePerimeter(). Create classes Circle, Rectangle, and Triangle that implement the Shape interface.
    public static void p42() {
        CoreJavaQuickRevision.shapes2.Circle circle = new CoreJavaQuickRevision.shapes2.Circle(3.8);
        circle.calculateArea();
        circle.calculatorPerimeter();

        CoreJavaQuickRevision.shapes2.Rectangle rectangle = new CoreJavaQuickRevision.shapes2.Rectangle(3.5, 5);
        rectangle.calculateArea();
        rectangle.calculatorPerimeter();

        CoreJavaQuickRevision.shapes2.Triangle triangle = new CoreJavaQuickRevision.shapes2.Triangle(7,5,3, 4);
        triangle.calculateArea();
        triangle.calculatorPerimeter();
    }

    //Define a class BankAccount with private attributes like accountNumber and balance. Provide public methods to access and modify these attributes.
    public static void p43() {
        BankAccount bankAccount = new BankAccount("413213412", 1500.00);
        bankAccount.setBalance(2000.00);
        System.out.println(bankAccount.getBalance());
        bankAccount.setAccountNumber("999999");
        System.out.println(bankAccount.getAccountNumber());
    }

    //Write a program to handle ArrayIndexOutOfBoundsException.
    public static void p44() {
        int[] ints = {19,432,7,54324,423,11,321,5,63,5,123,19,7,7,432};
        try {
            System.out.println(ints[500]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    //Write a program to handle NumberFormatException.
    public static void p45() {
        String str = "hello";
        try {
            Double val = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
    }

    //Write a program to handle NullPointerException.
    public static void p46() {
        Integer[] ints = new Integer[10];
        try {
            if(20==ints[5]) {
                System.out.println("yes");
            }
        } catch (NullPointerException e) {
            System.out.println("CAUGHT");
            System.out.println(e.getMessage());
        }
    }

    //Write a program that uses try, catch, and finally blocks.
    public static void p47() {
        int i = 5;
        try {
            int j = i/0;
        } catch (ArithmeticException e) {
            System.out.println("CAUGHT " + e.getMessage());
        } finally {
            System.out.println("finally block");
        }
    }

    //Write a program to create and use a custom exception InvalidAgeException.
    public static void p48() {
        try {
            throw new InvalidAgeException("invalid age");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    //Write a program to demonstrate the use of ArrayList.
    public static void p49() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(10);
        myList.add(15);
        System.out.println(myList.size());
        myList.remove(2);
        System.out.println(myList.get(0));
        myList.add(22);
        myList.stream().map(a->a+5).forEach(System.out::println);
    }

    //Write a program to demonstrate the use of LinkedList.
    public static void p50() {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(10);
        myList.add(20);
        myList.add(50);
        System.out.println(myList);
        myList.remove(1);
        int lastElement = myList.getLast();
        LinkedList<Integer> anotherList = (LinkedList<Integer>) myList.clone();
        System.out.println(anotherList);
    }

    //Write a program to demonstrate the use of HashSet.
    public static void p51() {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(4);
        set.add(5);
        System.out.println(set);
        if(!set.isEmpty()) {
            set.clear();
        }
        System.out.println(set.size());
    }

    //Write a program to demonstrate the use of TreeSet.
    public static void p52() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(12);
        treeSet.add(19);
        treeSet.add(6);
        if(treeSet.contains(8)) {
            System.out.println("contains 8");
        } else {
            System.out.println("does not contain 8");
        }
        System.out.println(treeSet);
    }

    //Write a program to demonstrate the use of HashMap.
    public static void p53() {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] myInts = {3,5,1,6,8,1,4,6,7,2,4,1,45,6,2,3,1,56,7,98,3,3};
        for(int i:myInts) {
            map.put(i,map.containsKey(i)?map.get(i)+1:1);
        }
        System.out.println(map);
    }

    //Write a program to demonstrate the use of TreeMap.
    public static void p54() {
        String[] myStr = {"hello","world","four","hi","bye","good","great","bad","sad","phone","java"};
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for(String s:myStr) {
            if(treeMap.containsKey(s.length())) {
                treeMap.put(s.length(), treeMap.get(s.length()) + ", " + s);
            } else {
                treeMap.put(s.length(), s);
            }
        }
        for(Object o:treeMap.keySet()) {
            System.out.println(o);
        }

        for(Object o:treeMap.values()) {
            System.out.println(o);
        }

        System.out.println(treeMap);
    }

    //Write a program to read content from a file.
    public static void p55() {

    }

    //Write a program to write content to a file.
    public static void p56() {

    }

    //Write a program to copy content from one file to another.
    public static void p57() {

    }

    //Write a program to read and write objects to a file using serialization.
    public static void p58() {

    }

    //Write a program to create and run multiple threads by extending the Thread class.
    public static void p59() {
        Multi m1 = new Multi();
        Multi m2 = new Multi();
        m1.start();
        m2.start();
    }

    //Write a program to create and run multiple threads by implementing the Runnable interface.
    public static void p60() {
        multi2 m = new multi2();
        multi2 o = new multi2();
        m.run();
        o.run();
    }

    //Write a program to demonstrate thread synchronization using synchronized methods.
    public static void p61() {
        multi3 m1 = new multi3();
        multi3 m2 = new multi3();
        m1.start();
        m2.start();
    }
}
