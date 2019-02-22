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
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 */

    public class Juego extends JPanel {

        private Image FondoJuego;
        private final Fondo luz;
        private final Fondo efecto;
        private final Fondo contruccion;
        private final Fondo ciudad;
        
        public Juego(){
            luz = new Fondo("/run/media/kebuun/Datos/Documents/U/2º/POO/ProyectoFinal/Juego/src/juego/Graficos/Recursos/Fondo/1Fondo.png");
            efecto = new Fondo("/run/media/kebuun/Datos/Documents/U/2º/POO/ProyectoFinal/Juego/src/juego/Graficos/Recursos/Fondo/2Fondo.png");
            contruccion = new Fondo("/run/media/kebuun/Datos/Documents/U/2º/POO/ProyectoFinal/Juego/src/juego/Graficos/Recursos/Fondo/2Fondo.png");
            ciudad = new Fondo("/run/media/kebuun/Datos/Documents/U/2º/POO/ProyectoFinal/Juego/src/juego/Graficos/Recursos/Fondo/1Fondo.png");
        }
        
        
        
        @Override
        protected void paintComponent(Graphics g){
            
            super.paintComponent(g);
            Image escena = luz.getImage();            
            Graphics2D g2d = (Graphics2D) g;
            
            g2d.drawImage(escena, 0, 0, null);

        }
         
 }
        