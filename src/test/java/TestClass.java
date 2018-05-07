import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Chenjiazhi
 * 2018-05-07
 */
@Slf4j
public class TestClass {


    public static void main(String[] args) {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }

    @Test
    public void test1 () {

    }

}
