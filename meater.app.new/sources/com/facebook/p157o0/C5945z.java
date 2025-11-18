package com.facebook.p157o0;

import com.facebook.p157o0.p165q0.C5902g;
import kotlin.jvm.internal.C9801m;

/* compiled from: AppEventStore.kt */
/* renamed from: com.facebook.o0.z */
/* loaded from: classes.dex */
public final class C5945z {

    /* renamed from: a */
    public static final C5945z f15551a = new C5945z();

    /* renamed from: b */
    private static final String f15552b = C5945z.class.getName();

    private C5945z() {
    }

    /* renamed from: a */
    public static final synchronized void m12874a(C5928t c5928t, C5829i0 c5829i0) {
        C9801m.m32346f(c5928t, "accessTokenAppIdPair");
        C9801m.m32346f(c5829i0, "appEvents");
        C5902g c5902g = C5902g.f15370a;
        C5902g.m12625b();
        C5943x c5943x = C5943x.f15541a;
        C5827h0 c5827h0M12851a = C5943x.m12851a();
        c5827h0M12851a.m12254a(c5928t, c5829i0.m12260d());
        C5943x.m12852b(c5827h0M12851a);
    }

    /* renamed from: b */
    public static final synchronized void m12875b(C5942w c5942w) {
        C9801m.m32346f(c5942w, "eventsToPersist");
        C5902g c5902g = C5902g.f15370a;
        C5902g.m12625b();
        C5943x c5943x = C5943x.f15541a;
        C5827h0 c5827h0M12851a = C5943x.m12851a();
        for (C5928t c5928t : c5942w.m12850f()) {
            C5829i0 c5829i0M12848c = c5942w.m12848c(c5928t);
            if (c5829i0M12848c == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            c5827h0M12851a.m12254a(c5928t, c5829i0M12848c.m12260d());
        }
        C5943x c5943x2 = C5943x.f15541a;
        C5943x.m12852b(c5827h0M12851a);
    }
}
