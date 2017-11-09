

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.FileConection;

class TestExport {


	@Test
	public void testcanExportFile()
	{
			assertTrue(FileConection.saveFileExport());//
	}
	@Test
	public void testExporttocancel()
	{
			assertFalse(FileConection.saveFileExport());
	}

}
