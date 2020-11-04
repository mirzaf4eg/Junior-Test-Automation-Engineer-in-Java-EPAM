package JavaCollectionsMainTask.Planes;

import JavaCollectionsMainTask.Classification.AlongTheLine;
import JavaCollectionsMainTask.Classification.Assignment;
import JavaCollectionsMainTask.Classification.Brand;

import java.util.Objects;

public abstract class Plane {
  private static int idFirst = 1;
  public final int id = idFirst++;
  public Brand brand;
  public String model;
  public String tailNumber;
  public Assignment assignment;
  public AlongTheLine alongTheLine;
  public int cruisingSpeed;
  public int flightDistance;
  public int fuelTank;
  public int averageFuelConsumption;

  public Plane(Brand brand, String model, String tailNumber, Assignment assignment, AlongTheLine alongTheLine, int cruisingSpeed, int flightDistance, int fuelTank, int averageFuelConsumption) {
    this.brand = brand;
    this.model = model;
    this.tailNumber = tailNumber;
    this.assignment = assignment;
    this.alongTheLine = alongTheLine;
    this.cruisingSpeed = cruisingSpeed;
    this.flightDistance = flightDistance;
    this.fuelTank = fuelTank;
    this.averageFuelConsumption = averageFuelConsumption;
  }

  public static int getIdFirst() {
    return idFirst;
  }

  public static void setIdFirst(int idFirst) {
    Plane.idFirst = idFirst;
  }

  public int getId() {
    return id;
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

  public String getTailNumber() {
    return tailNumber;
  }

  public void setTailNumber(String tailNumber) {
    this.tailNumber = tailNumber;
  }

  public Assignment getAssignment() {
    return assignment;
  }

  public void setAssignment(Assignment assignment) {
    this.assignment = assignment;
  }

  public AlongTheLine getAlongTheLine() {
    return alongTheLine;
  }

  public void setAlongTheLine(AlongTheLine alongTheLine) {
    this.alongTheLine = alongTheLine;
  }

  public int getCruisingSpeed() {
    return cruisingSpeed;
  }

  public void setCruisingSpeed(int maxSpeed) {
    this.cruisingSpeed = maxSpeed;
  }

  public int getFlightDistance() {
    return flightDistance;
  }

  public void setFlightDistance(int flightDistance) {
    this.flightDistance = flightDistance;
  }

  public int getFuelTank() {
    return fuelTank;
  }

  public void setFuelTank(int fuelTank) {
    this.fuelTank = fuelTank;
  }

  public int getAverageFuelConsumption() {
    return averageFuelConsumption;
  }

  public void setAverageFuelConsumption(int averageFuelConsumption) {
    this.averageFuelConsumption = averageFuelConsumption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Plane plane = (Plane) o;
    return id == plane.id &&
           cruisingSpeed == plane.cruisingSpeed &&
           flightDistance == plane.flightDistance &&
           fuelTank == plane.fuelTank &&
           averageFuelConsumption == plane.averageFuelConsumption &&
           brand == plane.brand &&
           model.equals(plane.model) &&
           tailNumber.equals(plane.tailNumber) &&
           assignment == plane.assignment &&
           alongTheLine == plane.alongTheLine;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brand, model, tailNumber, assignment, alongTheLine, cruisingSpeed, flightDistance, fuelTank, averageFuelConsumption);
  }

  @Override
  public String toString() {
    return "Plane{" +
           "id=" + id +
           ", brand=" + brand +
           ", model='" + model + '\'' +
           ", tailNumber='" + tailNumber + '\'' +
           ", assignment=" + assignment +
           ", alongTheLine=" + alongTheLine +
           ", cruisingSpeed=" + cruisingSpeed +
           ", flightDistance=" + flightDistance +
           ", fuelTank=" + fuelTank +
           ", averageFuelConsumption=" + averageFuelConsumption +
           '}';
  }
}
