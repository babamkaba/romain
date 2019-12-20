package kaba.romain;

import junit.framework.TestCase;
import kaba.romain.service.INombreService;
import kaba.romain.service.NombreRomain;

public class RomainTest extends TestCase {
	
	public void testConvertRomain(){
		
		INombreService nombre = new NombreRomain();		
		String romain = nombre.convertNombre(1545);		
		assertEquals("MDXLV", romain);
		
	}

}
