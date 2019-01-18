package top.liyf.kindleclock.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author liyf
 * Created in 2019-01-16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTimeUtil {

    @Test
    public void interval() {
        LocalDate start = LocalDate.of(2019, 1, 16);
        LocalDate end = LocalDate.of(2019, 1, 17);
        Assert.assertEquals(1, TimeUtil.intervalDays(start, end));

        LocalDate cj = LocalDate.of(2019, 2, 5);
        System.out.println("cj = " + TimeUtil.intervalDays(cj));

        ZonedDateTime sf = ZonedDateTime.of(cj, LocalTime.MIN, ZoneId.of("Asia/Shanghai"));
        System.out.println("sf = " + TimeUtil.intervalDays(sf));

    }


}