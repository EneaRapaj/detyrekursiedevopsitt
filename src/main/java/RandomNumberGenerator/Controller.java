package RandomNumberGenerator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.Logger;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
	private static Logger logger  = LogManager.getLogger(Controller.class);
	@RequestMapping("/random")
	public int index() {
//		String style = "\"color:white;font-size:10rem;position: absolute; top: 30%;left: 50%;-moz-transform: translateX(-50%) translateY(-50%);-webkit-transform: translateX(-50%) translateY(-50%);transform: translateX(-50%) translateY(-50%);\"";
//		return "<!doctypehtml><html><head><title>RandomNumber</title></head><body style=\"background:black\"><h1 style="
//				+ style + ">" + new Random().nextInt(1000001) + "</h1></body></html>";
		logger.info("loging finding randomnumber");
		return new Random().nextInt(1000001);
	}
}
