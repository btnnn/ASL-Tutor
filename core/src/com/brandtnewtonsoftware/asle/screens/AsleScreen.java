package com.brandtnewtonsoftware.asle.screens;

import com.badlogic.gdx.Screen;

/**
 * Created by Brandt on 10/29/2015.
 */
public abstract class AsleScreen implements Screen {

    public AsleScreen() {

    }

    /** Called when the screen should update itself, e.g. continue a simulation etc. */
    public abstract void update (float delta);

    /** Called when a screen should render itself */
    public abstract void draw (float delta);

    /** Called by GdxInvaders to check whether the screen is done.
     * @return true when the screen is done, false otherwise */
    public abstract boolean isDone ();

    @Override
    public void render (float delta) {
        update(delta);
        draw(delta);
    }

    @Override
    public void resize (int width, int height) {
    }

    @Override
    public void show () {
    }

    @Override
    public void hide () {
    }

    @Override
    public void pause () {
    }

    @Override
    public void resume () {
    }

    @Override
    public void dispose () {
    }
}
