package sb;

import Ea.ObservableProperty;
import Hb.U;
import Ra.t0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.V;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import sb.InterfaceC4523b;
import sb.n;
import sb.w;
import vb.AbstractC4943g;

/* compiled from: DescriptorRendererOptionsImpl.kt */
/* loaded from: classes3.dex */
public final class z implements w {

    /* renamed from: Z, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f49637Z = {P.f(new kotlin.jvm.internal.A(P.b(z.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "withDefinedIn", "getWithDefinedIn()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "modifiers", "getModifiers()Ljava/util/Set;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "startFromName", "getStartFromName()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "debugMode", "getDebugMode()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "verbose", "getVerbose()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "unitReturnType", "getUnitReturnType()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "withoutReturnType", "getWithoutReturnType()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "enhancedTypes", "getEnhancedTypes()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderDefaultModality", "getRenderDefaultModality()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "receiverAfterName", "getReceiverAfterName()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), P.f(new kotlin.jvm.internal.A(P.b(z.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* renamed from: A, reason: collision with root package name */
    private final Ea.e f49638A;

    /* renamed from: B, reason: collision with root package name */
    private final Ea.e f49639B;

    /* renamed from: C, reason: collision with root package name */
    private final Ea.e f49640C;

    /* renamed from: D, reason: collision with root package name */
    private final Ea.e f49641D;

    /* renamed from: E, reason: collision with root package name */
    private final Ea.e f49642E;

    /* renamed from: F, reason: collision with root package name */
    private final Ea.e f49643F;

    /* renamed from: G, reason: collision with root package name */
    private final Ea.e f49644G;

    /* renamed from: H, reason: collision with root package name */
    private final Ea.e f49645H;

    /* renamed from: I, reason: collision with root package name */
    private final Ea.e f49646I;

    /* renamed from: J, reason: collision with root package name */
    private final Ea.e f49647J;

    /* renamed from: K, reason: collision with root package name */
    private final Ea.e f49648K;

    /* renamed from: L, reason: collision with root package name */
    private final Ea.e f49649L;

    /* renamed from: M, reason: collision with root package name */
    private final Ea.e f49650M;

    /* renamed from: N, reason: collision with root package name */
    private final Ea.e f49651N;

    /* renamed from: O, reason: collision with root package name */
    private final Ea.e f49652O;

    /* renamed from: P, reason: collision with root package name */
    private final Ea.e f49653P;

    /* renamed from: Q, reason: collision with root package name */
    private final Ea.e f49654Q;

    /* renamed from: R, reason: collision with root package name */
    private final Ea.e f49655R;

    /* renamed from: S, reason: collision with root package name */
    private final Ea.e f49656S;

    /* renamed from: T, reason: collision with root package name */
    private final Ea.e f49657T;

    /* renamed from: U, reason: collision with root package name */
    private final Ea.e f49658U;

    /* renamed from: V, reason: collision with root package name */
    private final Ea.e f49659V;

    /* renamed from: W, reason: collision with root package name */
    private final Ea.e f49660W;

    /* renamed from: X, reason: collision with root package name */
    private final Ea.e f49661X;

    /* renamed from: Y, reason: collision with root package name */
    private final Ea.e f49662Y;

    /* renamed from: a, reason: collision with root package name */
    private boolean f49663a;

    /* renamed from: b, reason: collision with root package name */
    private final Ea.e f49664b = r0(InterfaceC4523b.c.f49577a);

    /* renamed from: c, reason: collision with root package name */
    private final Ea.e f49665c;

    /* renamed from: d, reason: collision with root package name */
    private final Ea.e f49666d;

    /* renamed from: e, reason: collision with root package name */
    private final Ea.e f49667e;

    /* renamed from: f, reason: collision with root package name */
    private final Ea.e f49668f;

    /* renamed from: g, reason: collision with root package name */
    private final Ea.e f49669g;

    /* renamed from: h, reason: collision with root package name */
    private final Ea.e f49670h;

    /* renamed from: i, reason: collision with root package name */
    private final Ea.e f49671i;

