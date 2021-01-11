package ex_001_lambda;

public class Lamp implements ElectricityConsumer {

    private void lightOn() {
        System.out.println("Лампа зажглась");
    }

    public void electricityOn(Object sender) {
        lightOn();
    }
}
