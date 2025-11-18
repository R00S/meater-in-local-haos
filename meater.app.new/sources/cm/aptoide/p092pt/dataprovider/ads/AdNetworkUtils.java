package cm.aptoide.p092pt.dataprovider.ads;

import android.content.Context;
import android.text.TextUtils;
import cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface;
import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.IOException;
import java.util.Date;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class AdNetworkUtils {
    public static boolean isGooglePlayServicesAvailable(Context context) {
        return GoogleApiAvailability.m13803q().mo13812i(context) == 0;
    }

    private static boolean isImpressionUrlPresent(GetAdsResponse.C2220Ad c2220Ad) {
        return (c2220Ad == null || c2220Ad.getPartner() == null || c2220Ad.getPartner().getData() == null || c2220Ad.getPartner().getData().getImpressionUrl() == null) ? false : true;
    }

    public static void knock(String str) {
        if (str == null) {
            return;
        }
        new OkHttpClient().newCall(new Request.Builder().url(str).build()).enqueue(new Callback() { // from class: cm.aptoide.pt.dataprovider.ads.AdNetworkUtils.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                response.body().close();
            }
        });
    }

    public static void knockCpc(MinimalAdInterface minimalAdInterface) {
        knock(minimalAdInterface.getCpcUrl());
    }

    public static void knockCpd(MinimalAdInterface minimalAdInterface) {
        knock(minimalAdInterface.getCpdUrl());
    }

    public static void knockCpi(MinimalAdInterface minimalAdInterface) {
        knock(minimalAdInterface.getCpiUrl());
    }

    public static void knockImpression(GetAdsResponse.C2220Ad c2220Ad) {
        if (isImpressionUrlPresent(c2220Ad)) {
            knock(c2220Ad.getPartner().getData().getImpressionUrl());
        }
    }

    public static String parseMacros(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            str = str.replace("[USER_ANDROID_ID]", str2);
        }
        return str.replace("[USER_UDID]", str3).replace("[USER_AAID]", str4).replace("[TIME_STAMP]", String.valueOf(new Date().getTime()));
    }
}
