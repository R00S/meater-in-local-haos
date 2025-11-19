package jb;

import Db.B;
import Db.C1008n;
import Db.C1019z;
import Db.InterfaceC1007m;
import Db.InterfaceC1009o;
import Db.InterfaceC1016w;
import Qa.k;
import Ra.M;
import Ta.a;
import Ta.c;
import Ua.C1773l;
import ab.InterfaceC1961u;
import bb.InterfaceC2284j;
import db.C3095j;
import db.C3100o;
import gb.InterfaceC3459b;
import jb.InterfaceC3760D;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import yb.C5147c;
import zb.C5225b;

/* compiled from: DeserializationComponentsForJava.kt */
/* renamed from: jb.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3777k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f43646b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C1008n f43647a;

    /* compiled from: DeserializationComponentsForJava.kt */
    /* renamed from: jb.k$a */
    public static final class a {

        /* compiled from: DeserializationComponentsForJava.kt */
        /* renamed from: jb.k$a$a, reason: collision with other inner class name */
        public static final class C0564a {

            /* renamed from: a, reason: collision with root package name */
            private final C3777k f43648a;

            /* renamed from: b, reason: collision with root package name */
            private final n f43649b;

            public C0564a(C3777k deserializationComponentsForJava, n deserializedDescriptorResolver) {
                C3862t.g(deserializationComponentsForJava, "deserializationComponentsForJava");
                C3862t.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f43648a = deserializationComponentsForJava;
                this.f43649b = deserializedDescriptorResolver;
            }

            public final C3777k a() {
                return this.f43648a;
            }

            public final n b() {
                return this.f43649b;
            }
        }

        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final C0564a a(v kotlinClassFinder, v jvmBuiltInsKotlinClassFinder, InterfaceC1961u javaClassFinder, String moduleName, InterfaceC1016w errorReporter, InterfaceC3459b javaSourceElementFactory) {
            C3862t.g(kotlinClassFinder, "kotlinClassFinder");
            C3862t.g(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            C3862t.g(javaClassFinder, "javaClassFinder");
            C3862t.g(moduleName, "moduleName");
            C3862t.g(errorReporter, "errorReporter");
            C3862t.g(javaSourceElementFactory, "javaSourceElementFactory");
            Gb.f fVar = new Gb.f("DeserializationComponentsForJava.ModuleData");
            Qa.k kVar = new Qa.k(fVar, k.a.f14617B);
            qb.f fVarW = qb.f.w('<' + moduleName + '>');
            C3862t.f(fVarW, "special(...)");
            Ua.F f10 = new Ua.F(fVarW, fVar, kVar, null, null, null, 56, null);
            kVar.E0(f10);
            kVar.M0(f10, true);
            n nVar = new n();
            C3100o c3100o = new C3100o();
            M m10 = new M(fVar, f10);
            C3095j c3095jB = C3778l.b(javaClassFinder, f10, fVar, m10, kotlinClassFinder, nVar, errorReporter, javaSourceElementFactory, c3100o, (512 & 512) != 0 ? InterfaceC3760D.a.f43571a : null);
            C3777k c3777kA = C3778l.a(f10, fVar, m10, c3095jB, kotlinClassFinder, nVar, errorReporter, pb.e.f47733i);
            nVar.p(c3777kA);
            InterfaceC2284j EMPTY = InterfaceC2284j.f30726a;
            C3862t.f(EMPTY, "EMPTY");
            C5147c c5147c = new C5147c(c3095jB, EMPTY);
            c3100o.c(c5147c);
            Qa.w wVar = new Qa.w(fVar, jvmBuiltInsKotlinClassFinder, f10, m10, kVar.L0(), kVar.L0(), InterfaceC1009o.a.f3713a, Ib.p.f7000b.a(), new C5225b(fVar, kotlin.collections.r.m()));
            f10.X0(f10);
            f10.P0(new C1773l(kotlin.collections.r.p(c5147c.a(), wVar), "CompositeProvider@RuntimeModuleData for " + f10));
            return new C0564a(c3777kA, nVar);
        }

        private a() {
        }
    }

    public C3777k(Gb.n storageManager, Ra.H moduleDescriptor, InterfaceC1009o configuration, o classDataFinder, C3774h annotationAndConstantLoader, C3095j packageFragmentProvider, M notFoundClasses, InterfaceC1016w errorReporter, Za.c lookupTracker, InterfaceC1007m contractDeserializer, Ib.p kotlinTypeChecker, Kb.a typeAttributeTranslators) {
        Ta.c cVarL0;
        Ta.a aVarL0;
        C3862t.g(storageManager, "storageManager");
        C3862t.g(moduleDescriptor, "moduleDescriptor");
        C3862t.g(configuration, "configuration");
        C3862t.g(classDataFinder, "classDataFinder");
        C3862t.g(annotationAndConstantLoader, "annotationAndConstantLoader");
        C3862t.g(packageFragmentProvider, "packageFragmentProvider");
        C3862t.g(notFoundClasses, "notFoundClasses");
        C3862t.g(errorReporter, "errorReporter");
        C3862t.g(lookupTracker, "lookupTracker");
        C3862t.g(contractDeserializer, "contractDeserializer");
        C3862t.g(kotlinTypeChecker, "kotlinTypeChecker");
        C3862t.g(typeAttributeTranslators, "typeAttributeTranslators");
        Oa.j jVarQ = moduleDescriptor.q();
        Qa.k kVar = jVarQ instanceof Qa.k ? (Qa.k) jVarQ : null;
        this.f43647a = new C1008n(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, B.a.f3588a, errorReporter, lookupTracker, p.f43660a, kotlin.collections.r.m(), notFoundClasses, contractDeserializer, (kVar == null || (aVarL0 = kVar.L0()) == null) ? a.C0255a.f16659a : aVarL0, (kVar == null || (cVarL0 = kVar.L0()) == null) ? c.b.f16661a : cVarL0, pb.i.f47746a.a(), kotlinTypeChecker, new C5225b(storageManager, kotlin.collections.r.m()), typeAttributeTranslators.a(), C1019z.f3742a);
    }

    public final C1008n a() {
        return this.f43647a;
    }
}
