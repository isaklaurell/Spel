import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Move

{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public int speed =4;
   
   public void checkCollision() // checks if the people spawn on top of eachother. will remove one.
    {
        Actor people = getOneIntersectingObject(People.class);
        if(people != null)
        {
            getWorld().removeObject(people);
        }
     }
     
}
