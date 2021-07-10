/**
 * 
 */
package com.study.java9practice;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author
 *
 */
public class ImmutableCillectionPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String>setOld= new HashSet<>();
		setOld.add("a");
		setOld.add("b");
		setOld= Collections.unmodifiableSet(setOld);
//		setOld.add("c"); //exception will occur
		setOld.forEach(System.out::println);
		
		Set<String> set9=Set.of("a","b","c","d","f","g","h","i","e","j","k","l");
		set9.forEach(System.out::println);
		List<Integer> list9=List.of(1,2,3,4,5,6,7,8,9,10,11,12);
		list9.forEach(System.out::println);
		Map<Integer, Integer> map9=Map.of(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10);
		map9.forEach((k,v)->{
			display(k,v);
		});
		
		Map<Integer, Integer> map9withMore=Map.ofEntries(
				new AbstractMap.SimpleEntry<>(1, 1),
				new AbstractMap.SimpleEntry<>(2,2),
				new AbstractMap.SimpleEntry<>(3,3),
				new AbstractMap.SimpleEntry<>(4,4),
				new AbstractMap.SimpleEntry<>(5,5),
				new AbstractMap.SimpleEntry<>(6,6),
				new AbstractMap.SimpleEntry<>(7,7));
		map9withMore.forEach((k,v)->display(k,v));

	}
	
	static void display(Integer k, Integer v) {
		System.out.println(k+":"+v);
	}

}
