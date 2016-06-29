import java.util.Scanner;

/**
 * Created by mgkan on 2016-06-28.
 */
public class AdvFunctions {
  public static void main(String[]args){
    //testing
    System.out.println(oddEven(-5222));//#1
    System.out.println("-----------------------------");
    System.out.println(spellCheck("MichAEl","michAel"));//#2
    System.out.println("-----------------------------");
    wStoper("Dragons are good for War");//#3
    System.out.println("-----------------------------");
    genRandomNum();//#4
    System.out.println("-----------------------------");
    System.out.println(nextDay(1, 6, 2050));//#5
    System.out.println("-----------------------------");
    System.out.println(halfWord("HarryPotter"));//#6
    System.out.println("-----------------------------");
    allButFour(34);//#7
    System.out.println("-----------------------------");
    sameNum(6,6);//#8
    System.out.println("-----------------------------");
    System.out.println("Please enter a country domain:");//#9
    countryDomain();//#9
    System.out.println("-----------------------------");
    System.out.println("Please enter a letter:");//#10
    vOrC();//#10



  }
  //Write a function that takes in a number and returns true if the number is even or false if the number is odd. You may use control flow and multiple conditionals.
  public static boolean oddEven(int a) {
    if( a%2 == 0){
      return true;
    }else return false;
  }
  //Write a function that takes in two words and compares them. If the spelling is the same, the functions returns true, otherwise false.
  public static boolean spellCheck(String a, String b){
    if(a.toLowerCase().equals(b.toLowerCase())){
      return true;
    }else return false;
  }
  //Write a function that takes in a word and prints out its every letter on a new line before it sees the letter "w". If it encounters "w" the function should stop executing.
  public static void wStoper(String a){
    for(int i= 0;i<a.length();i++) {
      if (a.toLowerCase().charAt(i) != 'w') {
        System.out.println(a.charAt(i));
      }else break;
    }
  }
  //Write a function that generates a random number. Print it out. If the number is greater that 50, return it, otherwise return -1. You may use control flow and multiple conditionals.
  public static void genRandomNum(){
    int randNum = (int)(Math.random()*100);
    if(randNum > 50){
      System.out.println(randNum);
    }else System.out.println(-1);
  }
  //Write a function that takes in 3 integers: day, month, and year and computes day, month, and year of the next day. The function should return a string (e.g. day:12 month:11 year:1988)
  public static String nextDay(int day, int month, int year){

    switch (day) {
      case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:
      case 11:case 12:case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:
      case 21:case 22:case 23:case 24:case 25:case 26:case 27://I wonder if there is a better way to do this
        day++;
        break;
      case 28:
        if (month == 2 && ((2016 - year) % 4) != 0){
          day = 1;
          month++;
        }else day++;
        break;
      case 29:
        if (((2016 - year) % 4) == 0 && month == 2){
        day = 1;
        month++;
      }else day++;
      break;
      case 30:
        if (month == 4 || month == 6 || month == 9 || month == 11) {
          day = 1;
          month++;
        }day++;
        break;
      case 31:
        day = 1;
        if (month == 12) {
          month = 1;
          year++;
        } else {
          month++;
        }
        break;
      default:
        System.out.println("What are you talking about??");
    }
    String tomorrow ="day:"+day+" month:"+month+" year:"+year;
    return tomorrow;
  }
  //Write a function that takes in a word, omits every other letter in that word and returns a new word. You can use control flow and multiple conditionals.
  public static String halfWord(String word){
    String halfString = "";
    for(int i = 0; i<=word.length() ; i++){
      if(i%2==0){
        halfString += word.charAt(i);
      }
    }
    return halfString;
  }
  //Write a function that takes in a number greater than 5 and prints out all the numbers from 1 to that number except number 4. Please use a while statement.
  public static void allButFour(int num){
    int i=1;
    while(i<=num){
      if(i!=4){
        System.out.println(i);
      }
      i++;
    }
  }
  //Write a function that takes in 2 numbers, and checks if they are the same. If they are not the same, it adds 1 to every number and returns its sum. If the numbers are the same, it adds 2 to every number and returns its sum.
  public static void sameNum(int a, int b){
    if(a==b){
      System.out.println(a+b+4);
    }else System.out.println(a+b+2);
  }
  //Write a function that asks the user to enter a country domain. If the user types in "us", the function prints out "United States", if the user enters "de", the function prints out "Germany", if the user types in "hu" the response should be "Hungary". In all other cases the function should print out "Unknown". Please try to use a switch statement and make sure the function works with a user's input of lower and upper case strings.
  public static void countryDomain(){
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();
    switch(userInput.toLowerCase()){
      case "us":
        System.out.println("United States");
        break;
      case "de":
        System.out.println("Germany");
        break;
      case "hu":
        System.out.println("Hungary");
        break;
      default:
        System.out.println("Unknown");
    }
  }
  //Write a function that asks the user to type in a letter and prints out whether the letter is a vowel or a consonant. You may use control flow and multiple conditionals.
  public static void vOrC(){
    Scanner input = new Scanner(System.in);
    String letter =input.nextLine().toLowerCase();
    if(letter.equals("a") ||letter.equals("e") ||letter.equals("i") ||letter.equals("o") ||letter.equals("u")){
      System.out.println("The letter is a vowel");
    }else System.out.println("The letter is a consonant");

  }
}








