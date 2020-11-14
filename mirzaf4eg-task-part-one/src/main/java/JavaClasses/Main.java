package JavaClasses;

import JavaClasses.Cars.Car;
import JavaClasses.Specifications.Brand;
import JavaClasses.Specifications.CarColor;
import JavaClasses.Specifications.CarType;
import JavaClasses.Specifications.EngineType;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mirzaf4eg in sep 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Classes
 * Создать классы, спецификации которых приведены ниже.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 *----------------------------------------------------------------------------------------
 * 8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
 * Создать массив объектов. Вывести:
 *  a) список автомобилей заданной марки;
 *  b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
 *  c) список автомобилей заданного года выпуска, цена которых больше указанной.
 */

public class Main {
  static List<Car> cars = Arrays.asList(
    new Car(Brand.SUBARU, "Legacy", 2005, CarColor.BLACK, 5000, "7076HM7", CarType.PASSENGER, EngineType.PETROL),
    new Car(Brand.BMW, "1-Series", 2007, CarColor.BLUE, 4000, "1315IP7", CarType.PASSENGER, EngineType.DIESEL),
    new Car(Brand.BMW, "3-Series", 2009, CarColor.RED, 9000, "7451HP7", CarType.PASSENGER, EngineType.ELECTRIC),
    new Car(Brand.BMW, "5-Series", 2015, CarColor.SERO_BURO_MALINOVI_MOKRI_ASFALT, 35000, "5448TU7", CarType.PASSENGER, EngineType.DIESEL),
    new Car(Brand.BMW, "7-Series", 2012, CarColor.RED, 25000, "4111VB7", CarType.PASSENGER, EngineType.HYBRID),
    new Car(Brand.MERCEDES, "A-Class", 2002, CarColor.WHITE, 3000, "1715AD7", CarType.PASSENGER, EngineType.DIESEL),
    new Car(Brand.MERCEDES, "B-Class", 2013, CarColor.YELLOW, 15000, "1547BA7", CarType.PASSENGER, EngineType.DIESEL),
    new Car(Brand.MERCEDES, "C-Class", 2000, CarColor.WHITE, 1000, "4888TB7", CarType.PASSENGER, EngineType.HYBRID), new Car(Brand.MERCEDES, "E-Class", 2007, CarColor.BLACK, 6000, "5512TR7", CarType.PASSENGER, EngineType.PETROL),
    new Car(Brand.MERCEDES, "V-Class", 2010, CarColor.WHITE, 10000, "6522KL7", CarType.MINIVAN, EngineType.HYBRID),
    new Car(Brand.MERCEDES, "G-Class", 1995, CarColor.SERO_BURO_MALINOVI_MOKRI_ASFALT, 11000, "7878NN7", CarType.SUV, EngineType.DIESEL)
    );

  public static void main(String[] args) {
    Mirzaf4egAutoPark auto = new Mirzaf4egAutoPark();
    System.out.println("\nСписок всех автомобилей:");
    auto.printCars(cars);
    System.out.println("\nСписок автомобилей Mercedes:");
    auto.printCars(auto.getCarsByBrand(cars, Brand.MERCEDES));
    System.out.println("\nСписок автомобилей модели C-Class и сроком эксплуатации больше 5 лет:");
    auto.printCars(auto.getCarsByModelMoreYearsUsed(cars, "C-Class",2020, 5));
    System.out.println("\nСписок автомобилей 2005 года выпуска, цена которых больше 1000 euro: ");
    auto.printCars(auto.getCarsByYearsAndPrice(cars, 2005, 1000));
  }
}
