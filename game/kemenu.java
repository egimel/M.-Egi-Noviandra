import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kemenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kemenu extends Actor
{
    /**
     * Act - do whatever the kemenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public kemenu()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 50, image.getHeight() - 70);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
