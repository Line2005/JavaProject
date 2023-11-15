package contract;

/**
 * The Interface IController.
 *
 * @author Jean-Aymeric Diet
 */
public interface IController {

	/**
	 * Control.
	 */
	public void control();
	
	public void movePlayer();
	
	public void killPlayer();
	
	public void winPlayer();
	
	public void gravityBoulder(int x, int y);
	
	public void gravityDiaBoulder(int x, int y);
	
	public void gravityDiamond(int x, int y); 
	
	public void gravityDiaDiamond(int x, int y);
	
	public void KillerMonster(int x, int y);
	
	public void moveMonster(int x, int y);
	
	

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	IOrderPerformer getOrderPerformer();
}
