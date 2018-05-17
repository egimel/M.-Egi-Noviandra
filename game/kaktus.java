import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kaktus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kaktus extends Actor
{
    /**
     * Act - do whatever the kaktus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int umur;
    public kaktus(){
        umur = 150;
    }
      public kaktus(int umur){
        this.umur = umur;
    }
    public void act() 
    {
        // Add your action code here.
        umur--;
    
        if (umur == 0)
            getWorld().removeObject(this);
    }
   }
