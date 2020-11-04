package JavaCollectionsMainTask;

import JavaCollectionsMainTask.Planes.CargoPlane;
import JavaCollectionsMainTask.Planes.MilitaryPlane;
import JavaCollectionsMainTask.Planes.PassengerPlane;
import JavaCollectionsMainTask.Planes.Plane;

import java.util.*;

public class Mirzaf4egAirLines {
  private List<? extends Plane> planes;
  int totalCapacityCargo = 0;
  List<PassengerPlane> passengerPlanes = new ArrayList<>();
  List<CargoPlane> cargoPlanes = new ArrayList<>();
  List<MilitaryPlane> militaryPlanes = new ArrayList<>();

  public Mirzaf4egAirLines(List<? extends Plane> planes) {
    this.planes = planes;
  }

  public List<? extends Plane> getPlanes() {
    return planes;
  }

  public void setPlanes(List<? extends Plane> planes) {
    this.planes = planes;
  }

  public int getTotalCapacityPassengers() {
    return passengerPlanes.stream().mapToInt(PassengerPlane::getCapacityOfPassengers).sum();
  }

  public int getTotalCapacityCargo() {
    cargoPlanes.forEach(capacityCargo -> totalCapacityCargo += capacityCargo.getCapacityOfCargo());
    return totalCapacityCargo;
  }

  public void setTotalCapacityCargo(int totalCapacityCargo) {
    this.totalCapacityCargo = totalCapacityCargo;
  }

  public List<PassengerPlane> getPassengerPlanes() {
    planes.forEach(plane -> {
      if (plane instanceof PassengerPlane) {
        passengerPlanes.add((PassengerPlane) plane);
      }
    });
    return passengerPlanes;
  }

  public void setPassengerPlanes(List<PassengerPlane> passengerPlanes) {
    this.passengerPlanes = passengerPlanes;
  }

  public List<CargoPlane> getCargoPlanes() {
    planes.forEach(plane -> {
      if (plane instanceof CargoPlane) {
        cargoPlanes.add((CargoPlane) plane);
      }
    });
    return cargoPlanes;
  }

  public void setCargoPlanes(List<CargoPlane> cargoPlanes) {
    this.cargoPlanes = cargoPlanes;
  }

  public List<MilitaryPlane> getMilitaryPlanes() {
    planes.forEach(plane -> {
      if (plane instanceof MilitaryPlane) {
        militaryPlanes.add((MilitaryPlane) plane);
      }
    });
    return militaryPlanes;
  }

  public void setMilitaryPlanes(List<MilitaryPlane> militaryPlanes) {
    this.militaryPlanes = militaryPlanes;
  }

  public List<Plane> filterAverageFuelConsumption(int minAverageFuelConsumption, int maxAverageFuelConsumption) {
    List<Plane> result = new ArrayList<>();
    planes.forEach(plane -> {
      if (plane.getAverageFuelConsumption() >= minAverageFuelConsumption && plane.getAverageFuelConsumption() <= maxAverageFuelConsumption) result.add(plane);
    });
    return result;
  }

  public Collection<? extends Plane> sortByFlightDistance () {
    planes.sort((Comparator<Plane>) (o1, o2) -> o1.getFlightDistance() - o2.getFlightDistance());
    return planes;
  }

  public void printPlane(Collection<? extends Plane> collection) {
    for (Plane plane : collection) {
      System.out.println(plane);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Mirzaf4egAirLines that = (Mirzaf4egAirLines) o;
    return planes.equals(that.planes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planes);
  }

  @Override
  public String toString() {
    return "Mirzaf4egAirLines{" +
           "planes=" + planes +
           '}';
  }
}
