package com.facebook.internal.p148t0;

import com.facebook.C5641a0;
import com.facebook.internal.C5666a0;
import com.facebook.internal.p148t0.p149l.C5720e;
import com.facebook.internal.p148t0.p150m.C5723c;
import com.facebook.internal.p148t0.p151n.C5724a;
import com.facebook.internal.p148t0.p152o.C5729e;
import com.facebook.internal.p148t0.p153p.C5730a;

/* compiled from: InstrumentManager.kt */
/* renamed from: com.facebook.internal.t0.j */
/* loaded from: classes2.dex */
public final class C5714j {

    /* renamed from: a */
    public static final C5714j f14589a = new C5714j();

    private C5714j() {
    }

    /* renamed from: d */
    public static final void m11738d() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            C5666a0 c5666a0 = C5666a0.f14313a;
            C5666a0.m11372a(C5666a0.b.CrashReport, new C5666a0.a() { // from class: com.facebook.internal.t0.b
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5714j.m11739e(z);
                }
            });
            C5666a0.m11372a(C5666a0.b.ErrorReport, new C5666a0.a() { // from class: com.facebook.internal.t0.d
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5714j.m11740f(z);
                }
            });
            C5666a0.m11372a(C5666a0.b.AnrReport, new C5666a0.a() { // from class: com.facebook.internal.t0.c
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5714j.m11741g(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m11739e(boolean z) {
        if (z) {
            C5723c.f14603f.m11780a();
            C5666a0 c5666a0 = C5666a0.f14313a;
            if (C5666a0.m11378g(C5666a0.b.CrashShield)) {
                C5712h c5712h = C5712h.f14569a;
                C5712h.m11714a();
                C5724a c5724a = C5724a.f14607a;
                C5724a.m11781a();
            }
            if (C5666a0.m11378g(C5666a0.b.ThreadCheck)) {
                C5730a c5730a = C5730a.f14618a;
                C5730a.m11797a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m11740f(boolean z) {
        if (z) {
            C5729e c5729e = C5729e.f14617a;
            C5729e.m11787a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m11741g(boolean z) {
        if (z) {
            C5720e c5720e = C5720e.f14599a;
            C5720e.m11766a();
        }
    }
}
