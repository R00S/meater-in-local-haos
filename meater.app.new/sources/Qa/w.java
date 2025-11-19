package Qa;

import Db.AbstractC0997c;
import Db.B;
import Db.C1000f;
import Db.C1008n;
import Db.C1011q;
import Db.C1019z;
import Db.InterfaceC1007m;
import Db.InterfaceC1009o;
import Db.InterfaceC1016w;
import Db.InterfaceC1017x;
import Ra.H;
import Ra.M;
import Za.c;
import java.io.InputStream;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import zb.InterfaceC5224a;

/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* loaded from: classes3.dex */
public final class w extends AbstractC0997c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f14657f = new a(null);

    /* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Gb.n storageManager, jb.v finder, H moduleDescriptor, M notFoundClasses, Ta.a additionalClassPartsProvider, Ta.c platformDependentDeclarationFilter, InterfaceC1009o deserializationConfiguration, Ib.p kotlinTypeChecker, InterfaceC5224a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        C3862t.g(storageManager, "storageManager");
        C3862t.g(finder, "finder");
        C3862t.g(moduleDescriptor, "moduleDescriptor");
        C3862t.g(notFoundClasses, "notFoundClasses");
        C3862t.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        C3862t.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C3862t.g(deserializationConfiguration, "deserializationConfiguration");
        C3862t.g(kotlinTypeChecker, "kotlinTypeChecker");
        C3862t.g(samConversionResolver, "samConversionResolver");
        C1011q c1011q = new C1011q(this);
        Eb.a aVar = Eb.a.f4154r;
        C1000f c1000f = new C1000f(moduleDescriptor, notFoundClasses, aVar);
        B.a aVar2 = B.a.f3588a;
        InterfaceC1016w DO_NOTHING = InterfaceC1016w.f3734a;
        C3862t.f(DO_NOTHING, "DO_NOTHING");
        k(new C1008n(storageManager, moduleDescriptor, deserializationConfiguration, c1011q, c1000f, this, aVar2, DO_NOTHING, c.a.f19624a, InterfaceC1017x.a.f3735a, kotlin.collections.r.p(new Pa.a(storageManager, moduleDescriptor), new g(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, InterfaceC1007m.f3689a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.e(), kotlinTypeChecker, samConversionResolver, null, C1019z.f3742a, 262144, null));
    }

    @Override // Db.AbstractC0997c
    protected Db.r e(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        InputStream inputStreamA = h().a(fqName);
        if (inputStreamA != null) {
            return Eb.c.f4156P.a(fqName, j(), i(), inputStreamA, false);
        }
        return null;
    }
}
