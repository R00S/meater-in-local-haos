package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import com.google.android.gms.ads.AdRequest;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10632c;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10653i;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10674x;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9932f;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9934h;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9940c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10050o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9969g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9989f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9993j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC10017b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10107w;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10238c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.C10243b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10301k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10300j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10302l;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10312v;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10322f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10401l;
import kotlin.reflect.p371y.internal.p374j0.p415l.p418v1.C10431a;

/* compiled from: DeserializationComponentsForJava.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.e */
/* loaded from: classes3.dex */
public final class C10089e {

    /* renamed from: a */
    public static final a f38441a = new a(null);

    /* renamed from: b */
    private final C10301k f38442b;

    /* compiled from: DeserializationComponentsForJava.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.e$a */
    public static final class a {

        /* compiled from: DeserializationComponentsForJava.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.e$a$a, reason: collision with other inner class name */
        public static final class C11550a {

            /* renamed from: a */
            private final C10089e f38443a;

            /* renamed from: b */
            private final C10091g f38444b;

            public C11550a(C10089e c10089e, C10091g c10091g) {
                C9801m.m32346f(c10089e, "deserializationComponentsForJava");
                C9801m.m32346f(c10091g, "deserializedDescriptorResolver");
                this.f38443a = c10089e;
                this.f38444b = c10091g;
            }

            /* renamed from: a */
            public final C10089e m33958a() {
                return this.f38443a;
            }

            /* renamed from: b */
            public final C10091g m33959b() {
                return this.f38444b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C11550a m33957a(InterfaceC10099o interfaceC10099o, InterfaceC10099o interfaceC10099o2, InterfaceC10050o interfaceC10050o, String str, InterfaceC10308r interfaceC10308r, InterfaceC10017b interfaceC10017b) {
            C9801m.m32346f(interfaceC10099o, "kotlinClassFinder");
            C9801m.m32346f(interfaceC10099o2, "jvmBuiltInsKotlinClassFinder");
            C9801m.m32346f(interfaceC10050o, "javaClassFinder");
            C9801m.m32346f(str, "moduleName");
            C9801m.m32346f(interfaceC10308r, "errorReporter");
            C9801m.m32346f(interfaceC10017b, "javaSourceElementFactory");
            C10322f c10322f = new C10322f("DeserializationComponentsForJava.ModuleData");
            C9932f c9932f = new C9932f(c10322f, C9932f.a.FROM_DEPENDENCIES);
            C10163f c10163fM35451D = C10163f.m35451D('<' + str + '>');
            C9801m.m32345e(c10163fM35451D, "special(\"<$moduleName>\")");
            C10674x c10674x = new C10674x(c10163fM35451D, c10322f, c9932f, null, null, null, 56, null);
            c9932f.m32769D0(c10674x);
            c9932f.m32956I0(c10674x, true);
            C10091g c10091g = new C10091g();
            C9993j c9993j = new C9993j();
            C10601j0 c10601j0 = new C10601j0(c10322f, c10674x);
            C9989f c9989fM33961b = C10090f.m33961b(interfaceC10050o, c10674x, c10322f, c10601j0, interfaceC10099o, c10091g, interfaceC10308r, interfaceC10017b, c9993j, (AdRequest.MAX_CONTENT_URL_LENGTH & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? InterfaceC10107w.a.f38487a : null);
            C10089e c10089eM33960a = C10090f.m33960a(c10674x, c10322f, c10601j0, c9989fM33961b, interfaceC10099o, c10091g, interfaceC10308r);
            c10091g.m33974l(c10089eM33960a);
            InterfaceC9969g interfaceC9969g = InterfaceC9969g.f37920a;
            C9801m.m32345e(interfaceC9969g, "EMPTY");
            C10238c c10238c = new C10238c(c9989fM33961b, interfaceC9969g);
            c9993j.m33297c(c10238c);
            C9934h c9934h = new C9934h(c10322f, interfaceC10099o2, c10674x, c10601j0, c9932f.m32955H0(), c9932f.m32955H0(), InterfaceC10302l.a.f39932a, InterfaceC10401l.f40201b.m36950a(), new C10243b(c10322f, C10817u.m38888j()));
            c10674x.m37998Z0(c10674x);
            c10674x.m37993T0(new C10653i(C10817u.m38891m(c10238c.m36104a(), c9934h), "CompositeProvider@RuntimeModuleData for " + c10674x));
            return new C11550a(c10089eM33960a, c10091g);
        }
    }

    public C10089e(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, InterfaceC10302l interfaceC10302l, C10092h c10092h, C10085c c10085c, C9989f c9989f, C10601j0 c10601j0, InterfaceC10308r interfaceC10308r, InterfaceC9940c interfaceC9940c, InterfaceC10300j interfaceC10300j, InterfaceC10401l interfaceC10401l, C10431a c10431a) {
        InterfaceC10632c interfaceC10632cM32955H0;
        InterfaceC10630a interfaceC10630aM32955H0;
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10592g0, "moduleDescriptor");
        C9801m.m32346f(interfaceC10302l, "configuration");
        C9801m.m32346f(c10092h, "classDataFinder");
        C9801m.m32346f(c10085c, "annotationAndConstantLoader");
        C9801m.m32346f(c9989f, "packageFragmentProvider");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        C9801m.m32346f(interfaceC10308r, "errorReporter");
        C9801m.m32346f(interfaceC9940c, "lookupTracker");
        C9801m.m32346f(interfaceC10300j, "contractDeserializer");
        C9801m.m32346f(interfaceC10401l, "kotlinTypeChecker");
        C9801m.m32346f(c10431a, "typeAttributeTranslators");
        AbstractC9914h abstractC9914hMo37021o = interfaceC10592g0.mo37021o();
        C9932f c9932f = abstractC9914hMo37021o instanceof C9932f ? (C9932f) abstractC9914hMo37021o : null;
        this.f38442b = new C10301k(interfaceC10330n, interfaceC10592g0, interfaceC10302l, c10092h, c10085c, c9989f, InterfaceC10312v.a.f39960a, interfaceC10308r, interfaceC9940c, C10093i.f38455a, C10817u.m38888j(), c10601j0, interfaceC10300j, (c9932f == null || (interfaceC10630aM32955H0 = c9932f.m32955H0()) == null) ? InterfaceC10630a.a.f40889a : interfaceC10630aM32955H0, (c9932f == null || (interfaceC10632cM32955H0 = c9932f.m32955H0()) == null) ? InterfaceC10632c.b.f40891a : interfaceC10632cM32955H0, C10121i.f38607a.m34265a(), interfaceC10401l, new C10243b(interfaceC10330n, C10817u.m38888j()), null, c10431a.m37084a(), 262144, null);
    }

    /* renamed from: a */
    public final C10301k m33956a() {
        return this.f38442b;
    }
}
