package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: AnimationSpec.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lv/p0;", "T", "Lv/C;", "", "durationMillis", "delay", "Lv/D;", "easing", "<init>", "(IILv/D;)V", "Lv/q;", "V", "Lv/q0;", "converter", "Lv/E0;", "f", "(Lv/q0;)Lv/E0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getDurationMillis", "b", "getDelay", "c", "Lv/D;", "getEasing", "()Lv/D;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4768p0<T> implements InterfaceC4710C<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4712D easing;

    public C4768p0() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(Object other) {
        if (!(other instanceof C4768p0)) {
            return false;
        }
        C4768p0 c4768p0 = (C4768p0) other;
        return c4768p0.durationMillis == this.durationMillis && c4768p0.delay == this.delay && C3862t.b(c4768p0.easing, this.easing);
    }

    @Override // kotlin.InterfaceC4710C, kotlin.InterfaceC4753i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public <V extends AbstractC4769q> C4715E0<V> a(InterfaceC4770q0<T, V> converter) {
        return new C4715E0<>(this.durationMillis, this.delay, this.easing);
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    public C4768p0(int i10, int i11, InterfaceC4712D interfaceC4712D) {
        this.durationMillis = i10;
        this.delay = i11;
        this.easing = interfaceC4712D;
    }

    public /* synthetic */ C4768p0(int i10, int i11, InterfaceC4712D interfaceC4712D, int i12, C3854k c3854k) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? C4716F.d() : interfaceC4712D);
    }
}
