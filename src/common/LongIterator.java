package common;

import java.util.Iterator;

public interface LongIterator extends Iterator<Long> {
	 /**
	   * @return next {@code long} in iteration
	   */
	  long nextLong();
	  
	  /**
	   * @return next {@code long} in iteration without advancing iteration
	   */
	  long peek();
}
