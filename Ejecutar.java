
package com.manosenelcodigo.trabajo;

import graficas.Marco;
import javax.swing.JOptionPane;


public class Ejecutar 
{
    public static void main(String[] args) 
    {
        String texto =JOptionPane.showInputDialog("ingrese el título");
        Marco m=new Marco();
        m.setTitulo(texto);
        m.getVentana();
    }
}
