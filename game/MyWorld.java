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
    int range_umur = 300;
    kaktus kaktuus = new kaktus();
    public void act(){
       if (cekTimunHabis())
        populate();
    }

    private boolean cekTimunHabis(){
        return getObjects(timun.class).size() == 0;
    }
    private boolean cekkaktusHabis(){
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
        for (int i=0; i<3; i++){
            int umur = umur_terpendek + Greenfoot.getRandomNumber(range_umur);
            addObject(new timun(umur), myRandom(getWidth()), getHeight()-myRandom(getHeight()/2));
        }
        for (int i=0; i<3; i++){
            int umur = umur_terpendek + Greenfoot.getRandomNumber(range_umur);
            addObject(new kaktus(umur), myRandom(getWidth()), getHeight()-myRandom(getHeight()/2));
        }
   }


    private int myRandom(int x){
        return Greenfoot.getRandomNumber(x);
        
        
        
        
    }

}
