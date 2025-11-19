package P2;

import X1.C1804a;
import X1.L;

/* compiled from: TrackSampleTable.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final s f13908a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13909b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f13910c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f13911d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13912e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f13913f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f13914g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13915h;

    public v(s sVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        C1804a.a(iArr.length == jArr2.length);
        C1804a.a(jArr.length == jArr2.length);
        C1804a.a(iArr2.length == jArr2.length);
        this.f13908a = sVar;
        this.f13910c = jArr;
        this.f13911d = iArr;
        this.f13912e = i10;
        this.f13913f = jArr2;
        this.f13914g = iArr2;
        this.f13915h = j10;
        this.f13909b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iH = L.h(this.f13913f, j10, true, false); iH >= 0; iH--) {
            if ((this.f13914g[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iE = L.e(this.f13913f, j10, true, false); iE < this.f13913f.length; iE++) {
            if ((this.f13914g[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }
}
