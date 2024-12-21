# lab5_java
Лабораторна робота 5 з дисципліни "Розробка програмного забезпечення на платфомі Java"

Для запуску лабораторної роботи потрібно запустити основний клас `Main` перед цим додавши різні види кави:
```java
            van.addCoffee(new CoffeeBeans("Arabica Beans", 50.0, 20.0, 9.0));
            van.addCoffee(new GroundCoffee("Espresso Ground", 40.0, 15.0, 8.5));
            van.addCoffee(new InstantCoffee("Instant Classic", 30.0, 10.0, 7.5));
            van.addCoffee(new CoffeeBeans("Robusta Beans", 35.0, 25.0, 8.0));
```
та змінивши діапазон за яким буде відібрана кава в тому ж класі:
```java
            double minQuality = 8.0;
            double maxQuality = 10.0;
```
