package contract;

import java.io.IOException;

public interface IOrderPerformer {

	/**
	 * @param userOrder
	 * @throws IOException
	 */
	public void OrderPerformer(UserOrder userOrder) throws IOException;
}
