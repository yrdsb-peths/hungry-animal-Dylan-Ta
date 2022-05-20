import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyWorld creates game world
 * 
 * @author Dylan Ta
 * @version May 2022
*/
public class MyWorld extends World
{
    public static int score = 0;
    public Label scoreLabel = new Label(score, 80);
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Bee bee1 = new Bee ();
        addObject(bee1, 300, 300);
        addObject(scoreLabel, 40,30);
        spawnPizza();
        GreenfootImage background = new GreenfootImage("images/Forest.png");  
        background.scale(600,400);
        setBackground(background);
    }
    public void spawnPizza(){
        Pizza piz = new Pizza();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(piz, x, y);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void gameOver()
    {
        GameOverWorld world = new GameOverWorld();
        Greenfoot.setWorld(world);
    }
}
