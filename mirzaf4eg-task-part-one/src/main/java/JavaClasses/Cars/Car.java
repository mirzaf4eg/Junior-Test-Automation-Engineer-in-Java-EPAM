package JavaClasses.Cars;

import JavaClasses.Specifications.Brand;
import JavaClasses.Specifications.CarColor;
import JavaClasses.Specifications.CarType;
import JavaClasses.Specifications.EngineType;

public class Car {
  private static int idFirst = 1;
  private final int id = idFirst++;
  private Brand brand;
  private String model;
  private int yearOfManufacture;
  private CarColor color;
  private int price;
  private String registrationPlate;
  private CarType carType;
  private EngineType engineType;

  public Car(Brand brand, String model, int yearOfManufacture, CarColor color, int price, String registrationPlate, CarType carType, EngineType engineType) {
    this.brand = brand;
    this.model = model;
    this.yearOfManufacture = yearOfManufacture;
    this.color = color;
    this.price = price;
    this.registrationPlate = registrationPlate;
    this.carType = carType;
    this.engineType = engineType;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYearOfManufacture() {
    return yearOfManufacture;
  }

  public void setYearOfManufacture(int yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
  }

  public CarColor getColor() {
    return color;
  }

  public void setColor(CarColor color) {
    this.color = color;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getRegistrationPlate() {
    return registrationPlate;
  }

  public void setRegistrationPlate(String registrationPlate) {
    this.registrationPlate = registrationPlate;
  }

  public CarType getCarType() {
    return carType;
  }

  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  public EngineType getEngineType() {
    return engineType;
  }

  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }

  @Override
  public String toString() {
    return " " +
           "id" + id +
           ", Марка - " + brand +
           ", Модель - " + model +
           ", Год выпуска - " + yearOfManufacture +
           ", Цвет - " + color +
           ", Цена - " + price +
           ", Регистрационный номер - " + registrationPlate +
           ", Назначение - " + carType +
           ", Двигатель - " + engineType;
  }
}
