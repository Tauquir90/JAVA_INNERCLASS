public class PassionTester {
    public static void main(String... args) {
        Passion.MyPassion pm = new Passion().new MyPassionImplementer();
        pm.achieveBig();
        pm.doOutOfTheBox();
        pm.unleashPotential();
    }
}
