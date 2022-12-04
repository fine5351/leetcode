package entryproblem;

import lombok.extern.slf4j.Slf4j;
import utils.GsonUtils;

import java.time.LocalDateTime;
import java.util.Collections;

/**
 * @author User
 */
@Slf4j
public class BackendTw {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        log.info("now: {}", GsonUtils.toJson(now));

        log.info("emptyList: {}", GsonUtils.toJson(Collections.emptyList()));

    }

}
