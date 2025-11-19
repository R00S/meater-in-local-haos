package Na;

import Ra.h0;
import ab.C1927H;
import ab.C1928I;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jb.x;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.K;
import qb.b;
import qb.c;

/* compiled from: SpecialJvmAnnotations.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12585a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<b> f12586b;

    /* renamed from: c, reason: collision with root package name */
    private static final b f12587c;

    static {
        List listP = r.p(C1928I.f20139a, C1928I.f20150l, C1928I.f20151m, C1928I.f20142d, C1928I.f20144f, C1928I.f20147i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f48178d;
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.c((c) it.next()));
        }
        f12586b = linkedHashSet;
        b.a aVar2 = b.f48178d;
        c REPEATABLE_ANNOTATION = C1928I.f20148j;
        C3862t.f(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f12587c = aVar2.c(REPEATABLE_ANNOTATION);
    }

    private a() {
    }

    public final b a() {
        return f12587c;
    }

    public final Set<b> b() {
        return f12586b;
    }

    public final boolean c(x klass) {
        C3862t.g(klass, "klass");
        K k10 = new K();
        klass.d(new C0194a(k10), null);
        return k10.f43974B;
    }

    /* compiled from: SpecialJvmAnnotations.kt */
    /* renamed from: Na.a$a, reason: collision with other inner class name */
    public static final class C0194a implements x.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K f12588a;

        C0194a(K k10) {
            this.f12588a = k10;
        }

        @Override // jb.x.c
        public x.a c(b classId, h0 source) {
            C3862t.g(classId, "classId");
            C3862t.g(source, "source");
            if (!C3862t.b(classId, C1927H.f20134a.a())) {
                return null;
            }
            this.f12588a.f43974B = true;
            return null;
        }

        @Override // jb.x.c
        public void a() {
        }
    }
}
