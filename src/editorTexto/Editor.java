/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorTexto;

/**
 *
 * @author Student
 */
public class Editor {
  private String copiar;
  private String cortar;
  private String pegar;
  private String fuente;
  private String color;
  private String abrir; 
  private String guardar; 
  private String salir; 

    public String getCopiar() {
        return copiar;
    }

    public String getCortar() {
        return cortar;
    }

    public String getPegar() {
        return pegar;
    }

    public String getFuente() {
        return fuente;
    }

    public String getColor() {
        return color;
    }

    public String getAbrir() {
        return abrir;
    }

    public String getGuardar() {
        return guardar;
    }

    public String getSalir() {
        return salir;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public void setColor(String color) {
        this.color =  color;
    }

    public Editor(String copiar, String cortar, String pegar, String fuente, String color, String abrir, String guardar, String salir) {
        this.copiar = copiar;
        this.cortar = cortar;
        this.pegar = pegar;
        this.fuente = fuente;
        this.color = color;
        this.abrir = abrir;
        this.guardar = guardar;
        this.salir = salir;
    }
  
  
  
  
  
}
