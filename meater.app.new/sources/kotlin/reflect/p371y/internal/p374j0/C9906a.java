package kotlin.reflect.p371y.internal.p374j0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9782c0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10080z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9945a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: SpecialJvmAnnotations.kt */
/* renamed from: kotlin.f0.y.e.j0.a */
/* loaded from: classes2.dex */
public final class C9906a {

    /* renamed from: a */
    public static final C9906a f37442a = new C9906a();

    /* renamed from: b */
    private static final Set<C10159b> f37443b;

    /* renamed from: c */
    private static final C10159b f37444c;

    /* compiled from: SpecialJvmAnnotations.kt */
    /* renamed from: kotlin.f0.y.e.j0.a$a */
    public static final class a implements InterfaceC10101q.c {

        /* renamed from: a */
        final /* synthetic */ C9782c0 f37445a;

        a(C9782c0 c9782c0) {
            this.f37445a = c9782c0;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.c
        /* renamed from: a */
        public void mo32695a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.c
        /* renamed from: b */
        public InterfaceC10101q.a mo32696b(C10159b c10159b, InterfaceC10741z0 interfaceC10741z0) {
            C9801m.m32346f(c10159b, "classId");
            C9801m.m32346f(interfaceC10741z0, "source");
            if (!C9801m.m32341a(c10159b, C10080z.f38329a.m33834a())) {
                return null;
            }
            this.f37445a.f37168f = true;
            return null;
        }
    }

    static {
        List listM38891m = C10817u.m38891m(C9945a0.f37786a, C9945a0.f37796k, C9945a0.f37797l, C9945a0.f37789d, C9945a0.f37791f, C9945a0.f37794i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM38891m.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C10159b.m35408m((C10160c) it.next()));
        }
        f37443b = linkedHashSet;
        C10159b c10159bM35408m = C10159b.m35408m(C9945a0.f37795j);
        C9801m.m32345e(c10159bM35408m, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f37444c = c10159bM35408m;
    }

    private C9906a() {
    }

    /* renamed from: a */
    public final C10159b m32692a() {
        return f37444c;
    }

    /* renamed from: b */
    public final Set<C10159b> m32693b() {
        return f37443b;
    }

    /* renamed from: c */
    public final boolean m32694c(InterfaceC10101q interfaceC10101q) {
        C9801m.m32346f(interfaceC10101q, "klass");
        C9782c0 c9782c0 = new C9782c0();
        interfaceC10101q.mo34026b(new a(c9782c0), null);
        return c9782c0.f37168f;
    }
}
