========================================================
Introduction-to-Programming-in-Java-by-Robert-Sedgewick
========================================================

          -------------------------
           ELEMENTS OF PROGRAMMING
          -------------------------

It instructs you on how to create, compile, and execute a Java program on your system.

-----------------------
Creating a Java Program
-----------------------

We break the process of programming in Java into three steps:
-Create the program by typing it into a text editor and saving it to a file named, say, MyProgram.java. (class MyProgram)
-Compile it by typing "javac MyProgram.java" in the terminal window.
-Run (or execute) it by typing "java MyProgram" in the terminal window.

------------
  Errors
------------

Most errors are easily fixed by carefully examining the program as we create it, in just the same way as we fix spelling and grammatical errors when we type an e-mail message.
-Compile-time errors. These errors are caught by the system when we compile the program, because they prevent the compiler from doing the translation (so it issues an error message that tries to explain why).
-Run-time errors. These errors are caught by the system when we execute the program, because the program tries to peform an invalid operation (e.g., division by zero).
-Logical errors. These errors are (hopefully) caught by the programmer when we execute the program and it produces the wrong answer. Bugs are the bane of a programmer's existence. They can be subtle and very hard to find.

------------------------
  Delimiters
------------------------

Material inside quotation marks is an exception to the rule of the previous question: things within quotes are taken literally so that you can precisely specify what gets printed. If you put any number of successive spaces within the quotes, you get that number of spaces in the output. If you accidentally omit a quotation mark, the compiler may get very confused, because it needs that mark to distinguish between characters in the string and other parts of the program. To print a quotation mark, a newline, or a tab, use \", \n, or \t, respectively, within the quotation marks.

-----------------------------
 command-line argument
-----------------------------

We can put several, though we normally use only a few. We refer to the first one as args[0] the second one as args[1], the third one as args[2], and so forth. Note that we start counting from 0 in Java.

------------------
 class file
------------------

It's a binary file (sequence of 0s and 1s). If you are using Unix or OS X, you can examine its contents by typing od -x HelloWorld.class at the command prompt. This displays the results in hexadecimal (base 16). In deference to Java's name, the first word of every .class file is cafebabe.

0000000 cafe babe 0000 002e 001d 0a00 0600 0f09
0000020 0010 0011 0800 120a 0013 0014 0700 1507
0000040 0016 0100 063c 696e 6974 3e01 0003 2829
0000060 5601 0004 436f 6465 0100 0f4c 696e 654e
0000100 756d 6265 7254 6162 6c65 0100 046d 6169
0000120 6e01 0016 285b 4c6a 6176 612f 6c61 6e67
0000140 2f53 7472 696e 673b 2956 0100 0a53 6f75
0000160 7263 6546 696c 6501 000f 4865 6c6c 6f57
0000200 6f72 6c64 2e6a 6176 610c 0007 0008 0700
0000220 170c 0018 0019 0100 0c48 656c 6c6f 2c20
0000240 576f 726c 6407 001a 0c00 1b00 1c01 000a
0000260 4865 6c6c 6f57 6f72 6c64 0100 106a 6176
0000300 612f 6c61 6e67 2f4f 626a 6563 7401 0010
0000320 6a61 7661 2f6c 616e 672f 5379 7374 656d
0000340 0100 036f 7574 0100 154c 6a61 7661 2f69
0000360 6f2f 5072 696e 7453 7472 6561 6d3b 0100
0000400 136a 6176 612f 696f 2f50 7269 6e74 5374
0000420 7265 616d 0100 0770 7269 6e74 6c6e 0100
0000440 1528 4c6a 6176 612f 6c61 6e67 2f53 7472
0000460 696e 673b 2956 0021 0005 0006 0000 0000
0000500 0002 0001 0007 0008 0001 0009 0000 001d
0000520 0001 0001 0000 0005 2ab7 0001 b100 0000
0000540 0100 0a00 0000 0600 0100 0000 0c00 0900
0000560 0b00 0c00 0100 0900 0000 2500 0200 0100
0000600 0000 09b2 0002 1203 b600 04b1 0000 0001
0000620 000a 0000 000a 0002 0000 000f 0008 0010
0000640 0001 000d 0000 0002 000e
0000652

------------------
Debugging Example
------------------
|1|
I typed in the following program. It compiles fine, but when I execute it, I get the error java.lang.NoSuchMethodError: main. What am I doing wrong?
public class Hello {
   public static void main() {
      System.out.println("Doesn't execute");   
   }
}

|Answer:| you forgot the String[] args. It is required.

|2|
What happens if we omit/misspell the identifier "void" in the program?

|Answer:| It compiels fine but gives a run-time error.




