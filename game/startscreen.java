import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startscreen extends World
{

    /**
     * Constructor for objects of class startscreen.
     * 
     */
    public startscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        start start = new start();
        addObject(start,301,296);
        start.setLocation(304,272);
        start.setLocation(306,285);
    }
}
