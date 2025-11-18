package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzayi {

    /* renamed from: a */
    private final Object f22677a = new Object();

    /* renamed from: b */
    private String f22678b = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: c */
    private String f22679c = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: d */
    private boolean f22680d = false;

    /* renamed from: e */
    @VisibleForTesting
    private String f22681e = HttpUrl.FRAGMENT_ENCODE_SET;

    @VisibleForTesting
    /* renamed from: b */
    private final void m17231b(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzaxi.f22654a.post(new RunnableC7142s5(this, context, str, z, z2));
        } else {
            zzbad.m17352h("Can not create dialog without Activity Context");
        }
    }

    /* renamed from: d */
    private final String m17232d(Context context) {
        String str;
        synchronized (this.f22677a) {
            if (TextUtils.isEmpty(this.f22678b)) {
                zzk.zzlg();
                String strM17154h0 = zzaxi.m17154h0(context, "debug_signals_id.txt");
                this.f22678b = strM17154h0;
                if (TextUtils.isEmpty(strM17154h0)) {
                    zzk.zzlg();
                    this.f22678b = zzaxi.m17158j0();
                    zzk.zzlg();
                    zzaxi.m17131K(context, "debug_signals_id.txt", this.f22678b);
                }
            }
            str = this.f22678b;
        }
        return str;
    }

    /* renamed from: e */
    private final void m17233e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = m17234f(context, (String) zzyt.m20848e().m16421c(zzacu.f21662L3), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        zzk.zzlg();
        zzaxi.m17130J(context, str, builderBuildUpon.build().toString());
    }

    /* renamed from: f */
    private final Uri m17234f(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("linkedDeviceId", m17232d(context));
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    @VisibleForTesting
    /* renamed from: h */
    private final boolean m17235h(Context context, String str, String str2) {
        String strM17237j = m17237j(context, m17234f(context, (String) zzyt.m20848e().m16421c(zzacu.f21650J3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM17237j)) {
            zzbad.m17349e("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM17237j.trim());
            String strOptString = jSONObject.optString("gct");
            this.f22681e = jSONObject.optString("status");
            synchronized (this.f22677a) {
                this.f22679c = strOptString;
            }
            return true;
        } catch (JSONException e2) {
            zzbad.m17348d("Fail to get in app preview response json.", e2);
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: i */
    private final boolean m17236i(Context context, String str, String str2) {
        String strM17237j = m17237j(context, m17234f(context, (String) zzyt.m20848e().m16421c(zzacu.f21656K3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM17237j)) {
            zzbad.m17349e("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strM17237j.trim()).optString("debug_mode"));
            synchronized (this.f22677a) {
                this.f22680d = zEquals;
            }
            return zEquals;
        } catch (JSONException e2) {
            zzbad.m17348d("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: j */
    private static String m17237j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", zzk.zzlg().m17177g0(context, str2));
        zzbbh<String> zzbbhVarM17258c = new zzayu(context).m17258c(str, map);
        try {
            return zzbbhVarM17258c.get(((Integer) zzyt.m20848e().m16421c(zzacu.f21668M3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            String strValueOf = String.valueOf(str);
            zzbad.m17347c(strValueOf.length() != 0 ? "Interrupted while retriving a response from: ".concat(strValueOf) : new String("Interrupted while retriving a response from: "), e2);
            zzbbhVarM17258c.cancel(true);
            return null;
        } catch (TimeoutException e3) {
            String strValueOf2 = String.valueOf(str);
            zzbad.m17347c(strValueOf2.length() != 0 ? "Timeout while retriving a response from: ".concat(strValueOf2) : new String("Timeout while retriving a response from: "), e3);
            zzbbhVarM17258c.cancel(true);
            return null;
        } catch (Exception e4) {
            String strValueOf3 = String.valueOf(str);
            zzbad.m17347c(strValueOf3.length() != 0 ? "Error retriving a response from: ".concat(strValueOf3) : new String("Error retriving a response from: "), e4);
            return null;
        }
    }

    /* renamed from: k */
    private final void m17238k(Context context, String str, String str2) {
        zzk.zzlg();
        zzaxi.m17157j(context, m17234f(context, (String) zzyt.m20848e().m16421c(zzacu.f21644I3), str, str2));
    }

    /* renamed from: a */
    public final void m17239a(Context context, String str, String str2, String str3) {
        boolean zM17243m = m17243m();
        if (!m17236i(context, str, str2)) {
            m17238k(context, str, str2);
            return;
        }
        if (!zM17243m && !TextUtils.isEmpty(str3)) {
            m17233e(context, str2, str3, str);
        }
        zzbad.m17349e("Device is linked for debug signals.");
        m17231b(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    /* renamed from: c */
    public final boolean m17240c(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzk.zzlq().m17243m()) {
            return false;
        }
        zzbad.m17349e("Sending troubleshooting signals to the server.");
        m17233e(context, str, str2, str3);
        return true;
    }

    /* renamed from: g */
    public final void m17241g(Context context, String str, String str2) {
        if (!m17235h(context, str, str2)) {
            m17231b(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(this.f22681e)) {
            zzbad.m17349e("Creative is not pushed for this device.");
            m17231b(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f22681e)) {
            zzbad.m17349e("The app is not linked for creative preview.");
            m17238k(context, str, str2);
        } else if ("0".equals(this.f22681e)) {
            zzbad.m17349e("Device is linked for in app preview.");
            m17231b(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: l */
    public final String m17242l() {
        String str;
        synchronized (this.f22677a) {
            str = this.f22679c;
        }
        return str;
    }

    /* renamed from: m */
    public final boolean m17243m() {
        boolean z;
        synchronized (this.f22677a) {
            z = this.f22680d;
        }
        return z;
    }
}
