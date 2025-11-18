package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;

@zzard
/* loaded from: classes2.dex */
public final class zzavx {
    @VisibleForTesting
    /* renamed from: a */
    private static Uri m17019a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i2 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i2) + str2 + "=" + str3 + "&" + str.substring(i2));
    }

    /* renamed from: b */
    public static String m17020b(Uri uri, Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!zzk.zzme().m17002D(context)) {
            return uri.toString();
        }
        String strM17009n = zzk.zzme().m17009n(context);
        if (strM17009n == null) {
            return uri.toString();
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21605C0)).booleanValue()) {
            String str = (String) zzyt.m20848e().m16421c(zzacu.f21611D0);
            String string = uri.toString();
            if (string.contains(str)) {
                zzk.zzme().m17015u(context, strM17009n);
                return string.replace(str, strM17009n);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = m17019a(uri.toString(), "fbs_aeid", strM17009n);
            zzk.zzme().m17015u(context, strM17009n);
        }
        return uri.toString();
    }

    /* renamed from: c */
    public static String m17021c(String str, Context context, boolean z) {
        String strM17009n;
        if ((((Boolean) zzyt.m20848e().m16421c(zzacu.f21653K0)).booleanValue() && !z) || !zzk.zzme().m17002D(context) || TextUtils.isEmpty(str) || (strM17009n = zzk.zzme().m17009n(context)) == null) {
            return str;
        }
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21605C0)).booleanValue()) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (zzk.zzlg().m17173T(str)) {
                zzk.zzme().m17015u(context, strM17009n);
                return m17019a(str, "fbs_aeid", strM17009n).toString();
            }
            if (!zzk.zzlg().m17174U(str)) {
                return str;
            }
            zzk.zzme().m17016v(context, strM17009n);
            return m17019a(str, "fbs_aeid", strM17009n).toString();
        }
        CharSequence charSequence = (String) zzyt.m20848e().m16421c(zzacu.f21611D0);
        if (!str.contains(charSequence)) {
            return str;
        }
        if (zzk.zzlg().m17173T(str)) {
            zzk.zzme().m17015u(context, strM17009n);
            return str.replace(charSequence, strM17009n);
        }
        if (!zzk.zzlg().m17174U(str)) {
            return str;
        }
        zzk.zzme().m17016v(context, strM17009n);
        return str.replace(charSequence, strM17009n);
    }
}