    /* renamed from: j, reason: collision with root package name */
    private final Ea.e f49672j;

    /* renamed from: k, reason: collision with root package name */
    private final Ea.e f49673k;

    /* renamed from: l, reason: collision with root package name */
    private final Ea.e f49674l;

    /* renamed from: m, reason: collision with root package name */
    private final Ea.e f49675m;

    /* renamed from: n, reason: collision with root package name */
    private final Ea.e f49676n;

    /* renamed from: o, reason: collision with root package name */
    private final Ea.e f49677o;

    /* renamed from: p, reason: collision with root package name */
    private final Ea.e f49678p;

    /* renamed from: q, reason: collision with root package name */
    private final Ea.e f49679q;

    /* renamed from: r, reason: collision with root package name */
    private final Ea.e f49680r;

    /* renamed from: s, reason: collision with root package name */
    private final Ea.e f49681s;

    /* renamed from: t, reason: collision with root package name */
    private final Ea.e f49682t;

    /* renamed from: u, reason: collision with root package name */
    private final Ea.e f49683u;

    /* renamed from: v, reason: collision with root package name */
    private final Ea.e f49684v;

    /* renamed from: w, reason: collision with root package name */
    private final Ea.e f49685w;

    /* renamed from: x, reason: collision with root package name */
    private final Ea.e f49686x;

    /* renamed from: y, reason: collision with root package name */
    private final Ea.e f49687y;

