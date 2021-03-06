package com.ezio.bilibili.network.api;


import com.ezio.bilibili.entity.live.LiveAppIndexInfo;
import com.ezio.bilibili.network.HttpResult;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by hcc on 16/8/4 12:03
 * 100332338@qq.com
 * <p>
 * 直播相关api
 */
public interface LiveService {

    public static final String LIVE_BASE_URL = "http://live.bilibili.com/";

    /**
     * 首页直播
     *
     * @return
     */
    @GET("AppIndex/home?_device=android&_hwid=51e96f5f2f54d5f9&_ulv=10000&access_key=563d6046f06289cbdcb472601ce5a761&appkey=c1b107428d337928&build=410000&platform=android&scale=xxhdpi&sign=fbdcfe141853f7e2c84c4d401f6a8758")
    Observable<HttpResult<LiveAppIndexInfo>> getLiveAppIndex();
//
//    /**
//     * 直播url
//     *
//     * @param cid
//     * @return
//     */
//    @GET("api/playurl?player=1&quality=0")
//    Observable<ResponseBody> getLiveUrl(@Query("cid") int cid);
//
//
//    /**
//     * 获取直播状态
//     *
//     * @param mid
//     * @return
//     */
//    @GET("AppRoom/getRoomInfo")
//    Observable<UserLiveRoomStatusInfo> getUserLiveRoomStatus(@Query("mid") int mid);
}
