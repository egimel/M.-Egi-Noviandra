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
        kancildepan kancildepan = new kancildepan();
        addObject(kancildepan,312,164);
        kancildepan.setLocation(291,163);
        kancildepan.setLocation(289,166);
        kancildepan.setLocation(302,175);
        kancildepan.setLocation(302,178);
        newstart newstart = new newstart();
        addObject(newstart,318,326);
        newstart.setLocation(314,324);
        newstart.setLocation(307,316);
        newstart.setLocation(311,313);
        exit exit = new exit();
        addObject(exit,541,43);
        exit.setLocation(576,23);
    }
}
