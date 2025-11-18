package jb;

import Db.InterfaceC1007m;
import Db.InterfaceC1009o;
import Db.InterfaceC1016w;
import Hb.C1112y;
import Ra.M;
import Ra.k0;
import Za.c;
import ab.C1923D;
import ab.C1944d;
import ab.InterfaceC1920A;
import ab.InterfaceC1961u;
import ab.InterfaceC1962v;
import bb.InterfaceC2283i;
import bb.InterfaceC2284j;
import db.C3089d;
import db.C3095j;
import db.InterfaceC3090e;
import db.InterfaceC3099n;
import gb.InterfaceC3459b;
import hb.InterfaceC3508a;
import ib.C3673g;
import ib.e0;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import zb.C5225b;

/* compiled from: DeserializationComponentsForJava.kt */
/* renamed from: jb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3778l {

    /* compiled from: DeserializationComponentsForJava.kt */
    /* renamed from: jb.l$a */
    public static final class a implements InterfaceC1920A {
        a() {
        }

        @Override // ab.InterfaceC1920A
        public List<InterfaceC3508a> a(qb.b classId) {
            C3862t.g(classId, "classId");
            return null;
        }
    }

    public static final C3777k a(Ra.H module, Gb.n storageManager, M notFoundClasses, C3095j lazyJavaPackageFragmentProvider, v reflectKotlinClassFinder, n deserializedDescriptorResolver, InterfaceC1016w errorReporter, pb.e jvmMetadataVersion) {
        C3862t.g(module, "module");
        C3862t.g(storageManager, "storageManager");
        C3862t.g(notFoundClasses, "notFoundClasses");
        C3862t.g(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        C3862t.g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        C3862t.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        C3862t.g(errorReporter, "errorReporter");
        C3862t.g(jvmMetadataVersion, "jvmMetadataVersion");
        return new C3777k(storageManager, module, InterfaceC1009o.a.f3713a, new o(reflectKotlinClassFinder, deserializedDescriptorResolver), C3775i.a(module, notFoundClasses, storageManager, reflectKotlinClassFinder, jvmMetadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, c.a.f19624a, InterfaceC1007m.f3689a.a(), Ib.p.f7000b.a(), new Kb.a(kotlin.collections.r.e(C1112y.f5816a)));
    }

    public static final C3095j b(InterfaceC1961u javaClassFinder, Ra.H module, Gb.n storageManager, M notFoundClasses, v reflectKotlinClassFinder, n deserializedDescriptorResolver, InterfaceC1016w errorReporter, InterfaceC3459b javaSourceElementFactory, InterfaceC3099n singleModuleClassResolver, InterfaceC3760D packagePartProvider) {
        C3862t.g(javaClassFinder, "javaClassFinder");
        C3862t.g(module, "module");
        C3862t.g(storageManager, "storageManager");
        C3862t.g(notFoundClasses, "notFoundClasses");
        C3862t.g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        C3862t.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        C3862t.g(errorReporter, "errorReporter");
        C3862t.g(javaSourceElementFactory, "javaSourceElementFactory");
        C3862t.g(singleModuleClassResolver, "singleModuleClassResolver");
        C3862t.g(packagePartProvider, "packagePartProvider");
        bb.o DO_NOTHING = bb.o.f30733a;
        C3862t.f(DO_NOTHING, "DO_NOTHING");
        InterfaceC2284j EMPTY = InterfaceC2284j.f30726a;
        C3862t.f(EMPTY, "EMPTY");
        InterfaceC2283i.a aVar = InterfaceC2283i.a.f30725a;
        C5225b c5225b = new C5225b(storageManager, kotlin.collections.r.m());
        k0.a aVar2 = k0.a.f15161a;
        c.a aVar3 = c.a.f19624a;
        Oa.o oVar = new Oa.o(module, notFoundClasses);
        C1923D.b bVar = C1923D.f20121d;
        C1944d c1944d = new C1944d(bVar.a());
        InterfaceC3090e.a aVar4 = InterfaceC3090e.a.f39903a;
        return new C3095j(new C3089d(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, aVar, c5225b, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, oVar, c1944d, new e0(new C3673g(aVar4)), InterfaceC1962v.a.f20273a, aVar4, Ib.p.f7000b.a(), bVar.a(), new a(), null, 8388608, null));
    }
}
