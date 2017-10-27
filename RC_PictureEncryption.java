
/**
 * Write a program that produces pseudo-random bits by simulating a linear-feedback 
 * shift register, and then use it to implement a simple form of encryption for digital pictures.
 * 
 * LFSR review.  A linear-feedback shift register (LFSR) is a register of bits that performs 
 * discrete step operations that shifts the bits one position to the left and replaces the 
 * vacated bit by the exclusive or (xor) of the bit shifted off and the bit previously at a 
 * given tap position in the register.
 * A LFSR has three parameters that characterize the sequence of bits it produces: the number 
 * of bits n, the initial seed (the sequence of bits that initializes the register), and the 
 * tap position tap. As in the example in Lecture 0, the following illustrates one step of an 
 * 11-bit LFSR with initial seed 01101000010 and tap positions 9.
 * 
 * Ruhika Chatterjee
 * 4/7/17
 */

import java.awt.Color;
public class RC_PictureEncryption
{
    private RC_Picture picture;
    private RC_Picture transformed;
    private RC_LFSR lfsr;
    
    public RC_PictureEncryption (String fileName, String seed, int tap){
        picture = new RC_Picture (fileName);
        transformed = new RC_Picture (picture.width(), picture.height());
        lfsr = new RC_LFSR (seed, tap);
    }
    
    public RC_PictureEncryption (){
        picture = new RC_Picture ("pipe.png");
        transformed = new RC_Picture (picture.width(), picture.height());
        lfsr = new RC_LFSR ("01101000010", 9);
    }
    
    public RC_Picture transform (){
        Color color;
        Color newColor;
        for (int i = 0; i < picture.width(); i++){
            for (int j = 0; j < picture.height(); j++){
                color = picture.get(i, j);
                newColor = new Color (lfsr.generate(8) ^ color.getRed(), lfsr.generate(8) ^ color.getGreen(), lfsr.generate(8) ^ color.getBlue());
                transformed.set (i, j, newColor);
            }
        }
        return transformed;
    }
}
