public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Gümüş",2000,1.6,4);
        Car car2 = new Car();
        Car car3 = new Car("Siyah",3000);

        car1.showınfo();
        System.out.println("---------");
        car2.showınfo();
        System.out.println("----------");
        car3.showınfo();
        
    }
}