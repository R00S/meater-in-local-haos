package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.C10775u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessTokenCache.kt */
/* renamed from: com.facebook.u */
/* loaded from: classes.dex */
public final class C5954u {

    /* renamed from: a */
    public static final a f15569a = new a(null);

    /* renamed from: b */
    private final SharedPreferences f15570b;

    /* renamed from: c */
    private final b f15571c;

    /* renamed from: d */
    private C5657f0 f15572d;

    /* compiled from: AccessTokenCache.kt */
    /* renamed from: com.facebook.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: AccessTokenCache.kt */
    /* renamed from: com.facebook.u$b */
    public static final class b {
        /* renamed from: a */
        public final C5657f0 m12896a() {
            C5641a0 c5641a0 = C5641a0.f14199a;
            return new C5657f0(C5641a0.m11284c(), null, 2, null);
        }
    }

    public C5954u(SharedPreferences sharedPreferences, b bVar) {
        C9801m.m32346f(sharedPreferences, "sharedPreferences");
        C9801m.m32346f(bVar, "tokenCachingStrategyFactory");
        this.f15570b = sharedPreferences;
        this.f15571c = bVar;
    }

    /* renamed from: b */
    private final AccessToken m12888b() {
        String string = this.f15570b.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.f14054f.m11102b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final AccessToken m12889c() {
        Bundle bundleM11351c = m12890d().m11351c();
        if (bundleM11351c == null || !C5657f0.f14287a.m11358g(bundleM11351c)) {
            return null;
        }
        return AccessToken.f14054f.m11103c(bundleM11351c);
    }

    /* renamed from: d */
    private final C5657f0 m12890d() {
        if (this.f15572d == null) {
            synchronized (this) {
                if (this.f15572d == null) {
                    this.f15572d = this.f15571c.m12896a();
                }
                C10775u c10775u = C10775u.f41439a;
            }
        }
        C5657f0 c5657f0 = this.f15572d;
        if (c5657f0 != null) {
            return c5657f0;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: e */
    private final boolean m12891e() {
        return this.f15570b.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: h */
    private final boolean m12892h() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        return C5641a0.m11305x();
    }

    /* renamed from: a */
    public final void m12893a() {
        this.f15570b.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m12892h()) {
            m12890d().m11350a();
        }
    }

    /* renamed from: f */
    public final AccessToken m12894f() {
        if (m12891e()) {
            return m12888b();
        }
        if (!m12892h()) {
            return null;
        }
        AccessToken accessTokenM12889c = m12889c();
        if (accessTokenM12889c == null) {
            return accessTokenM12889c;
        }
        m12895g(accessTokenM12889c);
        m12890d().m11350a();
        return accessTokenM12889c;
    }

    /* renamed from: g */
    public final void m12895g(AccessToken accessToken) {
        C9801m.m32346f(accessToken, "accessToken");
        try {
            this.f15570b.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m11096o().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5954u() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences sharedPreferences = C5641a0.m11284c().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C9801m.m32345e(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new b());
    }
}
