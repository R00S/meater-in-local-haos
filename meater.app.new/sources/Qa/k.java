package Qa;

import Ra.H;
import Ua.F;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes3.dex */
public final class k extends Oa.j {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f14613k = {P.h(new G(P.b(k.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: h, reason: collision with root package name */
    private final a f14614h;

    /* renamed from: i, reason: collision with root package name */
    private Ba.a<b> f14615i;

    /* renamed from: j, reason: collision with root package name */
    private final Gb.i f14616j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JvmBuiltIns.kt */
    public static final class a {

        /* renamed from: B, reason: collision with root package name */
        public static final a f14617B = new a("FROM_DEPENDENCIES", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final a f14618C = new a("FROM_CLASS_LOADER", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final a f14619D = new a("FALLBACK", 2);

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ a[] f14620E;

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f14621F;

        static {
            a[] aVarArrC = c();
            f14620E = aVarArrC;
            f14621F = C4929b.a(aVarArrC);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] c() {
            return new a[]{f14617B, f14618C, f14619D};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f14620E.clone();
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final H f14622a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f14623b;

        public b(H ownerModuleDescriptor, boolean z10) {
            C3862t.g(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f14622a = ownerModuleDescriptor;
            this.f14623b = z10;
        }

        public final H a() {
            return this.f14622a;
        }

        public final boolean b() {
            return this.f14623b;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14624a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f14617B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f14618C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f14619D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14624a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Gb.n storageManager, a kind) {
        super(storageManager);
        C3862t.g(storageManager, "storageManager");
        C3862t.g(kind, "kind");
        this.f14614h = kind;
        this.f14616j = storageManager.g(new h(this, storageManager));
        int i10 = c.f14624a[kind.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f(false);
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u I0(k kVar, Gb.n nVar) {
        F fR = kVar.r();
        C3862t.f(fR, "getBuiltInsModule(...)");
        return new u(fR, nVar, new j(kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b J0(k kVar) {
        Ba.a<b> aVar = kVar.f14615i;
        if (aVar == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b bVarInvoke = aVar.invoke();
        kVar.f14615i = null;
        return bVarInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b N0(H h10, boolean z10) {
        return new b(h10, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Oa.j
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public List<Ta.b> v() {
        Iterable<Ta.b> iterableV = super.v();
        C3862t.f(iterableV, "getClassDescriptorFactories(...)");
        Gb.n nVarU = U();
        C3862t.f(nVarU, "getStorageManager(...)");
        F fR = r();
        C3862t.f(fR, "getBuiltInsModule(...)");
        return kotlin.collections.r.E0(iterableV, new g(nVarU, fR, null, 4, null));
    }

    public final u L0() {
        return (u) Gb.m.a(this.f14616j, this, f14613k[0]);
    }

    @Override // Oa.j
    protected Ta.c M() {
        return L0();
    }

    public final void M0(H moduleDescriptor, boolean z10) {
        C3862t.g(moduleDescriptor, "moduleDescriptor");
        O0(new i(moduleDescriptor, z10));
    }

    public final void O0(Ba.a<b> computation) {
        C3862t.g(computation, "computation");
        this.f14615i = computation;
    }

    @Override // Oa.j
    protected Ta.a g() {
        return L0();
    }
}
