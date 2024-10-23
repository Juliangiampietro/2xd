package model;

public class Plane {
  protected Integer id;
  protected String piloto;
  protected Integer capacidad_pasajeros;

  public Plane() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPiloto() {
    return piloto;
  }

  public void setPiloto(String piloto) {
    this.piloto = piloto;
  }

  public Integer getCapacidad_pasajeros() {
    return capacidad_pasajeros;
  }

  public void setCapacidad_pasajeros(Integer capacidad_pasajeros) {
    this.capacidad_pasajeros = capacidad_pasajeros;
  }

  @Override
  public String toString() {
    return "Plane{" +
            "id=" + id +
            ", piloto='" + piloto + '\'' +
            ", capacidad_pasajeros=" + capacidad_pasajeros +
            '}';
  }
}
