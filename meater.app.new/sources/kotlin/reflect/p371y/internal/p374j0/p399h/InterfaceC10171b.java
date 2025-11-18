package kotlin.reflect.p371y.internal.p374j0.p399h;

import java.util.ArrayList;
import kotlin.collections.C10778a0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import okhttp3.HttpUrl;

/* compiled from: ClassifierNamePolicy.kt */
/* renamed from: kotlin.f0.y.e.j0.h.b */
/* loaded from: classes3.dex */
public interface InterfaceC10171b {

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.b$a */
    public static final class a implements InterfaceC10171b {

        /* renamed from: a */
        public static final a f39368a = new a();

        private a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10171b
        /* renamed from: a */
        public String mo35496a(InterfaceC10594h interfaceC10594h, AbstractC10172c abstractC10172c) {
            C9801m.m32346f(interfaceC10594h, "classifier");
            C9801m.m32346f(abstractC10172c, "renderer");
            if (interfaceC10594h instanceof InterfaceC10587e1) {
                C10163f name = ((InterfaceC10587e1) interfaceC10594h).getName();
                C9801m.m32345e(name, "classifier.name");
                return abstractC10172c.mo35504v(name, false);
            }
            C10161d c10161dM35825m = C10187d.m35825m(interfaceC10594h);
            C9801m.m32345e(c10161dM35825m, "getFqName(classifier)");
            return abstractC10172c.mo35503u(c10161dM35825m);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.b$b */
    public static final class b implements InterfaceC10171b {

        /* renamed from: a */
        public static final b f39369a = new b();

        private b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.i0, kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10171b
        /* renamed from: a */
        public String mo35496a(InterfaceC10594h interfaceC10594h, AbstractC10172c abstractC10172c) {
            C9801m.m32346f(interfaceC10594h, "classifier");
            C9801m.m32346f(abstractC10172c, "renderer");
            if (interfaceC10594h instanceof InterfaceC10587e1) {
                C10163f name = ((InterfaceC10587e1) interfaceC10594h).getName();
                C9801m.m32345e(name, "classifier.name");
                return abstractC10172c.mo35504v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(interfaceC10594h.getName());
                interfaceC10594h = interfaceC10594h.mo32876b();
            } while (interfaceC10594h instanceof InterfaceC10585e);
            return C10183n.m35765c(C10778a0.m38552F(arrayList));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.b$c */
    public static final class c implements InterfaceC10171b {

        /* renamed from: a */
        public static final c f39370a = new c();

        private c() {
        }

        /* renamed from: b */
        private final String m35497b(InterfaceC10594h interfaceC10594h) {
            C10163f name = interfaceC10594h.getName();
            C9801m.m32345e(name, "descriptor.name");
            String strM35764b = C10183n.m35764b(name);
            if (interfaceC10594h instanceof InterfaceC10587e1) {
                return strM35764b;
            }
            InterfaceC10609m interfaceC10609mMo32876b = interfaceC10594h.mo32876b();
            C9801m.m32345e(interfaceC10609mMo32876b, "descriptor.containingDeclaration");
            String strM35498c = m35498c(interfaceC10609mMo32876b);
            if (strM35498c == null || C9801m.m32341a(strM35498c, HttpUrl.FRAGMENT_ENCODE_SET)) {
                return strM35764b;
            }
            return strM35498c + '.' + strM35764b;
        }

        /* renamed from: c */
        private final String m35498c(InterfaceC10609m interfaceC10609m) {
            if (interfaceC10609m instanceof InterfaceC10585e) {
                return m35497b((InterfaceC10594h) interfaceC10609m);
            }
            if (!(interfaceC10609m instanceof InterfaceC10604k0)) {
                return null;
            }
            C10161d c10161dM35428j = ((InterfaceC10604k0) interfaceC10609m).mo37712d().m35428j();
            C9801m.m32345e(c10161dM35428j, "descriptor.fqName.toUnsafe()");
            return C10183n.m35763a(c10161dM35428j);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10171b
        /* renamed from: a */
        public String mo35496a(InterfaceC10594h interfaceC10594h, AbstractC10172c abstractC10172c) {
            C9801m.m32346f(interfaceC10594h, "classifier");
            C9801m.m32346f(abstractC10172c, "renderer");
            return m35497b(interfaceC10594h);
        }
    }

    /* renamed from: a */
    String mo35496a(InterfaceC10594h interfaceC10594h, AbstractC10172c abstractC10172c);
}
