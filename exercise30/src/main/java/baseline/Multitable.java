package baseline;

public class Multitable {
    int oneThruWhat = 12;

    //makes it easy to change the dimensions of the table
    //could easily add a method tha asks user for what table they want
    public int getOneThruWhat() {
        return oneThruWhat;
    }

    public void print(){
        //generates table with double for loop
        //use print f to format table
        for (int a = 1; a <= getOneThruWhat(); a++) {
            for (int b = 1; b <= getOneThruWhat(); b++) {
                System.out.printf("%4d", (a * b));
            }
            System.out.println();
        }
    }
}
