package com.tonkatsu.mapper;

import Actors.*;
import Classes.*;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Mapper extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
        FloorActor fa;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
                Floor f = new Floor(3,3,true);
                fa = new FloorActor(f);
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
                fa.draw(batch,1);
                batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
