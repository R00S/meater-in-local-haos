package kotlin;

import kotlin.Metadata;

/* compiled from: FloatAnimationSpec.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J/\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lv/H;", "Lv/i;", "", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JFFF)F", "b", "d", "(FFF)F", "c", "(FFF)J", "Lv/q;", "V", "Lv/q0;", "converter", "Lv/y0;", "a", "(Lv/q0;)Lv/y0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4719H extends InterfaceC4753i<Float> {
    float b(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);

    long c(float initialValue, float targetValue, float initialVelocity);

    default float d(float initialValue, float targetValue, float initialVelocity) {
        return b(c(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);

    @Override // kotlin.InterfaceC4753i
    default <V extends AbstractC4769q> C4786y0<V> a(InterfaceC4770q0<Float, V> converter) {
        return new C4786y0<>(this);
    }
}
