package beta;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Hey");
		log.error("hi");
		log.fatal("message");
		log.info("hi this side");


	}

}
