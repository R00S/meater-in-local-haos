package Db;

import Db.InterfaceC1015v;
import Fb.InterfaceC1037s;
import Hb.C1112y;
import Hb.t0;
import Ra.InterfaceC1692e;
import Ta.a;
import Ta.c;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import nb.AbstractC4075a;
import nb.InterfaceC4077c;
import vb.AbstractC4943g;
import zb.InterfaceC5224a;

/* compiled from: context.kt */
/* renamed from: Db.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1008n {

    /* renamed from: a, reason: collision with root package name */
    private final Gb.n f3692a;

    /* renamed from: b, reason: collision with root package name */
    private final Ra.H f3693b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1009o f3694c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1004j f3695d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC0999e<Sa.c, AbstractC4943g<?>> f3696e;

    /* renamed from: f, reason: collision with root package name */
    private final Ra.O f3697f;

    /* renamed from: g, reason: collision with root package name */
    private final B f3698g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1016w f3699h;

    /* renamed from: i, reason: collision with root package name */
    private final Za.c f3700i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1017x f3701j;

    /* renamed from: k, reason: collision with root package name */
    private final Iterable<Ta.b> f3702k;

    /* renamed from: l, reason: collision with root package name */
    private final Ra.M f3703l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC1007m f3704m;

    /* renamed from: n, reason: collision with root package name */
    private final Ta.a f3705n;

    /* renamed from: o, reason: collision with root package name */
    private final Ta.c f3706o;

    /* renamed from: p, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.f f3707p;

    /* renamed from: q, reason: collision with root package name */
    private final Ib.p f3708q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC5224a f3709r;

    /* renamed from: s, reason: collision with root package name */
    private final List<t0> f3710s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC1015v f3711t;

    /* renamed from: u, reason: collision with root package name */
    private final C1006l f3712u;

    /* JADX WARN: Multi-variable type inference failed */
    public C1008n(Gb.n storageManager, Ra.H moduleDescriptor, InterfaceC1009o configuration, InterfaceC1004j classDataFinder, InterfaceC0999e<? extends Sa.c, ? extends AbstractC4943g<?>> annotationAndConstantLoader, Ra.O packageFragmentProvider, B localClassifierTypeSettings, InterfaceC1016w errorReporter, Za.c lookupTracker, InterfaceC1017x flexibleTypeDeserializer, Iterable<? extends Ta.b> fictitiousClassDescriptorFactories, Ra.M notFoundClasses, InterfaceC1007m contractDeserializer, Ta.a additionalClassPartsProvider, Ta.c platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.protobuf.f extensionRegistryLite, Ib.p kotlinTypeChecker, InterfaceC5224a samConversionResolver, List<? extends t0> typeAttributeTranslators, InterfaceC1015v enumEntriesDeserializationSupport) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(moduleDescriptor, "moduleDescriptor");
        C3862t.g(configuration, "configuration");
        C3862t.g(classDataFinder, "classDataFinder");
        C3862t.g(annotationAndConstantLoader, "annotationAndConstantLoader");
        C3862t.g(packageFragmentProvider, "packageFragmentProvider");
        C3862t.g(localClassifierTypeSettings, "localClassifierTypeSettings");
        C3862t.g(errorReporter, "errorReporter");
        C3862t.g(lookupTracker, "lookupTracker");
        C3862t.g(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        C3862t.g(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        C3862t.g(notFoundClasses, "notFoundClasses");
        C3862t.g(contractDeserializer, "contractDeserializer");
        C3862t.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        C3862t.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C3862t.g(extensionRegistryLite, "extensionRegistryLite");
        C3862t.g(kotlinTypeChecker, "kotlinTypeChecker");
        C3862t.g(samConversionResolver, "samConversionResolver");
        C3862t.g(typeAttributeTranslators, "typeAttributeTranslators");
        C3862t.g(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f3692a = storageManager;
        this.f3693b = moduleDescriptor;
        this.f3694c = configuration;
        this.f3695d = classDataFinder;
        this.f3696e = annotationAndConstantLoader;
        this.f3697f = packageFragmentProvider;
        this.f3698g = localClassifierTypeSettings;
        this.f3699h = errorReporter;
        this.f3700i = lookupTracker;
        this.f3701j = flexibleTypeDeserializer;
        this.f3702k = fictitiousClassDescriptorFactories;
        this.f3703l = notFoundClasses;
        this.f3704m = contractDeserializer;
        this.f3705n = additionalClassPartsProvider;
        this.f3706o = platformDependentDeclarationFilter;
        this.f3707p = extensionRegistryLite;
        this.f3708q = kotlinTypeChecker;
        this.f3709r = samConversionResolver;
        this.f3710s = typeAttributeTranslators;
        this.f3711t = enumEntriesDeserializationSupport;
        this.f3712u = new C1006l(this);
    }

    public final C1010p a(Ra.N descriptor, InterfaceC4077c nameResolver, nb.g typeTable, nb.h versionRequirementTable, AbstractC4075a metadataVersion, InterfaceC1037s interfaceC1037s) {
        C3862t.g(descriptor, "descriptor");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        C3862t.g(versionRequirementTable, "versionRequirementTable");
        C3862t.g(metadataVersion, "metadataVersion");
        return new C1010p(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, interfaceC1037s, null, kotlin.collections.r.m());
    }

    public final InterfaceC1692e b(qb.b classId) {
        C3862t.g(classId, "classId");
        return C1006l.f(this.f3712u, classId, null, 2, null);
    }

    public final Ta.a c() {
        return this.f3705n;
    }

    public final InterfaceC0999e<Sa.c, AbstractC4943g<?>> d() {
        return this.f3696e;
    }

    public final InterfaceC1004j e() {
        return this.f3695d;
    }

    public final C1006l f() {
        return this.f3712u;
    }

    public final InterfaceC1009o g() {
        return this.f3694c;
    }

    public final InterfaceC1007m h() {
        return this.f3704m;
    }

    public final InterfaceC1015v i() {
        return this.f3711t;
    }

    public final InterfaceC1016w j() {
        return this.f3699h;
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.f k() {
        return this.f3707p;
    }

    public final Iterable<Ta.b> l() {
        return this.f3702k;
    }

    public final InterfaceC1017x m() {
        return this.f3701j;
    }

    public final Ib.p n() {
        return this.f3708q;
    }

    public final B o() {
        return this.f3698g;
    }

    public final Za.c p() {
        return this.f3700i;
    }

    public final Ra.H q() {
        return this.f3693b;
    }

    public final Ra.M r() {
        return this.f3703l;
    }

    public final Ra.O s() {
        return this.f3697f;
    }

    public final Ta.c t() {
        return this.f3706o;
    }

    public final Gb.n u() {
        return this.f3692a;
    }

    public final List<t0> v() {
        return this.f3710s;
    }

    public /* synthetic */ C1008n(Gb.n nVar, Ra.H h10, InterfaceC1009o interfaceC1009o, InterfaceC1004j interfaceC1004j, InterfaceC0999e interfaceC0999e, Ra.O o10, B b10, InterfaceC1016w interfaceC1016w, Za.c cVar, InterfaceC1017x interfaceC1017x, Iterable iterable, Ra.M m10, InterfaceC1007m interfaceC1007m, Ta.a aVar, Ta.c cVar2, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, Ib.p pVar, InterfaceC5224a interfaceC5224a, List list, InterfaceC1015v interfaceC1015v, int i10, C3854k c3854k) {
        this(nVar, h10, interfaceC1009o, interfaceC1004j, interfaceC0999e, o10, b10, interfaceC1016w, cVar, interfaceC1017x, iterable, m10, interfaceC1007m, (i10 & 8192) != 0 ? a.C0255a.f16659a : aVar, (i10 & 16384) != 0 ? c.a.f16660a : cVar2, fVar, (65536 & i10) != 0 ? Ib.p.f7000b.a() : pVar, interfaceC5224a, (262144 & i10) != 0 ? kotlin.collections.r.e(C1112y.f5816a) : list, (i10 & 524288) != 0 ? InterfaceC1015v.a.f3733a : interfaceC1015v);
    }
}
