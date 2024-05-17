package com.techacademy;

import java.util.Calendar;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        Calendar cal = Calendar.getInstance();
        int year = Integer.parseInt(val1.substring(0,4));
        int month = Integer.parseInt(val1.substring(4,6))-1;
        int day = Integer.parseInt(val1.substring(6,8));
        

        cal.set(year, month, day);
        int dayofweek_num = cal.get(Calendar.DAY_OF_WEEK);
        String[] weekDays = {"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
        String dayofweek = weekDays[dayofweek_num-1];
        return dayofweek;
        }
    
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果：" + res ;
    }
    
    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "実行結果：" + res ;
    }
    
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "実行結果：" + res ;
    }
    
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "実行結果：" + res ;
    }  
    
}
