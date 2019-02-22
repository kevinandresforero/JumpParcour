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
package juego;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero>
 */
public class Personaje {

    private final Juego Juego;
    private boolean saltando = false;
    int ancho = 50;
    int alto = 50;
    int x = 10;
    int y = 350;
    int x1 = 0;
    int y1=0;

    public Personaje(Juego aThis) {
        this.Juego = aThis;
    }

    void mover() {
        
    }

    void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_SPACE)
        {
            saltando=true;
        }
    }

    void paint(Graphics2D g) {
       ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/juego/Graficos/Recursos/Personaje/k3.png"));
       g.drawImage(imagenFondo.getImage(), 250, 250,150,150,null);
       
    }
    
    
	public ImageIcon getBounds() {
		return new ImageIcon();
	}
    
}
