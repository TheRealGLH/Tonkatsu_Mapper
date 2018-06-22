/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.enums.CavetileLevel;
import Classes.enums.TileType;

/**
 *
 * @author Martijn
 */
public class Floor {
    public Tile[][] tiles;
    final boolean isCave;
    public final int x;
    public final int y;
    
    public Floor(int x, int y, boolean isCave)
    {
        this.x = x;
        this.y = y;
        this.isCave = isCave;
        tiles = new Tile[x][y];
        if(isCave)
        {
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    tiles[j][i] = new CaveTile(TileType.bottom,CavetileLevel.l2);
                    
                }
            }
        }
        
    }
    
}
