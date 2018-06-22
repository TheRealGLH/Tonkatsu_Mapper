package Actors;

import Classes.*;
import Classes.enums.TileType;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.*;

/**
 *
 * @author Martijn
 */
public class FloorActor extends Actor {

    Texture img = new Texture("tileset/cave01.png");
    float spritesheetwidth = img.getWidth();
    float spritesheetheight = img.getHeight();
    int tilewidthpixels = 16;
    Floor floor;

    public FloorActor(Floor floor) {
        this.floor = floor;
    }

    @Override
    public void draw(Batch batch, float parentalpha) {

        Tile currtile = floor.tiles[0][0];
        TextureRegion tx = new TextureRegion(img, currtile.getTileType().getXCoord() * tilewidthpixels,
                currtile.getTileType().getYCoord() * tilewidthpixels, tilewidthpixels, tilewidthpixels);
        float currX = 0;
        float currY = 0;
        for (int i = 0; i < floor.y; i++) {
            for (int j = 0; j < floor.x; j++) {
                batch.draw(tx, currX, currY, 64, 64);
                //currX += tilewidthpixels;
                currX += 64;
                currtile = floor.tiles[i][j];
                tx.setRegion(currtile.getTileType().getXCoord() * tilewidthpixels,
                         currtile.getTileType().getYCoord() * tilewidthpixels, tilewidthpixels, tilewidthpixels);
                //tx.setRegionY(64);


            }
            currX = 0;
            //currY += tilewidthpixels;
            currY += 64;
        }
    }
}
