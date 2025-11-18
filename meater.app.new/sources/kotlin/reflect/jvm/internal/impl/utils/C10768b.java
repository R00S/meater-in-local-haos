package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: DFS.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.b */
/* loaded from: classes3.dex */
public class C10768b {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$a */
    static class a<N> extends b<N, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Function1 f41411a;

        /* renamed from: b */
        final /* synthetic */ boolean[] f41412b;

        a(Function1 function1, boolean[] zArr) {
            this.f41411a = function1;
            this.f41412b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.d
        /* renamed from: c */
        public boolean mo32995c(N n) {
            if (((Boolean) this.f41411a.invoke(n)).booleanValue()) {
                this.f41412b[0] = true;
            }
            return !this.f41412b[0];
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean mo32994a() {
            return Boolean.valueOf(this.f41412b[0]);
        }
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$b */
    public static abstract class b<N, R> implements d<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.d
        /* renamed from: b */
        public void mo36088b(N n) {
        }
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$c */
    public interface c<N> {
        /* renamed from: a */
        Iterable<? extends N> mo32992a(N n);
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$d */
    public interface d<N, R> {
        /* renamed from: a */
        R mo32994a();

        /* renamed from: b */
        void mo36088b(N n);

        /* renamed from: c */
        boolean mo32995c(N n);
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$e */
    public interface e<N> {
        /* renamed from: a */
        boolean mo38521a(N n);
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$f */
    public static class f<N> implements e<N> {

        /* renamed from: a */
        private final Set<N> f41413a;

        public f() {
            this(new HashSet());
        }

        /* renamed from: b */
        private static /* synthetic */ void m38522b(int i2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.e
        /* renamed from: a */
        public boolean mo38521a(N n) {
            return this.f41413a.add(n);
        }

        public f(Set<N> set) {
            if (set == null) {
                m38522b(0);
            }
            this.f41413a = set;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m38515a(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i2) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <N, R> R m38516b(Collection<N> collection, c<N> cVar, d<N, R> dVar) {
        if (collection == null) {
            m38515a(4);
        }
        if (cVar == null) {
            m38515a(5);
        }
        if (dVar == null) {
            m38515a(6);
        }
        return (R) m38517c(collection, cVar, new f(), dVar);
    }

    /* renamed from: c */
    public static <N, R> R m38517c(Collection<N> collection, c<N> cVar, e<N> eVar, d<N, R> dVar) {
        if (collection == null) {
            m38515a(0);
        }
        if (cVar == null) {
            m38515a(1);
        }
        if (eVar == null) {
            m38515a(2);
        }
        if (dVar == null) {
            m38515a(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            m38518d(it.next(), cVar, eVar, dVar);
        }
        return dVar.mo32994a();
    }

    /* renamed from: d */
    public static <N> void m38518d(N n, c<N> cVar, e<N> eVar, d<N, ?> dVar) {
        if (n == null) {
            m38515a(22);
        }
        if (cVar == null) {
            m38515a(23);
        }
        if (eVar == null) {
            m38515a(24);
        }
        if (dVar == null) {
            m38515a(25);
        }
        if (eVar.mo38521a(n) && dVar.mo32995c(n)) {
            Iterator<? extends N> it = cVar.mo32992a(n).iterator();
            while (it.hasNext()) {
                m38518d(it.next(), cVar, eVar, dVar);
            }
            dVar.mo36088b(n);
        }
    }

    /* renamed from: e */
    public static <N> Boolean m38519e(Collection<N> collection, c<N> cVar, Function1<N, Boolean> function1) {
        if (collection == null) {
            m38515a(7);
        }
        if (cVar == null) {
            m38515a(8);
        }
        if (function1 == null) {
            m38515a(9);
        }
        return (Boolean) m38516b(collection, cVar, new a(function1, new boolean[1]));
    }
}
