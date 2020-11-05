package JavaCollectionsMainTask.Planes;

import JavaCollectionsMainTask.Classification.AlongTheLine;
import JavaCollectionsMainTask.Classification.Assignment;
import JavaCollectionsMainTask.Classification.Brand;

import java.util.Objects;

public class CargoPlane extends Plane{
  private int capacityOfCargo;

  public CargoPlane(Brand brand, String model, String tailNumber, Assignment assignment, AlongTheLine alongTheLine, int cruisingSpeed, int flightDistance, int fuelTank, int averageFuelConsumption, int capacityOfCargo) {
    super(brand, model, tailNumber, assignment, alongTheLine, cruisingSpeed, flightDistance, fuelTank, averageFuelConsumption);
    this.capacityOfCargo = capacityOfCargo;
  }

  public int getCapacityOfCargo() {
    return capacityOfCargo;
  }

  public int setCapacityOfCargo(int capacityOfCargo) {
    this.capacityOfCargo = capacityOfCargo;
    return capacityOfCargo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CargoPlane that = (CargoPlane) o;
    return capacityOfCargo == that.capacityOfCargo;
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityOfCargo);
  }

  @Override
  public String toString() {
    return "id=" + id +  '\t' +
           "Грузовой самолет{" +
           "Производитель: " + brand +
           ", Модель: " + model +
           ", Бортовой номер: " + tailNumber +
           ", Назначение: " + assignment +
           ", Уровень использования: " + alongTheLine +
           ", Максимальный груз (тонн): " + capacityOfCargo +
           ", Крейсерская скорость (км/ч): " + cruisingSpeed +
           ", Дальность полета при максимальной загрузке (км): " + flightDistance +
           ", Вместимость топливных баков: " + fuelTank +
           ", Расход топлива при максимальной загрузке (литров/час): " + averageFuelConsumption +
           '}';
  }
}
