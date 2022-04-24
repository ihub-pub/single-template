package pub.ihub.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author liheng
 */
class HelloWorldTest {

	@Test
	void getHello() {
		Assertions.assertEquals("Hello IHub", new HelloWorld("IHub").getHello());
	}

}
