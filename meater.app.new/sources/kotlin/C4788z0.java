package kotlin;

import kotlin.AbstractC4769q;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DecayAnimationSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0016\u0010\u0019\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Lv/z0;", "Lv/q;", "V", "Lv/v0;", "Lv/I;", "floatDecaySpec", "<init>", "(Lv/I;)V", "", "playTimeNanos", "initialValue", "initialVelocity", "b", "(JLv/q;Lv/q;)Lv/q;", "e", "(Lv/q;Lv/q;)J", "d", "c", "(Lv/q;Lv/q;)Lv/q;", "a", "Lv/I;", "getFloatDecaySpec", "()Lv/I;", "Lv/q;", "valueVector", "velocityVector", "targetVector", "", "F", "()F", "absVelocityThreshold", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4788z0<V extends AbstractC4769q> implements InterfaceC4780v0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4720I floatDecaySpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V targetVector;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float absVelocityThreshold;

    public C4788z0(InterfaceC4720I interfaceC4720I) {
        this.floatDecaySpec = interfaceC4720I;
        this.absVelocityThreshold = interfaceC4720I.a();
    }

    @Override // kotlin.InterfaceC4780v0
    /* renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // kotlin.InterfaceC4780v0
    public V b(long playTimeNanos, V initialValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) C4771r.g(initialValue);
        }
        V v10 = this.valueVector;
        if (v10 == null) {
            C3862t.u("valueVector");
            v10 = null;
        }
        int size = v10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v11 = this.valueVector;
            if (v11 == null) {
                C3862t.u("valueVector");
                v11 = null;
            }
            v11.e(i10, this.floatDecaySpec.e(playTimeNanos, initialValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.valueVector;
        if (v12 != null) {
            return v12;
        }
        C3862t.u("valueVector");
        return null;
    }

    @Override // kotlin.InterfaceC4780v0
    public V c(V initialValue, V initialVelocity) {
        if (this.targetVector == null) {
            this.targetVector = (V) C4771r.g(initialValue);
        }
        V v10 = this.targetVector;
        if (v10 == null) {
            C3862t.u("targetVector");
            v10 = null;
        }
        int size = v10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v11 = this.targetVector;
            if (v11 == null) {
                C3862t.u("targetVector");
                v11 = null;
            }
            v11.e(i10, this.floatDecaySpec.d(initialValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.targetVector;
        if (v12 != null) {
            return v12;
        }
        C3862t.u("targetVector");
        return null;
    }

    @Override // kotlin.InterfaceC4780v0
    public V d(long playTimeNanos, V initialValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) C4771r.g(initialValue);
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            C3862t.u("velocityVector");
            v10 = null;
        }
        int size = v10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v11 = this.velocityVector;
            if (v11 == null) {
                C3862t.u("velocityVector");
                v11 = null;
            }
            v11.e(i10, this.floatDecaySpec.b(playTimeNanos, initialValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.velocityVector;
        if (v12 != null) {
            return v12;
        }
        C3862t.u("velocityVector");
        return null;
    }

    @Override // kotlin.InterfaceC4780v0
    public long e(V initialValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) C4771r.g(initialValue);
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            C3862t.u("velocityVector");
            v10 = null;
        }
        int size = v10.getSize();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, this.floatDecaySpec.c(initialValue.a(i10), initialVelocity.a(i10)));
        }
        return jMax;
    }
}
