package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
	public HelloWorld hellowolrd = new HelloWorld();
	@Test
	public void testHello() {
		hellowolrd.hello();
		assertEquals("Hello World!", hellowolrd.getStr());
	}

}
