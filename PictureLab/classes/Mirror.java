
public class Mirror extends SimplePicture
{

    /**
     * Default constructor for objects of class Mirror
     */
    public void mirror_effect()
    {
        Pixel[][] pixels = getPixels2D();
        
        Pixel first = null;
        Pixel second = null;
        for(int row = 0; row <= pixels.length;row++)
        {
            for(int col = 0; col < pixels[row].length/2;col++)
            {
                int mirrorcol = -col+pixels[row].length;
                
                pixels[row][mirrorcol].setColor(pixels[row][col].getColor());
                pixels[row][col].setColor(pixels[row][mirrorcol].getColor());
                
            }
        }
    }

    public static void main(String[] args)
    {
        Mirror pic = new Mirror("earth.jpg");
        pic.mirror_effect();
    }

}
