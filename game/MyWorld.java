import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

   public KANCIL utama = new KANCIL();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(utama, 417, 256);
        populate();
    }
    
    private void populate(){
        addObject(new timun(), myRandom(getWidth()), getHeight()-myRandom(getHeight()/2));
    }
    
    private int myRandom(int x){
        return Greenfoot.getRandomNumber(x);
    }

}
