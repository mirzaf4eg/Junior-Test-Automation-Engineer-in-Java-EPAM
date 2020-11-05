package CleanCode.Planes;

import CleanCode.Classifications.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {
  private MilitaryType militaryType;

  public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType) {
    super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    this.militaryType = militaryType;
  }

  public MilitaryType getMilitaryType() {
    return militaryType;
  }

  public void setMilitaryType(MilitaryType militaryType) {
    this.militaryType = militaryType;
  }

  @Override
  public String toString() {
    return super.toString().replace(
            "}",
            ", militaryType=" + militaryType +
           '}');
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MilitaryPlane)) return false;
    if (!super.equals(o)) return false;
    MilitaryPlane that = (MilitaryPlane) o;
    return militaryType == that.militaryType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), militaryType);
  }
}
