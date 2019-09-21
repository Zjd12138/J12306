package com.kalvin.J12306.config;

/**
 * Create by Kalvin on 2019/9/18.
 */
public class Constants {

    public final static String HOST = "kyfw.12306.cn";

    public final static String ACCEPT = "text/javascript, application/javascript, application/ecmascript,application/json, application/x-ecmascript,image/webp,image/apng,image/*,*/*; q=0.01";

    public final static String IMAGE_AI_URL = "http://shell.teachx.cn:12306/predict";

    public final static int REQ_SUCCESS_STATUS = 200;

    public final static String STATION_CACHE_KEY = "STATION";   // 站点信息
    public final static String BLACK_ROOM_KEY = "BLACK_ROOM";   // 小黑屋
    public final static int BLACK_ROOM_CACHE_EXP_TIME = 3;  // 默认3分钟


    /*座席代码*/
    public final static String L1_SEAT_CODE = "M";
    public final static String L2_SEAT_CODE = "O";
    public final static String NO_SEAT_CODE = "N";

    public final static int MAX_TRY_TIMES = 20;

}