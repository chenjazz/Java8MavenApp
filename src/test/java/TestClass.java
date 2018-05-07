import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author Chenjiazhi
 * 2018-05-07
 */
@Slf4j
public class TestClass {




    @Test
    public void test1() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }

}
