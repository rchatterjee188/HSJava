
/**
 * Runs a simulation of RC_PictureEncryption
 * 
 * Ruhika Chatterjee
 * 4/11/17
 */
public class RC_PicEncryptionDriver
{
    public static void main (String args[])
    {
        RC_PictureEncryption encrypt = new RC_PictureEncryption ();
        RC_Picture transformed = encrypt.transform();
        transformed.show();
        transformed.save("transformed.png");
        
        RC_PictureEncryption decrypt = new RC_PictureEncryption ("transformed.png", "01101000010", 9);
        RC_Picture decrypted = decrypt.transform();
        decrypted.show();
    }
}
