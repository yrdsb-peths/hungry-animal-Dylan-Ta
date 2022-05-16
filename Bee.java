import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("s")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("w")){
            move(4);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(4);
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-4);
        }
        eat();
    }
    public void eat(){
        if(isTouching(Pizza.class)){
            Greenfoot.playSound("sounds/salamisound-1920781-humming-of-a-beehive-swarm.mp3");
            removeTouching(Pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnPizza();
        }
    }
}
