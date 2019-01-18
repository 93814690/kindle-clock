package top.liyf.kindleclock.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import top.liyf.kindleclock.model.CountDown;
import top.liyf.kindleclock.util.TimeUtil;
import top.liyf.kindleclock.util.ZoneIdUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * @author liyf
 * Created in 2019-01-13
 */
@Controller
public class Home {

    @GetMapping({"/", "/index"})
    public String index(Model model) {

        CountDown countDown = new CountDown();
        countDown.setName("春节");
        LocalDate cj = LocalDate.of(2019, 2, 5);
        countDown.setDays(TimeUtil.intervalDays(ZonedDateTime.of(cj, LocalTime.MIN, ZoneIdUtil.get())));
        model.addAttribute(countDown);

        return "index";
    }
}
