/*
 * @author dharmik.maru@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

package com.phoenix.comparators;
import java.util.Comparator;

public class CompareNum implements Comparator<Integer> {

	
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2)
		return 1;
		else if(o1>o2)
			return -1;
		else
			return 0;
//		if(o1>o2)
//			return 1;
//			else if(o1<o2)
//				return -1;
//			else
//				return 0;
	}	

	

}
