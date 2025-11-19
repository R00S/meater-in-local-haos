package kotlin;

import kotlin.AbstractC4769q;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Animation.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rBG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R*\u0010'\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010*\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u0016\u0010-\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0014\u0010\u000b\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00106\u001a\u00028\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00105R\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0014\u0010\n\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010$R\u0014\u00109\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00108R\u0014\u0010;\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010:¨\u0006<"}, d2 = {"Lv/l0;", "T", "Lv/q;", "V", "Lv/d;", "Lv/t0;", "animationSpec", "Lv/q0;", "typeConverter", "initialValue", "targetValue", "initialVelocityVector", "<init>", "(Lv/t0;Lv/q0;Ljava/lang/Object;Ljava/lang/Object;Lv/q;)V", "Lv/i;", "(Lv/i;Lv/q0;Ljava/lang/Object;Ljava/lang/Object;Lv/q;)V", "", "playTimeNanos", "f", "(J)Ljava/lang/Object;", "d", "(J)Lv/q;", "", "toString", "()Ljava/lang/String;", "a", "Lv/t0;", "getAnimationSpec$animation_core_release", "()Lv/t0;", "b", "Lv/q0;", "c", "()Lv/q0;", "value", "Ljava/lang/Object;", "getMutableTargetValue$animation_core_release", "()Ljava/lang/Object;", "setMutableTargetValue$animation_core_release", "(Ljava/lang/Object;)V", "mutableTargetValue", "getMutableInitialValue$animation_core_release", "setMutableInitialValue$animation_core_release", "mutableInitialValue", "e", "Lv/q;", "initialValueVector", "targetValueVector", "g", "h", "J", "_durationNanos", "i", "_endVelocity", "()Lv/q;", "endVelocity", "", "()Z", "isInfinite", "()J", "durationNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4760l0<T, V extends AbstractC4769q> implements InterfaceC4743d<T, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4776t0<V> animationSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4770q0<T, V> typeConverter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T mutableTargetValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private T mutableInitialValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private V initialValueVector;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private V targetValueVector;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final V initialVelocityVector;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long _durationNanos;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private V _endVelocity;

    public C4760l0(InterfaceC4776t0<V> interfaceC4776t0, InterfaceC4770q0<T, V> interfaceC4770q0, T t10, T t11, V v10) {
        V v11;
        this.animationSpec = interfaceC4776t0;
        this.typeConverter = interfaceC4770q0;
        this.mutableTargetValue = t11;
        this.mutableInitialValue = t10;
        this.initialValueVector = c().a().invoke(t10);
        this.targetValueVector = c().a().invoke(t11);
        this.initialVelocityVector = (v10 == null || (v11 = (V) C4771r.e(v10)) == null) ? (V) C4771r.g(c().a().invoke(t10)) : v11;
        this._durationNanos = -1L;
    }

    private final V h() {
        V v10 = this._endVelocity;
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) this.animationSpec.d(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = v11;
        return v11;
    }

    @Override // kotlin.InterfaceC4743d
    public boolean a() {
        return this.animationSpec.a();
    }

    @Override // kotlin.InterfaceC4743d
    public long b() {
        if (this._durationNanos < 0) {
            this._durationNanos = this.animationSpec.b(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this._durationNanos;
    }

    @Override // kotlin.InterfaceC4743d
    public InterfaceC4770q0<T, V> c() {
        return this.typeConverter;
    }

    @Override // kotlin.InterfaceC4743d
    public V d(long playTimeNanos) {
        return !e(playTimeNanos) ? (V) this.animationSpec.g(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : (V) h();
    }

    @Override // kotlin.InterfaceC4743d
    public T f(long playTimeNanos) {
        if (e(playTimeNanos)) {
            return g();
        }
        AbstractC4769q abstractC4769qE = this.animationSpec.e(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        int size = abstractC4769qE.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (Float.isNaN(abstractC4769qE.a(i10))) {
                C4736Z.b("AnimationVector cannot contain a NaN. " + abstractC4769qE + ". Animation: " + this + ", playTimeNanos: " + playTimeNanos);
            }
        }
        return (T) c().b().invoke(abstractC4769qE);
    }

    @Override // kotlin.InterfaceC4743d
    public T g() {
        return this.mutableTargetValue;
    }

    public final T i() {
        return this.mutableInitialValue;
    }

    public String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + g() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + C4747f.b(this) + " ms,animationSpec: " + this.animationSpec;
    }

    public /* synthetic */ C4760l0(InterfaceC4753i interfaceC4753i, InterfaceC4770q0 interfaceC4770q0, Object obj, Object obj2, AbstractC4769q abstractC4769q, int i10, C3854k c3854k) {
        this((InterfaceC4753i<Object>) interfaceC4753i, (InterfaceC4770q0<Object, AbstractC4769q>) interfaceC4770q0, obj, obj2, (i10 & 16) != 0 ? null : abstractC4769q);
    }

    public C4760l0(InterfaceC4753i<T> interfaceC4753i, InterfaceC4770q0<T, V> interfaceC4770q0, T t10, T t11, V v10) {
        this(interfaceC4753i.a(interfaceC4770q0), interfaceC4770q0, t10, t11, v10);
    }
}
