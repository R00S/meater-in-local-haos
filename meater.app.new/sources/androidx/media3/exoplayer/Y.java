package androidx.media3.exoplayer;

import X1.C1804a;
import androidx.media3.exoplayer.source.r;

/* compiled from: MediaPeriodInfo.java */
/* loaded from: classes.dex */
final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final r.b f26577a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26578b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26579c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26580d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26581e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26582f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26583g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26584h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26585i;

    Y(r.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        C1804a.a(!z13 || z11);
        C1804a.a(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        C1804a.a(z14);
        this.f26577a = bVar;
        this.f26578b = j10;
        this.f26579c = j11;
        this.f26580d = j12;
        this.f26581e = j13;
        this.f26582f = z10;
        this.f26583g = z11;
        this.f26584h = z12;
        this.f26585i = z13;
    }

    public Y a(long j10) {
        return j10 == this.f26579c ? this : new Y(this.f26577a, this.f26578b, j10, this.f26580d, this.f26581e, this.f26582f, this.f26583g, this.f26584h, this.f26585i);
    }

    public Y b(long j10) {
        return j10 == this.f26578b ? this : new Y(this.f26577a, j10, this.f26579c, this.f26580d, this.f26581e, this.f26582f, this.f26583g, this.f26584h, this.f26585i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y.class != obj.getClass()) {
            return false;
        }
        Y y10 = (Y) obj;
        return this.f26578b == y10.f26578b && this.f26579c == y10.f26579c && this.f26580d == y10.f26580d && this.f26581e == y10.f26581e && this.f26582f == y10.f26582f && this.f26583g == y10.f26583g && this.f26584h == y10.f26584h && this.f26585i == y10.f26585i && X1.L.d(this.f26577a, y10.f26577a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f26577a.hashCode()) * 31) + ((int) this.f26578b)) * 31) + ((int) this.f26579c)) * 31) + ((int) this.f26580d)) * 31) + ((int) this.f26581e)) * 31) + (this.f26582f ? 1 : 0)) * 31) + (this.f26583g ? 1 : 0)) * 31) + (this.f26584h ? 1 : 0)) * 31) + (this.f26585i ? 1 : 0);
    }
}
