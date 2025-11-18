package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class StatsUtils {
    @KeepForSdk
    /* renamed from: a */
    public static String m14587a(PowerManager.WakeLock wakeLock, String str) {
        String strValueOf = String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock));
        if (true == TextUtils.isEmpty(str)) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return String.valueOf(strValueOf).concat(String.valueOf(str));
    }
}
