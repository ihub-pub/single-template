package pub.ihub.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liheng
 */
@Data
@AllArgsConstructor
public class HelloWorld {

	private String text;

	public String getHello() {
		return "Hello " + text;
	}

}
