package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: CompanionObjectMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.b.c */
/* loaded from: classes2.dex */
public final class C9909c {

    /* renamed from: a */
    public static final C9909c f37450a = new C9909c();

    /* renamed from: b */
    private static final Set<C10159b> f37451b;

    static {
        Set<EnumC9915i> set = EnumC9915i.f37470g;
        ArrayList arrayList = new ArrayList(C10819v.m38911u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(C9917k.m32828c((EnumC9915i) it.next()));
        }
        C10160c c10160cM35441l = C9917k.a.f37574h.m35441l();
        C9801m.m32345e(c10160cM35441l, "string.toSafe()");
        List listM38610p0 = C10782c0.m38610p0(arrayList, c10160cM35441l);
        C10160c c10160cM35441l2 = C9917k.a.f37578j.m35441l();
        C9801m.m32345e(c10160cM35441l2, "_boolean.toSafe()");
        List listM38610p02 = C10782c0.m38610p0(listM38610p0, c10160cM35441l2);
        C10160c c10160cM35441l3 = C9917k.a.f37596s.m35441l();
        C9801m.m32345e(c10160cM35441l3, "_enum.toSafe()");
        List listM38610p03 = C10782c0.m38610p0(listM38610p02, c10160cM35441l3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = listM38610p03.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(C10159b.m35408m((C10160c) it2.next()));
        }
        f37451b = linkedHashSet;
    }

    private C9909c() {
    }

    /* renamed from: a */
    public final Set<C10159b> m32700a() {
        return f37451b;
    }

    /* renamed from: b */
    public final Set<C10159b> m32701b() {
        return f37451b;
    }
}
