package contract;

import java.io.IOException;

public interface IOrderPerformer {

	/**
	 * @param userOrder
         *@author Benje Bassal
	 * @throws IOException
	 */
	public void OrderPerformer(UserOrder userOrder) throws IOException;
}
