package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;



class CuentaTest {
	
	static Cuenta aux;
	static Cuenta aux1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux=new Cuenta("12345", "Manuel" , 50);
		aux1=new Cuenta("67890", "Levi" , 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		aux.setSaldo(0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	

	@Test
	void testingresar() throws Exception {
		aux.ingresar(1000);
		assertEquals(aux.getSaldo() ,1000 );
	}
	@Test
	void testretirar() throws Exception {
		aux.retirar(100);
		assertEquals(aux.getSaldo() ,0 );
	}
	@Test
	void testreintegro200auxprimer() throws Exception {
		aux.ingresar(200);
		assertEquals(aux.getSaldo() ,1000 );
	}
	@Test
	void testreintegro350aux1() throws Exception {
		aux1.ingresar(350);
		assertEquals(aux.getSaldo() ,1000 );
	}
	@Test
	void testingresar100aux() throws Exception {
		aux.ingresar(100);
		assertEquals(aux.getSaldo() ,1000 );
	}
	@Test
	void testreintegro200aux1() throws Exception {
		aux1.ingresar(200);
		assertEquals(aux.getSaldo() ,1000 );
	}
	@Test
	void testreintegro150aux1() throws Exception {
		aux.ingresar(1000);
		assertEquals(aux.getSaldo() ,1000 );
	}
	@Test
	void testreintegro200aux() throws Exception {
		aux.ingresar(1000);
		assertEquals(aux.getSaldo() ,1000 );
	}
	@Test
	void testingreso50aux1() throws Exception {
		aux.ingresar(1000);
		assertEquals(aux.getSaldo() ,1000 );
	}
	@Test
	void testreintegro100aux1() throws Exception {
		aux.ingresar(1000);
		assertEquals(aux.getSaldo() ,1000 );
	}

}
