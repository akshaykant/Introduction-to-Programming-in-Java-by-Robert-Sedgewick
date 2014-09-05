========================================================
Introduction-to-Programming-in-Java-by-Robert-Sedgewick
========================================================

          -------------------------
           ELEMENTS OF PROGRAMMING
          -------------------------
**It instructs you on how to create, compile, and execute a Java program on your system.**

-----------------------
### Creating a Java Program
-----------------------

We break the process of programming in Java into three steps:
- **Create** the program by typing it into a text editor and saving it to a file named, say, _MyProgram.java. (class MyProgram)_
- **Compile** it by typing "_javac MyProgram.java_" in the terminal window.
- **Run (or execute)** it by typing "_java MyProgram_" in the terminal window.

------------
 ### Errors
------------

Most errors are easily fixed by carefully examining the program as we create it, in just the same way as we fix spelling and grammatical errors when we type an e-mail message.
- **Compile-time errors**. These errors are caught by the system when we compile the program, because they prevent the compiler from doing the translation (so it issues an error message that tries to explain why).
- **Run-time errors.** These errors are caught by the system when we execute the program, because the program tries to peform an invalid operation (e.g., division by zero).
- **Logical errors.** These errors are (hopefully) caught by the programmer when we execute the program and it produces the wrong answer. Bugs are the bane of a programmer's existence. They can be subtle and very hard to find.

------------------------
### Delimiters
------------------------

Material inside quotation marks is an exception to the rule of the previous question: things within quotes are taken literally so that you can precisely specify what gets printed. If you put any number of successive spaces within the quotes, you get that number of spaces in the output. If you accidentally omit a quotation mark, the compiler may get very confused, because it needs that mark to distinguish between characters in the string and other parts of the program. _To print a quotation mark, a newline, or a tab, use \", \n, or \t, respectively, within the quotation marks._

-----------------------------
### command-line argument
-----------------------------

We can put several, though we normally use only a few. We refer to the first one as args[0] the second one as args[1], the third one as args[2], and so forth. Note that we start counting from 0 in Java.

------------------
### class file
------------------

It's a binary file (sequence of 0s and 1s). If you are using Unix or OS X, you can examine its contents by typing od -x HelloWorld.class at the command prompt. This displays the results in hexadecimal (base 16). In deference to Java's name,_the first word of every .class file is cafe babe._

