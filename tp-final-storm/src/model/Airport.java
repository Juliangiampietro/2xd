package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Airport {
    @JsonProperty("_id")
    protected String id;
    @JsonProperty("activo")
    protected Boolean activo;
    @JsonProperty("balance")
    protected String balance;
    @JsonProperty("imagen")
    protected String imagen;
    @JsonProperty("capacidad")
    protected Integer capacidad;
    @JsonProperty("nombre")
    protected String nombre;
    @JsonProperty("email")
    protected String email;
    @JsonProperty("phone")
    protected String phone;
    @JsonProperty("direccion")
    protected String direccion;
    @JsonProperty("acerca")
    protected String acerca;
    @JsonProperty("fecha_inicio")
    protected String time;
    @JsonProperty("longitud")
    protected Double longitud;

    protected Double latitud;
    @JsonProperty("etiquetas")
    protected List<String> etiquetas;
    @JsonProperty("aviones")
    protected List<Plane> aviones;

    public Airport() {
    }

    public Airport(Boolean activo, String balance, String imagen, Integer capacidad, String nombre, String email, String phone, String direccion, String acerca, String time, Double longitud, List<String> etiquetas, List<Plane> aviones) {
        this.activo = activo;
        this.balance = balance;
        this.imagen = imagen;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.email = email;
        this.phone = phone;
        this.direccion = direccion;
        this.acerca = acerca;
        this.time = time;
        this.longitud = longitud;
        this.etiquetas = etiquetas;
        this.aviones = aviones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Plane> getAviones() {
        return aviones;
    }

    public void setAviones(List<Plane> aviones) {
        this.aviones = aviones;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id='" + id + '\'' +
                ", activo=" + activo +
                ", balance='" + balance + '\'' +
                ", imagen='" + imagen + '\'' +
                ", capacidad=" + capacidad +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", direccion='" + direccion + '\'' +
                ", acerca='" + acerca + '\'' +
                ", time='" + time + '\'' +
                ", longitud=" + longitud +
                ", latitud=" + latitud +
                ", etiquetas=" + etiquetas +
                ", aviones=" + aviones +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport airport)) return false;
        return Objects.equals(getId(), airport.getId()) && Objects.equals(getActivo(), airport.getActivo()) && Objects.equals(getBalance(), airport.getBalance()) && Objects.equals(getImagen(), airport.getImagen()) && Objects.equals(getCapacidad(), airport.getCapacidad()) && Objects.equals(getNombre(), airport.getNombre()) && Objects.equals(getEmail(), airport.getEmail()) && Objects.equals(getPhone(), airport.getPhone()) && Objects.equals(getDireccion(), airport.getDireccion()) && Objects.equals(getAcerca(), airport.getAcerca()) && Objects.equals(getTime(), airport.getTime()) && Objects.equals(getLongitud(), airport.getLongitud()) && Objects.equals(getLatitud(), airport.getLatitud()) && Objects.equals(getEtiquetas(), airport.getEtiquetas()) && Objects.equals(getAviones(), airport.getAviones());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getId(), getActivo(), getBalance(), getImagen(), getCapacidad(), getNombre(), getEmail(), getPhone(), getDireccion(), getAcerca(), getTime(), getLongitud(), getLatitud(), getEtiquetas(), getAviones());
    }
}
