package CleanCode;

import CleanCode.Classifications.MilitaryType;
import CleanCode.Planes.ExperimentalPlane;
import CleanCode.Planes.MilitaryPlane;
import CleanCode.Planes.PassengerPlane;
import CleanCode.Planes.Plane;

import java.util.*;

public class Airport {
  private List<? extends Plane> planes;

  public List<PassengerPlane> getPassengerPlanes() {
    List<PassengerPlane> passengerPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof PassengerPlane) {
        passengerPlanes.add((PassengerPlane) plane);
      }
    }
    return passengerPlanes;
  }

  public List<MilitaryPlane> getMilitaryPlanes() {
    List<MilitaryPlane> militaryPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof MilitaryPlane) {
        militaryPlanes.add((MilitaryPlane) plane);
      }
    }
    return militaryPlanes;
  }

  public List<ExperimentalPlane> getExperimentalPlanes() {
    List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof ExperimentalPlane) {
        experimentalPlanes.add((ExperimentalPlane) plane);
      }
    }
    return experimentalPlanes;
  }

  public PassengerPlane getPassengerPlaneWithMaxCapacity() {
    List<PassengerPlane> passengerPlanes = getPassengerPlanes();
    PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
    for (PassengerPlane plane : passengerPlanes) {
      if (plane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
        planeWithMaxCapacity = plane;
      }
    }
    return  planeWithMaxCapacity;
  }

  public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (MilitaryPlane plane : militaryPlanes) {
      if (plane.getMilitaryType() == MilitaryType.TRANSPORT) {
        transportMilitaryPlanes.add(plane);
      }
    }
    return transportMilitaryPlanes;
  }

  private List<MilitaryPlane> getBomberMilitaryPlanes() {
    List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (MilitaryPlane plane : militaryPlanes) {
      if (plane.getMilitaryType() == MilitaryType.BOMBER) {
        bomberMilitaryPlanes.add(plane);
      }
    }
    return bomberMilitaryPlanes;
  }

  public Collection<? extends Plane> sortByMaxFlightDistance() {
    planes.sort((Comparator<Plane>) (o1, o2) -> o1.getMaxFlightDistance() - o2.getMaxFlightDistance());
    return planes;
  }

  public Collection<? extends Plane> sortByMaxSpeed() {
    planes.sort((Comparator<Plane>) (o1, o2) -> o1.getMaxSpeed() - o2.getMaxSpeed());
    return planes;
  }

  public List<? extends Plane> getPlanes() {
    return planes;
  }

  public void setPlanes(List<? extends Plane> planes) {
    this.planes = planes;
  }

  public Airport(List<? extends Plane> planes) {
    this.planes = planes;
  }

  public void printPlane(Collection<? extends Plane> collection) {
    for (Plane plane : collection) {
      System.out.println(plane);
    }
  }

  @Override
  public String toString() {
    return "Airport{" +
           "Planes=" + planes.toString() +
           '}';
  }
}
