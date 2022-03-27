import ecs100.*;
import java.awt.Color;
/**
 * Flower support class
 * Create a flower of a size and colour
 * Can grow.
 *
 * @author AL
 * @version March 2022
 */
public class Flower
{
    // instance variables - replace the example below with your own
    private double flowerX = -100; // x pos of the flower
    private double flowerY = -100; // y pos of the flower
    
    private int flowerSize;
    private int flowerHeight;
    
    private Color color;            // Color of flower
    
    private double left;            // left of flower
    private double top;             // top of flower
    private double bottom;          // bottom of flower
    

    /**
     * Constructor for objects of class Flower
     */
    public Flower(double x, double y, int size, int stem, Color col)
    {
        // initialise instance variables
        this.flowerX = x;
        this.flowerY = y;
        this.flowerSize = size;
        this.flowerHeight = stem;
        this.color = col;
        
        // set top, left, bottom
        this.setLeft();
        this.setTop();
        this.setBottom();
    }

    /**
     * Set left
     */
    public void setLeft() {
        this.left = this.flowerX - this.flowerSize/2.0;
    }
    
    /**
     * Set top
     */
    public void setTop() {
        this.top = this.flowerY - this.flowerSize/2.0;
    }
    
    /**
     * Set bottom
     */
    public void setBottom() {
        this.bottom = this.flowerY + this.flowerHeight;
    }
}
