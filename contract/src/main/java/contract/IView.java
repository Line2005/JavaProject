package contract;


import fr.exia.showboard.BoardFrame;
/**
 * The Interface IView.
 *
 * @author Benje Bassal
 */
public interface IView {

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
void displayMessage(final String message);
	
	public void followMyPlayer();

	public void updateView();
	
	

	BoardFrame getBoardFrame();
}
