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
    int umur_terpendek = 150;
<<<<<<< HEAD
    int range_umur = 150;
    public void act(){
        if (cekTimunHabis())
            populate();
            
    }
    
=======
    int range_umur = 300;
    
    public void act(){
       if (cekTimunHabis())
        populate();
            
    }

>>>>>>> 09abf48110d7700f9fdc76a56bc89a0372bcba93
    private boolean cekTimunHabis(){
        return getObjects(timun.class).size() == 0;
    }
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(utama, 417, 256);
        populate();
    }
    
    private void populate(){
<<<<<<< HEAD
        for(int i =0; i<3; i++){
            int umur = umur_terpendek + Greenfoot.getRandomNumber(range_umur);
           addObject(new timun(umur), myRandom(getWidth()), getHeight()-myRandom(getHeight()/2));
        }
    }
=======
        for (int i=0; i<3; i++){
            int umur = umur_terpendek + Greenfoot.getRandomNumber(range_umur);
            addObject(new timun(umur), myRandom(getWidth()), getHeight()-myRandom(getHeight()/2));
        }
   }

>>>>>>> 09abf48110d7700f9fdc76a56bc89a0372bcba93
    
    private int myRandom(int x){
        return Greenfoot.getRandomNumber(x);
        
        
        
        
    }

}
