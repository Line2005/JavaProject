package contract;

import entity.element.IMap;
import entity.element.mobile.IMobile;

/**
 * The Interface IModel.
 *
 * @author Benje Bassal
 */
public interface IModel {

	/**
	 * Gets the map from the interface Enti
	 *
	 * @return the methode getmap()
	 */
	IMap getMap();
	
	/**
	 * Gets the myPlayer from the interface IMobile
	 *
	 * @return the methode MyPlayer()
	 */

	IMobile getMyPlayer();
}
