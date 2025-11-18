package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzcgm extends Exception {

    /* renamed from: f */
    private final int f24277f;

    public zzcgm(int i2) {
        this.f24277f = i2;
    }

    /* renamed from: b */
    public static int m18773b(Throwable th) {
        if (th instanceof zzcgm) {
            return ((zzcgm) th).f24277f;
        }
        if (th instanceof zzayn) {
            return ((zzayn) th).m17246a();
        }
        return 0;
    }

    /* renamed from: a */
    public final int m18774a() {
        return this.f24277f;
    }

    public zzcgm(String str, int i2) {
        super(str);
        this.f24277f = i2;
    }

    public zzcgm(String str, Throwable th, int i2) {
        super(str, th);
        this.f24277f = 0;
    }
}
