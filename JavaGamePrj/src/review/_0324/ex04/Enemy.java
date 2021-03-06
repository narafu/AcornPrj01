package review._0324.ex04;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Enemy implements Movable {

	private static Image img;
	private double x, y, vy;
	private int width, height, imgIndex;

	static {
		try {
			img = ImageIO.read(new File("res/image/alien.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Enemy() {

		width = img.getWidth(GameCanvas.getInstance()) / 12;
		height = img.getHeight(GameCanvas.getInstance());
		y = 150;
		vy = 1;

	}

	@Override
	public void dateUp() {

	}

	@Override
	public void paint(Graphics g) {

		int dx1 = (int) x - width / 2;
		int dy1 = (int) y - height / 2;
		int dx2 = (int) x + width / 2;
		int dy2 = (int) y + height / 2;

		g.drawImage(img, dx1, dy1, dx2, dy2, width * imgIndex, 0, width * (imgIndex + 1), height,
				GameCanvas.getInstance());

	}

}
