package model;

public interface Preference {

		/**
		 *  @return ID of user who prefers the item 
		 */
	  long getUserID();
	  
	  /**
	   *  @return item ID that is preferred
	   */
	  long getItemID();
	  
	  /**
	   * @return strength of the preference for that item. Zero should indicate "no preference either way";
	   *         positive values indicate preference and negative values indicate dislike
	   */
	  float getValue();
	  
	  /**
	   * Sets the strength of the preference for this item
	   * 
	   * @param value
	   *          new preference
	   */
	  void setValue(float value);
}
