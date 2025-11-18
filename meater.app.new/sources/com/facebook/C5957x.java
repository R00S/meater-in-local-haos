package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;

/* compiled from: AuthenticationTokenCache.kt */
/* renamed from: com.facebook.x */
/* loaded from: classes.dex */
public final class C5957x {

    /* renamed from: a */
    public static final a f15603a = new a(null);

    /* renamed from: b */
    private final SharedPreferences f15604b;

    /* compiled from: AuthenticationTokenCache.kt */
    /* renamed from: com.facebook.x$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public C5957x(SharedPreferences sharedPreferences) {
        C9801m.m32346f(sharedPreferences, "sharedPreferences");
        this.f15604b = sharedPreferences;
    }

    /* renamed from: a */
    public final void m12938a() {
        this.f15604b.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    /* renamed from: b */
    public final void m12939b(AuthenticationToken authenticationToken) {
        C9801m.m32346f(authenticationToken, "authenticationToken");
        try {
            this.f15604b.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.m11110b().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5957x() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences sharedPreferences = C5641a0.m11284c().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        C9801m.m32345e(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this(sharedPreferences);
    }
}
