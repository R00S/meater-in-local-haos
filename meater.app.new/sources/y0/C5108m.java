package y0;

import kotlin.Metadata;

/* compiled from: Layout.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Ly0/m;", "Ly0/H;", "Ly0/q;", "measurable", "Ly0/s;", "minMax", "Ly0/t;", "widthHeight", "<init>", "(Ly0/q;Ly0/s;Ly0/t;)V", "LU0/b;", "constraints", "Ly0/Z;", "T", "(J)Ly0/Z;", "", "height", "Q", "(I)I", "S", "width", "f0", "q", "B", "Ly0/q;", "getMeasurable", "()Ly0/q;", "C", "Ly0/s;", "D", "Ly0/t;", "", "b", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5108m implements H {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5112q measurable;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final EnumC5113s minMax;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final EnumC5114t widthHeight;

    public C5108m(InterfaceC5112q interfaceC5112q, EnumC5113s enumC5113s, EnumC5114t enumC5114t) {
        this.measurable = interfaceC5112q;
        this.minMax = enumC5113s;
        this.widthHeight = enumC5114t;
    }

    @Override // y0.InterfaceC5112q
    public int Q(int height) {
        return this.measurable.Q(height);
    }

    @Override // y0.InterfaceC5112q
    public int S(int height) {
        return this.measurable.S(height);
    }

    @Override // y0.H
    public Z T(long constraints) {
        if (this.widthHeight == EnumC5114t.Width) {
            return new C5110o(this.minMax == EnumC5113s.Max ? this.measurable.S(U0.b.k(constraints)) : this.measurable.Q(U0.b.k(constraints)), U0.b.g(constraints) ? U0.b.k(constraints) : 32767);
        }
        return new C5110o(U0.b.h(constraints) ? U0.b.l(constraints) : 32767, this.minMax == EnumC5113s.Max ? this.measurable.q(U0.b.l(constraints)) : this.measurable.f0(U0.b.l(constraints)));
    }

    @Override // y0.InterfaceC5112q
    public Object b() {
        return this.measurable.b();
    }

    @Override // y0.InterfaceC5112q
    public int f0(int width) {
        return this.measurable.f0(width);
    }

    @Override // y0.InterfaceC5112q
    public int q(int width) {
        return this.measurable.q(width);
    }
}
