package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10782c0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10813s;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.f1 */
/* loaded from: classes3.dex */
public abstract class AbstractC10348f1 extends AbstractC10360j1 {

    /* renamed from: c */
    public static final a f40104c = new a(null);

    /* compiled from: TypeSubstitution.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f1$a */
    public static final class a {

        /* compiled from: TypeSubstitution.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.f1$a$a, reason: collision with other inner class name */
        public static final class C11571a extends AbstractC10348f1 {

            /* renamed from: d */
            final /* synthetic */ Map<InterfaceC10345e1, InterfaceC10351g1> f40105d;

            /* renamed from: e */
            final /* synthetic */ boolean f40106e;

            /* JADX WARN: Multi-variable type inference failed */
            C11571a(Map<InterfaceC10345e1, ? extends InterfaceC10351g1> map, boolean z) {
                this.f40105d = map;
                this.f40106e = z;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
            /* renamed from: a */
            public boolean mo36685a() {
                return this.f40106e;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
            /* renamed from: f */
            public boolean mo33537f() {
                return this.f40105d.isEmpty();
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348f1
            /* renamed from: k */
            public InterfaceC10351g1 mo36679k(InterfaceC10345e1 interfaceC10345e1) {
                C9801m.m32346f(interfaceC10345e1, RoomNotification.KEY);
                return this.f40105d.get(interfaceC10345e1);
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ AbstractC10348f1 m36680e(a aVar, Map map, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return aVar.m36684d(map, z);
        }

        /* renamed from: a */
        public final AbstractC10360j1 m36681a(AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(abstractC10344e0, "kotlinType");
            return m36682b(abstractC10344e0.mo35993O0(), abstractC10344e0.mo35991M0());
        }

        /* renamed from: b */
        public final AbstractC10360j1 m36682b(InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list) {
            C9801m.m32346f(interfaceC10345e1, "typeConstructor");
            C9801m.m32346f(list, "arguments");
            List<InterfaceC10587e1> parameters = interfaceC10345e1.getParameters();
            C9801m.m32345e(parameters, "typeConstructor.parameters");
            InterfaceC10587e1 interfaceC10587e1 = (InterfaceC10587e1) C10813s.m38847i0(parameters);
            if (!(interfaceC10587e1 != null && interfaceC10587e1.mo37673o0())) {
                return new C10338c0(parameters, list);
            }
            List<InterfaceC10587e1> parameters2 = interfaceC10345e1.getParameters();
            C9801m.m32345e(parameters2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C10819v.m38911u(parameters2, 10));
            Iterator<T> it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10587e1) it.next()).mo32877h());
            }
            return m36680e(this, C10810q0.m38805q(C10782c0.m38580L0(arrayList, list)), false, 2, null);
        }

        /* renamed from: c */
        public final AbstractC10348f1 m36683c(Map<InterfaceC10345e1, ? extends InterfaceC10351g1> map) {
            C9801m.m32346f(map, "map");
            return m36680e(this, map, false, 2, null);
        }

        /* renamed from: d */
        public final AbstractC10348f1 m36684d(Map<InterfaceC10345e1, ? extends InterfaceC10351g1> map, boolean z) {
            C9801m.m32346f(map, "map");
            return new C11571a(map, z);
        }
    }

    /* renamed from: i */
    public static final AbstractC10360j1 m36677i(InterfaceC10345e1 interfaceC10345e1, List<? extends InterfaceC10351g1> list) {
        return f40104c.m36682b(interfaceC10345e1, list);
    }

    /* renamed from: j */
    public static final AbstractC10348f1 m36678j(Map<InterfaceC10345e1, ? extends InterfaceC10351g1> map) {
        return f40104c.m36683c(map);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: e */
    public InterfaceC10351g1 mo33536e(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, RoomNotification.KEY);
        return mo36679k(abstractC10344e0.mo35993O0());
    }

    /* renamed from: k */
    public abstract InterfaceC10351g1 mo36679k(InterfaceC10345e1 interfaceC10345e1);
}
