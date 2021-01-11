package ex_001_lambda;

public class Main {

    private static void fire(Object sender) {
        System.out.println("Fire!!!");
    }

    public static void main(String[] args) {

        ElectricityConsumer lamp = new Lamp();
        ElectricityConsumer radio = new Radio();

        ElectricityConsumer consumerAnonimus = new ElectricityConsumer() {
            @Override
            public void electricityOn(Object sender) {
                System.out.println("Пожар!!!");
            }
        };

        ElectricityConsumer consumerLambda = sender -> System.out.println("Пожар!!! Лямбда");

        lamp.electricityOn(new Object());
        radio.electricityOn(new Object());
        consumerAnonimus.electricityOn(new Object());
        consumerLambda.electricityOn(new Object());






    }
}
