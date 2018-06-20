/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.enums.*;

/**
 *
 * @author Martijn
 */
public class CaveTile extends Tile {
    
    CavetileLevel tilelevel;
    public CaveTile(TileType cavetiletype, CavetileLevel tilelevel)
    {
        super(cavetiletype);
        this.tilelevel = tilelevel;
    }
    
}
