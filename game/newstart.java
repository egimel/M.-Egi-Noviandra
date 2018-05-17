import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class newstart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class newstart extends Actor
{
    /**
     * Act - do whatever the newstart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public newstart()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 50, image.getHeight() - 70);
        setImage(image);
    }
    
    public void act() 
    {
        Greenfoot.start();
        tombol_klik();
        // Add your action code here.
    }    
    
     public void tombol_klik(){
        if(Greenfoot.mouseClicked(this)){
            MyWorld MyWorld = new MyWorld();
            Greenfoot.setWorld(MyWorld);
        }
    }
}
