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
<<<<<<< HEAD
    
=======
        if (isTouching(KANCIL.class))
            getWorld().removeObject(this);
          
            
            
            
            
>>>>>>> e560d60cf6f0d5672c34c352b9781732cfcdc651
        if (umur == 0)
            getWorld().removeObject(this);
    }
   }
