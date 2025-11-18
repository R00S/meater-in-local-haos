package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.C5696p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import p024c.p076q.p077a.C0997a;

/* compiled from: AuthenticationTokenManager.kt */
/* loaded from: classes.dex */
public final class AuthenticationTokenManager {

    /* renamed from: a */
    public static final C5611a f14102a = new C5611a(null);

    /* renamed from: b */
    private static AuthenticationTokenManager f14103b;

    /* renamed from: c */
    private final C0997a f14104c;

    /* renamed from: d */
    private final C5957x f14105d;

    /* renamed from: e */
    private AuthenticationToken f14106e;

    /* compiled from: AuthenticationTokenManager.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m32267d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lkotlin/u;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "()V", "facebook-core_release"}, m32268k = 1, m32269mv = {1, 5, 1})
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C9801m.m32346f(context, "context");
            C9801m.m32346f(intent, "intent");
        }
    }

    /* compiled from: AuthenticationTokenManager.kt */
    /* renamed from: com.facebook.AuthenticationTokenManager$a */
    public static final class C5611a {
        private C5611a() {
        }

        public /* synthetic */ C5611a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final AuthenticationTokenManager m11130a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f14103b;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.f14103b;
                if (authenticationTokenManager == null) {
                    C5641a0 c5641a0 = C5641a0.f14199a;
                    C0997a c0997aM6341b = C0997a.m6341b(C5641a0.m11284c());
                    C9801m.m32345e(c0997aM6341b, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(c0997aM6341b, new C5957x());
                    C5611a c5611a = AuthenticationTokenManager.f14102a;
                    AuthenticationTokenManager.f14103b = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }
    }

    public AuthenticationTokenManager(C0997a c0997a, C5957x c5957x) {
        C9801m.m32346f(c0997a, "localBroadcastManager");
        C9801m.m32346f(c5957x, "authenticationTokenCache");
        this.f14104c = c0997a;
        this.f14105d = c5957x;
    }

    /* renamed from: d */
    private final void m11126d(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        Intent intent = new Intent(C5641a0.m11284c(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken2);
        this.f14104c.m6344d(intent);
    }

    /* renamed from: f */
    private final void m11127f(AuthenticationToken authenticationToken, boolean z) {
        AuthenticationToken authenticationTokenM11128c = m11128c();
        this.f14106e = authenticationToken;
        if (z) {
            if (authenticationToken != null) {
                this.f14105d.m12939b(authenticationToken);
            } else {
                this.f14105d.m12938a();
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5641a0 c5641a0 = C5641a0.f14199a;
                C5696p0.m11568g(C5641a0.m11284c());
            }
        }
        C5696p0 c5696p02 = C5696p0.f14478a;
        if (C5696p0.m11560c(authenticationTokenM11128c, authenticationToken)) {
            return;
        }
        m11126d(authenticationTokenM11128c, authenticationToken);
    }

    /* renamed from: c */
    public final AuthenticationToken m11128c() {
        return this.f14106e;
    }

    /* renamed from: e */
    public final void m11129e(AuthenticationToken authenticationToken) {
        m11127f(authenticationToken, true);
    }
}
