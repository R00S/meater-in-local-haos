package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@zzard
@Deprecated
/* loaded from: classes2.dex */
public class zzbbw<T> {

    /* renamed from: a */
    private final zzbbr<T> f22768a;

    /* renamed from: b */
    private final AtomicInteger f22769b;

    public zzbbw() {
        zzbbr<T> zzbbrVar = new zzbbr<>();
        this.f22768a = zzbbrVar;
        this.f22769b = new AtomicInteger(0);
        zzbar.m17369f(zzbbrVar, new C6774i7(this), zzbbm.f22758b);
    }

    @Deprecated
    /* renamed from: a */
    public final int m17388a() {
        return this.f22769b.get();
    }

    @Deprecated
    /* renamed from: b */
    public final void m17389b() {
        this.f22768a.m17386c(new Exception());
    }

    @Deprecated
    /* renamed from: d */
    public final void m17390d(zzbbv<T> zzbbvVar, zzbbt zzbbtVar) {
        zzbar.m17369f(this.f22768a, new C6811j7(this, zzbbvVar, zzbbtVar), zzbbm.f22758b);
    }

    @Deprecated
    /* renamed from: e */
    public final void m17391e(T t) {
        this.f22768a.m17385a(t);
    }
}
