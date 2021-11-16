package projects.pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Handles user input.
 */
public class Input implements KeyListener {

	/**
	 * The directions that players can move in.
	 */
	public enum Direction {
		/**
		 * Up.
		 */
		UP,
		/**
		 * No direction.
		 */
		NONE,
		/**
		 * Down.
		 */
		DOWN;
	}

	/**
	 * The players that we support.
	 */
	public enum Player {
		/**
		 * The first player.
		 */
		ONE,
		/**
		 * The second player.
		 */
		TWO;
	}

	private static final int PLAYER_1_UP = KeyEvent.VK_W;
	private static final int PLAYER_1_DOWN = KeyEvent.VK_S;

	private static final int PLAYER_2_UP = KeyEvent.VK_UP;

	private static final int PLAYER_2_DOWN = KeyEvent.VK_DOWN;

	private Map<Integer, Boolean> keysDown;

	/**
	 * Set up the input handling class.
	 */
	public Input() {
		this.keysDown = new HashMap<>();
		this.keysDown.put(Input.PLAYER_1_UP, false);
		this.keysDown.put(Input.PLAYER_1_DOWN, false);
		this.keysDown.put(Input.PLAYER_2_UP, false);
		this.keysDown.put(Input.PLAYER_2_DOWN, false);
	}

	/**
	 * Return the direction that the given player is trying to move in. This
	 * does account for opposite direction keys being down.
	 *
	 * @param player The player to check.
	 * @return The direction the player should be moving in based on the keys
	 *         that are pressed.
	 */
	public Direction getDirection(Player player) {
		if (player == null) {
			return Direction.NONE;
		}
		switch (player) {
			case ONE:
				if (this.keysDown.get(Input.PLAYER_1_DOWN) == this.keysDown
					.get(Input.PLAYER_1_UP)) {
					/*
					 * Either neither pressed or both pressed, so it is not
					 * moving or canceling out.
					 */
					return Direction.NONE;
				}
				if (this.keysDown.get(Input.PLAYER_1_DOWN)) {
					return Direction.DOWN;
				}
				// only one is pressed, and it's not down, so it's up
				return Direction.UP;
			case TWO:
				if (this.keysDown.get(Input.PLAYER_2_DOWN) == this.keysDown
					.get(Input.PLAYER_2_UP)) {
					/*
					 * Either neither pressed or both pressed, so it is not
					 * moving or canceling out.
					 */
					return Direction.NONE;
				}
				if (this.keysDown.get(Input.PLAYER_2_DOWN)) {
					return Direction.DOWN;
				}
				// only one is pressed, and it's not down, so it's up
				return Direction.UP;
			default:
				return Direction.NONE;
		}

	}

	/**
	 * Check if a player is trying to move in a certain direction. A player
	 * could be trying to move in multiple directions, this only considers if
	 * the key to move towards the given direction is pressed.
	 *
	 * @param direction The direction we are checking for.
	 * @param player The player that is trying to move.
	 * @return True if we are trying to move in that direction, false if not.
	 */
	public boolean isKeyDown(Direction direction, Player player) {
		if (direction == null || player == null) {
			return false;
		}
		switch (player) {
			case ONE:
				switch (direction) {
					case DOWN:
						return this.keysDown.get(Input.PLAYER_1_DOWN);
					case UP:
						return this.keysDown.get(Input.PLAYER_1_UP);
					case NONE:
					default:
						return false;
				}
			case TWO:
				switch (direction) {
					case DOWN:
						return this.keysDown.get(Input.PLAYER_2_DOWN);
					case UP:
						return this.keysDown.get(Input.PLAYER_2_UP);
					case NONE:
					default:
						return false;
				}
			default:
				return false;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		final int id = e.getKeyCode();
		switch (id) {
			case PLAYER_1_UP:
			case PLAYER_1_DOWN:
			case PLAYER_2_UP:
			case PLAYER_2_DOWN:
				this.keysDown.put(id, true);
				break;
			default:
				// Ignore
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		final int id = e.getKeyCode();
		switch (id) {
			case PLAYER_1_UP:
			case PLAYER_1_DOWN:
			case PLAYER_2_UP:
			case PLAYER_2_DOWN:
				this.keysDown.put(id, false);
				break;
			default:
				// Ignore
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

}
