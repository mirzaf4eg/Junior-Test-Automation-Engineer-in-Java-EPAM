package JavaClasses;

import JavaClasses.Cars.Car;
import JavaClasses.Specifications.Brand;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Mirzaf4egAutoPark {
  public List<Car> getCarsByBrand(List<Car> cars, Brand brand) {
    List<Car> result = new ArrayList<>();
    for (Car car : cars) {
      if (car.getBrand().equals(brand)) {
        result.add(car);
      }
    }
    return result;
  }

  public List<Car> getCarsByModelMoreYearsUsed (List<Car> cars, String model, int yearsUsed, int yearsMoreAge) {
    List<Car> result = new ArrayList<>();
    for (Car car : cars) {
      if (car.getModel().equals(model) && yearsUsed - car.getYearOfManufacture() > yearsMoreAge) {
        result.add(car);
      }
    }
    return result;
  }

  public List<Car> getCarsByYearsAndPrice (List<Car> cars, int yearOfManufacture, int price) {
    List<Car> result = new ArrayList<>();
    for (Car car : cars) {
      if (car.getYearOfManufacture() == yearOfManufacture && car.getPrice() > price) {
        result.add(car);
      }
    }
    return result;
  }

  public void printCars(Collection<? extends Car> collection) {
    for (Car cars : collection) {
      System.out.println(cars);
    }
  }
}
