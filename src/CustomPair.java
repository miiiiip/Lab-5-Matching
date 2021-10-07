public class CustomPair {
        private Companies company;
        private Programmer program;
        public static int rowCounter=0;

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

    public void swapCompany(CustomPair one, CustomPair two){
        Companies temp = one.getCompany();
        one.setCompany(two.getCompany());
        two.setCompany(temp);
    }
    public void swapProgrammer(CustomPair one, CustomPair two){
        Programmer temp = one.getProgram();
        one.setProgram(two.getProgram());
        two.setProgram(temp);
    }

    public int getRowCounter(){
        return rowCounter;
    }

    public void printPairs(CustomPair[] Pairs){
        int len = Pairs.length;
        for (int i = 0; i < len; i++) {
            int z = i;
            z+=1;
            System.out.println("Pair #" + (z));
            System.out.println(Pairs[i].getCompany().getName());
            System.out.println(Pairs[i].getProgram().getName()+"\n");
        }
    }

    public void swapsies(CustomPair one, CustomPair two){
        boolean C2 = false;
        boolean P1 = false;
        int prog1 = one.getProgram().getName();
        int prog2 = two.getProgram().getName();
        char comp1 = one.getCompany().getName();
        char comp2 = two.company.getName();
        if(two.getCompany().getIndex(prog1, two.getCompany())-two.getCompany().getIndex(prog2, two.getCompany()) < 0){
            C2 = true;
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

    public CustomPair[] matching(CustomPair[] Pairs) {
        int numPairs = Pairs.length;
        while (Pairs[0].getRowCounter() < numPairs+1) {
            for (int i = 0; i < numPairs; i++) {
                for (int j = 0; j < numPairs; j++) {
                    Pairs[i].swapsies(Pairs[i], Pairs[j]);
                }
            }
        }
        return Pairs;
    }
}
