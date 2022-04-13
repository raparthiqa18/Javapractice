package Practice.Modifiers;

public class Second extends Defaultclass{
        public static void main(String[] args) {
            final Cars cars = new Cars();
            System.out.println(cars.colour);
            System.out.println(cars.wheels);
            cars.wheels=3;
            System.out.println(cars.wheels);
            cars.Start();
            //cars = new Cars();//throws error as the object reference is declared as static
            Cars car1=new Cars();
            System.out.println(car1.wheels);
            System.out.println(car1.colour);
            car1.Start();

        }
}
