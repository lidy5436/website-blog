package com.example.base.utils;

import cn.hutool.core.date.DateUtil;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 单据工具类
 */
public class BillUtils {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private static final int MAX_SERIAL = 999;

    public static String getSerialNumber(){
        String date = DateUtil.format(DateUtil.date(), "yyyyMMdd");
        int serial = counter.incrementAndGet();
        if (serial > MAX_SERIAL) {
            counter.set(0);
            serial = counter.incrementAndGet();
        }
        String serialStr = String.format("%03d", serial);
        return date + serialStr;
    }
}
