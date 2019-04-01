import greenfoot.*;

public class Player extends Actor
{
    public Player(){
        setRotation(270);
    }
    
    public void act() 
    {
        movement();
        shooting();
    }
    
    private void movement(){
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX() - 5, getY());
        }
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX() + 5, getY());
        }
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY() - 5);
        }
        if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY() + 5);
        }
    }
    
    private void shooting(){
        if(Greenfoot.isKeyDown("SPACE")){
            getWorld().addObject(new PlayerBullet(),
                                    getX(), getY());
        }
    }
}
