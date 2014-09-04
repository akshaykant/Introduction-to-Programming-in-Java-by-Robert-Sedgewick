
/*************************************************************************
 *  Compilation:  javac UseThreeArguements.java
 *  Execution:    java UseThreeArguements name1 name2 name3
 *
 *  Takes 3 command-line arguments and prints them in reverse order
 *  in a friendly greeting.
 *
 *  % java UseThree Alice Bob Carol
 *  Hi, Carol, Bob, and Alice.
 *
 *  % java UseThree Carol Bob Alice
 *  Hi, Alice, Bob, and Carol.
 *
 *************************************************************************/

public class UseThreeArguements {

    public static void main(String[] args) {
        System.out.print("Hi, "+ args[2] + ", " + args[1] + ", and " + args[0] + ".");
       
    }

}
