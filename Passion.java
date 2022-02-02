public class Passion {
    interface MyPassion{
        void achieveBig();
        void unleashPotential();
        void doOutOfTheBox();
    }
    class MyPassionImplementer implements MyPassion
    {

        @Override
        public void achieveBig() {
            System.out.println("I wanna achieve big");
        }

        @Override
        public void unleashPotential() {
            System.out.println("I wanna unleash my potential");

        }

        @Override
        public void doOutOfTheBox() {
            System.out.println("I wanna do out of the box.");

        }
    }
}
