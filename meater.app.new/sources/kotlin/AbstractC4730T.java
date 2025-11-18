package kotlin;

import kotlin.AbstractC4728Q;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import s.C4380B;
import s.C4406p;

/* compiled from: AnimationSpec.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nR,\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\u0082\u0001\u0001\u001b¨\u0006\u001c"}, d2 = {"Lv/T;", "T", "Lv/Q;", "E", "", "<init>", "()V", "Lv/D;", "easing", "e", "(Lv/Q;Lv/D;)Lv/Q;", "", "<set-?>", "a", "I", "b", "()I", "d", "(I)V", "durationMillis", "setDelayMillis", "delayMillis", "Ls/B;", "c", "Ls/B;", "()Ls/B;", "keyframes", "Lv/S$b;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4730T<T, E extends AbstractC4728Q<T>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int durationMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int delayMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4380B<E> keyframes;

    public /* synthetic */ AbstractC4730T(C3854k c3854k) {
        this();
    }

    /* renamed from: a, reason: from getter */
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    /* renamed from: b, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final C4380B<E> c() {
        return this.keyframes;
    }

    public final void d(int i10) {
        this.durationMillis = i10;
    }

    public final E e(E e10, InterfaceC4712D interfaceC4712D) {
        e10.c(interfaceC4712D);
        return e10;
    }

    private AbstractC4730T() {
        this.durationMillis = 300;
        this.keyframes = C4406p.b();
    }
}
