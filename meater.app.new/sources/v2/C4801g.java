package v2;

import java.util.Arrays;
import v2.J;

/* compiled from: ChunkIndex.java */
/* renamed from: v2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4801g implements J {

    /* renamed from: a, reason: collision with root package name */
    public final int f51162a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f51163b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f51164c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f51165d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f51166e;

    /* renamed from: f, reason: collision with root package name */
    private final long f51167f;

    public C4801g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f51163b = iArr;
        this.f51164c = jArr;
        this.f51165d = jArr2;
        this.f51166e = jArr3;
        int length = iArr.length;
        this.f51162a = length;
        if (length > 0) {
            this.f51167f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f51167f = 0L;
        }
    }

    public int b(long j10) {
        return X1.L.h(this.f51166e, j10, true, true);
    }

    @Override // v2.J
    public boolean g() {
        return true;
    }

    @Override // v2.J
    public J.a k(long j10) {
        int iB = b(j10);
        K k10 = new K(this.f51166e[iB], this.f51164c[iB]);
        if (k10.f51054a >= j10 || iB == this.f51162a - 1) {
            return new J.a(k10);
        }
        int i10 = iB + 1;
        return new J.a(k10, new K(this.f51166e[i10], this.f51164c[i10]));
    }

    @Override // v2.J
    public long m() {
        return this.f51167f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f51162a + ", sizes=" + Arrays.toString(this.f51163b) + ", offsets=" + Arrays.toString(this.f51164c) + ", timeUs=" + Arrays.toString(this.f51166e) + ", durationsUs=" + Arrays.toString(this.f51165d) + ")";
    }
}
