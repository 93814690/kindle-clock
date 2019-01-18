package top.liyf.kindleclock.util;

import java.time.ZoneId;

/**
 * @author liyf
 * Created in 2019-01-18
 */
public class ZoneIdUtil {

    /**
     * 功能描述: 默认获取上海时区
     *
     * @return java.time.ZoneId
     * @author liyf
     */
    public static ZoneId get() {
        return ZoneId.of("Asia/Shanghai");
    }


}
