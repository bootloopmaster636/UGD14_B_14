/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ugd14_b_14;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tkg
 */
public class KurirObjekTest extends junit.framework.TestCase {
	@Test
	public void testKurirObjek() {
		Kurir k = new Kurir("AAA", "KU1234", 1000000);
		assertNotNull(k);
	}

	@Test
	public void testKurirObjek2() {
		Kurir k = new Kurir("", "KU1234", 1000000);
		assertNotNull(k);
	}

	@Test
	public void testKurirObjek3() {
		Kurir k = new Kurir("Aaa", "1", 1000000);
		assertNotNull(k);
	}

	@Test
	public void testKurirObjek4() {
		Kurir k = new Kurir("AAA", "KU1234", -1);
		assertNotNull(k);
	}
}
