package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzln {

    /* renamed from: a */
    public static final zzln f26490a = new zzln(1.0f, 1.0f);

    /* renamed from: b */
    public final float f26491b;

    /* renamed from: c */
    public final float f26492c;

    /* renamed from: d */
    private final int f26493d;

    public zzln(float f2, float f3) {
        this.f26491b = f2;
        this.f26492c = f3;
        this.f26493d = Math.round(f2 * 1000.0f);
    }

    /* renamed from: a */
    public final long m20211a(long j2) {
        return j2 * this.f26493d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzln.class == obj.getClass()) {
            zzln zzlnVar = (zzln) obj;
            if (this.f26491b == zzlnVar.f26491b && this.f26492c == zzlnVar.f26492c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f26491b) + 527) * 31) + Float.floatToRawIntBits(this.f26492c);
    }
}
