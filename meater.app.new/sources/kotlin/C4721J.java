package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: FloatAnimationSpec.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001c"}, d2 = {"Lv/J;", "Lv/H;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JFFF)F", "b", "d", "(FFF)F", "c", "(FFF)J", "a", "F", "getDampingRatio", "()F", "getStiffness", "Lv/d0;", "Lv/d0;", "spring", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4721J implements InterfaceC4719H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float visibilityThreshold;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C4744d0 spring;

    public C4721J() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // kotlin.InterfaceC4719H
    public float b(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.e(targetValue);
        return C4731U.c(this.spring.g(initialValue, initialVelocity, playTimeNanos / 1000000));
    }

    @Override // kotlin.InterfaceC4719H
    public long c(float initialValue, float targetValue, float initialVelocity) {
        float fB = this.spring.b();
        float dampingRatio = this.spring.getDampingRatio();
        float f10 = initialValue - targetValue;
        float f11 = this.visibilityThreshold;
        return C4742c0.b(fB, dampingRatio, initialVelocity / f11, f10 / f11, 1.0f) * 1000000;
    }

    @Override // kotlin.InterfaceC4719H
    public float d(float initialValue, float targetValue, float initialVelocity) {
        return 0.0f;
    }

    @Override // kotlin.InterfaceC4719H
    public float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.spring.e(targetValue);
        return C4731U.b(this.spring.g(initialValue, initialVelocity, playTimeNanos / 1000000));
    }

    public C4721J(float f10, float f11, float f12) {
        this.dampingRatio = f10;
        this.stiffness = f11;
        this.visibilityThreshold = f12;
        C4744d0 c4744d0 = new C4744d0(1.0f);
        c4744d0.d(f10);
        c4744d0.f(f11);
        this.spring = c4744d0;
    }

    public /* synthetic */ C4721J(float f10, float f11, float f12, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
