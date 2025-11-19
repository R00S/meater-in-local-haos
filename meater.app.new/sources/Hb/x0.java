package Hb;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes3.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5797a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5798b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5799c;

    /* renamed from: d, reason: collision with root package name */
    private final Lb.o f5800d;

    /* renamed from: e, reason: collision with root package name */
    private final r f5801e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC1106s f5802f;

    /* renamed from: g, reason: collision with root package name */
    private int f5803g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5804h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayDeque<Lb.j> f5805i;

    /* renamed from: j, reason: collision with root package name */
    private Set<Lb.j> f5806j;

    /* compiled from: AbstractTypeChecker.kt */
    public interface a {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: Hb.x0$a$a, reason: collision with other inner class name */
        public static final class C0110a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f5807a;

            @Override // Hb.x0.a
            public void a(Ba.a<Boolean> block) {
                C3862t.g(block, "block");
                if (this.f5807a) {
                    return;
                }
                this.f5807a = block.invoke().booleanValue();
            }

            public final boolean b() {
                return this.f5807a;
            }
        }

        void a(Ba.a<Boolean> aVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractTypeChecker.kt */
    public static final class b {

        /* renamed from: B, reason: collision with root package name */
        public static final b f5808B = new b("CHECK_ONLY_LOWER", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final b f5809C = new b("CHECK_SUBTYPE_AND_LOWER", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final b f5810D = new b("SKIP_LOWER", 2);

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ b[] f5811E;

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f5812F;

        static {
            b[] bVarArrC = c();
            f5811E = bVarArrC;
            f5812F = C4929b.a(bVarArrC);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] c() {
            return new b[]{f5808B, f5809C, f5810D};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f5811E.clone();
        }
    }

    /* compiled from: AbstractTypeChecker.kt */
    public static abstract class c {

        /* compiled from: AbstractTypeChecker.kt */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f5813a = new b();

            private b() {
                super(null);
            }

            @Override // Hb.x0.c
            public Lb.j a(x0 state, Lb.i type) {
                C3862t.g(state, "state");
                C3862t.g(type, "type");
                return state.j().m0(type);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: Hb.x0$c$c, reason: collision with other inner class name */
        public static final class C0111c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0111c f5814a = new C0111c();

            private C0111c() {
                super(null);
            }

            @Override // Hb.x0.c
            public /* bridge */ /* synthetic */ Lb.j a(x0 x0Var, Lb.i iVar) {
                return (Lb.j) b(x0Var, iVar);
            }

            public Void b(x0 state, Lb.i type) {
                C3862t.g(state, "state");
                C3862t.g(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f5815a = new d();

            private d() {
                super(null);
            }

            @Override // Hb.x0.c
            public Lb.j a(x0 state, Lb.i type) {
                C3862t.g(state, "state");
                C3862t.g(type, "type");
                return state.j().G0(type);
            }
        }

        public /* synthetic */ c(C3854k c3854k) {
            this();
        }

        public abstract Lb.j a(x0 x0Var, Lb.i iVar);

        private c() {
        }
    }

    public x0(boolean z10, boolean z11, boolean z12, Lb.o typeSystemContext, r kotlinTypePreparator, AbstractC1106s kotlinTypeRefiner) {
        C3862t.g(typeSystemContext, "typeSystemContext");
        C3862t.g(kotlinTypePreparator, "kotlinTypePreparator");
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f5797a = z10;
        this.f5798b = z11;
        this.f5799c = z12;
        this.f5800d = typeSystemContext;
        this.f5801e = kotlinTypePreparator;
        this.f5802f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(x0 x0Var, Lb.i iVar, Lb.i iVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return x0Var.c(iVar, iVar2, z10);
    }

    public Boolean c(Lb.i subType, Lb.i superType, boolean z10) {
        C3862t.g(subType, "subType");
        C3862t.g(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque<Lb.j> arrayDeque = this.f5805i;
        C3862t.d(arrayDeque);
        arrayDeque.clear();
        Set<Lb.j> set = this.f5806j;
        C3862t.d(set);
        set.clear();
        this.f5804h = false;
    }

    public boolean f(Lb.i subType, Lb.i superType) {
        C3862t.g(subType, "subType");
        C3862t.g(superType, "superType");
        return true;
    }

    public b g(Lb.j subType, Lb.d superType) {
        C3862t.g(subType, "subType");
        C3862t.g(superType, "superType");
        return b.f5809C;
    }

    public final ArrayDeque<Lb.j> h() {
        return this.f5805i;
    }

    public final Set<Lb.j> i() {
        return this.f5806j;
    }

    public final Lb.o j() {
        return this.f5800d;
    }

    public final void k() {
        this.f5804h = true;
        if (this.f5805i == null) {
            this.f5805i = new ArrayDeque<>(4);
        }
        if (this.f5806j == null) {
            this.f5806j = Rb.l.f15221D.a();
        }
    }

    public final boolean l(Lb.i type) {
        C3862t.g(type, "type");
        return this.f5799c && this.f5800d.v0(type);
    }

    public final boolean m() {
        return this.f5797a;
    }

    public final boolean n() {
        return this.f5798b;
    }

    public final Lb.i o(Lb.i type) {
        C3862t.g(type, "type");
        return this.f5801e.a(type);
    }

    public final Lb.i p(Lb.i type) {
        C3862t.g(type, "type");
        return this.f5802f.a(type);
    }

    public boolean q(Ba.l<? super a, C4153F> block) {
        C3862t.g(block, "block");
        a.C0110a c0110a = new a.C0110a();
        block.invoke(c0110a);
        return c0110a.b();
    }
}
