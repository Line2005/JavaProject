package contract;

import entity.IMap;
import entity.mobile.IMobile;

import entity.HelloWorld;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	
	 
	
	/**
	 * Load the message.
	 *
	 * @param code
	 *          the code
	 */
	 IMap getMap();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	 IMobile getMyPlayer();
}
