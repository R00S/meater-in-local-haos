package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9908b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10134m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p395y.C10146a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p395y.C10148c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10307q;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: BuiltInsPackageFragmentImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.f0.c */
/* loaded from: classes3.dex */
public final class C10281c extends AbstractC10307q implements InterfaceC9908b {

    /* renamed from: s */
    public static final a f39756s = new a(null);

    /* renamed from: t */
    private final boolean f39757t;

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.f0.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10281c m36250a(C10160c c10160c, InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, InputStream inputStream, boolean z) throws IOException {
            C9801m.m32346f(c10160c, "fqName");
            C9801m.m32346f(interfaceC10330n, "storageManager");
            C9801m.m32346f(interfaceC10592g0, "module");
            C9801m.m32346f(inputStream, "inputStream");
            Pair<C10134m, C10146a> pairM35357a = C10148c.m35357a(inputStream);
            C10134m c10134mM37646a = pairM35357a.m37646a();
            C10146a c10146aM37647b = pairM35357a.m37647b();
            if (c10134mM37646a != null) {
                return new C10281c(c10160c, interfaceC10330n, interfaceC10592g0, c10134mM37646a, c10146aM37647b, z, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C10146a.f39169h + ", actual " + c10146aM37647b + ". Please update Kotlin");
        }
    }

    private C10281c(C10160c c10160c, InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, C10134m c10134m, C10146a c10146a, boolean z) {
        super(c10160c, interfaceC10330n, interfaceC10592g0, c10134m, c10146a, null);
        this.f39757t = z;
    }

    public /* synthetic */ C10281c(C10160c c10160c, InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, C10134m c10134m, C10146a c10146a, boolean z, C9789g c9789g) {
        this(c10160c, interfaceC10330n, interfaceC10592g0, c10134m, c10146a, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10676z, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j
    public String toString() {
        return "builtins package fragment for " + mo37712d() + " from " + C10235a.m36078l(this);
    }
}
