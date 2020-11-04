package CleanCode.Planes;

import CleanCode.Classifications.ExperimentalType;
import CleanCode.Classifications.SecretLevel;

public class ExperimentalPlane extends Plane {
  private ExperimentalType experimentalType;
  private SecretLevel secretLevel;

  public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalType experimentalType, SecretLevel secretLevel) {
    super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    this.experimentalType = experimentalType;
    this.secretLevel = secretLevel;
  }

  public ExperimentalType getExperimentalType() {
    return experimentalType;
  }

  public void setExperimentalType(ExperimentalType experimentalType) {
    this.experimentalType = experimentalType;
  }

  public SecretLevel getSecretLevel() {
    return secretLevel;
  }

  public void setSecretLevel(SecretLevel secretLevel) {
    this.secretLevel = secretLevel;
  }

  @Override
  public String toString() {
    return "ExperimentalPlane{" +
           "experimentalType=" + experimentalType +
           ", secretLevel=" + secretLevel +
           '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ExperimentalPlane)) return false;
    if (!super.equals(o)) return false;

    ExperimentalPlane that = (ExperimentalPlane) o;

    if (getExperimentalType() != that.getExperimentalType()) return false;
    return getSecretLevel() == that.getSecretLevel();
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (getExperimentalType() != null ? getExperimentalType().hashCode() : 0);
    result = 31 * result + (getSecretLevel() != null ? getSecretLevel().hashCode() : 0);
    return result;
  }
}
