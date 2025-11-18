package kotlin;

import A0.InterfaceC0831j;
import U0.h;
import i0.C3602t0;
import i0.InterfaceC3608w0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import w.InterfaceC4949B;
import z.InterfaceC5160i;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"LI/W;", "Lw/B;", "", "bounded", "LU0/h;", "radius", "Li0/w0;", "colorProducer", "Li0/t0;", "color", "<init>", "(ZFLi0/w0;J)V", "(ZFJLkotlin/jvm/internal/k;)V", "Lz/i;", "interactionSource", "LA0/j;", "a", "(Lz/i;)LA0/j;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "b", "F", "c", "Li0/w0;", "d", "J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1134W implements InterfaceC4949B {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3608w0 colorProducer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/t0;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.W$a */
    static final class a implements InterfaceC3608w0 {
        a() {
        }

        @Override // i0.InterfaceC3608w0
        public final long a() {
            return C1134W.this.color;
        }
    }

    public /* synthetic */ C1134W(boolean z10, float f10, long j10, C3854k c3854k) {
        this(z10, f10, j10);
    }

    @Override // w.InterfaceC4949B
    public InterfaceC0831j a(InterfaceC5160i interactionSource) {
        InterfaceC3608w0 aVar = this.colorProducer;
        if (aVar == null) {
            aVar = new a();
        }
        return new C1157t(interactionSource, this.bounded, this.radius, aVar, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1134W)) {
            return false;
        }
        C1134W c1134w = (C1134W) other;
        if (this.bounded == c1134w.bounded && h.w(this.radius, c1134w.radius) && C3862t.b(this.colorProducer, c1134w.colorProducer)) {
            return C3602t0.m(this.color, c1134w.color);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.bounded) * 31) + h.x(this.radius)) * 31;
        InterfaceC3608w0 interfaceC3608w0 = this.colorProducer;
        return ((iHashCode + (interfaceC3608w0 != null ? interfaceC3608w0.hashCode() : 0)) * 31) + C3602t0.s(this.color);
    }

    private C1134W(boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, long j10) {
        this.bounded = z10;
        this.radius = f10;
        this.colorProducer = interfaceC3608w0;
        this.color = j10;
    }

    private C1134W(boolean z10, float f10, long j10) {
        this(z10, f10, (InterfaceC3608w0) null, j10);
    }
}
