package Clases;

import android.graphics.Color;

public class Usuario {
    private String nombre;
    private String mensaje_chat;
    private String ultima_conexion;
    private int imagen;
    private Color color;

    public Usuario(String nombre, String mensaje_chat, String ultima_conexion, int imagen, Color color){
        this.nombre = nombre;
        this.mensaje_chat = mensaje_chat;
        this.ultima_conexion = ultima_conexion;
        this.imagen = imagen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje_chat() {
        return mensaje_chat;
    }

    public void setMensaje_chat(String mensaje_chat) {
        this.mensaje_chat = mensaje_chat;
    }

    public String getUltima_conexion() {
        return ultima_conexion;
    }

    public void setUltima_conexion(String ultima_conexion) {
        this.ultima_conexion = ultima_conexion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
