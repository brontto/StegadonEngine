package Engine.GFX;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SImage {

    private int width, height;
    private int[] pixels;

    public SImage(String path){

        BufferedImage image = null;

        try{
            image = ImageIO.read(SImage.class.getClassLoader().getResourceAsStream(path));
        }catch (IOException e){
            e.printStackTrace();
        }


        width = image.getWidth();
        height = image.getHeight();
        pixels = image.getRGB(0, 0, width, height,null, 0 , width);

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[] getPixels() {
        return pixels;
    }

    public void setPixels(int[] pixels) {
        this.pixels = pixels;
    }
}