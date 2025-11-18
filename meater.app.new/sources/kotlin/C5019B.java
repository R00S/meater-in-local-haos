package kotlin;

import h0.C3476g;
import h0.C3477h;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import u0.PointerInputChange;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\bø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00020\u0006*\u00020\bø\u0001\u0001¢\u0006\u0004\b\r\u0010\fJ%\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lx/B;", "", "Lx/q;", "orientation", "<init>", "(Lx/q;)V", "", "touchSlop", "Lh0/g;", "b", "(F)J", "d", "(J)F", "c", "Lu0/z;", "dragEvent", "a", "(Lu0/z;F)Lh0/g;", "Loa/F;", "e", "()V", "Lx/q;", "getOrientation", "()Lx/q;", "J", "totalPositionChange", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5019B {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EnumC5037q orientation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long totalPositionChange;

    public C5019B() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final long b(float touchSlop) {
        if (this.orientation == null) {
            long j10 = this.totalPositionChange;
            return C3476g.q(this.totalPositionChange, C3476g.s(C3476g.h(j10, C3476g.k(j10)), touchSlop));
        }
        float fD = d(this.totalPositionChange) - (Math.signum(d(this.totalPositionChange)) * touchSlop);
        float fC = c(this.totalPositionChange);
        return this.orientation == EnumC5037q.Horizontal ? C3477h.a(fD, fC) : C3477h.a(fC, fD);
    }

    public final C3476g a(PointerInputChange dragEvent, float touchSlop) {
        long jR = C3476g.r(this.totalPositionChange, C3476g.q(dragEvent.getPosition(), dragEvent.getPreviousPosition()));
        this.totalPositionChange = jR;
        if ((this.orientation == null ? C3476g.k(jR) : Math.abs(d(jR))) >= touchSlop) {
            return C3476g.d(b(touchSlop));
        }
        return null;
    }

    public final float c(long j10) {
        return this.orientation == EnumC5037q.Horizontal ? C3476g.n(j10) : C3476g.m(j10);
    }

    public final float d(long j10) {
        return this.orientation == EnumC5037q.Horizontal ? C3476g.m(j10) : C3476g.n(j10);
    }

    public final void e() {
        this.totalPositionChange = C3476g.INSTANCE.c();
    }

    public C5019B(EnumC5037q enumC5037q) {
        this.orientation = enumC5037q;
        this.totalPositionChange = C3476g.INSTANCE.c();
    }

    public /* synthetic */ C5019B(EnumC5037q enumC5037q, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : enumC5037q);
    }
}