    /* renamed from: z, reason: collision with root package name */
    private final Ea.e f49688z;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delegates.kt */
    public static final class a<T> extends ObservableProperty<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f49689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, z zVar) {
            super(obj);
            this.f49689b = zVar;
        }

        @Override // Ea.ObservableProperty
        protected boolean d(Ia.m<?> property, T t10, T t11) {
            C3862t.g(property, "property");
            if (this.f49689b.p0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public z() {
        Boolean bool = Boolean.TRUE;
        this.f49665c = r0(bool);
        this.f49666d = r0(bool);
        this.f49667e = r0(v.f49616D);
        Boolean bool2 = Boolean.FALSE;
        this.f49668f = r0(bool2);
        this.f49669g = r0(bool2);
        this.f49670h = r0(bool2);
        this.f49671i = r0(bool2);
        this.f49672j = r0(bool2);
        this.f49673k = r0(bool);
        this.f49674l = r0(bool2);
        this.f49675m = r0(bool2);
        this.f49676n = r0(bool2);
        this.f49677o = r0(bool);
        this.f49678p = r0(bool);
        this.f49679q = r0(bool2);
        this.f49680r = r0(bool2);
        this.f49681s = r0(bool2);
        this.f49682t = r0(bool2);
        this.f49683u = r0(bool2);
        this.f49684v = r0(null);
        this.f49685w = r0(bool2);
        this.f49686x = r0(bool2);
        this.f49687y = r0(x.f49635B);
        this.f49688z = r0(y.f49636B);
        this.f49638A = r0(bool);
        this.f49639B = r0(C.f49550C);
        this.f49640C = r0(n.b.a.f49602a);
        this.f49641D = r0(F.f49564B);
        this.f49642E = r0(D.f49554B);
        this.f49643F = r0(bool2);
        this.f49644G = r0(bool2);
        this.f49645H = r0(E.f49560C);
        this.f49646I = r0(bool2);
        this.f49647J = r0(bool2);
        this.f49648K = r0(V.d());
        this.f49649L = r0(C4521A.f49546a.a());
        this.f49650M = r0(null);
        this.f49651N = r0(EnumC4522a.f49568D);
        this.f49652O = r0(bool2);
        this.f49653P = r0(bool);
        this.f49654Q = r0(bool);
        this.f49655R = r0(bool2);
        this.f49656S = r0(bool2);
        this.f49657T = r0(bool);
        this.f49658U = r0(bool);
        this.f49659V = r0(bool2);
        this.f49660W = r0(bool2);
        this.f49661X = r0(bool2);
        this.f49662Y = r0(bool);
    }

    private final <T> Ea.e<z, T> r0(T t10) {
        Ea.a aVar = Ea.a.f4151a;
        return new a(t10, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U s0(U it) {
        C3862t.g(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v(t0 it) {
        C3862t.g(it, "it");
        return "...";
    }

    public boolean A() {
        return ((Boolean) this.f49671i.a(this, f49637Z[7])).booleanValue();
    }

    public InterfaceC4523b B() {
        return (InterfaceC4523b) this.f49664b.a(this, f49637Z[0]);
    }

    public Ba.l<t0, String> C() {
        return (Ba.l) this.f49688z.a(this, f49637Z[24]);
    }

    public boolean D() {
        return ((Boolean) this.f49647J.a(this, f49637Z[34])).booleanValue();
    }

    public Set<qb.c> E() {
        return (Set) this.f49648K.a(this, f49637Z[35]);
    }

    public boolean F() {
        return ((Boolean) this.f49657T.a(this, f49637Z[44])).booleanValue();
    }

    public boolean G() {
        return ((Boolean) this.f49683u.a(this, f49637Z[19])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.f49662Y.a(this, f49637Z[49])).booleanValue();
    }

    public Set<v> I() {
        return (Set) this.f49667e.a(this, f49637Z[3]);
    }

    public boolean J() {
        return ((Boolean) this.f49676n.a(this, f49637Z[12])).booleanValue();
    }

    public C K() {
        return (C) this.f49639B.a(this, f49637Z[26]);
    }

    public D L() {
        return (D) this.f49642E.a(this, f49637Z[29]);
    }

    public boolean M() {
        return ((Boolean) this.f49658U.a(this, f49637Z[45])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.f49660W.a(this, f49637Z[47])).booleanValue();
    }

    public E O() {
        return (E) this.f49645H.a(this, f49637Z[32]);
    }

    public Ba.l<AbstractC4943g<?>, String> P() {
        return (Ba.l) this.f49684v.a(this, f49637Z[20]);
    }

    public boolean Q() {
        return ((Boolean) this.f49643F.a(this, f49637Z[30])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f49656S.a(this, f49637Z[43])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f49644G.a(this, f49637Z[31])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f49679q.a(this, f49637Z[15])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f49653P.a(this, f49637Z[40])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f49646I.a(this, f49637Z[33])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f49678p.a(this, f49637Z[14])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f49677o.a(this, f49637Z[13])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f49680r.a(this, f49637Z[16])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f49655R.a(this, f49637Z[42])).booleanValue();
    }

    @Override // sb.w
    public void a(F f10) {
        C3862t.g(f10, "<set-?>");
        this.f49641D.b(this, f49637Z[28], f10);
    }

    public boolean a0() {
        return ((Boolean) this.f49654Q.a(this, f49637Z[41])).booleanValue();
    }

    @Override // sb.w
    public void b(Set<qb.c> set) {
        C3862t.g(set, "<set-?>");
        this.f49649L.b(this, f49637Z[36], set);
    }

    public boolean b0() {
        return ((Boolean) this.f49638A.a(this, f49637Z[25])).booleanValue();
    }

    @Override // sb.w
    public boolean c() {
        return w.a.b(this);
    }

    public boolean c0() {
        return ((Boolean) this.f49669g.a(this, f49637Z[5])).booleanValue();
    }

    @Override // sb.w
    public void d(boolean z10) {
        this.f49668f.b(this, f49637Z[4], Boolean.valueOf(z10));
    }

    public boolean d0() {
        return ((Boolean) this.f49668f.a(this, f49637Z[4])).booleanValue();
    }

    @Override // sb.w
    public void e(Set<? extends v> set) {
        C3862t.g(set, "<set-?>");
        this.f49667e.b(this, f49637Z[3], set);
    }

    public F e0() {
        return (F) this.f49641D.a(this, f49637Z[28]);
    }

    @Override // sb.w
    public void f(boolean z10) {
        this.f49665c.b(this, f49637Z[1], Boolean.valueOf(z10));
    }

    public Ba.l<U, U> f0() {
        return (Ba.l) this.f49687y.a(this, f49637Z[23]);
    }

    @Override // sb.w
    public boolean g() {
        return ((Boolean) this.f49675m.a(this, f49637Z[11])).booleanValue();
    }

    public boolean g0() {
        return ((Boolean) this.f49682t.a(this, f49637Z[18])).booleanValue();
    }

    @Override // sb.w
    public void h(D d10) {
        C3862t.g(d10, "<set-?>");
        this.f49642E.b(this, f49637Z[29], d10);
    }

    public boolean h0() {
        return ((Boolean) this.f49673k.a(this, f49637Z[9])).booleanValue();
    }

    @Override // sb.w
    public void i(boolean z10) {
        this.f49686x.b(this, f49637Z[22], Boolean.valueOf(z10));
    }

    public n.b i0() {
        return (n.b) this.f49640C.a(this, f49637Z[27]);
    }

    @Override // sb.w
    public void j(boolean z10) {
        this.f49670h.b(this, f49637Z[6], Boolean.valueOf(z10));
    }

    public boolean j0() {
        return ((Boolean) this.f49672j.a(this, f49637Z[8])).booleanValue();
    }

    @Override // sb.w
    public void k(boolean z10) {
        this.f49644G.b(this, f49637Z[31], Boolean.valueOf(z10));
    }

    public boolean k0() {
        return ((Boolean) this.f49665c.a(this, f49637Z[1])).booleanValue();
    }

    @Override // sb.w
    public void l(boolean z10) {
        this.f49643F.b(this, f49637Z[30], Boolean.valueOf(z10));
    }

    public boolean l0() {
        return ((Boolean) this.f49666d.a(this, f49637Z[2])).booleanValue();
    }

    @Override // sb.w
    public void m(InterfaceC4523b interfaceC4523b) {
        C3862t.g(interfaceC4523b, "<set-?>");
        this.f49664b.b(this, f49637Z[0], interfaceC4523b);
    }

    public boolean m0() {
        return ((Boolean) this.f49674l.a(this, f49637Z[10])).booleanValue();
    }

    @Override // sb.w
    public boolean n() {
        return w.a.a(this);
    }

    public boolean n0() {
        return ((Boolean) this.f49686x.a(this, f49637Z[22])).booleanValue();
    }

    @Override // sb.w
    public Set<qb.c> o() {
        return (Set) this.f49649L.a(this, f49637Z[36]);
    }

    public boolean o0() {
        return ((Boolean) this.f49685w.a(this, f49637Z[21])).booleanValue();
    }

    @Override // sb.w
    public boolean p() {
        return ((Boolean) this.f49670h.a(this, f49637Z[6])).booleanValue();
    }

    public final boolean p0() {
        return this.f49663a;
    }

    @Override // sb.w
    public EnumC4522a q() {
        return (EnumC4522a) this.f49651N.a(this, f49637Z[38]);
    }

    public final void q0() {
        this.f49663a = true;
    }

    @Override // sb.w
    public void r(boolean z10) {
        this.f49685w.b(this, f49637Z[21], Boolean.valueOf(z10));
    }

    public final z u() {
        z zVar = new z();
        Iterator itA = C3846c.a(z.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    C3862t.f(name, "getName(...)");
                    Ub.n.G(name, "is", false, 2, null);
                    Ia.d dVarB = P.b(z.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    C3862t.f(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        C3862t.f(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(zVar, zVar.r0(observableProperty.a(this, new kotlin.jvm.internal.G(dVarB, name2, sb2.toString()))));
                }
            }
        }
        return zVar;
    }

    public boolean w() {
        return ((Boolean) this.f49681s.a(this, f49637Z[17])).booleanValue();
    }

    public boolean x() {
        return ((Boolean) this.f49652O.a(this, f49637Z[39])).booleanValue();
    }

    public Ba.l<Sa.c, Boolean> y() {
        return (Ba.l) this.f49650M.a(this, f49637Z[37]);
    }

    public boolean z() {
        return ((Boolean) this.f49661X.a(this, f49637Z[48])).booleanValue();
    }
}
