import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Class will check to se see if the car hits anything or if the user moves the car around the screen.
 * it will also keep up with the damage done to the car.
 * @author Hubert Jackson Black III
 * @version v0.1
 */
public class Car extends Move
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    

   
    
    public void act() // main part of the car that keeps running.
    {
            
        checkKeyPress();
        checkCollision();
    }  
   
    public void checkCollision() // increases damage of car when it hits a Vehicle.
    {
        Actor actor = getOneIntersectingObject(Enemy.class);
        if (actor != null)
        {
            Greenfoot.playSound("crash.wav");
            Greenfoot.stop();
        }
        
               
    }
    
    public void moveLeft() // moves car left but stops it before it runs off road.
    {
        if(getX() <= 530 && getX() >= 117)
        {
            setLocation(getX() - 2, getY());
        }
    }
    
    public void moveRight()  // moves the car right but stops it before it runs off road.
    {
        if(getX() < 485)
        {
        setLocation(getX() + 2, getY());
        }
    }
    public void moveUp()  // moves car up the screen
    {
        setLocation(getX(), getY() - 2);
    }
    public void moveDown() // moves car down the screen.
    {
        setLocation(getX(), getY() + 2);
    }
    

  
    
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("left")) // move car left
        {
            moveLeft();
        }
        if(Greenfoot.isKeyDown("right")) // move car right
        {
            moveRight();
        }
        if(Greenfoot.isKeyDown("up")) // Move car up
        {
           
            moveUp();
        }
        if(Greenfoot.isKeyDown("down")) // Move car down
        {     
            moveDown();
        }
         

        
        
    }   
}
