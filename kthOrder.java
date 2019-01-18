import java.io.File;
import java.util.Scanner;

public class kthOrder {

    public static void main(String[] args) {

        //initialize a new binary search tree
        BST Tree = new BST();

        //read the data from the first input file
        try {
            File dataX = new File(args[0]);
            Scanner dataXReader = new Scanner(dataX);
            while (dataXReader.hasNext()) {

                Tree.InsertAndUpdateSize(dataXReader.nextLong());
            }
            dataXReader.close();
        } catch (Exception e) {
            System.out.println(args[0] + " is invalid.");
        }

        //read the position from the second input file
        try {
            File positionX = new File(args[1]);
            Scanner positionXReader = new Scanner(positionX);
            System.out.println("Below are the outputs:");
            while (positionXReader.hasNext()) {

                //print out kth smallest statistic in the tree with given k
                System.out.println(Tree.KthSmallest(Tree.root(),
                        positionXReader.nextLong()));

            }
            positionXReader.close();
        } catch (Exception e) {
            System.out.println(args[1] + " is invalid.");
        }

    }
}
