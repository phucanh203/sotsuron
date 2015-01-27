package model;

import java.io.Serializable;
import common.LongIterator;


public interface DataModel extends Serializable {

	/**
	 * @return all user ID in model
	 */
	 LongIterator getAllUserIDs();
	 
	 /**
	  * 
	  * @return all item ID in model
	  */
	 LongIterator getAllItemIDs();
	 
	 /**
	   * @return total number of items known to the model. This is generally the union of all items preferred by
	   *         at least one user but could include more.
	   * @throws TasteException
	   *           if an error occurs while accessing the data
	   */
	  int getNumItems() ;
	  
	  /**
	   * @return total number of users known to the model.
	   * @throws TasteException
	   *           if an error occurs while accessing the data
	   */
	  int getNumUsers() ;
	  
	  /**
	   * @param itemID item ID to check for
	   * @return the number of users who have expressed a preference for the item
	   * @throws TasteException if an error occurs while accessing the data
	   */
	  
	  
}
