import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {
        super(600, 400, 1);
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);

        Label scoreLabel = new Label("Score: " + MyWorld.score, 60);
        addObject(scoreLabel, 290, 280);
        Label restartLabel = new Label("Press <space> to restart", 60);
        addObject(restartLabel, 300, 350);
        MyWorld.score = 0;
    }
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
