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
public class Tile {
    
    private TileType tiletype;
    
    public Tile(TileType cavetiletype)
    {
        this.tiletype = cavetiletype;
        
    }
    
    /**
     *
     * @param toSet
     * @return whether or not the given TileType is NOT the same as the one already there
     */
    public boolean setTileType(TileType toSet)
    {
        if(!toSet.equals(tiletype))
        {
            tiletype = toSet;
            return true;
        }
        return false;
    }
}
