package p241e.p254e.p255a;

import com.google.android.gms.ads.AdSize;

@Deprecated
/* renamed from: e.e.a.c */
/* loaded from: classes2.dex */
public final class C8783c {

    /* renamed from: a */
    public static final C8783c f33403a = new C8783c(-1, -2, "mb");

    /* renamed from: b */
    public static final C8783c f33404b = new C8783c(320, 50, "mb");

    /* renamed from: c */
    public static final C8783c f33405c = new C8783c(300, 250, "as");

    /* renamed from: d */
    public static final C8783c f33406d = new C8783c(468, 60, "as");

    /* renamed from: e */
    public static final C8783c f33407e = new C8783c(728, 90, "as");

    /* renamed from: f */
    public static final C8783c f33408f = new C8783c(160, 600, "as");

    /* renamed from: g */
    private final AdSize f33409g;

    public C8783c(AdSize adSize) {
        this.f33409g = adSize;
    }

    /* renamed from: a */
    public final int m27940a() {
        return this.f33409g.getHeight();
    }

    /* renamed from: b */
    public final int m27941b() {
        return this.f33409g.getWidth();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8783c) {
            return this.f33409g.equals(((C8783c) obj).f33409g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33409g.hashCode();
    }

    public final String toString() {
        return this.f33409g.toString();
    }

    private C8783c(int i2, int i3, String str) {
        this(new AdSize(i2, i3));
    }
}
