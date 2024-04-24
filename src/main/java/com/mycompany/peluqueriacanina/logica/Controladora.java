package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio){
    
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
     
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setuDuenio(duenio); // Cambiado a setuDuenio (asumiendo que es el método correcto para establecer el dueño de la mascota)
        
        controlPersis.guardar(duenio, masco); // Cambiado a controlPersis
    }
    
}
