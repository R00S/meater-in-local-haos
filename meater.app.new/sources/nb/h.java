package nb;

import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import lb.v;
import lb.w;

/* compiled from: VersionRequirement.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f45846b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final h f45847c = new h(r.m());

    /* renamed from: a, reason: collision with root package name */
    private final List<v> f45848a;

    /* compiled from: VersionRequirement.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final h a(w table) {
            C3862t.g(table, "table");
            if (table.w() == 0) {
                return b();
            }
            List<v> listX = table.x();
            C3862t.f(listX, "getRequirementList(...)");
            return new h(listX, null);
        }

        public final h b() {
            return h.f45847c;
        }

        private a() {
        }
    }

    public /* synthetic */ h(List list, C3854k c3854k) {
        this(list);
    }

    private h(List<v> list) {
        this.f45848a = list;
    }
}
