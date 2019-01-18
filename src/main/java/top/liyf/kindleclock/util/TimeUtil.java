package top.liyf.kindleclock.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author liyf
 * Created in 2019-01-16
 */
public class TimeUtil {

    /**
     * 功能描述: 计算当前日期与指定日期的间隔天数
     * 
     * @param endDate 指定日期
     * @return long
     * @author liyf
     */
    public static long intervalDays(LocalDate endDate) {
        return LocalDate.now().until(endDate, ChronoUnit.DAYS);
    }

    /**
     * 功能描述: 计算日期{@code startDate}与{@code endDate}的间隔天数
     *
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return long
     * @author liyf
     */
    public static long intervalDays(LocalDate startDate, LocalDate endDate) {
        return startDate.until(endDate, ChronoUnit.DAYS);
    }

    /**
     * 功能描述: 计算当前日期与指定日期的间隔天数
     *
     * @param endDate 指定日期
     * @return long
     * @author liyf
     */
    public static long intervalDays(ZonedDateTime endDate) {
        ZoneId zone = endDate.getZone();
        return intervalDays(ZonedDateTime.now(zone), endDate);
    }

    /**
     * 功能描述: 计算日期{@code startDate}与{@code endDate}的间隔天数
     *
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return long
     * @author liyf
     */
    public static long intervalDays(ZonedDateTime startDate, ZonedDateTime endDate) {
        // 当天零点
        ZonedDateTime startDateZero = startDate.truncatedTo(ChronoUnit.DAYS);
        // 当天零点
        ZonedDateTime endDateZero = endDate.with(LocalTime.MIN);
        return startDateZero.until(endDateZero, ChronoUnit.DAYS);
    }


}
