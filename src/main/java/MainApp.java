import lombok.extern.slf4j.Slf4j;

/**
 * @author Chenjiazhi
 * 2018-05-07
 */
@Slf4j
public class MainApp {

    public static void main(String[] args) {
        System.out.println(log.getName());
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
