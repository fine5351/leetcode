package learn.entryproblem;

import lombok.extern.slf4j.Slf4j;
import utils.GsonUtils;

import java.time.LocalDateTime;

/**
 * @author User
 */
@Slf4j
public class BackendTw {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        log.info("now: {}", GsonUtils.toJson(now));

    }

}
