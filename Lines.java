import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lines extends Move
{
    /**
     * Act - do whatever the Lines wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        driveDown();
    }    
    
    public void driveDown() // moves people down the screen at 3 units.
    {
        setLocation(getX(100), getY + 3);
    }
    
}
