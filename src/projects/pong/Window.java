package projects.pong;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The window that displays the game.
 */
public class Window extends JFrame {

	/**
	 * A custom canvas for drawing on, for performance reasons.
	 */
	class Canvas extends JPanel {
		/**
		 * Serial version ID.
		 */
		private static final long serialVersionUID = 4995528906323790395L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Window.this.update();
			Window.this.draw(g);
		}
	}

	/**
	 * For serialization.
	 */
	private static final long serialVersionUID = 8856066702068888163L;

	/**
	 * The initial width of the window in pixels.
	 */
	private static final int CANVAS_WIDTH = 500;

	/**
	 * The initial height of the window in pixels.
	 */
	private static final int CANVAS_HEIGHT = 500;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private Ball ball;
	private Input input;
	private int player1Score;
	private int player2Score;

	private Canvas canvas;

	/**
	 * Create and configure a new window.
	 */
	public Window() {
		this.input = new Input();
		// Set up the window
		this.setTitle("Pong");
		this.setSize(Window.CANVAS_WIDTH, Window.CANVAS_HEIGHT);
		this.setResizable(false);
		this.setVisible(true);
		this.setBackground(Color.BLACK);
		this.canvas = new Canvas();
		this.add(this.canvas);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this.input);

		this.player1Score = 0;
		this.player2Score = 0;

		// Set up the game elements
		this.leftPaddle = new Paddle(new Rectangle(10, 10, 10, 60));
		this.rightPaddle = new Paddle(new Rectangle(440, 10, 10, 60));
		this.ball = new Ball(new Rectangle(250, 250, 15, 15));

		// Keep refreshing the screen
		new Thread(() -> {
			while (true) {
				this.canvas.repaint();
				try {
					Thread.sleep(30);
				}
				catch (InterruptedException e) {
					System.err.println("Repaint thread interrupted");
					// keep processing the interruption
					Thread.currentThread().interrupt();
				}
			}
		}).start();
	}

	/**
	 * Draw everything on the canvas.
	 *
	 * @param g The graphics object to draw on.
	 */
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Window.CANVAS_WIDTH, Window.CANVAS_HEIGHT);

		// Example drawing
		g.setColor(Color.WHITE);// remove this
		g.fillRect(40, 40, 50, 50);// remove this
		g.fillOval(250, 250, 20, 20);// remove this
		g.clearRect(60, 60, 20, 20);// remove this

		// Score
		g.drawString("Player 1: " + this.player1Score, 150, 10);
		g.drawString("Player 2: " + this.player2Score, 300, 10);

		// TODO Draw the paddles and ball
	}

	/**
	 * Update all the game objects, check logic.
	 */
	void update() {
		// TODO Handle the movement of the paddles, handle collision with walls
		// TODO Handle the movement of the ball, handle collisions and bounces
		// TODO Check for a goal, update the scores
	}

}
