package J;

import A0.A;
import A0.C0832k;
import A0.C0839s;
import A0.InterfaceC0829h;
import Xb.C1841i;
import Xb.I;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import b0.i;
import h0.C3482m;
import i0.InterfaceC3608w0;
import k0.InterfaceC3783c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import oa.C4173r;
import s.C4386H;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.InterfaceC5159h;
import z.InterfaceC5160i;
import z.m;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u0014*\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0014*\u00020&H&¢\u0006\u0004\b'\u0010(J*\u0010-\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020*2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)H&¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00108R*\u0010L\u001a\u00020*2\u0006\u0010G\u001a\u00020*8\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00104R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00120O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0017\u0010U\u001a\u00020S8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bT\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"LJ/q;", "Lb0/i$c;", "LA0/h;", "LA0/r;", "LA0/A;", "Lz/i;", "interactionSource", "", "bounded", "LU0/h;", "radius", "Li0/w0;", "color", "Lkotlin/Function0;", "LJ/g;", "rippleAlpha", "<init>", "(Lz/i;ZFLi0/w0;LBa/a;Lkotlin/jvm/internal/k;)V", "Lz/m;", "pressInteraction", "Loa/F;", "u2", "(Lz/m;)V", "Lz/h;", "interaction", "LXb/I;", "scope", "w2", "(Lz/h;LXb/I;)V", "LU0/r;", "size", "q", "(J)V", "T1", "()V", "Lk0/c;", "d", "(Lk0/c;)V", "Lk0/f;", "p2", "(Lk0/f;)V", "Lz/m$b;", "Lh0/m;", "", "targetRadius", "o2", "(Lz/m$b;JF)V", "v2", "(Lz/m$b;)V", "O", "Lz/i;", "P", "Z", "q2", "()Z", "Q", "F", "R", "Li0/w0;", "S", "LBa/a;", "r2", "()LBa/a;", "T", "O1", "shouldAutoInvalidate", "LJ/u;", "U", "LJ/u;", "stateLayer", "V", "<set-?>", "W", "J", "t2", "()J", "rippleSize", "X", "hasValidSize", "Ls/H;", "Y", "Ls/H;", "pendingInteractions", "Li0/t0;", "s2", "rippleColor", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class q extends i.c implements InterfaceC0829h, A0.r, A {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5160i interactionSource;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3608w0 color;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<RippleAlpha> rippleAlpha;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private u stateLayer;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private float targetRadius;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private boolean hasValidSize;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final C4386H<z.m> pendingInteractions;

    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {378}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7145B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f7146C;

        /* compiled from: Ripple.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz/h;", "interaction", "Loa/F;", "b", "(Lz/h;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: J.q$a$a, reason: collision with other inner class name */
        static final class C0148a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ q f7148B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ I f7149C;

            C0148a(q qVar, I i10) {
                this.f7148B = qVar;
                this.f7149C = i10;
            }

            @Override // ac.InterfaceC1971f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                if (!(interfaceC5159h instanceof z.m)) {
                    this.f7148B.w2(interfaceC5159h, this.f7149C);
                } else if (this.f7148B.hasValidSize) {
                    this.f7148B.u2((z.m) interfaceC5159h);
                } else {
                    this.f7148B.pendingInteractions.e(interfaceC5159h);
                }
                return C4153F.f46609a;
            }
        }

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = q.this.new a(interfaceC4588d);
            aVar.f7146C = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f7145B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f7146C;
                InterfaceC1970e<InterfaceC5159h> interfaceC1970eB = q.this.interactionSource.b();
                C0148a c0148a = new C0148a(q.this, i11);
                this.f7145B = 1;
                if (interfaceC1970eB.b(c0148a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ q(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, Ba.a aVar, C3854k c3854k) {
        this(interfaceC5160i, z10, f10, interfaceC3608w0, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u2(z.m pressInteraction) {
        if (pressInteraction instanceof m.b) {
            o2((m.b) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof m.c) {
            v2(((m.c) pressInteraction).getPress());
        } else if (pressInteraction instanceof m.a) {
            v2(((m.a) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(InterfaceC5159h interaction, I scope) {
        u uVar = this.stateLayer;
        if (uVar == null) {
            uVar = new u(this.bounded, this.rippleAlpha);
            C0839s.a(this);
            this.stateLayer = uVar;
        }
        uVar.c(interaction, scope);
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // b0.i.c
    public void T1() {
        C1841i.d(J1(), null, null, new a(null), 3, null);
    }

    @Override // A0.r
    public void d(InterfaceC3783c interfaceC3783c) {
        interfaceC3783c.C1();
        u uVar = this.stateLayer;
        if (uVar != null) {
            uVar.b(interfaceC3783c, this.targetRadius, s2());
        }
        p2(interfaceC3783c);
    }

    public abstract void o2(m.b interaction, long size, float targetRadius);

    public abstract void p2(k0.f fVar);

    @Override // A0.A
    public void q(long size) {
        this.hasValidSize = true;
        U0.d dVarI = C0832k.i(this);
        this.rippleSize = U0.s.d(size);
        this.targetRadius = Float.isNaN(this.radius) ? i.a(dVarI, this.bounded, this.rippleSize) : dVarI.X0(this.radius);
        C4386H<z.m> c4386h = this.pendingInteractions;
        Object[] objArr = c4386h.content;
        int i10 = c4386h._size;
        for (int i11 = 0; i11 < i10; i11++) {
            u2((z.m) objArr[i11]);
        }
        this.pendingInteractions.f();
    }

    /* renamed from: q2, reason: from getter */
    protected final boolean getBounded() {
        return this.bounded;
    }

    protected final Ba.a<RippleAlpha> r2() {
        return this.rippleAlpha;
    }

    public final long s2() {
        return this.color.a();
    }

    /* renamed from: t2, reason: from getter */
    protected final long getRippleSize() {
        return this.rippleSize;
    }

    public abstract void v2(m.b interaction);

    private q(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, Ba.a<RippleAlpha> aVar) {
        this.interactionSource = interfaceC5160i;
        this.bounded = z10;
        this.radius = f10;
        this.color = interfaceC3608w0;
        this.rippleAlpha = aVar;
        this.rippleSize = C3482m.INSTANCE.b();
        this.pendingInteractions = new C4386H<>(0, 1, null);
    }
}
