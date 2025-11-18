package androidx.media3.common;

import U1.G;

/* loaded from: classes.dex */
public final class IllegalSeekPositionException extends IllegalStateException {

    /* renamed from: B, reason: collision with root package name */
    public final G f26020B;

    /* renamed from: C, reason: collision with root package name */
    public final int f26021C;

    /* renamed from: D, reason: collision with root package name */
    public final long f26022D;

    public IllegalSeekPositionException(G g10, int i10, long j10) {
        this.f26020B = g10;
        this.f26021C = i10;
        this.f26022D = j10;
    }
}
