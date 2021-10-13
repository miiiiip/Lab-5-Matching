/*
CustomPair is a type which contains both a Company and a Programmer, representing one of the pairs
This class also contains rowCounter, which is used for termination
 */

public class CustomPair {
        private Companies company;
        private Programmer program;
        public static int rowCounter=0;
        public static int comparisons=0;

    public Companies getCompany() {
        return company;
    }

    public Programmer getProgram() {
        return program;
    }

    public void setCompany(Companies company) {
        this.company = company;
    }

    public void setProgram(Programmer program) {
        this.program = program;
    }

    //Set method for swapping two companies in customPairs
    public void swapCompany(CustomPair one, CustomPair two){
        Companies temp = one.getCompany();
        one.setCompany(two.getCompany());
        two.setCompany(temp);
    }

    //Set method for swapping two programmers in customPairs
    public void swapProgrammer(CustomPair one, CustomPair two){
        Programmer temp = one.getProgram();
        one.setProgram(two.getProgram());
        two.setProgram(temp);
    }

    public int getRowCounter(){
        return rowCounter;
    }

    //Used for testing to show pairs before and after matching
    public void printPairs(CustomPair[] Pairs){
        int len = Pairs.length;
        for (int i = 0; i < len; i++) {
            int z = i;
            z+=1;
            System.out.println("Pair #" + (z));
            System.out.println(Pairs[i].getCompany().getName());
            System.out.println(Pairs[i].getProgram().getName()+"\n");
        }
        System.out.println("Number of comparisons: " + comparisons);
        comparisons=0;
    }

    //Checks if Company 2 prefer's company 1's programmer more than their own.
    //If so, checks if company 1's programmer prefers company 2 to company 1.
    //If both of these are true, swaps company 1 and company 2's programmers.
    //Every time a swap is done, rowCounter is set to 0, so that the new
    //pair gets a chance to be compared to all other pairs for possible swaps.
    //Every time a swap isn't done, rowCounter gets incremented so that
    //our termination occurs when every comparison for every pair has been checked
    //once, and no swaps were done.
    public void swapsies(CustomPair one, CustomPair two){
        boolean C2 = false;
        boolean P1 = false;
        int prog1 = one.getProgram().getName();
        int prog2 = two.getProgram().getName();
        char comp1 = one.getCompany().getName();
        char comp2 = two.company.getName();
        comparisons++;
        if(two.getCompany().getIndex(prog1, two.getCompany())-two.getCompany().getIndex(prog2, two.getCompany()) < 0){
            C2 = true;
            comparisons++;
            if(one.getProgram().getIndex(comp1, one.getProgram())-two.getProgram().getIndex(comp2, one.getProgram())>0){
                P1 = true;
            }
        }
        if(C2 && P1){
            one.swapProgrammer(one, two);
            rowCounter=0;
        }
        else{
            rowCounter++;
        }
    }

    //Finds the number of pairs, and uses rowCounter for termination (with a while statement)
    //Runs swapsies for each index of Pairs against every other Pair, so that programmers are
    //swapped when a pairing isn't satisfactory.
    //Once this comparison has been done for every index versus every other Pair,
    //and no matches have been found n^2 times in a row, the program terminates.
    //(n^2 being the number of times swapsies needs to be checked to ensure that
    //no pairs are unsatisfactory.)
    public CustomPair[] matching(CustomPair[] Pairs) {
        int numPairs = Pairs.length;
        while (Pairs[0].getRowCounter() < (numPairs*numPairs)) {
            for (int i = 0; i < numPairs; i++) {
                for (int j = 0; j < numPairs; j++) {
                    Pairs[i].swapsies(Pairs[i], Pairs[j]);
                }
            }
        }
        return Pairs;
    }
}