package v0;

import U0.y;
import U0.z;
import h0.C3476g;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import v0.C4791c;
import x0.C5047a;

/* compiled from: VelocityTracker.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0003R\u001a\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u0012\u0004\b\u0012\u0010\u0003R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R(\u0010\u001e\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001f\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lv0/d;", "", "<init>", "()V", "", "timeMillis", "Lh0/g;", "position", "Loa/F;", "a", "(JJ)V", "LU0/y;", "maximumVelocity", "b", "(J)J", "e", "Lv0/c$a;", "Lv0/c$a;", "getStrategy$annotations", "strategy", "Lv0/c;", "Lv0/c;", "xVelocityTracker", "c", "yVelocityTracker", "d", "J", "()J", "f", "(J)V", "currentPointerPositionAccumulator", "g", "lastMoveEventTimeStamp", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4792d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4791c.a strategy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4791c xVelocityTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4791c yVelocityTracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long currentPointerPositionAccumulator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long lastMoveEventTimeStamp;

    public C4792d() {
        C4791c.a aVar = e.h() ? C4791c.a.Impulse : C4791c.a.Lsq2;
        this.strategy = aVar;
        boolean z10 = false;
        int i10 = 1;
        C3854k c3854k = null;
        this.xVelocityTracker = new C4791c(z10, aVar, i10, c3854k);
        this.yVelocityTracker = new C4791c(z10, aVar, i10, c3854k);
        this.currentPointerPositionAccumulator = C3476g.INSTANCE.c();
    }

    public final void a(long timeMillis, long position) {
        this.xVelocityTracker.a(timeMillis, C3476g.m(position));
        this.yVelocityTracker.a(timeMillis, C3476g.n(position));
    }

    public final long b(long maximumVelocity) {
        if (!(y.h(maximumVelocity) > 0.0f && y.i(maximumVelocity) > 0.0f)) {
            C5047a.b("maximumVelocity should be a positive value. You specified=" + ((Object) y.n(maximumVelocity)));
        }
        return z.a(this.xVelocityTracker.d(y.h(maximumVelocity)), this.yVelocityTracker.d(y.i(maximumVelocity)));
    }

    /* renamed from: c, reason: from getter */
    public final long getCurrentPointerPositionAccumulator() {
        return this.currentPointerPositionAccumulator;
    }

    /* renamed from: d, reason: from getter */
    public final long getLastMoveEventTimeStamp() {
        return this.lastMoveEventTimeStamp;
    }

    public final void e() {
        this.xVelocityTracker.e();
        this.yVelocityTracker.e();
        this.lastMoveEventTimeStamp = 0L;
    }

    public final void f(long j10) {
        this.currentPointerPositionAccumulator = j10;
    }

    public final void g(long j10) {
        this.lastMoveEventTimeStamp = j10;
    }
}
