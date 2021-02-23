package hello.core.singleton;

public class StatefulService {

    private int price; //상태를 유지하는 필드 10000-> 20000이 되는 문제 발생

    public int order(String name, int price){
        System.out.println("name = " + name + ", price = " + price);
        //this.price = price; //여기가 문제!
        return price; //속성값을 변경하지 않고 넘기기만 수행.
    }

    public int getPrice(){
        return price;
    }
}
