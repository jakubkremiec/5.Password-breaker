import java.util.Scanner;

public class Main {

    String password;
    short wordSize=0;
    long startTime = System.nanoTime();
    static String abcd;

    public static void main(String[] args) {

        abcd = "abcdefghijklmnoprstuwyxzABCDEFGHIJKLMNOPRSTUWYXZ0123456789!@#$%^&*()-_=+";  //alphabet for password

        Main main = new Main();
        System.out.println("Hello!\nPassword need to have at least 4 characters and maximally 8 characters.\nPassword need to contains one big letter, one small, and one number.");
        main.passworBrake(main.getPasswordFromUser(),abcd.length());  //password breaker
    }

    public String getPasswordFromUser(){

        System.out.print("Type in your password:");
        Scanner scanner = new Scanner(System.in);
        password = new String();
        password = scanner.next();             //getting user ,,password" from input

        if (!(password.matches(".*[a-z]+.*") &&     //password needs to have at least one small letter
                password.matches(".*[A-Z]+.*") &&   //password needs to have at least one big letter
                password.matches(".*[0-9]+.*") &&   //password needs to have at least one number letter
                password.matches(".{4,8}"))){       ////password needs to have 4 to 8 letters
            System.out.println("Incorrect password!");
            getPasswordFromUser();  //if password dont meet requirements, method works in loop using recursion
        }
        return password;
    }



    public void passworBrake(String password, long loopSize){

        char[] chars = abcd.toCharArray();      //creating array of chars
        boolean found = false;                  //variable used to check if app found password
        int abcdLenght = abcd.length();
        String checker;                         //declaration of string which in every step of loop saves actual guess

        forloop:
        for(int i = 0; i<loopSize ; i++) {  //loop with size of actual lenght of actual guess. For example word of 1 lenght has 72 possible combinations, word of 2 lenght has 72*72 possible combinations



            switch (wordSize){      //switch of actual word lenght
                case 0:
                    checker = String.format("1: %c", chars[i % abcdLenght]);    // variable checker holds actual guess of loop
                    System.out.println(checker);
                    if (checker.substring(3).equals(password)){         // check if actual guess (checker) is password
                        System.out.println("FOUND!!!!!");
                        found=true;                                    // if checker == password, then found is true, it means that it dont need to do recursion anymore
                        break forloop;                                 // breakes for loop
                    }
                    break;
                case 1:
                    checker = String.format("2: %c%c", chars[i / abcdLenght % abcdLenght], chars[i % abcdLenght]);      //same as before, but now it holds 2 letters
                    System.out.println(checker);
                    if (checker.substring(3).equals(password)){
                        System.out.println("FOUND!!!!!");
                        found=true;
                        break forloop;
                    }
                    break;
                case 2:
                    checker = String.format("3: %c%c%c",chars[(i / (abcdLenght*abcdLenght)) % abcdLenght], chars[i / abcdLenght % (abcdLenght)], chars[i % abcdLenght]);    //same as before, but now it holds 3 letters
                    System.out.println(checker);
                    if (checker.substring(3).equals(password)){
                        System.out.println("FOUND!!!!!");
                        found=true;
                        break forloop;
                    }
                    break;
                case 3:
                    checker = String.format("4: %c%c%c%c", chars[(i / (abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i/(abcdLenght*abcdLenght))%(abcdLenght)], chars[i / abcdLenght % (abcdLenght)], chars[i % abcdLenght]);
                    System.out.println(checker);
                    if (checker.substring(3).equals(password)) {
                        System.out.println("FOUND!!!!!");
                        found = true;
                        break forloop;
                    }
                    break;
                case 4:
                    checker = String.format("5: %c%c%c%c%c", chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i/(abcdLenght*abcdLenght*abcdLenght))%(abcdLenght)], chars[(i/(abcdLenght*abcdLenght))%(abcdLenght)], chars[i / abcdLenght % (abcdLenght)], chars[i % abcdLenght]);
                    System.out.println(checker);
                    if (checker.substring(3).equals(password)) {
                        System.out.println("FOUND!!!!!");
                        found = true;
                        break forloop;
                    }
                    break;
                case 5:
                    checker = String.format("6: %c%c%c%c%c%c", chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i/(abcdLenght*abcdLenght*abcdLenght))%(abcdLenght)], chars[(i/(abcdLenght*abcdLenght))%(abcdLenght)], chars[i / abcdLenght % (abcdLenght)], chars[i % abcdLenght]);
                    System.out.println(checker);
                    if (checker.substring(3).equals(password)) {
                        System.out.println("FOUND!!!!!");
                        found = true;
                        break forloop;
                    }
                    break;
                case 6:
                    checker = String.format("7: %c%c%c%c%c%c%c", chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i/(abcdLenght*abcdLenght*abcdLenght))%(abcdLenght)], chars[(i/(abcdLenght*abcdLenght))%(abcdLenght)], chars[i / abcdLenght % (abcdLenght)], chars[i % abcdLenght]);
                    System.out.println(checker);
                    if (checker.substring(3).equals(password)) {
                        System.out.println("FOUND!!!!!");
                        found = true;
                        break forloop;
                    }
                    break;
                case 7:
                    checker = String.format("8: %c%c%c%c%c%c%c%c", chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i / (abcdLenght*abcdLenght*abcdLenght*abcdLenght)) % abcdLenght], chars[(i/(abcdLenght*abcdLenght*abcdLenght))%(abcdLenght)], chars[(i/(abcdLenght*abcdLenght))%(abcdLenght)], chars[i / abcdLenght % (abcdLenght)], chars[i % abcdLenght]);
                    System.out.println(checker);
                    if (checker.substring(3).equals(password)) {
                        System.out.println("FOUND!!!!!");
                        found = true;
                        break forloop;
                    }
                    break;
            }
        }

        if(found) {        //if for loop founds password, that if dont allow to do recursion
            long finshTime = System.nanoTime();

            System.out.println("It took in total " + (double)(finshTime-startTime)/1000000000); //calculation how much time does searching took
        }else{
            wordSize++;     // wordSize++ it means that actual word size isnt one we are looking for
            passworBrake(password, loopSize * abcdLenght); //recursion of method until we found password
        }
    }
}

