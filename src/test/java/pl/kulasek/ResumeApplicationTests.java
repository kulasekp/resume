package pl.kulasek;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pl.kulasek.resume.ResumeApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ResumeApplication.class)
@WebAppConfiguration
public class ResumeApplicationTests {

	@Test
	public void contextLoads() {
	}

}
