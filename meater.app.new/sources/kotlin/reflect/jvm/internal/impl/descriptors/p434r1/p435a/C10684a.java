package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C10782c0;
import kotlin.collections.C10815t;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10661m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10091g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10100p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10086a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10239d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10245b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;

/* compiled from: PackagePartScopeCache.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.a */
/* loaded from: classes2.dex */
public final class C10684a {

    /* renamed from: a */
    private final C10091g f41137a;

    /* renamed from: b */
    private final C10690g f41138b;

    /* renamed from: c */
    private final ConcurrentHashMap<C10159b, InterfaceC10251h> f41139c;

    public C10684a(C10091g c10091g, C10690g c10690g) {
        C9801m.m32346f(c10091g, "resolver");
        C9801m.m32346f(c10690g, "kotlinClassFinder");
        this.f41137a = c10091g;
        this.f41138b = c10690g;
        this.f41139c = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final InterfaceC10251h m38013a(C10689f c10689f) {
        Collection collectionM38883e;
        C9801m.m32346f(c10689f, "fileClass");
        ConcurrentHashMap<C10159b, InterfaceC10251h> concurrentHashMap = this.f41139c;
        C10159b c10159bMo34028e = c10689f.mo34028e();
        InterfaceC10251h interfaceC10251h = concurrentHashMap.get(c10159bMo34028e);
        if (interfaceC10251h == null) {
            C10160c c10160cM35413h = c10689f.mo34028e().m35413h();
            C9801m.m32345e(c10160cM35413h, "fileClass.classId.packageFqName");
            if (c10689f.mo34025a().m33913c() == C10086a.a.MULTIFILE_CLASS) {
                List<String> listM33916f = c10689f.mo34025a().m33916f();
                collectionM38883e = new ArrayList();
                Iterator<T> it = listM33916f.iterator();
                while (it.hasNext()) {
                    C10159b c10159bM35408m = C10159b.m35408m(C10239d.m36109d((String) it.next()).m36110e());
                    C9801m.m32345e(c10159bM35408m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    InterfaceC10101q interfaceC10101qM34024b = C10100p.m34024b(this.f41138b, c10159bM35408m);
                    if (interfaceC10101qM34024b != null) {
                        collectionM38883e.add(interfaceC10101qM34024b);
                    }
                }
            } else {
                collectionM38883e = C10815t.m38883e(c10689f);
            }
            C10661m c10661m = new C10661m(this.f41137a.m33971d().m36431p(), c10160cM35413h);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collectionM38883e.iterator();
            while (it2.hasNext()) {
                InterfaceC10251h interfaceC10251hM33970b = this.f41137a.m33970b(c10661m, (InterfaceC10101q) it2.next());
                if (interfaceC10251hM33970b != null) {
                    arrayList.add(interfaceC10251hM33970b);
                }
            }
            List listM38569E0 = C10782c0.m38569E0(arrayList);
            InterfaceC10251h interfaceC10251hM36124a = C10245b.f39624b.m36124a("package " + c10160cM35413h + " (" + c10689f + ')', listM38569E0);
            InterfaceC10251h interfaceC10251hPutIfAbsent = concurrentHashMap.putIfAbsent(c10159bMo34028e, interfaceC10251hM36124a);
            interfaceC10251h = interfaceC10251hPutIfAbsent == null ? interfaceC10251hM36124a : interfaceC10251hPutIfAbsent;
        }
        C9801m.m32345e(interfaceC10251h, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return interfaceC10251h;
    }
}
