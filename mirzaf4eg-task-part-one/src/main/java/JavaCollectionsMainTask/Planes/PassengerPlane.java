package JavaCollectionsMainTask.Planes;

import JavaCollectionsMainTask.Classification.AlongTheLine;
import JavaCollectionsMainTask.Classification.Assignment;
import JavaCollectionsMainTask.Classification.Brand;
import JavaCollectionsMainTask.Classification.ServiceLevel;

import java.util.Objects;

public class PassengerPlane extends Plane{
  private ServiceLevel serviceLevel;
  private int capacityOfPassengers;

  public PassengerPlane(Brand brand, String model, String tailNumber, Assignment assignment, AlongTheLine alongTheLine, int cruisingSpeed, int flightDistance, int fuelTank, int averageFuelConsumption, ServiceLevel serviceLevel, int capacityOfPassengers) {
    super(brand, model, tailNumber, assignment, alongTheLine, cruisingSpeed, flightDistance, fuelTank, averageFuelConsumption);
    this.serviceLevel = serviceLevel;
    this.capacityOfPassengers = capacityOfPassengers;
  }

  public ServiceLevel getServiceLevel() {
    return serviceLevel;
  }

  public void setServiceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  public int getCapacityOfPassengers() {
    return capacityOfPassengers;
  }

  public int setCapacityOfPassengers(int capacityOfPassengers) {
    this.capacityOfPassengers = capacityOfPassengers;
    return capacityOfPassengers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PassengerPlane that = (PassengerPlane) o;
    return capacityOfPassengers == that.capacityOfPassengers &&
    serviceLevel == that.serviceLevel;
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLevel, capacityOfPassengers);
  }

  @Override
  public String toString() {
  return "id=" + id +  '\t' +
         "Пассажирский самолет{" +
         "Производитель: " + brand +
         ", Модель: " + model +
         ", Бортовой номер: " + tailNumber +
         ", Назначение: " + assignment +
         ", Уровень использования: " + alongTheLine +
         ", Уровень приоритета: " + serviceLevel +
         ", Вместимость (пассажиров): " + capacityOfPassengers +
         ", Крейсерская скорость (км/ч): " + cruisingSpeed +
         ", Дальность полета при максимальной загрузке (км): " + flightDistance +
         ", Вместимость топливных баков (тонн): " + fuelTank +
         ", Расход топлива при максимальной загрузке (литров/час)= " + averageFuelConsumption +
         '}';
  }
}
