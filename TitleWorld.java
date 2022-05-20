import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates title screen world.
 * 
 * @author Dylan Ta
 * @version May 2022
 */
public class TitleWorld extends World
{

    /**
     * Constructor for objects of class TitleWorld.
     * 
     */
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Label titleLabel = new Label("A Hungry Bee", 60);
        addObject(titleLabel,300, 200);
        Label instructionLabel = new Label("Press <enter> to begin", 50);
        addObject(instructionLabel, 300, 270);
        GreenfootImage background = new GreenfootImage("images/Forest.png");  
        background.scale(600,400);
        setBackground(background);
    }

    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
