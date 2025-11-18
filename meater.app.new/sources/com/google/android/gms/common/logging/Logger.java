package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class Logger {

    /* renamed from: a */
    private final String f17882a;

    /* renamed from: b */
    private final String f17883b;

    /* renamed from: c */
    private final GmsLogger f17884c;

    /* renamed from: d */
    private final int f17885d;

    @KeepForSdk
    public Logger(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f17883b = string;
        this.f17882a = str;
        this.f17884c = new GmsLogger(str);
        int i2 = 2;
        while (i2 <= 7 && !Log.isLoggable(this.f17882a, i2)) {
            i2++;
        }
        this.f17885d = i2;
    }

    @KeepForSdk
    /* renamed from: a */
    public void m14528a(String str, Object... objArr) {
        if (m14531d(3)) {
            Log.d(this.f17882a, m14530c(str, objArr));
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public void m14529b(String str, Object... objArr) {
        Log.e(this.f17882a, m14530c(str, objArr));
    }

    @KeepForSdk
    /* renamed from: c */
    protected String m14530c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f17883b.concat(str);
    }

    @KeepForSdk
    /* renamed from: d */
    public boolean m14531d(int i2) {
        return this.f17885d <= i2;
    }
}
