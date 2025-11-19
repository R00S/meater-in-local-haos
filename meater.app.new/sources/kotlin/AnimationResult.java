package kotlin;

import kotlin.AbstractC4769q;
import kotlin.Metadata;

/* compiled from: Animatable.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lv/g;", "T", "Lv/q;", "V", "", "Lv/k;", "endState", "Lv/e;", "endReason", "<init>", "(Lv/k;Lv/e;)V", "", "toString", "()Ljava/lang/String;", "a", "Lv/k;", "getEndState", "()Lv/k;", "b", "Lv/e;", "getEndReason", "()Lv/e;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class AnimationResult<T, V extends AbstractC4769q> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnimationState<T, V> endState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC4745e endReason;

    public AnimationResult(AnimationState<T, V> animationState, EnumC4745e enumC4745e) {
        this.endState = animationState;
        this.endReason = enumC4745e;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
