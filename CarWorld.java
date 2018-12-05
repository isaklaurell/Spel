import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWorld  extends World
{

    /**
     * Constructor for objects of class CarWorld.
     * 
     */
    public CarWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(600, 800, 1); 
        addObject(new Car(), 305, 550); //will need this later to make car appear.
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 1) //this will make trucks randomly apear.
        {        
          addObject(new Vehicle(), Greenfoot.getRandomNumber(200) + 200, 0); //this keeps trucks on the road   
        }
        if(Greenfoot.getRandomNumber (6) < 2) //this makes trees randomly appear.
        {
           addObject(new Trees(), Greenfoot.getRandomNumber(70), 0);  // keep them on left hand side of road
           addObject(new Trees(), Greenfoot.getRandomNumber(70) + 540, 0); //keep them on right hand side of road
        }
        if(Greenfoot.getRandomNumber(100) < 1) //this will make people randomly apear.
        {        
            addObject(new People(), Greenfoot.getRandomNumber(200) + 200, 0); //this keeps People on the road   
        }
    }
}
