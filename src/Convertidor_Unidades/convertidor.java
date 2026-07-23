/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Convertidor_Unidades;

/**
 *
 * @author Student
 */
public class convertidor {
    
   private CovertidorUnidad modelo;
   private jFrameConvertidor vista;
   

    public convertidor(CovertidorUnidad modelo, jFrameConvertidor vista) {
        this.modelo = modelo;
        this.vista = vista;
         ejecutarPuente();
        vista.getTxtValor().addChangeListener(e -> ejecutarPuente());
        vista.getCbOrigen().addActionListener(e -> ejecutarPuente());
        vista.getCbDestino().addActionListener(e -> ejecutarPuente());
    }
        private void ejecutarPuente() {
Object valorSpinner = vista.getTxtValor().getValue();
        double valor = Double.parseDouble(valorSpinner.toString());

        modelo.setValorO(valor);
        modelo.setUnidadO(vista.getCbOrigen().getSelectedItem().toString());
        modelo.setUnidadD(vista.getCbDestino().getSelectedItem().toString());

        double resultado = modelo.calcularUnidad();

        System.out.println("Valor calculado: " + resultado);

        vista.getTxtResultado().setText(String.valueOf(resultado));
    }
    
}

