/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actors;

import Classes.Dungeon;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 *
 * @author Martijn
 */
public class DungeonActor extends Actor {

    private Dungeon dungeon = new Dungeon();
    int activefloor;

    @Override
    public void draw(Batch batch, float parentalpha) {
        //dungeon.floors.get(activefloor).
    }

}
