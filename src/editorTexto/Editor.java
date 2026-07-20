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
  private boolean abrir; 
  private boolean guardar; 
  private boolean salir; 

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

    public boolean getAbrir() {
        return abrir;
    }

    public boolean getGuardar() {
        return guardar;
    }

    public boolean getSalir() {
        return salir;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public void setColor(String color) {
        this.color =  color;
    }

    public void setCopiar(String copiar) {
        this.copiar = copiar;
    }

    public void setPegar(String pegar) {
        this.pegar = pegar;
    }

    public void setAbrir(boolean abrir) {
        this.abrir = abrir;
    }

    public void setGuardar(boolean guardar) {
        this.guardar = guardar;
    }

    public Editor() {
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
