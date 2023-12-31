package sprite;

import biuoop.DrawSurface;

/**
 * interface defines the behaviour of sprites.
 */
public interface Sprite {
    /**
     * draw the sprite to the screen.
     *
     * @param d
     */

    void drawOn(DrawSurface d);

    /**
     * notify the sprite that time has passed.
     */

    void timePassed();
}
