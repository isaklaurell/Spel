import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class People extends Enemy
{
   
      public void act() // main act checks for collisions, makes trucks drive down scree, and removes them at end of world.
    {
        checkCollision();
        driveDown();
        endOfRoad();
    } 
    
    public void driveDown() // moves people down the screen at 3 units.
    {
        setLocation(getX(), getY() + 3);
    }
    
    public void checkCollision() // checks if the people spawn on top of eachother. will remove one.
    {
        Actor people = getOneIntersectingObject(People.class);
        if(people != null)
        {
            getWorld().removeObject(people);
        }
     }
    
     
    public void endOfRoad() // removes truck once it hits end of the world.
    {
        if(getY() >= getWorld().getHeight() -1)
        {
            getWorld().removeObject(this);
        }
     
    }
}
