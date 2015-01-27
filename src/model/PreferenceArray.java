package model;

import java.io.Serializable;

public interface PreferenceArray extends Cloneable, Serializable, Iterable<Preference>{
	/**
	   * @return size of length of the "array"
	   */
	  int length();
	  
	  /**
	   * @param i
	   *          index
	   * @return a materialized {@link Preference} representation of the preference at i
	   */
	  Preference get(int i);
	  
	  /**
	   * Sets preference at i from information in the given {@link Preference}
	   * 
	   * @param i
	   * @param pref
	   */
	  void set(int i, Preference pref);
	  
	  /**
	   * @param i
	   *          index
	   * @return user ID from preference at i
	   */
	  long getUserID(int i);
	  
	  /**
	   * Sets user ID for preference at i.
	   * 
	   * @param i
	   *          index
	   * @param userID
	   *          new user ID
	   */
	  void setUserID(int i, long userID);
	  
	  /**
	   * @param i
	   *          index
	   * @return item ID from preference at i
	   */
	  long getItemID(int i);
	  
	  /**
	   * Sets item ID for preference at i.
	   * 
	   * @param i
	   *          index
	   * @param itemID
	   *          new item ID
	   */
	  void setItemID(int i, long itemID);

	  /**
	   * @return all user or item IDs
	   */
	  long[] getIDs();
	  
	  /**
	   * @param i
	   *          index
	   * @return preference value from preference at i
	   */
	  float getValue(int i);
	  
	  /**
	   * Sets preference value for preference at i.
	   * 
	   * @param i
	   *          index
	   * @param value
	   *          new preference value
	   */
	  void setValue(int i, float value);
	  
	  /**
	   * @return independent copy of this object
	   */
	  PreferenceArray clone();
	  
	  /**
	   * Sorts underlying array by user ID, ascending.
	   */
	  void sortByUser();
	  
	  /**
	   * Sorts underlying array by item ID, ascending.
	   */
	  void sortByItem();
	  
	  /**
	   * Sorts underlying array by preference value, ascending.
	   */
	  void sortByValue();
	  
	  /**
	   * Sorts underlying array by preference value, descending.
	   */
	  void sortByValueReversed();
	  
	  /**
	   * @param userID
	   *          user ID
	   * @return true if array contains a preference with given user ID
	   */
	  boolean hasPrefWithUserID(long userID);
	  
	  /**
	   * @param itemID
	   *          item ID
	   * @return true if array contains a preference with given item ID
	   */
	  boolean hasPrefWithItemID(long itemID);
	  
}
