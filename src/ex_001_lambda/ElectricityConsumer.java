package ex_001_lambda;

// Функциональный интерфейс( с 1 методом )
// Аннотация контролиует, что интерфейс является функциональным
@FunctionalInterface
public interface ElectricityConsumer {

    void electricityOn(Object sender);
}
