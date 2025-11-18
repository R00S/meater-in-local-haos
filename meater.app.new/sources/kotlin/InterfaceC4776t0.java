package kotlin;

import kotlin.AbstractC4769q;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lv/t0;", "Lv/q;", "V", "", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLv/q;Lv/q;Lv/q;)Lv/q;", "g", "b", "(Lv/q;Lv/q;Lv/q;)J", "d", "(Lv/q;Lv/q;Lv/q;)Lv/q;", "", "a", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4776t0<V extends AbstractC4769q> {
    boolean a();

    long b(V initialValue, V targetValue, V initialVelocity);

    default V d(V initialValue, V targetValue, V initialVelocity) {
        return (V) g(b(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity);

    V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity);
}
