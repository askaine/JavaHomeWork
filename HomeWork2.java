import java.util.Scanner;

public class hw2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();

        if (exercise == 1) {
            f1(scanner);
        } else if (exercise == 2) {
            f2(scanner);
        }
        else if (exercise == 3) {
            f3(scanner);
        }
        else if (exercise == 4) {
            f4(scanner);
        }
        else if (exercise == 5) {
            f5(scanner);
        }
        else if (exercise == 6) {
            f6(scanner);
        }
        else if (exercise == 7) {
            f7(scanner);
        }
        else if (exercise == 8) {
            f8(scanner);
        }
        else if (exercise == 9) {
            f9(scanner);
        }
        else if (exercise == 10) {
            f10();
        }


    }

    public static void f1(Scanner scanner) {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter last name initial: ");
        String lastNameInitial = scanner.nextLine();
        System.out.println("Name: " +name+"\nAge: " +age+"\nHeight: " +height+"\nLast name initial: " +lastNameInitial+"\nAge in 10 years: " +(age+10));
    }

    public static void f2(Scanner scanner) {
        System.out.println("Enter seconds: ");
        int seconds = scanner.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds-hours*3600)/60;
        int seconds2 = (seconds-hours*3600)-minutes*60;
        System.out.println("Hours: " + hours + "\nMinutes: "+ minutes + "\nSeconds: " + seconds2);
    }

    public static void f3(Scanner scanner) {
        System.out.println("Enter bill: ");
        int bill = scanner.nextInt();
        System.out.println("Enter tip percentage: ");
        double tipPercentage = scanner.nextInt()/100;
        System.out.println("Enter people: ");
        int people = scanner.nextInt();

        double tip = tipPercentage*bill;
        double total = tip+bill;
        System.out.println("Tip: " + tip + "\nTotal: "+ total + "\nPer person: " + total/people);


    }

    public static void f4(Scanner scanner){
        int sum = 0;
        for(int i=0;i<3;i++){
            System.out.println("Enter Price: ");
            int price = scanner.nextInt();
            System.out.println("Enter quantity: ");
            int quantity = scanner.nextInt();
            sum+=quantity*price;
        }
        System.out.println("Enter sale percentage: ");
        int salePercentage = scanner.nextInt();
        int sale = sum*salePercentage;
        int finalPrice = sum-sale;

        System.out.println("Initial price: " + sum + "\nSale: "+ sale + "\nFinal price: " + finalPrice);

    }

    public static void f5(Scanner scanner){
        System.out.println("Enter Distance[km]: ");
        int distance = scanner.nextInt();
        System.out.println("Enter time[minutes]: ");
        int minutes = scanner.nextInt();

        double hours = minutes/60;
        double averageSpeed = distance/hours;

        System.out.println("Time in hours: " + hours + "\nAverage speed: "+ averageSpeed + "km/h\nDistance in one hour: " + averageSpeed +"km");
    }

    public  static  void f6(Scanner scanner){
        System.out.println("Enter assignments grade: ");
        int assignments = scanner.nextInt();
        System.out.println("Enter quiz grade: ");
        int quiz = scanner.nextInt();
        System.out.println("Enter final exam grade: ");
        int finalExam = scanner.nextInt();

        double finalGrade = assignments*0.2+ quiz*0.3+ finalExam*0.5;
        System.out.println("Final grade: "+finalGrade +"\nResult: ");
        if(finalGrade>55){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }

    public static void f7(Scanner scanner){
        System.out.println("Enter number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();

        if(num1==num2){
            System.out.println("The numbers are equal");
        }
        else if(num1>num2){
            System.out.println("Number 1 is bigger: "+num1);
        }
        else{
            System.out.println("Number 2 is bigger: "+num2);
        }

        if(num1%2==0){
            System.out.println("Number 1 is even");
        }
        else{
            System.out.println("Number 1 is odd");
        }

        if(num2%5==0){
            System.out.println("Number 2 is divisible by 5");
        }
        else{
            System.out.println("Number 2 isnt divisible by 5");
        }

        int sum = num1+num2;
        if(sum>0){
            System.out.println("Sum is positive");
        }
        else if(sum<0){
            System.out.println("Sum is negative");
        }
        else{
            System.out.println("Sum is equal to 0");
        }

    }

    public static void f8(Scanner scanner){
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        if(age<0){
            System.out.println("Error invalid age");
            return;
        }

        if(age<6){
            System.out.println("Price: Free");
        }
        else if(age<17){
            System.out.println("Price: 30");
        }
        else if(age<64){
            System.out.println("Price: 45");
        }
        else{
            System.out.println("Price: 25");
        }


    }
    public static void f9(Scanner scanner){
        System.out.println("Enter word: ");
        String word = scanner.nextLine();

        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: "+word.toUpperCase());
        System.out.println("Lowercase: "+word.toLowerCase());
        System.out.println("First character: "+word.charAt(0));
        System.out.println("Last character: "+word.charAt(word.length()-1));

    }
    public static void f10(){
        int a = 7;
        int b = 2;

        System.out.println(a / b);
        System.out.println(a / 2.0);
        // תוצאה אחת של  3 Int תוצאה שנייה של 3.5 float

        int num = 2147483647;

        System.out.println(num);
        System.out.println(num + 1);
        //  הדפסה ראשונה 2147483647 הדפסה שנייה גלישה וירידה למספר שלילי 2147483647-

        double a2 = 0.1;
        double b2 = 0.2;

        System.out.println(a2 + b2);
        System.out.println(a2 + b2 == 0.3);
        // תוצאה ראשונה חישוב רגיל של חיבור דאבלים יצא 0.3 אבל לא בדיוק 0.3, תוצאה שנייה בדיקה של האם התוצאה של a2+b2 שווה בדיוק 0.3 יהיה false כי המחשב לא יכול לעשות בדיוק 0.3

        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;

        System.out.println(smallPrecision + 1);
        System.out.println(highPrecision + 1);
        //float עם דיוק נמוך אז לא יציג עוד הרבה מספרים אחרי הנקודה ופשוט יעגל
        // double עם דיוק גבוהה אז יציג את המספר האמיתי שהמחשב מכיל ולא יעגל
    }


}