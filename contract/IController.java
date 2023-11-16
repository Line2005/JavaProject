package contract;

/**
 * The Interface IController.
 *
 * @author Benje Bassal
 */
public interface IController {
	/**
	 * @play to play the game
	 */
	void play();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	public void orderPerform(ControllerOrder controllerOrder);

	IController getOrderPerformer();
}
