package com.tts;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    String myString;
    myString ="hello";
    myString ="world";

    int myInt1 = 10;
    myInt1 =11;
    myInt1 =5+3;// => 8
    myInt1 =myInt +1;// =>9
    myInt1 +=1;// => 10
    myInt1 -=1;// => 9
    myInt1 ++;// => 10
    myInt1 --;
    myInt1 *=20;

    final int MY_INT = 11;
    //  MY_INT =5;// you can't reassign

    float myFloat = 10.99f;
    myFLoat1 =1.99f;

    double myDouble1 = 10.99;

    boolean myBoolean = true;
    myBooolean =false;

    myBoolean =5>1;// true
    myBoolean =1 < 5;
    myBoolean =5==5;//
    myBoolean =5!=10;// true
    myBoolean =5>=10;

    String myString2 = "Hello";
    myString2 =myString2 +"World";

    myString2 =myString2.concat("Again").

    concat("again");

    boolean containsHello = myString3.contains("hello");

    String myString4 = "hello";
    String myString5 = "hello";
    boolean stringEqual = myString4 == myString5;// => false

    stringsEqual =myString4.equals("hello");// true
    stringsEqual =!myString 4.e

    quals("notthis");// true

    char myChar = 'a';

    String[] students = {"Brent", "Erik", "Jason", 1};
    String firstStudentName = students[0];// => "Brent"

    // create a loop and log each student name;

    for(
    int i = 0;
    i<students.length;i++)

    {
        System.out.println(students[i]);
    }

    for(
    String student:students)

    {
        System.out.println(student);
    }

}
    /**
     *  nicely formatted
     *  multiline comment
     */

    String[] stringArray;
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Jenny");
    names.add("Erik");

    String secondName = names.get(1);
    names.remove(o: "John");

    boolean doesErikExist = names.contain("Erik"); // => true
    boolean doesJohnExist = names.contain("John"); // => false

List<String> fruits = List.of("Bananas", "oranges", "kiwis");

for (int i = 0; i < names.size(); i ++) {
    System.out.println(names.get(i));
        }

for (String fruit: fruits) {
    System.out.println(fruit);
        }

fruits.forEach(fruit -> {
    fruits.forEach(fruit -> {
        });