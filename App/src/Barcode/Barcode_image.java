package Barcode;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;

public abstract class Barcode_image {
	public static BufferedImage createImage(String myString)  {
            try {
		Code128Bean code128 = new Code128Bean();
		code128.setModuleWidth(0.2);
		code128.setQuietZone(10);
		code128.doQuietZone(true);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		BitmapCanvasProvider canvas = new BitmapCanvasProvider(baos, "image/x-png", 300, BufferedImage.TYPE_BYTE_BINARY, false, 0);
		code128.generateBarcode(canvas, myString);
		canvas.finish();
                byte[] imageInByte = baos.toByteArray();
                return ImageIO.read(new ByteArrayInputStream(imageInByte));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
	}
}