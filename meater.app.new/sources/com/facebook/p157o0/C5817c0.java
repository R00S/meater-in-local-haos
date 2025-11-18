package com.facebook.p157o0;

import com.facebook.internal.C5666a0;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.p157o0.C5817c0;
import com.facebook.p157o0.p158k0.C5835c;
import com.facebook.p157o0.p159l0.C5845f;
import com.facebook.p157o0.p162n0.C5876a;
import com.facebook.p157o0.p163o0.C5888k;
import com.facebook.p157o0.p164p0.C5893b;
import com.facebook.p157o0.p164p0.C5894c;
import com.facebook.p157o0.p166r0.C5919h;
import com.facebook.p157o0.p168t0.C5929a;
import org.json.JSONException;

/* compiled from: AppEventsManager.kt */
/* renamed from: com.facebook.o0.c0 */
/* loaded from: classes.dex */
public final class C5817c0 {

    /* renamed from: a */
    public static final C5817c0 f14926a = new C5817c0();

    /* compiled from: AppEventsManager.kt */
    /* renamed from: com.facebook.o0.c0$a */
    public static final class a implements C5672d0.b {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static final void m12225j(boolean z) {
            if (z) {
                C5835c c5835c = C5835c.f14978a;
                C5835c.m12271a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static final void m12226k(boolean z) throws JSONException {
            if (z) {
                C5929a c5929a = C5929a.f15481a;
                C5929a.m12761a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m12227l(boolean z) {
            if (z) {
                C5919h c5919h = C5919h.f15431a;
                C5919h.m12685c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public static final void m12228m(boolean z) {
            if (z) {
                C5876a c5876a = C5876a.f15262a;
                C5876a.m12487a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m12229n(boolean z) {
            if (z) {
                C5888k c5888k = C5888k.f15323a;
                C5888k.m12564a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static final void m12230o(boolean z) {
            if (z) {
                C5894c c5894c = C5894c.f15343a;
                C5894c.m12594b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public static final void m12231p(boolean z) {
            if (z) {
                C5893b c5893b = C5893b.f15339a;
                C5893b.m12583a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public static final void m12232q(boolean z) {
            if (z) {
                C5845f c5845f = C5845f.f15023a;
                C5845f.m12308a();
            }
        }

        @Override // com.facebook.internal.C5672d0.b
        /* renamed from: a */
        public void mo11431a(C5670c0 c5670c0) {
            C5666a0 c5666a0 = C5666a0.f14313a;
            C5666a0.m11372a(C5666a0.b.AAM, new C5666a0.a() { // from class: com.facebook.o0.n
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5817c0.a.m12225j(z);
                }
            });
            C5666a0.m11372a(C5666a0.b.RestrictiveDataFiltering, new C5666a0.a() { // from class: com.facebook.o0.r
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) throws JSONException {
                    C5817c0.a.m12226k(z);
                }
            });
            C5666a0.m11372a(C5666a0.b.PrivacyProtection, new C5666a0.a() { // from class: com.facebook.o0.k
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5817c0.a.m12227l(z);
                }
            });
            C5666a0.m11372a(C5666a0.b.EventDeactivation, new C5666a0.a() { // from class: com.facebook.o0.p
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5817c0.a.m12228m(z);
                }
            });
            C5666a0.m11372a(C5666a0.b.IapLogging, new C5666a0.a() { // from class: com.facebook.o0.o
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5817c0.a.m12229n(z);
                }
            });
            C5666a0.m11372a(C5666a0.b.ProtectedMode, new C5666a0.a() { // from class: com.facebook.o0.l
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5817c0.a.m12230o(z);
                }
            });
            C5666a0.m11372a(C5666a0.b.MACARuleMatching, new C5666a0.a() { // from class: com.facebook.o0.m
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5817c0.a.m12231p(z);
                }
            });
            C5666a0.m11372a(C5666a0.b.CloudBridge, new C5666a0.a() { // from class: com.facebook.o0.q
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5817c0.a.m12232q(z);
                }
            });
        }

        @Override // com.facebook.internal.C5672d0.b
        public void onError() {
        }
    }

    private C5817c0() {
    }

    /* renamed from: a */
    public static final void m12216a() {
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5672d0.m11415a(new a());
    }
}
