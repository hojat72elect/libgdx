
/**
 * Created at 4:14:34 AM Jul 17, 2010
 */

package org.jbox2d.pooling.arrays;

import java.util.HashMap;

/** Not thread safe int[] pooling
 * @author Daniel Murphy */
public class IntArray {

	private final HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();

	public int[] get (int argLength) {
		assert (argLength > 0);

		if (!map.containsKey(argLength)) {
			map.put(argLength, getInitializedArray(argLength));
		}

		assert (map.get(argLength).length == argLength) : "Array not built of correct length";
		return map.get(argLength);
	}

	protected int[] getInitializedArray (int argLength) {
		return new int[argLength];
	}
}
