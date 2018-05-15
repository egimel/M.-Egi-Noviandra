import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timun extends Actor
{
    /**
     * Act - do whatever the timun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int umur;
    public timun(){
        umur = 200; // 2 detik
    }
    public timun(int umur){
        this.umur = umur; // 2 detik
    }
    public void act() 
    {
        // Add your action code here.
        umur--;
        if (isTouching(KANCIL.class))
            getWorld().removeObject(this);
        if (umur == 0)
            getWorld().removeObject(this);
        
   }    
}
