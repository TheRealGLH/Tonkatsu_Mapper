/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.*;

/**
 *
 * @author Martijn
 */
public class Dungeon {
    
    ArrayList<Floor> floors;
    
    public Dungeon()
    {
        floors = new ArrayList<Floor>();
        floors.add(new Floor(35,25,true));
    }
}
