package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10782c0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;

/* compiled from: TypeAliasExpansion.kt */
/* renamed from: kotlin.f0.y.e.j0.l.w0 */
/* loaded from: classes3.dex */
public final class C10433w0 {

    /* renamed from: a */
    public static final a f40368a = new a(null);

    /* renamed from: b */
    private final C10433w0 f40369b;

    /* renamed from: c */
    private final InterfaceC10584d1 f40370c;

    /* renamed from: d */
    private final List<InterfaceC10351g1> f40371d;

    /* renamed from: e */
    private final Map<InterfaceC10587e1, InterfaceC10351g1> f40372e;

    /* compiled from: TypeAliasExpansion.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.w0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10433w0 m37090a(C10433w0 c10433w0, InterfaceC10584d1 interfaceC10584d1, List<? extends InterfaceC10351g1> list) {
            C9801m.m32346f(interfaceC10584d1, "typeAliasDescriptor");
            C9801m.m32346f(list, "arguments");
            List<InterfaceC10587e1> parameters = interfaceC10584d1.mo32877h().getParameters();
            C9801m.m32345e(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C10819v.m38911u(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10587e1) it.next()).mo37019a());
            }
            return new C10433w0(c10433w0, interfaceC10584d1, list, C10810q0.m38805q(C10782c0.m38580L0(arrayList, list)), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10433w0(C10433w0 c10433w0, InterfaceC10584d1 interfaceC10584d1, List<? extends InterfaceC10351g1> list, Map<InterfaceC10587e1, ? extends InterfaceC10351g1> map) {
        this.f40369b = c10433w0;
        this.f40370c = interfaceC10584d1;
        this.f40371d = list;
        this.f40372e = map;
    }

    public /* synthetic */ C10433w0(C10433w0 c10433w0, InterfaceC10584d1 interfaceC10584d1, List list, Map map, C9789g c9789g) {
        this(c10433w0, interfaceC10584d1, list, map);
    }

    /* renamed from: a */
    public final List<InterfaceC10351g1> m37086a() {
        return this.f40371d;
    }

    /* renamed from: b */
    public final InterfaceC10584d1 m37087b() {
        return this.f40370c;
    }

    /* renamed from: c */
    public final InterfaceC10351g1 m37088c(InterfaceC10345e1 interfaceC10345e1) {
        C9801m.m32346f(interfaceC10345e1, "constructor");
        InterfaceC10594h interfaceC10594hMo32887c = interfaceC10345e1.mo32887c();
        if (interfaceC10594hMo32887c instanceof InterfaceC10587e1) {
            return this.f40372e.get(interfaceC10594hMo32887c);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m37089d(InterfaceC10584d1 interfaceC10584d1) {
        C9801m.m32346f(interfaceC10584d1, "descriptor");
        if (!C9801m.m32341a(this.f40370c, interfaceC10584d1)) {
            C10433w0 c10433w0 = this.f40369b;
            if (!(c10433w0 != null ? c10433w0.m37089d(interfaceC10584d1) : false)) {
                return false;
            }
        }
        return true;
    }
}
