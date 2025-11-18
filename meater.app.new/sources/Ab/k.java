package Ab;

import Ra.Z;
import Ra.g0;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.V;
import kotlin.jvm.internal.C3862t;

/* compiled from: MemberScope.kt */
/* loaded from: classes3.dex */
public interface k extends n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1147a = a.f1148a;

    /* compiled from: MemberScope.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f1148a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Ba.l<qb.f, Boolean> f1149b = j.f1146B;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean a(qb.f it) {
            C3862t.g(it, "it");
            return true;
        }

        public final Ba.l<qb.f, Boolean> c() {
            return f1149b;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b extends l {

        /* renamed from: b, reason: collision with root package name */
        public static final b f1150b = new b();

        private b() {
        }

        @Override // Ab.l, Ab.k
        public Set<qb.f> a() {
            return V.d();
        }

        @Override // Ab.l, Ab.k
        public Set<qb.f> c() {
            return V.d();
        }

        @Override // Ab.l, Ab.k
        public Set<qb.f> e() {
            return V.d();
        }
    }

    Set<qb.f> a();

    Collection<? extends g0> b(qb.f fVar, Za.b bVar);

    Set<qb.f> c();

    Collection<? extends Z> d(qb.f fVar, Za.b bVar);

    Set<qb.f> e();
}
