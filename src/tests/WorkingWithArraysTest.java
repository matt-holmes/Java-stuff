package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import datastuctures.WorkingWithArrays;

public class WorkingWithArraysTest {
	
	private WorkingWithArrays workingWithArrays;
	
	public WorkingWithArraysTest() {
		this.workingWithArrays = new WorkingWithArrays();
		this.workingWithArrays.AddToMyArray(0, "Item 1");
		this.workingWithArrays.AddToMyArray(2, "Item 3");
		this.workingWithArrays.AddToMyArray(1, "Item 2");
		this.workingWithArrays.AddToMyArray(4, "Item 5");
		this.workingWithArrays.AddToMyArray(3, "Item 4");
	}

	@Test
	public void testGetMyArraySize() {
		assertEquals(5, this.workingWithArrays.getMyArraySize());
	}
	
	@Test
	public void testGetResultByWhileLoop() {
		assertEquals(" Item 1 Item 2 Item 3 Item 4 Item 5", 
				this.workingWithArrays.getResultByWhileLoop());
	}

}
