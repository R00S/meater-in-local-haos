package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.List;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10632c;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10634e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10747f;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9940c;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10156h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.InterfaceC10242a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10289f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10373o;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10464z0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10401l;
import okhttp3.internal.http2.Http2;

/* compiled from: context.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.k */
/* loaded from: classes3.dex */
public final class C10301k {

    /* renamed from: a */
    private final InterfaceC10330n f39911a;

    /* renamed from: b */
    private final InterfaceC10592g0 f39912b;

    /* renamed from: c */
    private final InterfaceC10302l f39913c;

    /* renamed from: d */
    private final InterfaceC10298h f39914d;

    /* renamed from: e */
    private final InterfaceC10272c<InterfaceC10616c, AbstractC10211g<?>> f39915e;

    /* renamed from: f */
    private final InterfaceC10607l0 f39916f;

    /* renamed from: g */
    private final InterfaceC10312v f39917g;

    /* renamed from: h */
    private final InterfaceC10308r f39918h;

    /* renamed from: i */
    private final InterfaceC9940c f39919i;

    /* renamed from: j */
    private final InterfaceC10309s f39920j;

    /* renamed from: k */
    private final Iterable<InterfaceC10631b> f39921k;

    /* renamed from: l */
    private final C10601j0 f39922l;

    /* renamed from: m */
    private final InterfaceC10300j f39923m;

    /* renamed from: n */
    private final InterfaceC10630a f39924n;

    /* renamed from: o */
    private final InterfaceC10632c f39925o;

    /* renamed from: p */
    private final C10747f f39926p;

    /* renamed from: q */
    private final InterfaceC10401l f39927q;

    /* renamed from: r */
    private final InterfaceC10242a f39928r;

    /* renamed from: s */
    private final InterfaceC10634e f39929s;

    /* renamed from: t */
    private final List<InterfaceC10464z0> f39930t;

    /* renamed from: u */
    private final C10299i f39931u;

