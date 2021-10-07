import java.lang.reflect.Array;
import java.util.Arrays;

public class Main{

Programmer one = new Programmer();

public void setProgrammer(char[] prefrences, Programmer j){
    j.setPrefrences(prefrences);
}

    public void setCompany(int[] prefrences, Companies j){
        j.setPrefrences(prefrences);
    }




    public void matching(Companies[] Companies2d, Programmer[] Programmers2d){
        int numCompanies = Companies2d.length;
        int numProgrammers = Programmers2d.length;
        int workingIndex = 0;
        int subIndex = 0;
        int finder;
        int[] maxNums = new int[numCompanies];
        while(Companies2d[workingIndex].getPrefrences()[0] == -1){
            workingIndex++;
        }
        while(Companies2d[workingIndex].getPrefrences()[subIndex] == 0){
            subIndex++;
        }
        finder = Companies2d[workingIndex].getPrefrences()[subIndex];
        for (int i = 0; i < numCompanies; i++) {
            maxNums[i] = (Companies2d[i].getIndex(finder, Companies2d[i]));
        }
        for (int i = 0; i < numCompanies; i++) {

        }

        }

}

//    int j = 0;
//    Companies temp = Companies2d[0];
//    int[] tempArr = temp.getPrefrences();
//    int first = tempArr[0];
//        for (int i = 0; i < Companies2d.length; i++) {
//            if(Companies2d[i+1].getIndex(first, Companies2d[i+1]) == 0){
//                int adder1 = Companies2d[i+1].getValue(first, Companies2d[i+1]);
//                while(Programmers2d[j]. != first){
//                    j++;
//                }
//            }
//        }
//    }

//    int counter = 1;
//    Companies[] equi;
//    int maxCompanyValue = Companies2d[0].getPrefrences().length;
//    Companies first = Companies2d[0];
//    int[] firstArray = first.getPrefrences();
//    int firstInt = firstArray[0];
//        for (int i = 1; i < Companies2d.length; i++) {
//        equi = new Companies[Companies2d[i].getPrefrences().length];
//        equi[0]=Companies2d[0];
//        Companies tempCom = Companies2d[i];
//        int[] tempArr = tempCom.getPrefrences();
//        int tempint = tempArr[0];
//        if(tempint == firstInt){
//        equi[counter] = Companies2d[i];
//        counter++;
//        }
//        }
//        int[] sums;
//        sums = new int[counter];
//        Programmer name = null;
//        for (int i = 0; i < Programmers2d.length; i++) {
//        if(Programmers2d[i].toString() == String.valueOf(firstInt)){
//        name = Programmers2d[i];
//        }
//        }
//        char[] temp = name.getPrefrences();
//        for (int i = 0; i < maxCompanyValue; i++) {
//        temp[].
//
//        }
