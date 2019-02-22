/*
 * Copyright (C) 2019 Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 *
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
package juego.Graficos;

import javax.swing.JFrame;
import juego.Juego;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 */
public class Ventana extends JFrame {
    private final int ancho = 1080;
    private final int alto = 720;

    public Ventana(){
        
        /*
          *   Se crea y setea la ventana Principal
        */
        JFrame ventana = new JFrame("Jueguito");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Jump Parcours");
        System.out.println("Ventana()");
        ventana.add(new Juego());
        ventana.setSize(ancho, alto);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setCursor(1);
        ventana.setLocationRelativeTo(null);
        
        
        
    }
    
}
