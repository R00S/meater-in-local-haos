package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10143v;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10144w;

/* compiled from: VersionRequirement.kt */
/* renamed from: kotlin.f0.y.e.j0.e.z.h */
/* loaded from: classes3.dex */
public final class C10156h {

    /* renamed from: a */
    public static final a f39237a = new a(null);

    /* renamed from: b */
    private static final C10156h f39238b = new C10156h(C10817u.m38888j());

    /* renamed from: c */
    private final List<C10143v> f39239c;

    /* compiled from: VersionRequirement.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.z.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10156h m35401a(C10144w c10144w) {
            C9801m.m32346f(c10144w, "table");
            if (c10144w.m35340v() == 0) {
                return m35402b();
            }
            List<C10143v> listM35341w = c10144w.m35341w();
            C9801m.m32345e(listM35341w, "table.requirementList");
            return new C10156h(listM35341w, null);
        }

        /* renamed from: b */
        public final C10156h m35402b() {
            return C10156h.f39238b;
        }
    }

    private C10156h(List<C10143v> list) {
        this.f39239c = list;
    }

    public /* synthetic */ C10156h(List list, C9789g c9789g) {
        this(list);
    }
}
