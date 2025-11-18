package kotlin;

import A0.AbstractC0834m;
import A0.C0830i;
import A0.InterfaceC0829h;
import A0.InterfaceC0831j;
import A0.h0;
import A0.i0;
import J.RippleAlpha;
import J.p;
import i0.C3602t0;
import i0.InterfaceC3608w0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import z.InterfaceC5160i;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"LI/t;", "LA0/m;", "LA0/h;", "LA0/h0;", "Lz/i;", "interactionSource", "", "bounded", "LU0/h;", "radius", "Li0/w0;", "color", "<init>", "(Lz/i;ZFLi0/w0;Lkotlin/jvm/internal/k;)V", "Loa/F;", "v2", "()V", "t2", "u2", "T1", "e1", "Q", "Lz/i;", "R", "Z", "S", "F", "T", "Li0/w0;", "LA0/j;", "U", "LA0/j;", "rippleNode", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1157t extends AbstractC0834m implements InterfaceC0829h, h0 {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5160i interactionSource;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3608w0 color;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private InterfaceC0831j rippleNode;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/t0;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.t$a */
    static final class a implements InterfaceC3608w0 {
        a() {
        }

        @Override // i0.InterfaceC3608w0
        public final long a() {
            long jA = C1157t.this.color.a();
            if (jA != 16) {
                return jA;
            }
            RippleConfiguration rippleConfiguration = (RippleConfiguration) C0830i.a(C1157t.this, C1133V.d());
            return (rippleConfiguration == null || rippleConfiguration.getColor() == 16) ? C1132U.f5923a.b(((C3602t0) C0830i.a(C1157t.this, C1151n.a())).getValue(), ((Colors) C0830i.a(C1157t.this, C1146i.c())).m()) : rippleConfiguration.getColor();
        }
    }

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LJ/g;", "a", "()LJ/g;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.t$b */
    static final class b extends AbstractC3864v implements Ba.a<RippleAlpha> {
        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RippleAlpha invoke() {
            RippleAlpha rippleAlpha;
            RippleConfiguration rippleConfiguration = (RippleConfiguration) C0830i.a(C1157t.this, C1133V.d());
            return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? C1132U.f5923a.a(((C3602t0) C0830i.a(C1157t.this, C1151n.a())).getValue(), ((Colors) C0830i.a(C1157t.this, C1146i.c())).m()) : rippleAlpha;
        }
    }

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.t$c */
    static final class c extends AbstractC3864v implements Ba.a<C4153F> {
        c() {
            super(0);
        }

        public final void a() {
            if (((RippleConfiguration) C0830i.a(C1157t.this, C1133V.d())) == null) {
                C1157t.this.u2();
            } else if (C1157t.this.rippleNode == null) {
                C1157t.this.t2();
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ C1157t(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, C3854k c3854k) {
        this(interfaceC5160i, z10, f10, interfaceC3608w0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t2() {
        this.rippleNode = j2(p.c(this.interactionSource, this.bounded, this.radius, new a(), new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u2() {
        InterfaceC0831j interfaceC0831j = this.rippleNode;
        if (interfaceC0831j != null) {
            m2(interfaceC0831j);
        }
    }

    private final void v2() {
        i0.a(this, new c());
    }

    @Override // b0.i.c
    public void T1() {
        v2();
    }

    @Override // A0.h0
    public void e1() {
        v2();
    }

    private C1157t(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0) {
        this.interactionSource = interfaceC5160i;
        this.bounded = z10;
        this.radius = f10;
        this.color = interfaceC3608w0;
    }
}
