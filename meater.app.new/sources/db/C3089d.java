package db;

import Db.InterfaceC1016w;
import Ra.H;
import Ra.k0;
import ab.C1923D;
import ab.C1944d;
import ab.InterfaceC1920A;
import ab.InterfaceC1961u;
import ab.InterfaceC1962v;
import bb.InterfaceC2283i;
import bb.InterfaceC2284j;
import gb.InterfaceC3459b;
import ib.e0;
import jb.InterfaceC3760D;
import jb.v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import yb.InterfaceC5150f;
import zb.InterfaceC5224a;

/* compiled from: context.kt */
/* renamed from: db.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3089d {

    /* renamed from: a, reason: collision with root package name */
    private final Gb.n f39879a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1961u f39880b;

    /* renamed from: c, reason: collision with root package name */
    private final v f39881c;

    /* renamed from: d, reason: collision with root package name */
    private final jb.n f39882d;

    /* renamed from: e, reason: collision with root package name */
    private final bb.o f39883e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1016w f39884f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC2284j f39885g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC2283i f39886h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC5224a f39887i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3459b f39888j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3099n f39889k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3760D f39890l;

    /* renamed from: m, reason: collision with root package name */
    private final k0 f39891m;

    /* renamed from: n, reason: collision with root package name */
    private final Za.c f39892n;

    /* renamed from: o, reason: collision with root package name */
    private final H f39893o;

    /* renamed from: p, reason: collision with root package name */
    private final Oa.o f39894p;

    /* renamed from: q, reason: collision with root package name */
    private final C1944d f39895q;

    /* renamed from: r, reason: collision with root package name */
    private final e0 f39896r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC1962v f39897s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3090e f39898t;

    /* renamed from: u, reason: collision with root package name */
    private final Ib.p f39899u;

    /* renamed from: v, reason: collision with root package name */
    private final C1923D f39900v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC1920A f39901w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC5150f f39902x;

    public C3089d(Gb.n storageManager, InterfaceC1961u finder, v kotlinClassFinder, jb.n deserializedDescriptorResolver, bb.o signaturePropagator, InterfaceC1016w errorReporter, InterfaceC2284j javaResolverCache, InterfaceC2283i javaPropertyInitializerEvaluator, InterfaceC5224a samConversionResolver, InterfaceC3459b sourceElementFactory, InterfaceC3099n moduleClassResolver, InterfaceC3760D packagePartProvider, k0 supertypeLoopChecker, Za.c lookupTracker, H module, Oa.o reflectionTypes, C1944d annotationTypeQualifierResolver, e0 signatureEnhancement, InterfaceC1962v javaClassesTracker, InterfaceC3090e settings, Ib.p kotlinTypeChecker, C1923D javaTypeEnhancementState, InterfaceC1920A javaModuleResolver, InterfaceC5150f syntheticPartsProvider) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(finder, "finder");
        C3862t.g(kotlinClassFinder, "kotlinClassFinder");
        C3862t.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        C3862t.g(signaturePropagator, "signaturePropagator");
        C3862t.g(errorReporter, "errorReporter");
        C3862t.g(javaResolverCache, "javaResolverCache");
        C3862t.g(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        C3862t.g(samConversionResolver, "samConversionResolver");
        C3862t.g(sourceElementFactory, "sourceElementFactory");
        C3862t.g(moduleClassResolver, "moduleClassResolver");
        C3862t.g(packagePartProvider, "packagePartProvider");
        C3862t.g(supertypeLoopChecker, "supertypeLoopChecker");
        C3862t.g(lookupTracker, "lookupTracker");
        C3862t.g(module, "module");
        C3862t.g(reflectionTypes, "reflectionTypes");
        C3862t.g(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        C3862t.g(signatureEnhancement, "signatureEnhancement");
        C3862t.g(javaClassesTracker, "javaClassesTracker");
        C3862t.g(settings, "settings");
        C3862t.g(kotlinTypeChecker, "kotlinTypeChecker");
        C3862t.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        C3862t.g(javaModuleResolver, "javaModuleResolver");
        C3862t.g(syntheticPartsProvider, "syntheticPartsProvider");
        this.f39879a = storageManager;
        this.f39880b = finder;
        this.f39881c = kotlinClassFinder;
        this.f39882d = deserializedDescriptorResolver;
        this.f39883e = signaturePropagator;
        this.f39884f = errorReporter;
        this.f39885g = javaResolverCache;
        this.f39886h = javaPropertyInitializerEvaluator;
        this.f39887i = samConversionResolver;
        this.f39888j = sourceElementFactory;
        this.f39889k = moduleClassResolver;
        this.f39890l = packagePartProvider;
        this.f39891m = supertypeLoopChecker;
        this.f39892n = lookupTracker;
        this.f39893o = module;
        this.f39894p = reflectionTypes;
        this.f39895q = annotationTypeQualifierResolver;
        this.f39896r = signatureEnhancement;
        this.f39897s = javaClassesTracker;
        this.f39898t = settings;
        this.f39899u = kotlinTypeChecker;
        this.f39900v = javaTypeEnhancementState;
        this.f39901w = javaModuleResolver;
        this.f39902x = syntheticPartsProvider;
    }

    public final C1944d a() {
        return this.f39895q;
    }

    public final jb.n b() {
        return this.f39882d;
    }

    public final InterfaceC1016w c() {
        return this.f39884f;
    }

    public final InterfaceC1961u d() {
        return this.f39880b;
    }

    public final InterfaceC1962v e() {
        return this.f39897s;
    }

    public final InterfaceC1920A f() {
        return this.f39901w;
    }

    public final InterfaceC2283i g() {
        return this.f39886h;
    }

    public final InterfaceC2284j h() {
        return this.f39885g;
    }

    public final C1923D i() {
        return this.f39900v;
    }

    public final v j() {
        return this.f39881c;
    }

    public final Ib.p k() {
        return this.f39899u;
    }

    public final Za.c l() {
        return this.f39892n;
    }

    public final H m() {
        return this.f39893o;
    }

    public final InterfaceC3099n n() {
        return this.f39889k;
    }

    public final InterfaceC3760D o() {
        return this.f39890l;
    }

    public final Oa.o p() {
        return this.f39894p;
    }

    public final InterfaceC3090e q() {
        return this.f39898t;
    }

    public final e0 r() {
        return this.f39896r;
    }

    public final bb.o s() {
        return this.f39883e;
    }

    public final InterfaceC3459b t() {
        return this.f39888j;
    }

    public final Gb.n u() {
        return this.f39879a;
    }

    public final k0 v() {
        return this.f39891m;
    }

    public final InterfaceC5150f w() {
        return this.f39902x;
    }

    public final C3089d x(InterfaceC2284j javaResolverCache) {
        C3862t.g(javaResolverCache, "javaResolverCache");
        return new C3089d(this.f39879a, this.f39880b, this.f39881c, this.f39882d, this.f39883e, this.f39884f, javaResolverCache, this.f39886h, this.f39887i, this.f39888j, this.f39889k, this.f39890l, this.f39891m, this.f39892n, this.f39893o, this.f39894p, this.f39895q, this.f39896r, this.f39897s, this.f39898t, this.f39899u, this.f39900v, this.f39901w, null, 8388608, null);
    }

    public /* synthetic */ C3089d(Gb.n nVar, InterfaceC1961u interfaceC1961u, v vVar, jb.n nVar2, bb.o oVar, InterfaceC1016w interfaceC1016w, InterfaceC2284j interfaceC2284j, InterfaceC2283i interfaceC2283i, InterfaceC5224a interfaceC5224a, InterfaceC3459b interfaceC3459b, InterfaceC3099n interfaceC3099n, InterfaceC3760D interfaceC3760D, k0 k0Var, Za.c cVar, H h10, Oa.o oVar2, C1944d c1944d, e0 e0Var, InterfaceC1962v interfaceC1962v, InterfaceC3090e interfaceC3090e, Ib.p pVar, C1923D c1923d, InterfaceC1920A interfaceC1920A, InterfaceC5150f interfaceC5150f, int i10, C3854k c3854k) {
        this(nVar, interfaceC1961u, vVar, nVar2, oVar, interfaceC1016w, interfaceC2284j, interfaceC2283i, interfaceC5224a, interfaceC3459b, interfaceC3099n, interfaceC3760D, k0Var, cVar, h10, oVar2, c1944d, e0Var, interfaceC1962v, interfaceC3090e, pVar, c1923d, interfaceC1920A, (i10 & 8388608) != 0 ? InterfaceC5150f.f53279a.a() : interfaceC5150f);
    }
}
