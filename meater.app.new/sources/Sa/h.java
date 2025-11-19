package Sa;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: Annotations.kt */
/* loaded from: classes3.dex */
public interface h extends Iterable<c>, Ca.a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f15630e = a.f15631a;

    /* compiled from: Annotations.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f15631a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final h f15632b = new C0228a();

        /* compiled from: Annotations.kt */
        /* renamed from: Sa.h$a$a, reason: collision with other inner class name */
        public static final class C0228a implements h {
            C0228a() {
            }

            @Override // Sa.h
            public boolean P(qb.c cVar) {
                return b.b(this, cVar);
            }

            public Void c(qb.c fqName) {
                C3862t.g(fqName, "fqName");
                return null;
            }

            @Override // Sa.h
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<c> iterator() {
                return kotlin.collections.r.m().iterator();
            }

            @Override // Sa.h
            public /* bridge */ /* synthetic */ c o(qb.c cVar) {
                return (c) c(cVar);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final h a(List<? extends c> annotations) {
            C3862t.g(annotations, "annotations");
            return annotations.isEmpty() ? f15632b : new i(annotations);
        }

        public final h b() {
            return f15632b;
        }
    }

    /* compiled from: Annotations.kt */
    public static final class b {
        public static c a(h hVar, qb.c fqName) {
            c next;
            C3862t.g(fqName, "fqName");
            Iterator<c> it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C3862t.b(next.f(), fqName)) {
                    break;
                }
            }
            return next;
        }

        public static boolean b(h hVar, qb.c fqName) {
            C3862t.g(fqName, "fqName");
            return hVar.o(fqName) != null;
        }
    }

    boolean P(qb.c cVar);

    boolean isEmpty();

    c o(qb.c cVar);
}
