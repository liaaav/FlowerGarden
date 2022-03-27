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
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
    }
}
