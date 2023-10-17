import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageSplitter {
    public static void main(String[] args) {
        try {
            // 加载图片
            BufferedImage image = ImageIO.read(new File("F:\\javacode\\javalearn\\puzzle\\src\\jpg (0).jpg"));

            // 计算每个小块的宽度和高度
            int width = image.getWidth() / 4;   // 图片总宽度除以4
            int height = image.getHeight() / 4; // 图片总高度除以4

            // 循环切割图片
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    // 创建一个新的BufferedImage来保存切割后的小块
                    BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

                    // 获取当前小块左上角的像素坐标
                    int x = i * width;
                    int y = j * height;

                    // 使用Graphics2D工具将原始图片中的对应区域绘制到新的BufferedImage中
                    Graphics2D g2d = newImage.createGraphics();
                    g2d.drawImage(image, 0, 0, width, height, x, y, x + width, y + height, null);
                    g2d.dispose();

                    // 保存切割后的小块为文件
                    File output = new File("output_" + i + "_" + j + ".jpg");
                    ImageIO.write(newImage, "JPEG", output);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
