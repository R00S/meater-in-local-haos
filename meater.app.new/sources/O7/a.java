package O7;

import C7.c;
import U7.b;
import android.content.Context;
import android.graphics.Color;
import j1.C3718c;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f13291f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13292a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13293b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13294c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13295d;

    /* renamed from: e, reason: collision with root package name */
    private final float f13296e;

    public a(Context context) {
        this(b.b(context, c.f2335t, false), M7.a.b(context, c.f2334s, 0), M7.a.b(context, c.f2333r, 0), M7.a.b(context, c.f2331p, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return C3718c.k(i10, 255) == this.f13295d;
    }

    public float a(float f10) {
        if (this.f13296e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = M7.a.j(C3718c.k(i10, 255), this.f13293b, fA);
        if (fA > 0.0f && (i11 = this.f13294c) != 0) {
            iJ = M7.a.i(iJ, C3718c.k(i11, f13291f));
        }
        return C3718c.k(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f13292a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f13292a;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f13292a = z10;
        this.f13293b = i10;
        this.f13294c = i11;
        this.f13295d = i12;
        this.f13296e = f10;
    }
}
