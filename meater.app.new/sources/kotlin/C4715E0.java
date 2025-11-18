package kotlin;

import kotlin.AbstractC4769q;
import kotlin.Metadata;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lv/E0;", "Lv/q;", "V", "Lv/w0;", "", "durationMillis", "delayMillis", "Lv/D;", "easing", "<init>", "(IILv/D;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLv/q;Lv/q;Lv/q;)Lv/q;", "g", "a", "I", "c", "()I", "b", "f", "Lv/D;", "getEasing", "()Lv/D;", "Lv/y0;", "d", "Lv/y0;", "anim", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.E0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4715E0<V extends AbstractC4769q> implements InterfaceC4782w0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4712D easing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C4786y0<V> anim;

    public C4715E0(int i10, int i11, InterfaceC4712D interfaceC4712D) {
        this.durationMillis = i10;
        this.delayMillis = i11;
        this.easing = interfaceC4712D;
        this.anim = new C4786y0<>(new C4722K(getDurationMillis(), getDelayMillis(), interfaceC4712D));
    }

    @Override // kotlin.InterfaceC4782w0
    /* renamed from: c, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // kotlin.InterfaceC4776t0
    public V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.e(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // kotlin.InterfaceC4782w0
    /* renamed from: f, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // kotlin.InterfaceC4776t0
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.g(playTimeNanos, initialValue, targetValue, initialVelocity);
    }
}
