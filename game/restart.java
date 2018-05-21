import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class restart extends Actor
{
    /**
     * Act - do whatever the restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public restart()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 50, image.getHeight() - 70);
        setImage(image);
    }
    
    
    public void act() 
    {
        tuju();
        // Add your action code here.
    }
    
     public void tuju(){
        if(Greenfoot.mouseClicked(this)){
            MyWorld MyWorld = new MyWorld();
            Greenfoot.setWorld(MyWorld);
        }
    }
}
