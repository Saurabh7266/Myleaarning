package file_two;

public class main {

    public static void main(String[] args) {
       
        basic basic = new basic("v8", "4*4", "7", "1");
        car car = new car(basic);
        car.carneed();
    }
    
}
