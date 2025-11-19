package kotlin;

import Ba.l;
import Ba.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4385G;
import s.C4388J;

/* compiled from: RecomposeScopeImpl.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00072\u0018\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001e\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00102\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0018J#\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0010\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010?R*\u0010B\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010AR$\u0010G\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\u0011\u0010L\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bK\u0010DR\u0011\u0010N\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bM\u0010DR$\u0010Q\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010D\"\u0004\bP\u0010FR$\u0010T\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010D\"\u0004\bS\u0010FR$\u0010W\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR$\u0010Z\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010D\"\u0004\bY\u0010FR$\u0010]\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010D\"\u0004\b\\\u0010FR\u0011\u0010_\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b^\u0010D¨\u0006`"}, d2 = {"LO/J0;", "LO/W0;", "LO/I0;", "LO/L0;", "owner", "<init>", "(LO/L0;)V", "LO/H;", "Ls/J;", "", "dependencies", "", "f", "(LO/H;Ls/J;)Z", "LO/l;", "composer", "Loa/F;", "g", "(LO/l;)V", "value", "LO/Y;", "s", "(Ljava/lang/Object;)LO/Y;", "x", "()V", "e", "invalidate", "Lkotlin/Function2;", "", "block", "a", "(LBa/p;)V", "token", "I", "(I)V", "z", "instance", "w", "(Ljava/lang/Object;)Z", "v", "(LO/H;Ljava/lang/Object;)V", "instances", "u", "y", "Lkotlin/Function1;", "LO/p;", "h", "(I)LBa/l;", "flags", "b", "LO/L0;", "LO/d;", "c", "LO/d;", "i", "()LO/d;", "A", "(LO/d;)V", "anchor", "d", "LBa/p;", "currentToken", "Ls/G;", "Ls/G;", "trackedInstances", "Ls/J;", "trackedDependencies", "o", "()Z", "F", "(Z)V", "rereading", "p", "G", "skipped", "r", "valid", "j", "canRecompose", "q", "H", "used", "k", "B", "defaultsInScope", "l", "C", "defaultsInvalid", "n", "E", "requiresRecompose", "m", "D", "forcedRecompose", "t", "isConditional", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.J0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507J0 implements W0, InterfaceC1505I0 {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f12638i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int flags;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1511L0 owner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C1536d anchor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p<? super InterfaceC1554l, ? super Integer, C4153F> block;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C4385G<Object> trackedInstances;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C4388J<InterfaceC1502H<?>, Object> trackedDependencies;

    /* compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LO/J0$a;", "", "<init>", "()V", "LO/c1;", "slots", "", "LO/d;", "anchors", "LO/L0;", "newOwner", "Loa/F;", "a", "(LO/c1;Ljava/util/List;LO/L0;)V", "LO/Z0;", "", "b", "(LO/Z0;Ljava/util/List;)Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.J0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final void a(SlotWriter slots, List<C1536d> anchors, InterfaceC1511L0 newOwner) {
            if (anchors.isEmpty()) {
                return;
            }
            int size = anchors.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objB1 = slots.b1(anchors.get(i10), 0);
                C1507J0 c1507j0 = objB1 instanceof C1507J0 ? (C1507J0) objB1 : null;
                if (c1507j0 != null) {
                    c1507j0.e(newOwner);
                }
            }
        }

        public final boolean b(Z0 slots, List<C1536d> anchors) {
            if (anchors.isEmpty()) {
                return false;
            }
            int size = anchors.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1536d c1536d = anchors.get(i10);
                if (slots.M(c1536d) && (slots.Q(slots.h(c1536d), 0) instanceof C1507J0)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LO/p;", "composition", "Loa/F;", "a", "(LO/p;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.J0$b */
    static final class b extends AbstractC3864v implements l<InterfaceC1562p, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f12647C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C4385G<Object> f12648D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, C4385G<Object> c4385g) {
            super(1);
            this.f12647C = i10;
            this.f12648D = c4385g;
        }

        public final void a(InterfaceC1562p interfaceC1562p) {
            int i10;
            if (C1507J0.this.currentToken != this.f12647C || !C3862t.b(this.f12648D, C1507J0.this.trackedInstances) || !(interfaceC1562p instanceof C1568s)) {
                return;
            }
            C4385G<Object> c4385g = this.f12648D;
            int i11 = this.f12647C;
            C1507J0 c1507j0 = C1507J0.this;
            long[] jArr = c4385g.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = c4385g.keys[i16];
                            boolean z10 = c4385g.values[i16] != i11;
                            if (z10) {
                                C1568s c1568s = (C1568s) interfaceC1562p;
                                c1568s.L(obj, c1507j0);
                                if (obj instanceof InterfaceC1502H) {
                                    c1568s.K((InterfaceC1502H) obj);
                                    C4388J c4388j = c1507j0.trackedDependencies;
                                    if (c4388j != null) {
                                        c4388j.o(obj);
                                    }
                                }
                            }
                            if (z10) {
                                c4385g.q(i16);
                            }
                            i10 = 8;
                        } else {
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        return;
                    }
                }
                if (i12 == length) {
                    return;
                } else {
                    i12++;
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1562p interfaceC1562p) {
            a(interfaceC1562p);
            return C4153F.f46609a;
        }
    }

    public C1507J0(InterfaceC1511L0 interfaceC1511L0) {
        this.owner = interfaceC1511L0;
    }

    private final void F(boolean z10) {
        if (z10) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void G(boolean z10) {
        if (z10) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    private final boolean f(InterfaceC1502H<?> interfaceC1502H, C4388J<InterfaceC1502H<?>, Object> c4388j) {
        C3862t.e(interfaceC1502H, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        l1<?> l1VarC = interfaceC1502H.c();
        if (l1VarC == null) {
            l1VarC = m1.o();
        }
        return !l1VarC.a(interfaceC1502H.o().a(), c4388j.b(interfaceC1502H));
    }

    private final boolean o() {
        return (this.flags & 32) != 0;
    }

    public final void A(C1536d c1536d) {
        this.anchor = c1536d;
    }

    public final void B(boolean z10) {
        if (z10) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void C(boolean z10) {
        if (z10) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void D(boolean z10) {
        if (z10) {
            this.flags |= 64;
        } else {
            this.flags &= -65;
        }
    }

    public final void E(boolean z10) {
        if (z10) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void H(boolean z10) {
        if (z10) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void I(int token) {
        this.currentToken = token;
        G(false);
    }

    @Override // kotlin.W0
    public void a(p<? super InterfaceC1554l, ? super Integer, C4153F> block) {
        this.block = block;
    }

    public final void e(InterfaceC1511L0 owner) {
        this.owner = owner;
    }

    public final void g(InterfaceC1554l composer) {
        C4153F c4153f;
        p<? super InterfaceC1554l, ? super Integer, C4153F> pVar = this.block;
        if (pVar != null) {
            pVar.invoke(composer, 1);
            c4153f = C4153F.f46609a;
        } else {
            c4153f = null;
        }
        if (c4153f == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    public final l<InterfaceC1562p, C4153F> h(int token) {
        C4385G<Object> c4385g = this.trackedInstances;
        if (c4385g == null || p()) {
            return null;
        }
        Object[] objArr = c4385g.keys;
        int[] iArr = c4385g.values;
        long[] jArr = c4385g.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        if (iArr[i13] != token) {
                            return new b(token, c4385g);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return null;
                }
            }
            if (i10 == length) {
                return null;
            }
            i10++;
        }
    }

    /* renamed from: i, reason: from getter */
    public final C1536d getAnchor() {
        return this.anchor;
    }

    @Override // kotlin.InterfaceC1505I0
    public void invalidate() {
        InterfaceC1511L0 interfaceC1511L0 = this.owner;
        if (interfaceC1511L0 != null) {
            interfaceC1511L0.e(this, null);
        }
    }

    public final boolean j() {
        return this.block != null;
    }

    public final boolean k() {
        return (this.flags & 2) != 0;
    }

    public final boolean l() {
        return (this.flags & 4) != 0;
    }

    public final boolean m() {
        return (this.flags & 64) != 0;
    }

    public final boolean n() {
        return (this.flags & 8) != 0;
    }

    public final boolean p() {
        return (this.flags & 16) != 0;
    }

    public final boolean q() {
        return (this.flags & 1) != 0;
    }

    public final boolean r() {
        if (this.owner == null) {
            return false;
        }
        C1536d c1536d = this.anchor;
        return c1536d != null ? c1536d.b() : false;
    }

    public final EnumC1525Y s(Object value) {
        EnumC1525Y enumC1525YE;
        InterfaceC1511L0 interfaceC1511L0 = this.owner;
        return (interfaceC1511L0 == null || (enumC1525YE = interfaceC1511L0.e(this, value)) == null) ? EnumC1525Y.IGNORED : enumC1525YE;
    }

    public final boolean t() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != 0) goto L8
            return r2
        L8:
            s.J<O.H<?>, java.lang.Object> r3 = r0.trackedDependencies
            if (r3 != 0) goto Ld
            return r2
        Ld:
            boolean r4 = r1 instanceof kotlin.InterfaceC1502H
            if (r4 == 0) goto L18
            O.H r1 = (kotlin.InterfaceC1502H) r1
            boolean r2 = r0.f(r1, r3)
            goto L72
        L18:
            boolean r4 = r1 instanceof s.V
            if (r4 == 0) goto L72
            s.V r1 = (s.V) r1
            boolean r4 = r1.e()
            r5 = 0
            if (r4 == 0) goto L71
            java.lang.Object[] r4 = r1.elements
            long[] r1 = r1.metadata
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L71
            r7 = r5
        L2f:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L49:
            if (r12 >= r10) goto L6a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            boolean r14 = r13 instanceof kotlin.InterfaceC1502H
            if (r14 == 0) goto L72
            O.H r13 = (kotlin.InterfaceC1502H) r13
            boolean r13 = r0.f(r13, r3)
            if (r13 == 0) goto L66
            goto L72
        L66:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L49
        L6a:
            if (r10 != r11) goto L71
        L6c:
            if (r7 == r6) goto L71
            int r7 = r7 + 1
            goto L2f
        L71:
            r2 = r5
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1507J0.u(java.lang.Object):boolean");
    }

    public final void v(InterfaceC1502H<?> instance, Object value) {
        C4388J<InterfaceC1502H<?>, Object> c4388j = this.trackedDependencies;
        if (c4388j == null) {
            c4388j = new C4388J<>(0, 1, null);
            this.trackedDependencies = c4388j;
        }
        c4388j.r(instance, value);
    }

    public final boolean w(Object instance) {
        if (o()) {
            return false;
        }
        C4385G<Object> c4385g = this.trackedInstances;
        if (c4385g == null) {
            c4385g = new C4385G<>(0, 1, null);
            this.trackedInstances = c4385g;
        }
        return c4385g.p(instance, this.currentToken, -1) == this.currentToken;
    }

    public final void x() {
        InterfaceC1511L0 interfaceC1511L0 = this.owner;
        if (interfaceC1511L0 != null) {
            interfaceC1511L0.d(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            r17 = this;
            r1 = r17
            O.L0 r0 = r1.owner
            if (r0 == 0) goto L60
            s.G<java.lang.Object> r2 = r1.trackedInstances
            if (r2 == 0) goto L60
            r3 = 1
            r1.F(r3)
            r3 = 0
            java.lang.Object[] r4 = r2.keys     // Catch: java.lang.Throwable -> L4b
            int[] r5 = r2.values     // Catch: java.lang.Throwable -> L4b
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L4b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L4b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L58
            r7 = r3
        L1b:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L4b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L4b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L53
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L4b
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L35:
            if (r12 >= r10) goto L51
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L4b
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L4b
            r0.a(r14)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L35
        L51:
            if (r10 != r11) goto L58
        L53:
            if (r7 == r6) goto L58
            int r7 = r7 + 1
            goto L1b
        L58:
            r1.F(r3)
            goto L60
        L5c:
            r1.F(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1507J0.y():void");
    }

    public final void z() {
        G(true);
    }
}
