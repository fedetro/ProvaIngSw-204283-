package it.unical.ingsw.provalab.ProvaIntermedia;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	private static MyListUtil myListUtil;
		
	@BeforeClass
	public static void prepareAll() {
		myListUtil = new MyListUtil();
	}
	
	@Before
	public void prepareTest() {
		System.out.println("before");
	}
	
	@After
	public void cleanTest() {
		System.out.println("after");
	}
	
	@Test
	public void ordinaWorks() {
		int[] numeri = new int[] {9,5,6,7,4,2};
		int[] ordinatoInModoCrescente = myListUtil.ordina(numeri, 1);
		int[] ordinatoInModoDecrescente = myListUtil.ordina(numeri, 2);
		assertArrayEquals(ordinatoInModoCrescente, numeri);
		assertArrayEquals(ordinatoInModoDecrescente, numeri);
		
	}
}

