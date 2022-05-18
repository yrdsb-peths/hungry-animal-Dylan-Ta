import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
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
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
