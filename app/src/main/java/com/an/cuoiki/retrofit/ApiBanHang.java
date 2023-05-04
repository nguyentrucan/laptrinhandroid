package com.an.cuoiki.retrofit;

import com.an.cuoiki.model.LoaiSpModel;
import com.an.cuoiki.model.SanPhamMoiModel;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface ApiBanHang {
    @GET("getloaisp.php")
    Observable<LoaiSpModel> getLoaiSp();

    @GET("getsanphammoi.php")
    Observable<SanPhamMoiModel> getSpMoi();

}