0000000 &nbsp;**cafe babe** &nbsp; 0000 &nbsp;  002e &nbsp;  001d &nbsp;  0a00 &nbsp;  0600  &nbsp; 0f09 <br>
0000020 &nbsp;  0010 &nbsp;  0011 &nbsp;  0800 &nbsp;  120a &nbsp;  0013  &nbsp; 0014 &nbsp;  0700 &nbsp; 1507	<br>
0000040  &nbsp; 0016 &nbsp;  0100 &nbsp;  063c &nbsp;  696e &nbsp;  6974 &nbsp;  3e01 &nbsp;  0003 &nbsp;  2829	<br>
0000060   &nbsp; 5601 &nbsp;   0004  &nbsp;  436f  &nbsp;  6465  &nbsp;  0100 &nbsp;   0f4c  &nbsp;  696e &nbsp;   654e	<br>
0000100  &nbsp;  756d  &nbsp;  6265 &nbsp;   7254  &nbsp;  6162  &nbsp;  6c65  &nbsp;  0100   &nbsp; 046d  &nbsp;  6169	<br>
0000120 &nbsp;  6e01 &nbsp;  0016  &nbsp; 285b &nbsp;  4c6a &nbsp;  6176 &nbsp;  612f  &nbsp; 6c61 &nbsp;  6e67	<br>
0000140  &nbsp; 2f53 &nbsp;  7472 &nbsp;  696e  &nbsp; 673b  &nbsp; 2956  &nbsp; 0100  &nbsp; 0a53  &nbsp; 6f75 <br>
0000160  &nbsp; 7263 &nbsp;  6546 &nbsp;  696c &nbsp;  6501 &nbsp;  000f &nbsp;  4865  &nbsp; 6c6c &nbsp;  6f57 <br>
0000200  &nbsp; 6f72  &nbsp; 6c64 &nbsp;  2e6a &nbsp;  6176  &nbsp; 610c  &nbsp; 0007  &nbsp; 0008  &nbsp; 0700 <br>
0000220  &nbsp; 170c  &nbsp; 0018  &nbsp; 0019  &nbsp; 0100  &nbsp; 0c48 &nbsp;  656c &nbsp;  6c6f  &nbsp; 2c20 <br>
0000240  &nbsp; 576f  &nbsp; 726c  &nbsp; 6407  &nbsp; 001a  &nbsp; 0c00  &nbsp; 1b00  &nbsp; 1c01  &nbsp; 000a <br>
0000260  &nbsp; 4865  &nbsp; 6c6c &nbsp;  6f57  &nbsp; 6f72  &nbsp; 6c64 &nbsp;  0100  &nbsp; 106a  &nbsp; 6176 <br>
0000300  &nbsp; 612f &nbsp;  6c61 &nbsp;  6e67 &nbsp;  2f4f &nbsp;  626a  &nbsp; 6563 &nbsp;  7401 &nbsp;  0010 <br>
0000320  &nbsp; 6a61 &nbsp;  7661 &nbsp;  2f6c &nbsp;  616e  &nbsp; 672f &nbsp;  5379 &nbsp;  7374  &nbsp; 656d <br>
0000340 &nbsp;  0100 &nbsp;  036f  &nbsp; 7574 &nbsp;  010 &nbsp; 0 154c  &nbsp; 6a61  &nbsp; 7661  &nbsp; 2f69 <br>
0000360 &nbsp;  6f2f &nbsp;  5072  &nbsp; 696e  &nbsp; 7453 &nbsp;  7472  &nbsp; 6561  &nbsp; 6d3b  &nbsp; 0100 <br>
0000400  &nbsp; 136a  &nbsp; 6176 &nbsp;  612f &nbsp;  696f  &nbsp; 2f50 &nbsp;  7269  &nbsp; 6e74  &nbsp; 5374 <br>
0000420  &nbsp; 7265 &nbsp;  616d  &nbsp; 0100 &nbsp;  0770  &nbsp; 7269  &nbsp; 6e74  &nbsp; 6c6e &nbsp;  0100 <br>
0000440 &nbsp;  1528  &nbsp; 4c6a &nbsp;  6176  &nbsp; 612f  &nbsp; 6c61  &nbsp; 6e67 &nbsp;  2f53  &nbsp; 7472 <br>
0000460 &nbsp;  696e &nbsp;  673b &nbsp;  2956 &nbsp;  0021  &nbsp; 0005  &nbsp; 0006 &nbsp;  0000  &nbsp; 0000 <br>
0000500  &nbsp; 0002  &nbsp; 0001 &nbsp;  0007  &nbsp; 0008 &nbsp;  0001 &nbsp;  0009 &nbsp;  0000  &nbsp; 001d <br>
0000520  &nbsp;  &nbsp; 0001  &nbsp; 0001 &nbsp;  0000 &nbsp;  0005  &nbsp; 2ab7  &nbsp; 0001  &nbsp; b100  &nbsp; 0000 <br>
0000540  &nbsp; 0100  &nbsp; 0a00  &nbsp; 0000  &nbsp; 0600  &nbsp; 0100 &nbsp;  0000 &nbsp;  0c00 0900 <br>
0000560  &nbsp; 0b00 &nbsp;  0c00 &nbsp;  0100  &nbsp; 0900 &nbsp;  0000  &nbsp; 2500  &nbsp; 0200  &nbsp; 0100 <br>
0000600 &nbsp;  0000  &nbsp; 09b2 &nbsp;  0002 &nbsp;  1203  &nbsp; b600 &nbsp;  04b1  &nbsp; 0000  &nbsp; 0001 <br>
0000620  &nbsp; 000a &nbsp;  0000  &nbsp; 000a  &nbsp; 0002  &nbsp; 0000 &nbsp;  000f  &nbsp; 0008  &nbsp; 0010 <br>
0000640  &nbsp; 0001 &nbsp;  000d  &nbsp; 0000  &nbsp; 0002  &nbsp; 000e <br>
0000652  &nbsp; <br>

------------------
### Debugging Example
------------------
|1|<br>
**I typed in the following program. It compiles fine, but when I execute it, I get the error java.lang.NoSuchMethodError: main. What am I doing wrong?<br>
public class Hello {<br>
 &nbsp;  &nbsp;  &nbsp; public static void main() {<br>
  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp; System.out.println("Doesn't execute");   <br>
  &nbsp;  &nbsp; }<br>
}**<br><br>
|Answer:| _you forgot the String[] args. It is required._<br><br>

|2|<br>
**What happens if we omit/misspell the identifier "void" in the program?**<br><br>

|Answer:| _It compiels fine but gives a run-time error._




