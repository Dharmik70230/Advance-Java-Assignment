package com.phoenix.collections.maps;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String, Long> actorMap = new HashMap<String, Long>();//unordered
		//Map<String,Long> actorMap = new LinkedHashMap<String, Long>();//ordered but unsorted
		//Map<String,Long> actorMap = new TreeMap<String, Long>();//ordered but sorted

	//	Comparator<String> c = Collections.reverseOrder();
		TreeMap<String,Long> actorMap = new TreeMap<String, Long>();		
		actorMap.put("Varun Dhawan", 9966337744L);
		actorMap.put("Jonny Depp", 9912347744L);
		actorMap.put("Robert Jr.", 9967837744L);
		actorMap.put("Aalia Bhat", 9526335744L);
		actorMap.put("Shraddha Kapoor", 9963337744L);
		
		System.out.println("Phone No of Varun Dhawan : " + actorMap.get("Varun Dhawan"));
		
		System.out.println(actorMap);
	
		System.out.println("-------------------------------------------------");
		Set<String> actor = actorMap.keySet();
		System.out.println("User  Iterator");
		Iterator<String> it = actor.iterator();
		while(it.hasNext()) {
			String actorName = it.next();
			long phNo = actorMap.get(actorName);
			System.out.println("Actor Name : " + actorName + "\tPhone Number : " + phNo);
		}
		System.out.println("-------------------------------------------------");
		
		NavigableMap<String, Long> hdMap = actorMap.headMap("Shraddha Kapoor", false);
		System.out.println("Head Map : " +hdMap);
		
		System.out.println("-------------------------------------------------");
		
		NavigableMap<String, Long> tlMap = actorMap.tailMap("Shraddha Kapoor", false);
		System.out.println("Tail Map : " +tlMap);
		
		System.out.println("-------------------------------------------------");
		
		SortedMap<String, Long> sbMap = actorMap.subMap("Aalia Bhat", "Shraddha Kapoor");
		System.out.println("Sub Map : " +sbMap);
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Ceiling of  Shraddha Kapoor is "  + actorMap.ceilingKey("Shraddha Kapoor") );
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Floor of  Shraddha Kapoor is "  + actorMap.floorKey("Shraddha Kapoor"));
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Higher of  Shraddha Kapoor is "  + actorMap.higherKey("Shraddha Kapoor"));
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Lower of  Shraddha Kapoor is "  + actorMap.lowerKey("Shraddha Kapoor"));
		
	}

}
