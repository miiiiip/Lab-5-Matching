public class CustomPair {
        private Companies company;
        private Programmer program;

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

    public void swapsies(CustomPair one, CustomPair two){
        boolean C2 = false;
        boolean P1 = false;
        String firstString = one.getProgram().toString();
        int firstInt = Integer.parseInt(firstString);
        String secondString = two.getProgram().toString();
        int secondInt = Integer.parseInt(secondString);
        String firstS = one.getCompany().toString();
        char finalS1 = firstS.charAt(0);
        String secondS = two.getCompany().toString();
        char finalS2 = secondS.charAt(0);
        if(one.getCompany().getIndex(firstInt, one.getCompany()) > two.getCompany().getIndex(secondInt, two.getCompany())){
            C2 = true;
        }
        if(one.getProgram().getIndex(finalS1, one.getProgram()) > two.getProgram().getIndex(finalS2, two.getProgram())){
            P1 = true;
        }
        if(C2 && P1){
            one.swapProgrammer(one, two);
            one.swapCompany(one, two);
        }
    }
}
