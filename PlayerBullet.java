import greenfoot.*;

public class PlayerBullet extends Actor
{
    
    public void act() 
    {
        setLocation(getX(), getY() - 25);
        edgeSelfDestoy();
    }
    
    private void edgeSelfDestoy(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
