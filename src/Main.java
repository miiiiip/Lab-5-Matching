public class Main {

    public static void main(String[] args) {

        //Create all the programmers
        Programmer z1 = new Programmer();Programmer z2 = new Programmer();Programmer z3 = new Programmer();Programmer z4 = new Programmer();Programmer z5 = new Programmer();

        //Create all the companies
        Companies a = new Companies();Companies b = new Companies();Companies c = new Companies();Companies d = new Companies();Companies e = new Companies();

        //Create prefrences for the companies to use
        int[] p1 = {2,5,1,3,4};int[] p2 = {1,2,3,4,5};int[] p3 = {5,3,2,1,4};int[] p4 = {1,3,2,4,5};int[] p5 = {2,3,5,4,1};

        //Create prefrences for the programmers to use
        char[] p6 = {'e','a','d', 'b', 'c'};char[] p7 = {'d','e','b', 'a', 'c'};char[] p8 = {'d','b', 'c','e', 'a'};char[] p9 = {'c', 'b', 'd', 'a', 'e'};char[] p10 = {'a', 'd', 'b', 'c', 'e'};

        //Set the company's prefrences to what they actually are
        a.setPrefrences(p1);b.setPrefrences(p2);c.setPrefrences(p3);d.setPrefrences(p4);e.setPrefrences(p5);

        //Set the programmer's prefrences to what they actually are
        z1.setPrefrences(p6);z2.setPrefrences(p7);z3.setPrefrences(p8);z4.setPrefrences(p9);z5.setPrefrences(p10);

        //Set the programmer's names to the integers we can use to refrence them
        z1.setName(1);z2.setName(2);z3.setName(3);z4.setName(4);z5.setName(5);

        //Set the Company's names to characters we can use to refrence them
        a.setName('a');b.setName('b');c.setName('c');d.setName('d');e.setName('e');

        //Create the empty pairs
        CustomPair k = new CustomPair();CustomPair m = new CustomPair();CustomPair v = new CustomPair();CustomPair km = new CustomPair();CustomPair mv = new CustomPair();

        //Set the pair's programmers and companies
        k.setCompany(a);k.setProgram(z3);m.setCompany(b);m.setProgram(z2);v.setCompany(c);v.setProgram(z1);km.setCompany(d);km.setProgram(z4);mv.setCompany(e);mv.setProgram(z5);

        //Create the array of pairs
        CustomPair[] Pairs = {mv, km, v, m, k};

        System.out.println("The original set of pairs");
        k.printPairs(Pairs);
        System.out.println("----------------\n|AFTER MATCHING BELOW|\n----------------\n");
        //FINALLY run the algorithm :)
        k.matching(Pairs);
        k.printPairs(Pairs);
    }
    //**ALL PREFRENCES OF PROGRAMMERS AND COMPANIES MATCH THEIR PREFRENCES OF THE EXAMPLE IN THE ASSIGNMENT**
    //
    //ORIGINAL SET OF PAIRS:
    //e5, d4, c1, b2, a3
    //
    //SET AFTER MATCHING:
    //e2, d1, c4, b3, a5
    //
    //These are satisfactory pairings, as there are no one step swaps which make a programmer and company happy.

}