package L8;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class L8_Ueb4 {
    public static void main(String[] args) throws IOException {
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";

        int indexSrc = seite.indexOf("src=") + 5;
        String substringOfSeite = seite.substring(indexSrc);
        substringOfSeite = substringOfSeite.substring(0, substringOfSeite.charAt('>')+1);

        String downloadUrl = substringOfSeite;
        URL url = new URL(downloadUrl);
        BufferedImage image = ImageIO.read(url);
        ImageIO.write(image, "png", new File("bild.png"));

    }

}
