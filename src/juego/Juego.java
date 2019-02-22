/*
 * Copyright (C) 2019 Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
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
package juego;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 */

    public class Juego extends JPanel {

        private Fondo fondoJuego ;
        private Image juego ; 
        private final String ruta = "/Graficos/Recursos/Fondo/4Fondo.png";
        
        public Juego(){

        
        }
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            File f = new File(ruta) ;
            try {
                juego = ImageIO.read(f) ;
                System.out.println("Se cargo correctamente la imagen de la ruta: "+ruta);
            } catch (IOException ex) {
                System.out.println("No se pudo cargar la imagen de la ruta: "+ruta);
            }
            
        }
         
 }
        