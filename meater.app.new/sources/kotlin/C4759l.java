package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3856m;

/* compiled from: AnimationState.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001aI\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "Lv/q;", "V", "Lv/k;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "c", "(Lv/k;Ljava/lang/Object;Lv/q;JJZ)Lv/k;", "", "initialValue", "initialVelocity", "Lv/m;", "a", "(FFJJZ)Lv/k;", "Lv/q0;", "e", "(Lv/q0;Ljava/lang/Object;)Lv/q;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4759l {
    public static final AnimationState<Float, C4761m> a(float f10, float f11, long j10, long j11, boolean z10) {
        return new AnimationState<>(C4774s0.i(C3856m.f44008a), Float.valueOf(f10), C4771r.a(f11), j10, j11, z10);
    }

    public static /* synthetic */ AnimationState b(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        long j12 = (i10 & 4) != 0 ? Long.MIN_VALUE : j10;
        long j13 = (i10 & 8) == 0 ? j11 : Long.MIN_VALUE;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(f10, f11, j12, j13, z10);
    }

    public static final <T, V extends AbstractC4769q> AnimationState<T, V> c(AnimationState<T, V> c4757k, T t10, V v10, long j10, long j11, boolean z10) {
        return new AnimationState<>(c4757k.j(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ AnimationState d(AnimationState c4757k, Object obj, AbstractC4769q abstractC4769q, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c4757k.getValue();
        }
        if ((i10 & 2) != 0) {
            abstractC4769q = C4771r.e(c4757k.q());
        }
        AbstractC4769q abstractC4769q2 = abstractC4769q;
        if ((i10 & 4) != 0) {
            j10 = c4757k.getLastFrameTimeNanos();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = c4757k.getFinishedTimeNanos();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = c4757k.getIsRunning();
        }
        return c(c4757k, obj, abstractC4769q2, j12, j13, z10);
    }

    public static final <T, V extends AbstractC4769q> V e(InterfaceC4770q0<T, V> interfaceC4770q0, T t10) {
        V vInvoke = interfaceC4770q0.a().invoke(t10);
        vInvoke.d();
        return vInvoke;
    }
}
