package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10624k;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9930d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9945a0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10406q;

/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.r */
/* loaded from: classes3.dex */
public final class C10068r {

    /* renamed from: a */
    private static final C10053c f38295a;

    /* renamed from: b */
    private static final C10053c f38296b;

    /* compiled from: typeEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.r$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38297a;

        static {
            int[] iArr = new int[EnumC10058h.values().length];
            iArr[EnumC10058h.NULLABLE.ordinal()] = 1;
            iArr[EnumC10058h.NOT_NULL.ordinal()] = 2;
            f38297a = iArr;
        }
    }

    static {
        C10160c c10160c = C9945a0.f37806u;
        C9801m.m32345e(c10160c, "ENHANCED_NULLABILITY_ANNOTATION");
        f38295a = new C10053c(c10160c);
        C10160c c10160c2 = C9945a0.f37807v;
        C9801m.m32345e(c10160c2, "ENHANCED_MUTABILITY_ANNOTATION");
        f38296b = new C10053c(c10160c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final InterfaceC10620g m33773f(List<? extends InterfaceC10620g> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new C10624k((List<? extends InterfaceC10620g>) C10782c0.m38569E0(list)) : (InterfaceC10620g) C10813s.m38866s0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final InterfaceC10594h m33774g(InterfaceC10594h interfaceC10594h, C10055e c10055e, EnumC10065o enumC10065o) {
        C9930d c9930d = C9930d.f37687a;
        if (!C10066p.m33766a(enumC10065o) || !(interfaceC10594h instanceof InterfaceC10585e)) {
            return null;
        }
        if (c10055e.m33683c() == EnumC10056f.READ_ONLY && enumC10065o == EnumC10065o.FLEXIBLE_LOWER) {
            InterfaceC10585e interfaceC10585e = (InterfaceC10585e) interfaceC10594h;
            if (c9930d.m32939c(interfaceC10585e)) {
                return c9930d.m32937a(interfaceC10585e);
            }
        }
        if (c10055e.m33683c() != EnumC10056f.MUTABLE || enumC10065o != EnumC10065o.FLEXIBLE_UPPER) {
            return null;
        }
        InterfaceC10585e interfaceC10585e2 = (InterfaceC10585e) interfaceC10594h;
        if (c9930d.m32940d(interfaceC10585e2)) {
            return c9930d.m32938b(interfaceC10585e2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final Boolean m33775h(C10055e c10055e, EnumC10065o enumC10065o) {
        if (!C10066p.m33766a(enumC10065o)) {
            return null;
        }
        EnumC10058h enumC10058hM33684d = c10055e.m33684d();
        int i2 = enumC10058hM33684d == null ? -1 : a.f38297a[enumC10058hM33684d.ordinal()];
        if (i2 == 1) {
            return Boolean.TRUE;
        }
        if (i2 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: i */
    public static final boolean m33776i(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return C10069s.m33779c(C10406q.f40209a, abstractC10344e0);
    }
}
