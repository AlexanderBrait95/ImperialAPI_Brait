package at.fhtechnikum.rectangle;

import at.fhtechnikum.rectangle.controller.controller;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class RectangleApplicationTests {

	@Test
	void convInchTest() {
		controller cont = new controller();
		String result = cont.convert_inch(1);
		assertEquals(result,String.valueOf(2.54));

	}

	@Test
	void convMeterTest() {
		controller cont = new controller();
		String result = cont.convert_meter(1);
		assertEquals(result,String.valueOf(0.9144));

	}

}
