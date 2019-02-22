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

import java.awt.Image;
import java.awt.event.KeyEvent;

/**
 *
 * @author Kevin Andres Forero Guaitero <https://github.com/kevinandresforero/JumpParcour>
 */
public class Personaje {

    int dx;
    int dy;
    int x;
    int y;
    String UbicacionImagen;
    Image Imagen;
    boolean saltando = false ;
    int numeroVidas = 3;

    public void mover(){
        if (dx > 0 && x <= 1250) {
            x += dx;
        } else if (dx < 0 && x >= 10) {
            x += dx;
        }

        if (dy > 0 && y <= 780) {
            y += dy;
        } else if (dy < 0 && y >= 10) {
            y += dy;
        }
    }

    void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_SPACE)
        {
            saltando=true;
        }
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public Image getImagen() {
        return Imagen;
    }
    
}
