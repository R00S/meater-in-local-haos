package j0;

import j0.C3714n;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import s.C4380B;
import s.C4406p;

/* compiled from: Connector.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Ls/B;", "Lj0/h;", "a", "Ls/B;", "()Ls/B;", "Connectors", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3709i {

    /* renamed from: a, reason: collision with root package name */
    private static final C4380B<C3708h> f43358a;

    static {
        C3707g c3707g = C3707g.f43324a;
        int id2 = c3707g.w().getId();
        int id3 = c3707g.w().getId();
        C3714n.Companion companion = C3714n.INSTANCE;
        C3854k c3854k = null;
        f43358a = C4406p.c(id2 | (id3 << 6) | (companion.b() << 12), C3708h.INSTANCE.c(c3707g.w()), c3707g.w().getId() | (c3707g.t().getId() << 6) | (companion.b() << 12), new C3708h(c3707g.w(), c3707g.t(), companion.b(), c3854k), c3707g.t().getId() | (c3707g.w().getId() << 6) | (companion.b() << 12), new C3708h(c3707g.t(), c3707g.w(), companion.b(), c3854k));
    }

    public static final C4380B<C3708h> a() {
        return f43358a;
    }
}
