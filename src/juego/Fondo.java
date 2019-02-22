/*
 * Copyright (C) 2019 Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package juego;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 */
public final class Fondo {
    String ruta;
    Image imagen ;
    //Variables de tamaño del fondo
    int ancho_fondo = 1300;
    int alto_fondo = 400;
    //Coordenadas iniciales para mover el fondo
    int x1=1300;
    int y1=0;
    //Coordenadas secundariasque mueven otro fondo
    int x2 = 0;
    int y2 = 0;
    
    public Fondo(String ruta){
        this.ruta = ruta;
        imagen = new ImageIcon(getClass().getResource(this.ruta)).getImage();
        System.out.println("Fondo(String ruta)");
        
    }

    void mover() {
        x1 = x1 - 2;
        x2 = x2 - 2;
            
        if (x1==0 & x2==-1300 )
            {   
                x1=1300;
                x2 = 0;
            }
    }

    void paint(String ruta) {
        this.ruta = ruta;
        this.imagen = new ImageIcon(getClass().getResource(this.ruta)).getImage();
        System.out.println("carga exitosa");
    }
    
}

