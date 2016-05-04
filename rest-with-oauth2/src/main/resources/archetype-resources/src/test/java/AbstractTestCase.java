package ${package};

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TadalinApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
@Transactional
@ActiveProfiles("test")
public abstract class AbstractTestCase {

	/**
	 * mvctest启动的随机端口号
	 */
	@Value("${local.server.port}")   //
	protected int port;

}
