package ed.controlador;

import ed.modelo.EditorModelo;
import ed.vista.EditorVista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Boris Perez
 */
public class EditorControlador {
    
    private EditorVista vista;
    private EditorModelo modelo;

    public EditorControlador(EditorVista vista) {
        this.vista = vista;
        modelo = new EditorModelo();
    }

    public void obtenerAtras() {
        
    }

    public void obtenerAdelante() {
        
    }

    public void enviarTexto() {
        
    }
    
    
    
}
