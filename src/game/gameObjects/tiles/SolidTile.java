package game.gameObjects.tiles;

import game.GameConstants;
import game.ID;
import game.gameObjects.ObjectManager;
import game.graphics.Resources;

import java.awt.*;

public class SolidTile extends Tile{

    public SolidTile(int x, int y, ID id, ObjectManager objectManager) {
        super(x, y, id,objectManager);
    }

    @Override
    public boolean isSolid() {
        return true;
    }

    @Override
    public boolean isBreakable() {
        return true;
    }

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.solidWall,x,y, GameConstants.TILE_WIDTH,GameConstants.TILE_HEIGHT,null);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x,y, GameConstants.TILE_WIDTH,GameConstants.TILE_HEIGHT);
    }
}

