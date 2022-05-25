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
    private GreenfootImage[] rightImages;
    private GreenfootImage[] leftImages;
    private SimpleTimer timer;
    private boolean isFacingRight = true;
    public Bee()
    {
        rightImages = new GreenfootImage[3];
        leftImages = new GreenfootImage[3];
        for(int i = 0; i < rightImages.length; i++){
            rightImages[i] = new GreenfootImage("images/bee_idle/idle" + i + ".png");
            rightImages[i].scale(110,75);
            leftImages[i] = new GreenfootImage("images/bee_idle/idle" + i + ".png");
            leftImages[i].scale(110,75);
            leftImages[i].mirrorHorizontally();
        }
        setImage(rightImages[0]);
        timer = new SimpleTimer();
        timer.mark();
    }

    int currentIndex = 0;
    void animate()
    {
        if(timer.millisElapsed() > 125){
            if(isFacingRight) {
                setImage(rightImages[currentIndex]);
            } else {
                setImage(leftImages[currentIndex]);
            }
            currentIndex++;
            currentIndex %= 3;
            timer.mark();
        }
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a")){
            isFacingRight = false;
            move(-3);
        }
        if(Greenfoot.isKeyDown("d")){
            isFacingRight = true;
            move(3);
        }
        eat();
        animate();
    }
    public void eat(){
        if(isTouching(Pizza.class)){
            Greenfoot.playSound("sounds/bee_sound.mp3");
            removeTouching(Pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnPizza();
        }
    }
}
