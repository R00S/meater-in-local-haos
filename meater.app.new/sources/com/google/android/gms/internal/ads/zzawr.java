package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzawr {

    /* renamed from: g */
    @VisibleForTesting
    private final String f22612g;

    /* renamed from: h */
    private final zzaxb f22613h;

    /* renamed from: a */
    @VisibleForTesting
    private long f22606a = -1;

    /* renamed from: b */
    @VisibleForTesting
    private long f22607b = -1;

    /* renamed from: c */
    @VisibleForTesting
    private int f22608c = -1;

    /* renamed from: d */
    @VisibleForTesting
    int f22609d = -1;

    /* renamed from: e */
    @VisibleForTesting
    private long f22610e = 0;

    /* renamed from: f */
    private final Object f22611f = new Object();

    /* renamed from: i */
    @VisibleForTesting
    private int f22614i = 0;

    /* renamed from: j */
    @VisibleForTesting
    private int f22615j = 0;

    public zzawr(String str, zzaxb zzaxbVar) {
        this.f22612g = str;
        this.f22613h = zzaxbVar;
    }

    /* renamed from: b */
    private static boolean m17065b(Context context) {
        Context contextM16926f = zzasq.m16926f(context);
        int identifier = contextM16926f.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzbad.m17352h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == contextM16926f.getPackageManager().getActivityInfo(new ComponentName(contextM16926f.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzbad.m17352h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzbad.m17353i("Fail to fetch AdActivity theme");
            zzbad.m17352h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    /* renamed from: a */
    public final void m17066a(zzxz zzxzVar, long j2) {
        Bundle bundle;
        synchronized (this.f22611f) {
            long jMo17099m = this.f22613h.mo17099m();
            long jMo14608a = zzk.zzln().mo14608a();
            if (this.f22607b == -1) {
                if (jMo14608a - jMo17099m > ((Long) zzyt.m20848e().m16421c(zzacu.f21785f1)).longValue()) {
                    this.f22609d = -1;
                } else {
                    this.f22609d = this.f22613h.mo17095i();
                }
                this.f22607b = j2;
                this.f22606a = j2;
            } else {
                this.f22606a = j2;
            }
            if (zzxzVar == null || (bundle = zzxzVar.f27404h) == null || bundle.getInt("gw", 2) != 1) {
                this.f22608c++;
                int i2 = this.f22609d + 1;
                this.f22609d = i2;
                if (i2 == 0) {
                    this.f22610e = 0L;
                    this.f22613h.mo17110x(jMo14608a);
                } else {
                    this.f22610e = jMo14608a - this.f22613h.mo17090d();
                }
            }
        }
    }

    /* renamed from: c */
    public final Bundle m17067c(Context context, String str) {
        Bundle bundle;
        synchronized (this.f22611f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f22612g);
            bundle.putLong("basets", this.f22607b);
            bundle.putLong("currts", this.f22606a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f22608c);
            bundle.putInt("preqs_in_session", this.f22609d);
            bundle.putLong("time_in_session", this.f22610e);
            bundle.putInt("pclick", this.f22614i);
            bundle.putInt("pimp", this.f22615j);
            bundle.putBoolean("support_transparent_background", m17065b(context));
        }
        return bundle;
    }

    /* renamed from: d */
    public final void m17068d() {
        synchronized (this.f22611f) {
            this.f22615j++;
        }
    }

    /* renamed from: e */
    public final void m17069e() {
        synchronized (this.f22611f) {
            this.f22614i++;
        }
    }
}
