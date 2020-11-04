package JavaCollectionsMainTask.Planes;

import JavaCollectionsMainTask.Classification.AlongTheLine;
import JavaCollectionsMainTask.Classification.Assignment;
import JavaCollectionsMainTask.Classification.Brand;
import JavaCollectionsMainTask.Classification.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{
  private MilitaryType militaryType;

  public MilitaryPlane(Brand brand, String model, String tailNumber, Assignment assignment, AlongTheLine alongTheLine, int cruisingSpeed, int flightDistance, int fuelTank, int averageFuelConsumption, MilitaryType militaryType) {
    super(brand, model, tailNumber, assignment, alongTheLine, cruisingSpeed, flightDistance, fuelTank, averageFuelConsumption);
    this.militaryType = militaryType;
  }

  public MilitaryType getMilitaryType() {
    return militaryType;
  }

  public MilitaryType setMilitaryType(MilitaryType militaryType) {
    this.militaryType = militaryType;
    return militaryType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MilitaryPlane that = (MilitaryPlane) o;
    return militaryType == that.militaryType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(militaryType);
  }

  @Override
  public String toString() {
    return "id=" + id +  '\t' +
           "Военный самолет{" +
           "Производитель: " + brand +
           ", Модель: " + model +
           ", Бортовой номер: " + tailNumber +
           ", Назначение: " + assignment +
           ", Боевое применение: " + militaryType +
           ", Уровень использования: " + alongTheLine +
           ", Крейсерская скорость (км/ч): " + cruisingSpeed +
           ", Дальность полета при максимальной загрузке (км): " + flightDistance +
           ", Вместимость топливных баков: " + fuelTank +
           ", Расход топлива при максимальной загрузке (литров/час): " + averageFuelConsumption +
           '}';
  }
}
