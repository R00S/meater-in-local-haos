package androidx.compose.foundation;

import A0.C0839s;
import A0.h0;
import A0.i0;
import A0.r;
import U0.t;
import b0.i;
import h0.C3482m;
import i0.AbstractC3582j0;
import i0.C3602t0;
import i0.N0;
import i0.O0;
import i0.Y0;
import i0.c1;
import k0.InterfaceC3783c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import oa.C4153F;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u0010\u001aR\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/foundation/c;", "LA0/r;", "Lb0/i$c;", "LA0/h0;", "Li0/t0;", "color", "Li0/j0;", "brush", "", "alpha", "Li0/c1;", "shape", "<init>", "(JLi0/j0;FLi0/c1;Lkotlin/jvm/internal/k;)V", "Lk0/c;", "Loa/F;", "k2", "(Lk0/c;)V", "j2", "Li0/N0;", "l2", "(Lk0/c;)Li0/N0;", "d", "e1", "()V", "O", "J", "getColor-0d7_KjU", "()J", "o2", "(J)V", "P", "Li0/j0;", "getBrush", "()Li0/j0;", "n2", "(Li0/j0;)V", "Q", "F", "getAlpha", "()F", "c", "(F)V", "R", "Li0/c1;", "m2", "()Li0/c1;", "n0", "(Li0/c1;)V", "Lh0/m;", "S", "lastSize", "LU0/t;", "T", "LU0/t;", "lastLayoutDirection", "U", "Li0/N0;", "lastOutline", "V", "lastShape", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends i.c implements r, h0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long color;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private AbstractC3582j0 brush;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private c1 shape;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private long lastSize;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private t lastLayoutDirection;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private N0 lastOutline;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private c1 lastShape;

    /* compiled from: Background.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ O<N0> f21925B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c f21926C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC3783c f21927D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O<N0> o10, c cVar, InterfaceC3783c interfaceC3783c) {
            super(0);
            this.f21925B = o10;
            this.f21926C = cVar;
            this.f21927D = interfaceC3783c;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, i0.N0] */
        public final void a() {
            this.f21925B.f43978B = this.f21926C.getShape().a(this.f21927D.C(), this.f21927D.getLayoutDirection(), this.f21927D);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ c(long j10, AbstractC3582j0 abstractC3582j0, float f10, c1 c1Var, C3854k c3854k) {
        this(j10, abstractC3582j0, f10, c1Var);
    }

    private final void j2(InterfaceC3783c interfaceC3783c) {
        N0 n0L2 = l2(interfaceC3783c);
        if (!C3602t0.m(this.color, C3602t0.INSTANCE.e())) {
            O0.c(interfaceC3783c, n0L2, this.color, (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? k0.j.f43725a : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? k0.f.INSTANCE.a() : 0);
        }
        AbstractC3582j0 abstractC3582j0 = this.brush;
        if (abstractC3582j0 != null) {
            O0.b(interfaceC3783c, n0L2, abstractC3582j0, this.alpha, null, null, 0, 56, null);
        }
    }

    private final void k2(InterfaceC3783c interfaceC3783c) {
        if (!C3602t0.m(this.color, C3602t0.INSTANCE.e())) {
            k0.f.T0(interfaceC3783c, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        AbstractC3582j0 abstractC3582j0 = this.brush;
        if (abstractC3582j0 != null) {
            k0.f.o0(interfaceC3783c, abstractC3582j0, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, i0.N0, java.lang.Object] */
    private final N0 l2(InterfaceC3783c interfaceC3783c) {
        O o10 = new O();
        if (C3482m.f(interfaceC3783c.C(), this.lastSize) && interfaceC3783c.getLayoutDirection() == this.lastLayoutDirection && C3862t.b(this.lastShape, this.shape)) {
            ?? r12 = this.lastOutline;
            C3862t.d(r12);
            o10.f43978B = r12;
        } else {
            i0.a(this, new a(o10, this, interfaceC3783c));
        }
        this.lastOutline = (N0) o10.f43978B;
        this.lastSize = interfaceC3783c.C();
        this.lastLayoutDirection = interfaceC3783c.getLayoutDirection();
        this.lastShape = this.shape;
        T t10 = o10.f43978B;
        C3862t.d(t10);
        return (N0) t10;
    }

    public final void c(float f10) {
        this.alpha = f10;
    }

    @Override // A0.r
    public void d(InterfaceC3783c interfaceC3783c) {
        if (this.shape == Y0.a()) {
            k2(interfaceC3783c);
        } else {
            j2(interfaceC3783c);
        }
        interfaceC3783c.C1();
    }

    @Override // A0.h0
    public void e1() {
        this.lastSize = C3482m.INSTANCE.a();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        C0839s.a(this);
    }

    /* renamed from: m2, reason: from getter */
    public final c1 getShape() {
        return this.shape;
    }

    public final void n0(c1 c1Var) {
        this.shape = c1Var;
    }

    public final void n2(AbstractC3582j0 abstractC3582j0) {
        this.brush = abstractC3582j0;
    }

    public final void o2(long j10) {
        this.color = j10;
    }

    private c(long j10, AbstractC3582j0 abstractC3582j0, float f10, c1 c1Var) {
        this.color = j10;
        this.brush = abstractC3582j0;
        this.alpha = f10;
        this.shape = c1Var;
        this.lastSize = C3482m.INSTANCE.a();
    }
}
