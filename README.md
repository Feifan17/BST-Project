
### This program contains two java files:
* BST.java
* kthOrder.java


### To use java in stdlinux:  
* open the terminal.
* type "subscribe" and then select JDK-CURRENT. 

### To compile BST.java and kthOrder.java: 
* type "cd [directory]"(the "[directory]" should be replaced by the location of where these two files have been stored.
* type "javac BST.java kthOrder.java" to compile these two files. If they are compiled successfully, you should see three new files in the same directory: 
                             
                             * BST.class
                             * BST$Node.class
                             * kthOrder.class.

### To run the program:
* put your test data files into the same directory with BST.class, BST$Node.class and kthOrder.class.
* the program takes two command line arguments as the names of input files. To run the program, type "java kthOrder dataX positionX". Here, "dataX" should be replaced by the name of your data file, which contains a set of integers. "positionX" should be replaced by the name of your position file, which contains a set of positions. 
* if the program is run successfully, the result will be printed out in the terminal.