    /* JADX WARN: Multi-variable type inference failed */
    public C10301k(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, InterfaceC10302l interfaceC10302l, InterfaceC10298h interfaceC10298h, InterfaceC10272c<? extends InterfaceC10616c, ? extends AbstractC10211g<?>> interfaceC10272c, InterfaceC10607l0 interfaceC10607l0, InterfaceC10312v interfaceC10312v, InterfaceC10308r interfaceC10308r, InterfaceC9940c interfaceC9940c, InterfaceC10309s interfaceC10309s, Iterable<? extends InterfaceC10631b> iterable, C10601j0 c10601j0, InterfaceC10300j interfaceC10300j, InterfaceC10630a interfaceC10630a, InterfaceC10632c interfaceC10632c, C10747f c10747f, InterfaceC10401l interfaceC10401l, InterfaceC10242a interfaceC10242a, InterfaceC10634e interfaceC10634e, List<? extends InterfaceC10464z0> list) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10592g0, "moduleDescriptor");
        C9801m.m32346f(interfaceC10302l, "configuration");
        C9801m.m32346f(interfaceC10298h, "classDataFinder");
        C9801m.m32346f(interfaceC10272c, "annotationAndConstantLoader");
        C9801m.m32346f(interfaceC10607l0, "packageFragmentProvider");
        C9801m.m32346f(interfaceC10312v, "localClassifierTypeSettings");
        C9801m.m32346f(interfaceC10308r, "errorReporter");
        C9801m.m32346f(interfaceC9940c, "lookupTracker");
        C9801m.m32346f(interfaceC10309s, "flexibleTypeDeserializer");
        C9801m.m32346f(iterable, "fictitiousClassDescriptorFactories");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        C9801m.m32346f(interfaceC10300j, "contractDeserializer");
        C9801m.m32346f(interfaceC10630a, "additionalClassPartsProvider");
        C9801m.m32346f(interfaceC10632c, "platformDependentDeclarationFilter");
        C9801m.m32346f(c10747f, "extensionRegistryLite");
        C9801m.m32346f(interfaceC10401l, "kotlinTypeChecker");
        C9801m.m32346f(interfaceC10242a, "samConversionResolver");
        C9801m.m32346f(interfaceC10634e, "platformDependentTypeTransformer");
        C9801m.m32346f(list, "typeAttributeTranslators");
        this.f39911a = interfaceC10330n;
        this.f39912b = interfaceC10592g0;
        this.f39913c = interfaceC10302l;
        this.f39914d = interfaceC10298h;
        this.f39915e = interfaceC10272c;
        this.f39916f = interfaceC10607l0;
        this.f39917g = interfaceC10312v;
        this.f39918h = interfaceC10308r;
        this.f39919i = interfaceC9940c;
        this.f39920j = interfaceC10309s;
        this.f39921k = iterable;
        this.f39922l = c10601j0;
        this.f39923m = interfaceC10300j;
        this.f39924n = interfaceC10630a;
        this.f39925o = interfaceC10632c;
        this.f39926p = c10747f;
        this.f39927q = interfaceC10401l;
        this.f39928r = interfaceC10242a;
        this.f39929s = interfaceC10634e;
        this.f39930t = list;
        this.f39931u = new C10299i(this);
    }

    /* renamed from: a */
    public final C10303m m36416a(InterfaceC10604k0 interfaceC10604k0, InterfaceC10151c interfaceC10151c, C10155g c10155g, C10156h c10156h, AbstractC10149a abstractC10149a, InterfaceC10289f interfaceC10289f) {
        C9801m.m32346f(interfaceC10604k0, "descriptor");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        C9801m.m32346f(c10156h, "versionRequirementTable");
        C9801m.m32346f(abstractC10149a, "metadataVersion");
        return new C10303m(this, interfaceC10151c, interfaceC10604k0, c10155g, c10156h, abstractC10149a, interfaceC10289f, null, C10817u.m38888j());
    }

    /* renamed from: b */
    public final InterfaceC10585e m36417b(C10159b c10159b) {
        C9801m.m32346f(c10159b, "classId");
        return C10299i.m36408e(this.f39931u, c10159b, null, 2, null);
    }

    /* renamed from: c */
    public final InterfaceC10630a m36418c() {
        return this.f39924n;
    }

    /* renamed from: d */
    public final InterfaceC10272c<InterfaceC10616c, AbstractC10211g<?>> m36419d() {
        return this.f39915e;
    }

    /* renamed from: e */
    public final InterfaceC10298h m36420e() {
        return this.f39914d;
    }

    /* renamed from: f */
    public final C10299i m36421f() {
        return this.f39931u;
    }

    /* renamed from: g */
    public final InterfaceC10302l m36422g() {
        return this.f39913c;
    }

    /* renamed from: h */
    public final InterfaceC10300j m36423h() {
        return this.f39923m;
    }

    /* renamed from: i */
    public final InterfaceC10308r m36424i() {
        return this.f39918h;
    }

    /* renamed from: j */
    public final C10747f m36425j() {
        return this.f39926p;
    }

    /* renamed from: k */
    public final Iterable<InterfaceC10631b> m36426k() {
        return this.f39921k;
    }

    /* renamed from: l */
    public final InterfaceC10309s m36427l() {
        return this.f39920j;
    }

    /* renamed from: m */
    public final InterfaceC10401l m36428m() {
        return this.f39927q;
    }

    /* renamed from: n */
    public final InterfaceC10312v m36429n() {
        return this.f39917g;
    }

    /* renamed from: o */
    public final InterfaceC9940c m36430o() {
        return this.f39919i;
    }

    /* renamed from: p */
    public final InterfaceC10592g0 m36431p() {
        return this.f39912b;
    }

    /* renamed from: q */
    public final C10601j0 m36432q() {
        return this.f39922l;
    }

    /* renamed from: r */
    public final InterfaceC10607l0 m36433r() {
        return this.f39916f;
    }

    /* renamed from: s */
    public final InterfaceC10632c m36434s() {
        return this.f39925o;
    }

    /* renamed from: t */
    public final InterfaceC10634e m36435t() {
        return this.f39929s;
    }

    /* renamed from: u */
    public final InterfaceC10330n m36436u() {
        return this.f39911a;
    }

    /* renamed from: v */
    public final List<InterfaceC10464z0> m36437v() {
        return this.f39930t;
    }

    public /* synthetic */ C10301k(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, InterfaceC10302l interfaceC10302l, InterfaceC10298h interfaceC10298h, InterfaceC10272c interfaceC10272c, InterfaceC10607l0 interfaceC10607l0, InterfaceC10312v interfaceC10312v, InterfaceC10308r interfaceC10308r, InterfaceC9940c interfaceC9940c, InterfaceC10309s interfaceC10309s, Iterable iterable, C10601j0 c10601j0, InterfaceC10300j interfaceC10300j, InterfaceC10630a interfaceC10630a, InterfaceC10632c interfaceC10632c, C10747f c10747f, InterfaceC10401l interfaceC10401l, InterfaceC10242a interfaceC10242a, InterfaceC10634e interfaceC10634e, List list, int i2, C9789g c9789g) {
        this(interfaceC10330n, interfaceC10592g0, interfaceC10302l, interfaceC10298h, interfaceC10272c, interfaceC10607l0, interfaceC10312v, interfaceC10308r, interfaceC9940c, interfaceC10309s, iterable, c10601j0, interfaceC10300j, (i2 & 8192) != 0 ? InterfaceC10630a.a.f40889a : interfaceC10630a, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? InterfaceC10632c.a.f40890a : interfaceC10632c, c10747f, (65536 & i2) != 0 ? InterfaceC10401l.f40201b.m36950a() : interfaceC10401l, interfaceC10242a, (262144 & i2) != 0 ? InterfaceC10634e.a.f40893a : interfaceC10634e, (i2 & 524288) != 0 ? C10815t.m38883e(C10373o.f40157a) : list);
    }
}
