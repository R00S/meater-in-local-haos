package U1;

import X1.C1804a;
import android.view.Surface;

/* compiled from: SurfaceInfo.java */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f16807a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16808b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16810d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16811e;

    public F(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return this.f16808b == f10.f16808b && this.f16809c == f10.f16809c && this.f16810d == f10.f16810d && this.f16811e == f10.f16811e && this.f16807a.equals(f10.f16807a);
    }

    public int hashCode() {
        return (((((((this.f16807a.hashCode() * 31) + this.f16808b) * 31) + this.f16809c) * 31) + this.f16810d) * 31) + (this.f16811e ? 1 : 0);
    }

    public F(Surface surface, int i10, int i11, int i12) {
        this(surface, i10, i11, i12, false);
    }

    public F(Surface surface, int i10, int i11, int i12, boolean z10) {
        C1804a.b(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f16807a = surface;
        this.f16808b = i10;
        this.f16809c = i11;
        this.f16810d = i12;
        this.f16811e = z10;
    }
}
