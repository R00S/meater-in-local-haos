package o2;

import U1.s;
import X1.C1804a;

/* compiled from: BaseMediaChunk.java */
/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4099a extends l {

    /* renamed from: k, reason: collision with root package name */
    public final long f46316k;

    /* renamed from: l, reason: collision with root package name */
    public final long f46317l;

    /* renamed from: m, reason: collision with root package name */
    private C4101c f46318m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f46319n;

    public AbstractC4099a(androidx.media3.datasource.a aVar, a2.g gVar, s sVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(aVar, gVar, sVar, i10, obj, j10, j11, j14);
        this.f46316k = j12;
        this.f46317l = j13;
    }

    public final int h(int i10) {
        return ((int[]) C1804a.i(this.f46319n))[i10];
    }

    protected final C4101c i() {
        return (C4101c) C1804a.i(this.f46318m);
    }

    public void j(C4101c c4101c) {
        this.f46318m = c4101c;
        this.f46319n = c4101c.b();
    }
}
