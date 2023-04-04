package test;

import java.util.*;
import org.testng.annotations.Test;

public class TestJavaNoSuchElementException {

	/*
	 * This test will throw NoSuchElementException as 
	 * only 2 elements are there and we try to fetch 3rd element
	 */
	@Test
	public void testNoSuchElementException()
	{
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		map.put(1, 1);
		map.put(2, 2);
		
		Iterator itr = map.keySet().iterator();
		
		System.out.println("first element : " + itr.next());
		System.out.println("second element : " + itr.next());
		System.out.println("third element : " + itr.next());
	}
	
	/*
	 * This test will not throw NoSuchElementException as 
	 * before fetching an element it checks if it is present
	 */
	@Test
	public void testNoSuchElementExceptionFixed()
	{
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		map.put(1, 1);
		map.put(2, 2);
		
		Iterator itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println("Element : "  + itr.next());
		}
	}
}
