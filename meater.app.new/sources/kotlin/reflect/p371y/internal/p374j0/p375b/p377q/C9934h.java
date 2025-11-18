package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.io.InputStream;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10632c;
import kotlin.reflect.p371y.internal.p374j0.p375b.p376p.C9922a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9940c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10099o;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.InterfaceC10242a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10268a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10306p;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10274d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10301k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10305o;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10300j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10302l;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10309s;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10312v;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0.C10279a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0.C10281c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10401l;

/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.h */
/* loaded from: classes2.dex */
public final class C9934h extends AbstractC10268a {

    /* renamed from: f */
    public static final a f37741f = new a(null);

    /* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9934h(InterfaceC10330n interfaceC10330n, InterfaceC10099o interfaceC10099o, InterfaceC10592g0 interfaceC10592g0, C10601j0 c10601j0, InterfaceC10630a interfaceC10630a, InterfaceC10632c interfaceC10632c, InterfaceC10302l interfaceC10302l, InterfaceC10401l interfaceC10401l, InterfaceC10242a interfaceC10242a) {
        super(interfaceC10330n, interfaceC10099o, interfaceC10592g0);
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10099o, "finder");
        C9801m.m32346f(interfaceC10592g0, "moduleDescriptor");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        C9801m.m32346f(interfaceC10630a, "additionalClassPartsProvider");
        C9801m.m32346f(interfaceC10632c, "platformDependentDeclarationFilter");
        C9801m.m32346f(interfaceC10302l, "deserializationConfiguration");
        C9801m.m32346f(interfaceC10401l, "kotlinTypeChecker");
        C9801m.m32346f(interfaceC10242a, "samConversionResolver");
        C10305o c10305o = new C10305o(this);
        C10279a c10279a = C10279a.f39754n;
        C10274d c10274d = new C10274d(interfaceC10592g0, c10601j0, c10279a);
        InterfaceC10312v.a aVar = InterfaceC10312v.a.f39960a;
        InterfaceC10308r interfaceC10308r = InterfaceC10308r.f39954a;
        C9801m.m32345e(interfaceC10308r, "DO_NOTHING");
        m36202i(new C10301k(interfaceC10330n, interfaceC10592g0, interfaceC10302l, c10305o, c10274d, this, aVar, interfaceC10308r, InterfaceC9940c.a.f37749a, InterfaceC10309s.a.f39955a, C10817u.m38891m(new C9922a(interfaceC10330n, interfaceC10592g0), new C9931e(interfaceC10330n, interfaceC10592g0, null, 4, null)), c10601j0, InterfaceC10300j.f39908a.m36415a(), interfaceC10630a, interfaceC10632c, c10279a.m36190e(), interfaceC10401l, interfaceC10242a, null, null, 786432, null));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10268a
    /* renamed from: d */
    protected AbstractC10306p mo33001d(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        InputStream inputStreamMo36473b = m36199f().mo36473b(c10160c);
        if (inputStreamMo36473b != null) {
            return C10281c.f39756s.m36250a(c10160c, m36201h(), m36200g(), inputStreamMo36473b, false);
        }
        return null;
    }
}
