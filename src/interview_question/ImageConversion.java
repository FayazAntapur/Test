package interview_question;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageConversion {

    public static void main(String[] args) {

        //.jpg ---->.png
        try {
            URL url = new URL("https://m.media-amazon.com/images/G/31/img19/AMS/Houseads/Laptops-Sept2019._CB436595915_.jpg");
            BufferedImage bf = ImageIO.read(url);
            ImageIO.write(bf,"png",new File("E:\\New_Java\\src\\interview_question\\myimage.png"));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
