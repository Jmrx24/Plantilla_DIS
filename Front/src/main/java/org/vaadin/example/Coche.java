package org.vaadin.example;

public class Coche {
    private int id;
    private String marca;
    private double precio;
    private String color;
    private int edad;
    private String popularidad;

    public Coche(int id, String marca, double precio, String color, int edad, String popularidad) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.edad = edad;
        this.popularidad = popularidad;
    }

    public Coche() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(String popularidad) {
        this.popularidad = popularidad;
    }

    public String mostrarJson()
    {
        return "{\n" +
                "\"id\": " + id  +  ",\n" +
                "\"marca\": " + "\"" + marca + "\"," + "\n" +
                "\"precio\": " + precio  +  ",\n" +
                "\"color\": " + color  +  ",\n" +
                "\"edad\": " + "\"" + edad + "\"," + "\n" +
                "\"popularidad\": " + "\"" + popularidad + "\"" + "\n" +
                "}";
    }
}
