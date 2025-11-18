package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.TimeUnit;

@zzard
/* loaded from: classes2.dex */
public final class zzbdg {

    /* renamed from: a */
    private final Context f22850a;

    /* renamed from: b */
    private final String f22851b;

    /* renamed from: c */
    private final zzbai f22852c;

    /* renamed from: d */
    private final zzadg f22853d;

    /* renamed from: e */
    private final zzadi f22854e;

    /* renamed from: g */
    private final long[] f22856g;

    /* renamed from: h */
    private final String[] f22857h;

    /* renamed from: m */
    private boolean f22862m;

    /* renamed from: n */
    private zzbco f22863n;

    /* renamed from: o */
    private boolean f22864o;

    /* renamed from: p */
    private boolean f22865p;

    /* renamed from: f */
    private final zzayq f22855f = new zzayt().m17253a("min_1", Double.MIN_VALUE, 1.0d).m17253a("1_5", 1.0d, 5.0d).m17253a("5_10", 5.0d, 10.0d).m17253a("10_20", 10.0d, 20.0d).m17253a("20_30", 20.0d, 30.0d).m17253a("30_max", 30.0d, Double.MAX_VALUE).m17254e();

    /* renamed from: i */
    private boolean f22858i = false;

    /* renamed from: j */
    private boolean f22859j = false;

    /* renamed from: k */
    private boolean f22860k = false;

    /* renamed from: l */
    private boolean f22861l = false;

    /* renamed from: q */
    private long f22866q = -1;

    public zzbdg(Context context, zzbai zzbaiVar, String str, zzadi zzadiVar, zzadg zzadgVar) {
        this.f22850a = context;
        this.f22852c = zzbaiVar;
        this.f22851b = str;
        this.f22854e = zzadiVar;
        this.f22853d = zzadgVar;
        String str2 = (String) zzyt.m20848e().m16421c(zzacu.f21640I);
        if (str2 == null) {
            this.f22857h = new String[0];
            this.f22856g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        this.f22857h = new String[strArrSplit.length];
        this.f22856g = new long[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                this.f22856g[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException e2) {
                zzbad.m17348d("Unable to parse frame hash target time number.", e2);
                this.f22856g[i2] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void m17483a() {
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21634H)).booleanValue() || this.f22864o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f22851b);
        bundle.putString("player", this.f22863n.mo17414r());
        for (zzays zzaysVar : this.f22855f.m17249c()) {
            String strValueOf = String.valueOf(zzaysVar.f22691a);
            bundle.putString(strValueOf.length() != 0 ? "fps_c_".concat(strValueOf) : new String("fps_c_"), Integer.toString(zzaysVar.f22695e));
            String strValueOf2 = String.valueOf(zzaysVar.f22691a);
            bundle.putString(strValueOf2.length() != 0 ? "fps_p_".concat(strValueOf2) : new String("fps_p_"), Double.toString(zzaysVar.f22694d));
        }
        int i2 = 0;
        while (true) {
            long[] jArr = this.f22856g;
            if (i2 >= jArr.length) {
                zzk.zzlg().m17180l(this.f22850a, this.f22852c.f22750f, "gmob-apps", bundle, true);
                this.f22864o = true;
                return;
            }
            String str = this.f22857h[i2];
            if (str != null) {
                String strValueOf3 = String.valueOf(Long.valueOf(jArr[i2]));
                StringBuilder sb = new StringBuilder(strValueOf3.length() + 3);
                sb.append("fh_");
                sb.append(strValueOf3);
                bundle.putString(sb.toString(), str);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public final void m17484b(zzbco zzbcoVar) {
        zzadb.m16440a(this.f22854e, this.f22853d, "vpc2");
        this.f22858i = true;
        zzadi zzadiVar = this.f22854e;
        if (zzadiVar != null) {
            zzadiVar.m16451d("vpn", zzbcoVar.mo17414r());
        }
        this.f22863n = zzbcoVar;
    }

    /* renamed from: c */
    public final void m17485c(zzbco zzbcoVar) {
        if (this.f22860k && !this.f22861l) {
            if (zzawz.m17083n() && !this.f22861l) {
                zzawz.m17082m("VideoMetricsMixin first frame");
            }
            zzadb.m16440a(this.f22854e, this.f22853d, "vff2");
            this.f22861l = true;
        }
        long jNanoTime = zzk.zzln().nanoTime();
        if (this.f22862m && this.f22865p && this.f22866q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            double d2 = jNanoTime - this.f22866q;
            Double.isNaN(nanos);
            Double.isNaN(d2);
            this.f22855f.m17248a(nanos / d2);
        }
        this.f22865p = this.f22862m;
        this.f22866q = jNanoTime;
        long jLongValue = ((Long) zzyt.m20848e().m16421c(zzacu.f21646J)).longValue();
        long currentPosition = zzbcoVar.getCurrentPosition();
        int i2 = 0;
        while (true) {
            String[] strArr = this.f22857h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && jLongValue > Math.abs(currentPosition - this.f22856g[i2])) {
                String[] strArr2 = this.f22857h;
                int i3 = 8;
                Bitmap bitmap = zzbcoVar.getBitmap(8, 8);
                long j2 = 63;
                int i4 = 0;
                long j3 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j3 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j2);
                        i5++;
                        j2--;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j3));
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public final void m17486d() {
        if (!this.f22858i || this.f22859j) {
            return;
        }
        zzadb.m16440a(this.f22854e, this.f22853d, "vfr2");
        this.f22859j = true;
    }

    /* renamed from: e */
    public final void m17487e() {
        this.f22862m = true;
        if (!this.f22859j || this.f22860k) {
            return;
        }
        zzadb.m16440a(this.f22854e, this.f22853d, "vfp2");
        this.f22860k = true;
    }

    /* renamed from: f */
    public final void m17488f() {
        this.f22862m = false;
    }
}
