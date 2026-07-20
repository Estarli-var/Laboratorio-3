/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorTexto;
/**
 *
 * @author emalv
 */
public class Controlador {
    
    private Editor controlador;

    public Controlador(Editor controlador) {
        this.controlador = controlador;
    }
    public void cambiarFuente(String newFuente){
        this.controlador.setFuente(newFuente);
    }
    public void cambiarColor(String newColor){
        this.controlador.setColor(newColor);
    }
    public void copiarTexto(String newTexto){
        this.controlador.setCopiar;
    }
}
