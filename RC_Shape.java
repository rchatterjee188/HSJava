
/**
 * Creates an interface for the 5 shapes to draw with the common methods
 * 
 * Ruhika Chatterjee
 * 06.07.17
 */

import java.util.ArrayList;
public interface RC_Shape
{
    void setPoints();
    void userInput();
    ArrayList<Double> getxVals();
    ArrayList<Double> getyVals();
    ArrayList<Double> gety2Vals();
}
