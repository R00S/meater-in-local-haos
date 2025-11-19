package kotlin;

import Ha.g;
import kotlin.Metadata;

/* compiled from: FloatAnimationSpec.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006 "}, d2 = {"Lv/K;", "Lv/H;", "", "duration", "delay", "Lv/D;", "easing", "<init>", "(IILv/D;)V", "", "playTimeNanos", "f", "(J)J", "", "initialValue", "targetValue", "initialVelocity", "e", "(JFFF)F", "c", "(FFF)J", "b", "a", "I", "getDuration", "()I", "getDelay", "Lv/D;", "d", "J", "durationNanos", "delayNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4722K implements InterfaceC4719H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int duration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4712D easing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long delayNanos;

    public C4722K(int i10, int i11, InterfaceC4712D interfaceC4712D) {
        this.duration = i10;
        this.delay = i11;
        this.easing = interfaceC4712D;
        this.durationNanos = i10 * 1000000;
        this.delayNanos = i11 * 1000000;
    }

    private final long f(long playTimeNanos) {
        return g.l(playTimeNanos - this.delayNanos, 0L, this.durationNanos);
    }

    @Override // kotlin.InterfaceC4719H
    public float b(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long jF = f(playTimeNanos);
        if (jF < 0) {
            return 0.0f;
        }
        if (jF == 0) {
            return initialVelocity;
        }
        return (e(jF, initialValue, targetValue, initialVelocity) - e(jF - 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }

    @Override // kotlin.InterfaceC4719H
    public long c(float initialValue, float targetValue, float initialVelocity) {
        return (this.delay + this.duration) * 1000000;
    }

    @Override // kotlin.InterfaceC4719H
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        float f10 = this.duration == 0 ? 1.0f : f(playTimeNanos) / this.durationNanos;
        InterfaceC4712D interfaceC4712D = this.easing;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        return C4774s0.k(initialValue, targetValue, interfaceC4712D.a(f10 <= 1.0f ? f10 : 1.0f));
    }
}
