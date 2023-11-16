package contract;

import fr.exia.showboard.BoardFrame;

import javax.swing.*;

/**
 * The Interface IView.
 *
 * @author Benje Bassal
 */
public interface IView {

	void displayMessage(final String message);

	void followMyPlayer();

	void updateView();

	BoardFrame getBoardFrame();
}
