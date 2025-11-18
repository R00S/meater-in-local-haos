package Sa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.M;
import kotlin.jvm.internal.C3854k;
import oa.v;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KotlinTarget.kt */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: D, reason: collision with root package name */
    public static final a f15654D;

    /* renamed from: E, reason: collision with root package name */
    private static final HashMap<String, r> f15656E;

    /* renamed from: F, reason: collision with root package name */
    private static final Set<r> f15658F;

    /* renamed from: F0, reason: collision with root package name */
    public static final r f15659F0;

    /* renamed from: G, reason: collision with root package name */
    private static final Set<r> f15660G;

    /* renamed from: H, reason: collision with root package name */
    private static final List<r> f15662H;

    /* renamed from: I, reason: collision with root package name */
    private static final List<r> f15664I;

    /* renamed from: J, reason: collision with root package name */
    private static final List<r> f15666J;

    /* renamed from: K, reason: collision with root package name */
    private static final List<r> f15668K;

    /* renamed from: L, reason: collision with root package name */
    private static final List<r> f15670L;

    /* renamed from: L0, reason: collision with root package name */
    private static final /* synthetic */ r[] f15671L0;

    /* renamed from: M, reason: collision with root package name */
    private static final List<r> f15672M;

    /* renamed from: M0, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f15673M0;

    /* renamed from: N, reason: collision with root package name */
    private static final List<r> f15674N;

    /* renamed from: O, reason: collision with root package name */
    private static final List<r> f15675O;

    /* renamed from: P, reason: collision with root package name */
    private static final List<r> f15676P;

    /* renamed from: Q, reason: collision with root package name */
    private static final List<r> f15677Q;

    /* renamed from: R, reason: collision with root package name */
    private static final List<r> f15678R;

    /* renamed from: S, reason: collision with root package name */
    private static final List<r> f15679S;

    /* renamed from: T, reason: collision with root package name */
    private static final Map<e, r> f15680T;

    /* renamed from: X, reason: collision with root package name */
    public static final r f15684X;

    /* renamed from: Y, reason: collision with root package name */
    public static final r f15685Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final r f15686Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final r f15687a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final r f15688b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final r f15689c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final r f15690d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final r f15691e0;

    /* renamed from: B, reason: collision with root package name */
    private final String f15713B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f15714C;

    /* renamed from: U, reason: collision with root package name */
    public static final r f15681U = new r("CLASS", 0, "class", false, 2, null);

    /* renamed from: V, reason: collision with root package name */
    public static final r f15682V = new r("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);

    /* renamed from: W, reason: collision with root package name */
    public static final r f15683W = new r("TYPE_PARAMETER", 2, "type parameter", false);

    /* renamed from: f0, reason: collision with root package name */
    public static final r f15692f0 = new r("TYPE", 11, "type usage", false);

    /* renamed from: g0, reason: collision with root package name */
    public static final r f15693g0 = new r("EXPRESSION", 12, "expression", false);

    /* renamed from: h0, reason: collision with root package name */
    public static final r f15694h0 = new r("FILE", 13, "file", false);

    /* renamed from: i0, reason: collision with root package name */
    public static final r f15695i0 = new r("TYPEALIAS", 14, "typealias", false);

    /* renamed from: j0, reason: collision with root package name */
    public static final r f15696j0 = new r("TYPE_PROJECTION", 15, "type projection", false);

    /* renamed from: k0, reason: collision with root package name */
    public static final r f15697k0 = new r("STAR_PROJECTION", 16, "star projection", false);

    /* renamed from: l0, reason: collision with root package name */
    public static final r f15698l0 = new r("PROPERTY_PARAMETER", 17, "property constructor parameter", false);

    /* renamed from: m0, reason: collision with root package name */
    public static final r f15699m0 = new r("CLASS_ONLY", 18, "class", false);

    /* renamed from: n0, reason: collision with root package name */
    public static final r f15700n0 = new r("OBJECT", 19, "object", false);

    /* renamed from: o0, reason: collision with root package name */
    public static final r f15701o0 = new r("STANDALONE_OBJECT", 20, "standalone object", false);

    /* renamed from: p0, reason: collision with root package name */
    public static final r f15702p0 = new r("COMPANION_OBJECT", 21, "companion object", false);

    /* renamed from: q0, reason: collision with root package name */
    public static final r f15703q0 = new r("INTERFACE", 22, "interface", false);

    /* renamed from: r0, reason: collision with root package name */
    public static final r f15704r0 = new r("ENUM_CLASS", 23, "enum class", false);

    /* renamed from: s0, reason: collision with root package name */
    public static final r f15705s0 = new r("ENUM_ENTRY", 24, "enum entry", false);

    /* renamed from: t0, reason: collision with root package name */
    public static final r f15706t0 = new r("LOCAL_CLASS", 25, "local class", false);

    /* renamed from: u0, reason: collision with root package name */
    public static final r f15707u0 = new r("LOCAL_FUNCTION", 26, "local function", false);

    /* renamed from: v0, reason: collision with root package name */
    public static final r f15708v0 = new r("MEMBER_FUNCTION", 27, "member function", false);

    /* renamed from: w0, reason: collision with root package name */
    public static final r f15709w0 = new r("TOP_LEVEL_FUNCTION", 28, "top level function", false);

    /* renamed from: x0, reason: collision with root package name */
    public static final r f15710x0 = new r("MEMBER_PROPERTY", 29, "member property", false);

    /* renamed from: y0, reason: collision with root package name */
    public static final r f15711y0 = new r("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);

    /* renamed from: z0, reason: collision with root package name */
    public static final r f15712z0 = new r("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);

    /* renamed from: A0, reason: collision with root package name */
    public static final r f15651A0 = new r("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);

    /* renamed from: B0, reason: collision with root package name */
    public static final r f15652B0 = new r("TOP_LEVEL_PROPERTY", 33, "top level property", false);

    /* renamed from: C0, reason: collision with root package name */
    public static final r f15653C0 = new r("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);

    /* renamed from: D0, reason: collision with root package name */
    public static final r f15655D0 = new r("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);

    /* renamed from: E0, reason: collision with root package name */
    public static final r f15657E0 = new r("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);

    /* renamed from: G0, reason: collision with root package name */
    public static final r f15661G0 = new r("INITIALIZER", 38, "initializer", false);

    /* renamed from: H0, reason: collision with root package name */
    public static final r f15663H0 = new r("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);

    /* renamed from: I0, reason: collision with root package name */
    public static final r f15665I0 = new r("LAMBDA_EXPRESSION", 40, "lambda expression", false);

    /* renamed from: J0, reason: collision with root package name */
    public static final r f15667J0 = new r("ANONYMOUS_FUNCTION", 41, "anonymous function", false);

    /* renamed from: K0, reason: collision with root package name */
    public static final r f15669K0 = new r("OBJECT_LITERAL", 42, "object literal", false);

    /* compiled from: KotlinTarget.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    static {
        int i10 = 2;
        C3854k c3854k = null;
        boolean z10 = false;
        f15684X = new r("PROPERTY", 3, "property", z10, i10, c3854k);
        int i11 = 2;
        C3854k c3854k2 = null;
        boolean z11 = false;
        f15685Y = new r("FIELD", 4, "field", z11, i11, c3854k2);
        f15686Z = new r("LOCAL_VARIABLE", 5, "local variable", z10, i10, c3854k);
        f15687a0 = new r("VALUE_PARAMETER", 6, "value parameter", z11, i11, c3854k2);
        f15688b0 = new r("CONSTRUCTOR", 7, "constructor", z10, i10, c3854k);
        f15689c0 = new r("FUNCTION", 8, "function", z11, i11, c3854k2);
        f15690d0 = new r("PROPERTY_GETTER", 9, "getter", z10, i10, c3854k);
        f15691e0 = new r("PROPERTY_SETTER", 10, "setter", z11, i11, c3854k2);
        f15659F0 = new r("BACKING_FIELD", 37, "backing field", z10, i10, c3854k);
        r[] rVarArrC = c();
        f15671L0 = rVarArrC;
        f15673M0 = C4929b.a(rVarArrC);
        f15654D = new a(null);
        f15656E = new HashMap<>();
        for (r rVar : j()) {
            f15656E.put(rVar.name(), rVar);
        }
        InterfaceC4928a<r> interfaceC4928aJ = j();
        ArrayList arrayList = new ArrayList();
        for (r rVar2 : interfaceC4928aJ) {
            if (rVar2.f15714C) {
                arrayList.add(rVar2);
            }
        }
        f15658F = kotlin.collections.r.b1(arrayList);
        f15660G = kotlin.collections.r.b1(j());
        r rVar3 = f15682V;
        r rVar4 = f15681U;
        f15662H = kotlin.collections.r.p(rVar3, rVar4);
        f15664I = kotlin.collections.r.p(f15706t0, rVar4);
        f15666J = kotlin.collections.r.p(f15699m0, rVar4);
        r rVar5 = f15702p0;
        r rVar6 = f15700n0;
        f15668K = kotlin.collections.r.p(rVar5, rVar6, rVar4);
        f15670L = kotlin.collections.r.p(f15701o0, rVar6, rVar4);
        f15672M = kotlin.collections.r.p(f15703q0, rVar4);
        f15674N = kotlin.collections.r.p(f15704r0, rVar4);
        r rVar7 = f15705s0;
        r rVar8 = f15684X;
        r rVar9 = f15685Y;
        f15675O = kotlin.collections.r.p(rVar7, rVar8, rVar9);
        r rVar10 = f15691e0;
        f15676P = kotlin.collections.r.e(rVar10);
        r rVar11 = f15690d0;
        f15677Q = kotlin.collections.r.e(rVar11);
        f15678R = kotlin.collections.r.e(f15689c0);
        r rVar12 = f15694h0;
        f15679S = kotlin.collections.r.e(rVar12);
        e eVar = e.f15618I;
        r rVar13 = f15687a0;
        f15680T = M.k(v.a(eVar, rVar13), v.a(e.f15612C, rVar9), v.a(e.f15614E, rVar8), v.a(e.f15613D, rVar12), v.a(e.f15615F, rVar11), v.a(e.f15616G, rVar10), v.a(e.f15617H, rVar13), v.a(e.f15619J, rVar13), v.a(e.f15620K, rVar9));
    }

    private r(String str, int i10, String str2, boolean z10) {
        this.f15713B = str2;
        this.f15714C = z10;
    }

    private static final /* synthetic */ r[] c() {
        return new r[]{f15681U, f15682V, f15683W, f15684X, f15685Y, f15686Z, f15687a0, f15688b0, f15689c0, f15690d0, f15691e0, f15692f0, f15693g0, f15694h0, f15695i0, f15696j0, f15697k0, f15698l0, f15699m0, f15700n0, f15701o0, f15702p0, f15703q0, f15704r0, f15705s0, f15706t0, f15707u0, f15708v0, f15709w0, f15710x0, f15711y0, f15712z0, f15651A0, f15652B0, f15653C0, f15655D0, f15657E0, f15659F0, f15661G0, f15663H0, f15665I0, f15667J0, f15669K0};
    }

    public static InterfaceC4928a<r> j() {
        return f15673M0;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f15671L0.clone();
    }

    /* synthetic */ r(String str, int i10, String str2, boolean z10, int i11, C3854k c3854k) {
        this(str, i10, str2, (i11 & 2) != 0 ? true : z10);
    }
}
