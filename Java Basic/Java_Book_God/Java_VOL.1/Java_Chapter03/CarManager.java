
public class CarManager {
    
    public static void main(String[] args) {
        
        // new : 예약어
        // new라는 예약어를 통해 Car() 생성자를 호출해서 객체 생성한다
        /*
            Car dogCar = new Car();
            Car cowCar = new Car();
            cowCar.speedUP();
        */
        
        Car dogCar = new Car();
        dogCar.speedUP();
        dogCar.speedUP();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.breakDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}
