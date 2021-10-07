public class Main {

    public void setProgrammer(char[] prefrences, Programmer j) {
        j.setPrefrences(prefrences);
    }

    public void setCompany(int[] prefrences, Companies j) {
        j.setPrefrences(prefrences);
    }

    public static void main(String[] args) {
        Programmer z1 = new Programmer();Programmer z2 = new Programmer();Programmer z3 = new Programmer();Programmer z4 = new Programmer();Programmer z5 = new Programmer();

        Companies a = new Companies();Companies b = new Companies();Companies c = new Companies();Companies d = new Companies();Companies e = new Companies();

        int[] p1 = {2,5,1,3,4};int[] p2 = {1,2,3,4,5};int[] p3 = {5,3,2,1,4};int[] p4 = {1,3,2,4,5};int[] p5 = {2,3,5,4,1};

        char[] p6 = {'e','a','d', 'b', 'c'};char[] p7 = {'d','e','b', 'a', 'c'};char[] p8 = {'d','b', 'c','e', 'a'};char[] p9 = {'c', 'b', 'd', 'a', 'e'};char[] p10 = {'a', 'd', 'b', 'c', 'e'};

        a.setPrefrences(p1);b.setPrefrences(p2);c.setPrefrences(p3);d.setPrefrences(p4);e.setPrefrences(p5);

        z1.setPrefrences(p6);z2.setPrefrences(p7);z3.setPrefrences(p8);z4.setPrefrences(p9);z5.setPrefrences(p10);

        z1.setName(1);z2.setName(2);z3.setName(3);z4.setName(4);z5.setName(5);

        a.setName('a');b.setName('b');c.setName('c');d.setName('d');e.setName('e');

        CustomPair k = new CustomPair();CustomPair m = new CustomPair();CustomPair v = new CustomPair();CustomPair km = new CustomPair();CustomPair mv = new CustomPair();

        k.setCompany(a);k.setProgram(z3);m.setCompany(b);m.setProgram(z2);v.setCompany(c);v.setProgram(z1);km.setCompany(d);km.setProgram(z4);mv.setCompany(e);mv.setProgram(z5);

        CustomPair[] Pairs = {k, m, v, km, mv};
        k.printPairs(Pairs);
        System.out.println("----------------\n|AFTER MATCHING|\n----------------\n");
        k.matching(Pairs);
        k.printPairs(Pairs);
    }
}