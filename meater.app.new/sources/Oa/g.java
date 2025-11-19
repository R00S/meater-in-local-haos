package Oa;

import kotlin.jvm.internal.C3854k;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: DefaultBuiltIns.kt */
/* loaded from: classes3.dex */
public final class g extends j {

    /* renamed from: h, reason: collision with root package name */
    public static final a f13317h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final InterfaceC4164i<g> f13318i = C4165j.a(f.f13316B);

    /* compiled from: DefaultBuiltIns.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final g a() {
            return (g) g.f13318i.getValue();
        }

        private a() {
        }
    }

    public g() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g F0() {
        return new g(false, 1, null);
    }

    public g(boolean z10) {
        super(new Gb.f("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    public /* synthetic */ g(boolean z10, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
