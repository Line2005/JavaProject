package contract;

import entity.element.IMap;
import entity.element.mobile.IMobile;

/**
 * The Interface IModel.
 *
 * @author Aurelie
 */
public interface IModel {
	/**
	 * @return
	 */
	IMap getMap();

	/**
	 * @return
	 */
	IMobile getMyPlayer();
}
