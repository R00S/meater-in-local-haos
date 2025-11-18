package w;

import A.N;
import i0.C3602t0;
import i0.C3606v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: OverscrollConfiguration.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lw/G;", "", "Li0/t0;", "glowColor", "LA/N;", "drawPadding", "<init>", "(JLA/N;Lkotlin/jvm/internal/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "LA/N;", "()LA/N;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w.G, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class OverscrollConfiguration {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long glowColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final N drawPadding;

    public /* synthetic */ OverscrollConfiguration(long j10, N n10, C3854k c3854k) {
        this(j10, n10);
    }

    /* renamed from: a, reason: from getter */
    public final N getDrawPadding() {
        return this.drawPadding;
    }

    /* renamed from: b, reason: from getter */
    public final long getGlowColor() {
        return this.glowColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C3862t.b(OverscrollConfiguration.class, other != null ? other.getClass() : null)) {
            return false;
        }
        C3862t.e(other, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) other;
        return C3602t0.m(this.glowColor, overscrollConfiguration.glowColor) && C3862t.b(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public int hashCode() {
        return (C3602t0.s(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) C3602t0.t(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }

    private OverscrollConfiguration(long j10, N n10) {
        this.glowColor = j10;
        this.drawPadding = n10;
    }

    public /* synthetic */ OverscrollConfiguration(long j10, N n10, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? C3606v0.d(4284900966L) : j10, (i10 & 2) != 0 ? androidx.compose.foundation.layout.o.c(0.0f, 0.0f, 3, null) : n10, null);
    }
}
