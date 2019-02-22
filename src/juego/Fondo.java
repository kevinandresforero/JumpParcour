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

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 */
public final class Fondo {
    Image imagen ;
    
    public Fondo(String ruta){
        File f = new File(ruta) ;
        
        
        System.out.println("Se cargo dorrectamente el fondo de la ruta"+ruta);
        
    }
    
    public Image getImage(){
        return imagen ;
    }
    
    	public void paint(Graphics2D g) {
            ImageIcon imagenFondo =new ImageIcon(getClass().getResource("/Imagenes/1Fondo.png"));
            ImageIcon imagenFondo2 =new ImageIcon(getClass().getResource("/Imagenes/2Fondo.png"));
            ImageIcon imagenFondo3 =new ImageIcon(getClass().getResource("/Imagenes/3Fondo.png"));
            ImageIcon imagenFondo4 =new ImageIcon(getClass().getResource("/Imagenes/4Fondo.png"));
            g.drawImage(imagenFondo.getImage(), 0, 0, null);
            g.drawImage(imagenFondo2.getImage(), 0, 0, null);
            g.drawImage(imagenFondo3.getImage(), 0, 0, null);
            g.drawImage(imagenFondo4.getImage(), 0, 0, null);
        }
    
}

