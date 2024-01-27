public class Car {
    public String model;
    public String color;
    // Создаем параметризованный конструктор
    public Car(String model, String color) {
        this.model = model;
        this.color = color;

        // Печатаем значения атрибутов Car
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
    }

    public static void main(String[] args) {
        // Создаем новый объект Car;
        // Обязательно задаем ему значения атрибутов в том же порядке,
        // в котором они заданы в конструкторе
        Car myCar = new Car("Toyota", "Red");
        System.out.println("test");
    }
}