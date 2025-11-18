package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: predefinedEnhancementInfo.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.k */
/* loaded from: classes3.dex */
public final class C10061k {

    /* renamed from: a */
    private final C10067q f38270a;

    /* renamed from: b */
    private final List<C10067q> f38271b;

    public C10061k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C10061k(C10067q c10067q, List<C10067q> list) {
        C9801m.m32346f(list, "parametersInfo");
        this.f38270a = c10067q;
        this.f38271b = list;
    }

    /* renamed from: a */
    public final List<C10067q> m33735a() {
        return this.f38271b;
    }

    /* renamed from: b */
    public final C10067q m33736b() {
        return this.f38270a;
    }

    public /* synthetic */ C10061k(C10067q c10067q, List list, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? null : c10067q, (i2 & 2) != 0 ? C10817u.m38888j() : list);
    }
}
