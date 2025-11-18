package kotlin.reflect.p371y.internal.p374j0.p415l;

import okhttp3.HttpUrl;

/* compiled from: Variance.kt */
/* renamed from: kotlin.f0.y.e.j0.l.r1 */
/* loaded from: classes3.dex */
public enum EnumC10384r1 {
    INVARIANT(HttpUrl.FRAGMENT_ENCODE_SET, true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);


    /* renamed from: j */
    private final String f40170j;

    /* renamed from: k */
    private final boolean f40171k;

    /* renamed from: l */
    private final boolean f40172l;

    /* renamed from: m */
    private final int f40173m;

    EnumC10384r1(String str, boolean z, boolean z2, int i2) {
        this.f40170j = str;
        this.f40171k = z;
        this.f40172l = z2;
        this.f40173m = i2;
    }

    /* renamed from: k */
    public final boolean m36819k() {
        return this.f40172l;
    }

    /* renamed from: q */
    public final String m36820q() {
        return this.f40170j;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f40170j;
    }
}
