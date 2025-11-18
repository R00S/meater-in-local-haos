package com.facebook.p157o0;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C5641a0;
import com.facebook.p157o0.C5813a0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: InternalAppEventsLogger.kt */
/* renamed from: com.facebook.o0.g0 */
/* loaded from: classes.dex */
public final class C5825g0 {

    /* renamed from: a */
    public static final a f14949a = new a(null);

    /* renamed from: b */
    private final C5815b0 f14950b;

    /* compiled from: InternalAppEventsLogger.kt */
    /* renamed from: com.facebook.o0.g0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C5825g0 m12249a(String str, String str2, AccessToken accessToken) {
            C9801m.m32346f(str, "activityName");
            return new C5825g0(str, str2, accessToken);
        }

        /* renamed from: b */
        public final Executor m12250b() {
            return C5815b0.f14915a.m12208f();
        }

        /* renamed from: c */
        public final C5813a0.b m12251c() {
            return C5815b0.f14915a.m12210h();
        }

        /* renamed from: d */
        public final String m12252d() {
            return C5815b0.f14915a.m12212j();
        }

        /* renamed from: e */
        public final void m12253e(Map<String, String> map) {
            C9801m.m32346f(map, "ud");
            C5831j0 c5831j0 = C5831j0.f14968a;
            C5831j0.m12268g(map);
        }
    }

    public C5825g0(C5815b0 c5815b0) {
        C9801m.m32346f(c5815b0, "loggerImpl");
        this.f14950b = c5815b0;
    }

    /* renamed from: a */
    public final void m12239a() {
        this.f14950b.m12186j();
    }

    /* renamed from: b */
    public final void m12240b(Bundle bundle) {
        C9801m.m32346f(bundle, "parameters");
        if (!((bundle.getInt("previous") & 2) != 0)) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            if (!C5641a0.m11288g()) {
                return;
            }
        }
        this.f14950b.m12192p("fb_sdk_settings_changed", null, bundle);
    }

    /* renamed from: c */
    public final void m12241c(String str, double d2, Bundle bundle) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            this.f14950b.m12188l(str, d2, bundle);
        }
    }

    /* renamed from: d */
    public final void m12242d(String str, Bundle bundle) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            this.f14950b.m12189m(str, bundle);
        }
    }

    /* renamed from: e */
    public final void m12243e(String str, String str2) {
        this.f14950b.m12191o(str, str2);
    }

    /* renamed from: f */
    public final void m12244f(String str) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            this.f14950b.m12192p(str, null, null);
        }
    }

    /* renamed from: g */
    public final void m12245g(String str, Bundle bundle) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            this.f14950b.m12192p(str, null, bundle);
        }
    }

    /* renamed from: h */
    public final void m12246h(String str, Double d2, Bundle bundle) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            this.f14950b.m12192p(str, d2, bundle);
        }
    }

    /* renamed from: i */
    public final void m12247i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            this.f14950b.m12193q(str, bigDecimal, currency, bundle);
        }
    }

    /* renamed from: j */
    public final void m12248j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            this.f14950b.m12195s(bigDecimal, currency, bundle);
        }
    }

    public C5825g0(Context context) {
        this(new C5815b0(context, (String) null, (AccessToken) null));
    }

    public C5825g0(Context context, String str) {
        this(new C5815b0(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5825g0(String str, String str2, AccessToken accessToken) {
        this(new C5815b0(str, str2, accessToken));
        C9801m.m32346f(str, "activityName");
    }
}
