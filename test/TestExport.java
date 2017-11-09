

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.FileConection;

class TestExport {


	@Test
	public void testcanExportFile() {
		assertTrue(FileConection.saveFileExport());
	
	}
	
	@Test
	public void testExporttocancel() {
		assertFalse("Error",FileConection.saveFileExport());
	}
	
	@Test
	public void testDecimal() {
		
		
		//1.insert score number with decimal
			
		//2.save
		
	}
	
	@Test
	public void testBoxInput() {
		//1.don't input any number in box
		
		//2.save
		
	}
	
	@Test
	public void testNegativeNumber() {
		//1.try input a negative number in box
		
		
		//2.save
		
	}
	
	@Test
	public void testEqualScores() {
		
		
	}
	
	@Test
	public void testTotalScores() {
		
		
	}

}
