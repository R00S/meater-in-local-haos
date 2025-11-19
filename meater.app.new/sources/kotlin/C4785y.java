package kotlin;

import Ha.g;
import kotlin.AbstractC4769q;
import kotlin.Metadata;

/* compiled from: Animation.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0017\u0010\n\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u001a\u0010%\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001a\u0010)\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0017\u0010(R\u001a\u0010.\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0015\u0010-¨\u0006/"}, d2 = {"Lv/y;", "T", "Lv/q;", "V", "Lv/d;", "Lv/v0;", "animationSpec", "Lv/q0;", "typeConverter", "initialValue", "initialVelocityVector", "<init>", "(Lv/v0;Lv/q0;Ljava/lang/Object;Lv/q;)V", "Lv/z;", "(Lv/z;Lv/q0;Ljava/lang/Object;Lv/q;)V", "", "playTimeNanos", "f", "(J)Ljava/lang/Object;", "d", "(J)Lv/q;", "a", "Lv/v0;", "b", "Lv/q0;", "c", "()Lv/q0;", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "Lv/q;", "initialValueVector", "e", "getInitialVelocityVector", "()Lv/q;", "endVelocity", "g", "targetValue", "h", "J", "()J", "durationNanos", "", "i", "Z", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4785y<T, V extends AbstractC4769q> implements InterfaceC4743d<T, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4780v0<V> animationSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4770q0<T, V> typeConverter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T initialValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final V initialValueVector;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final V initialVelocityVector;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final V endVelocity;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isInfinite;

    public C4785y(InterfaceC4780v0<V> interfaceC4780v0, InterfaceC4770q0<T, V> interfaceC4770q0, T t10, V v10) {
        this.animationSpec = interfaceC4780v0;
        this.typeConverter = interfaceC4770q0;
        this.initialValue = t10;
        V vInvoke = c().a().invoke(t10);
        this.initialValueVector = vInvoke;
        this.initialVelocityVector = (V) C4771r.e(v10);
        this.targetValue = (T) c().b().invoke(interfaceC4780v0.c(vInvoke, v10));
        this.durationNanos = interfaceC4780v0.e(vInvoke, v10);
        V v11 = (V) C4771r.e(interfaceC4780v0.d(getDurationNanos(), vInvoke, v10));
        this.endVelocity = v11;
        int size = v11.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v12 = this.endVelocity;
            v12.e(i10, g.j(v12.a(i10), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // kotlin.InterfaceC4743d
    /* renamed from: a, reason: from getter */
    public boolean getIsInfinite() {
        return this.isInfinite;
    }

    @Override // kotlin.InterfaceC4743d
    /* renamed from: b, reason: from getter */
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // kotlin.InterfaceC4743d
    public InterfaceC4770q0<T, V> c() {
        return this.typeConverter;
    }

    @Override // kotlin.InterfaceC4743d
    public V d(long playTimeNanos) {
        return !e(playTimeNanos) ? (V) this.animationSpec.d(playTimeNanos, this.initialValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    @Override // kotlin.InterfaceC4743d
    public T f(long playTimeNanos) {
        return !e(playTimeNanos) ? (T) c().b().invoke(this.animationSpec.b(playTimeNanos, this.initialValueVector, this.initialVelocityVector)) : g();
    }

    @Override // kotlin.InterfaceC4743d
    public T g() {
        return this.targetValue;
    }

    public C4785y(InterfaceC4787z<T> interfaceC4787z, InterfaceC4770q0<T, V> interfaceC4770q0, T t10, V v10) {
        this(interfaceC4787z.a(interfaceC4770q0), interfaceC4770q0, t10, v10);
    }
}
