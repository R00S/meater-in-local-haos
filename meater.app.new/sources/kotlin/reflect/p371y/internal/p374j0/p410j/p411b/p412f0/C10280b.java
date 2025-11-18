package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10610m0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10630a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10632c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9907a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9940c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.C10243b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10274d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10301k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10305o;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10300j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10302l;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10309s;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10312v;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: BuiltInsLoaderImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.f0.b */
/* loaded from: classes3.dex */
public final class C10280b implements InterfaceC9907a {

    /* renamed from: b */
    private final C10282d f39755b = new C10282d();

    /* compiled from: BuiltInsLoaderImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.f0.b$a */
    /* synthetic */ class a extends C9793i implements Function1<String, InputStream> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10282d.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String str) {
            C9801m.m32346f(str, "p0");
            return ((C10282d) this.receiver).m36251a(str);
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9907a
    /* renamed from: a */
    public InterfaceC10607l0 mo32697a(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, Iterable<? extends InterfaceC10631b> iterable, InterfaceC10632c interfaceC10632c, InterfaceC10630a interfaceC10630a, boolean z) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10592g0, "builtInsModule");
        C9801m.m32346f(iterable, "classDescriptorFactories");
        C9801m.m32346f(interfaceC10632c, "platformDependentDeclarationFilter");
        C9801m.m32346f(interfaceC10630a, "additionalClassPartsProvider");
        return m36248b(interfaceC10330n, interfaceC10592g0, C9917k.f37523x, iterable, interfaceC10632c, interfaceC10630a, z, new a(this.f39755b));
    }

    /* renamed from: b */
    public final InterfaceC10607l0 m36248b(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, Set<C10160c> set, Iterable<? extends InterfaceC10631b> iterable, InterfaceC10632c interfaceC10632c, InterfaceC10630a interfaceC10630a, boolean z, Function1<? super String, ? extends InputStream> function1) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10592g0, "module");
        C9801m.m32346f(set, "packageFqNames");
        C9801m.m32346f(iterable, "classDescriptorFactories");
        C9801m.m32346f(interfaceC10632c, "platformDependentDeclarationFilter");
        C9801m.m32346f(interfaceC10630a, "additionalClassPartsProvider");
        C9801m.m32346f(function1, "loadResource");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(set, 10));
        for (C10160c c10160c : set) {
            String strM36247n = C10279a.f39754n.m36247n(c10160c);
            InputStream inputStreamInvoke = function1.invoke(strM36247n);
            if (inputStreamInvoke == null) {
                throw new IllegalStateException("Resource not found in classpath: " + strM36247n);
            }
            arrayList.add(C10281c.f39756s.m36250a(c10160c, interfaceC10330n, interfaceC10592g0, inputStreamInvoke, z));
        }
        C10610m0 c10610m0 = new C10610m0(arrayList);
        C10601j0 c10601j0 = new C10601j0(interfaceC10330n, interfaceC10592g0);
        InterfaceC10302l.a aVar = InterfaceC10302l.a.f39932a;
        C10305o c10305o = new C10305o(c10610m0);
        C10279a c10279a = C10279a.f39754n;
        C10274d c10274d = new C10274d(interfaceC10592g0, c10601j0, c10279a);
        InterfaceC10312v.a aVar2 = InterfaceC10312v.a.f39960a;
        InterfaceC10308r interfaceC10308r = InterfaceC10308r.f39954a;
        C9801m.m32345e(interfaceC10308r, "DO_NOTHING");
        C10301k c10301k = new C10301k(interfaceC10330n, interfaceC10592g0, aVar, c10305o, c10274d, c10610m0, aVar2, interfaceC10308r, InterfaceC9940c.a.f37749a, InterfaceC10309s.a.f39955a, iterable, c10601j0, InterfaceC10300j.f39908a.m36415a(), interfaceC10630a, interfaceC10632c, c10279a.m36190e(), null, new C10243b(interfaceC10330n, C10817u.m38888j()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C10281c) it.next()).mo36465M0(c10301k);
        }
        return c10610m0;
    }
}
