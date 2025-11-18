package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.List;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9916j;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9940c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10077w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9950d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10050o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10070p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10074t;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9968f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9969g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9972j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9985b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9989f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9986c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9992i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC10017b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10054d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10062l;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.C10243b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10300j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10302l;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10373o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10401l;
import kotlin.reflect.p371y.internal.p374j0.p415l.p418v1.C10431a;

/* compiled from: DeserializationComponentsForJava.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.f */
/* loaded from: classes3.dex */
public final class C10090f {

    /* compiled from: DeserializationComponentsForJava.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.f$a */
    public static final class a implements InterfaceC10074t {
        a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10074t
        /* renamed from: a */
        public List<InterfaceC10019a> mo33803a(C10159b c10159b) {
            C9801m.m32346f(c10159b, "classId");
            return null;
        }
    }

    /* renamed from: a */
    public static final C10089e m33960a(InterfaceC10592g0 interfaceC10592g0, InterfaceC10330n interfaceC10330n, C10601j0 c10601j0, C9989f c9989f, InterfaceC10099o interfaceC10099o, C10091g c10091g, InterfaceC10308r interfaceC10308r) {
        C9801m.m32346f(interfaceC10592g0, "module");
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        C9801m.m32346f(c9989f, "lazyJavaPackageFragmentProvider");
        C9801m.m32346f(interfaceC10099o, "reflectKotlinClassFinder");
        C9801m.m32346f(c10091g, "deserializedDescriptorResolver");
        C9801m.m32346f(interfaceC10308r, "errorReporter");
        return new C10089e(interfaceC10330n, interfaceC10592g0, InterfaceC10302l.a.f39932a, new C10092h(interfaceC10099o, c10091g), new C10085c(interfaceC10592g0, c10601j0, interfaceC10330n, interfaceC10099o), c9989f, c10601j0, interfaceC10308r, InterfaceC9940c.a.f37749a, InterfaceC10300j.f39908a.m36415a(), InterfaceC10401l.f40201b.m36950a(), new C10431a(C10815t.m38883e(C10373o.f40157a)));
    }

    /* renamed from: b */
    public static final C9989f m33961b(InterfaceC10050o interfaceC10050o, InterfaceC10592g0 interfaceC10592g0, InterfaceC10330n interfaceC10330n, C10601j0 c10601j0, InterfaceC10099o interfaceC10099o, C10091g c10091g, InterfaceC10308r interfaceC10308r, InterfaceC10017b interfaceC10017b, InterfaceC9992i interfaceC9992i, InterfaceC10107w interfaceC10107w) {
        C9801m.m32346f(interfaceC10050o, "javaClassFinder");
        C9801m.m32346f(interfaceC10592g0, "module");
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        C9801m.m32346f(interfaceC10099o, "reflectKotlinClassFinder");
        C9801m.m32346f(c10091g, "deserializedDescriptorResolver");
        C9801m.m32346f(interfaceC10308r, "errorReporter");
        C9801m.m32346f(interfaceC10017b, "javaSourceElementFactory");
        C9801m.m32346f(interfaceC9992i, "singleModuleClassResolver");
        C9801m.m32346f(interfaceC10107w, "packagePartProvider");
        InterfaceC9972j interfaceC9972j = InterfaceC9972j.f37927a;
        C9801m.m32345e(interfaceC9972j, "DO_NOTHING");
        InterfaceC9969g interfaceC9969g = InterfaceC9969g.f37920a;
        C9801m.m32345e(interfaceC9969g, "EMPTY");
        InterfaceC9968f.a aVar = InterfaceC9968f.a.f37919a;
        C10243b c10243b = new C10243b(interfaceC10330n, C10817u.m38888j());
        InterfaceC10581c1.a aVar2 = InterfaceC10581c1.a.f40737a;
        InterfaceC9940c.a aVar3 = InterfaceC9940c.a.f37749a;
        C9916j c9916j = new C9916j(interfaceC10592g0, c10601j0);
        C10077w.b bVar = C10077w.f38316a;
        C9950d c9950d = new C9950d(bVar.m33821a());
        InterfaceC9986c.b bVar2 = InterfaceC9986c.b.f37988b;
        return new C9989f(new C9985b(interfaceC10330n, interfaceC10050o, interfaceC10099o, c10091g, interfaceC9972j, interfaceC10308r, interfaceC9969g, aVar, c10243b, interfaceC10017b, interfaceC9992i, interfaceC10107w, aVar2, aVar3, interfaceC10592g0, c9916j, c9950d, new C10062l(new C10054d(bVar2)), InterfaceC10070p.a.f38298a, bVar2, InterfaceC10401l.f40201b.m36950a(), bVar.m33821a(), new a(), null, 8388608, null));
    }
}
