package com.facebook.p157o0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import java.util.Arrays;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: AppEventsLogger.kt */
/* renamed from: com.facebook.o0.a0 */
/* loaded from: classes.dex */
public final class C5813a0 {

    /* renamed from: a */
    public static final a f14908a = new a(null);

    /* renamed from: b */
    private static final String f14909b = C5813a0.class.getCanonicalName();

    /* renamed from: c */
    private final C5815b0 f14910c;

    /* compiled from: AppEventsLogger.kt */
    /* renamed from: com.facebook.o0.a0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final void m12167a(Application application) {
            C9801m.m32346f(application, "application");
            C5815b0.f14915a.m12206d(application, null);
        }

        /* renamed from: b */
        public final void m12168b(Application application, String str) {
            C9801m.m32346f(application, "application");
            C5815b0.f14915a.m12206d(application, str);
        }

        /* renamed from: c */
        public final String m12169c(Context context) {
            C9801m.m32346f(context, "context");
            return C5815b0.f14915a.m12209g(context);
        }

        /* renamed from: d */
        public final b m12170d() {
            return C5815b0.f14915a.m12210h();
        }

        /* renamed from: e */
        public final String m12171e() {
            C5930u c5930u = C5930u.f15488a;
            return C5930u.m12770a();
        }

        /* renamed from: f */
        public final void m12172f(Context context, String str) {
            C9801m.m32346f(context, "context");
            C5815b0.f14915a.m12213k(context, str);
        }

        /* renamed from: g */
        public final C5813a0 m12173g(Context context) {
            C9801m.m32346f(context, "context");
            return new C5813a0(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* renamed from: h */
        public final void m12174h() {
            C5815b0.f14915a.m12214s();
        }

        /* renamed from: i */
        public final void m12175i(String str) {
            C5930u c5930u = C5930u.f15488a;
            C5930u.m12776g(str);
        }
    }

    /* compiled from: AppEventsLogger.kt */
    /* renamed from: com.facebook.o0.a0$b */
    public enum b {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            return (b[]) Arrays.copyOf(bVarArrValuesCustom, bVarArrValuesCustom.length);
        }
    }

    private C5813a0(Context context, String str, AccessToken accessToken) {
        this.f14910c = new C5815b0(context, str, accessToken);
    }

    public /* synthetic */ C5813a0(Context context, String str, AccessToken accessToken, C9789g c9789g) {
        this(context, str, accessToken);
    }

    /* renamed from: a */
    public static final void m12161a(Application application) {
        f14908a.m12167a(application);
    }

    /* renamed from: e */
    public static final C5813a0 m12162e(Context context) {
        return f14908a.m12173g(context);
    }

    /* renamed from: f */
    public static final void m12163f(String str) {
        f14908a.m12175i(str);
    }

    /* renamed from: b */
    public final void m12164b() {
        this.f14910c.m12186j();
    }

    /* renamed from: c */
    public final void m12165c(String str) {
        this.f14910c.m12187k(str);
    }

    /* renamed from: d */
    public final void m12166d(String str, Bundle bundle) {
        this.f14910c.m12189m(str, bundle);
    }
}
