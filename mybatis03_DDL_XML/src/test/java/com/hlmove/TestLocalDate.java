package com.hlmove;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/8 14:16
 * @Description com.hlmove
 * @Note
 */
public class TestLocalDate {
    @Test
    public void test1() {
        //分别进行实例化
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        //依次格式化输出
        System.out.println("ld = " + ld);
        System.out.printf("%tF%n", ld);
        System.out.printf("%tT%n", lt);
        System.out.printf("%tF %<tT%n", ldt);
    }


    @Test
    public void test2() {
        //分别进行实例化
        LocalDate ld = LocalDate.of(2020, 4, 5);
        LocalTime lt = LocalTime.of(14, 59, 59);
        LocalDateTime ldt = LocalDateTime.of(2020, 4, 5, 14, 59, 59);

        //依次格式化输出
        System.out.printf("%tF%n", ld);
        System.out.printf("%tT%n", lt);
        System.out.printf("%tF %<tT%n", ldt);
    }

    @Test
    public void test3() {
        //按特定格式传入字符串进行时间设置并实例化
        LocalDate ld = LocalDate.parse("2020-02-05");
        LocalTime lt = LocalTime.parse("14:59:59");
        LocalDateTime ldt = LocalDateTime.parse("2020-02-05T14:59:59");

        //依次格式化输出
        System.out.printf("%tF%n", ld);
        System.out.printf("%tT%n", lt);
        System.out.printf("%tF %<tT%n", ldt);

        // 指定字符串格式转换日期
        DateTimeFormatter ymdhms = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt1 = LocalDateTime.parse("2000-04-05 15:59:59",ymdhms);
        System.out.println("ldt = " + ldt1);

    }
    @Test
    public void test4(){
        LocalDate now  =  LocalDate.now();
        LocalDate now1 = now.minusYears(1);
        LocalDate birthday =  LocalDate.of(2003,4,26);
        long between = ChronoUnit.DAYS.between(now, birthday);
        System.out.println("between = " + between);
    }
}
