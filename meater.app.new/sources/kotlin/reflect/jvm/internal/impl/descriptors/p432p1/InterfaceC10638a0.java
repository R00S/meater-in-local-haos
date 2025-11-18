package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10589f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: PackageViewDescriptorFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a0 */
/* loaded from: classes2.dex */
public interface InterfaceC10638a0 {

    /* renamed from: a */
    public static final a f40902a = a.f40903a;

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a0$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f40903a = new a();

        /* renamed from: b */
        private static final C10589f0<InterfaceC10638a0> f40904b = new C10589f0<>("PackageViewDescriptorFactory");

        private a() {
        }

        /* renamed from: a */
        public final C10589f0<InterfaceC10638a0> m37759a() {
            return f40904b;
        }
    }

    /* compiled from: PackageViewDescriptorFactory.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.a0$b */
    public static final class b implements InterfaceC10638a0 {

        /* renamed from: b */
        public static final b f40905b = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10638a0
        /* renamed from: a */
        public InterfaceC10636p0 mo37758a(C10674x c10674x, C10160c c10160c, InterfaceC10330n interfaceC10330n) {
            C9801m.m32346f(c10674x, "module");
            C9801m.m32346f(c10160c, "fqName");
            C9801m.m32346f(interfaceC10330n, "storageManager");
            return new C10668r(c10674x, c10160c, interfaceC10330n);
        }
    }

    /* renamed from: a */
    InterfaceC10636p0 mo37758a(C10674x c10674x, C10160c c10160c, InterfaceC10330n interfaceC10330n);
}
