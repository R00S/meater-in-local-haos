package com.facebook;

import android.content.Intent;
import com.facebook.internal.C5696p0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import p024c.p076q.p077a.C0997a;

/* compiled from: ProfileManager.kt */
/* renamed from: com.facebook.i0 */
/* loaded from: classes.dex */
public final class C5663i0 {

    /* renamed from: a */
    public static final a f14305a = new a(null);

    /* renamed from: b */
    private static volatile C5663i0 f14306b;

    /* renamed from: c */
    private final C0997a f14307c;

    /* renamed from: d */
    private final C5661h0 f14308d;

    /* renamed from: e */
    private Profile f14309e;

    /* compiled from: ProfileManager.kt */
    /* renamed from: com.facebook.i0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final synchronized C5663i0 m11370a() {
            C5663i0 c5663i0;
            if (C5663i0.f14306b == null) {
                C5641a0 c5641a0 = C5641a0.f14199a;
                C0997a c0997aM6341b = C0997a.m6341b(C5641a0.m11284c());
                C9801m.m32345e(c0997aM6341b, "getInstance(applicationContext)");
                C5663i0.f14306b = new C5663i0(c0997aM6341b, new C5661h0());
            }
            c5663i0 = C5663i0.f14306b;
            if (c5663i0 == null) {
                C9801m.m32363w("instance");
                throw null;
            }
            return c5663i0;
        }
    }

    public C5663i0(C0997a c0997a, C5661h0 c5661h0) {
        C9801m.m32346f(c0997a, "localBroadcastManager");
        C9801m.m32346f(c5661h0, "profileCache");
        this.f14307c = c0997a;
        this.f14308d = c5661h0;
    }

    /* renamed from: e */
    private final void m11365e(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f14307c.m6344d(intent);
    }

    /* renamed from: g */
    private final void m11366g(Profile profile, boolean z) {
        Profile profile2 = this.f14309e;
        this.f14309e = profile;
        if (z) {
            if (profile != null) {
                this.f14308d.m11362c(profile);
            } else {
                this.f14308d.m11360a();
            }
        }
        C5696p0 c5696p0 = C5696p0.f14478a;
        if (C5696p0.m11560c(profile2, profile)) {
            return;
        }
        m11365e(profile2, profile);
    }

    /* renamed from: c */
    public final Profile m11367c() {
        return this.f14309e;
    }

    /* renamed from: d */
    public final boolean m11368d() {
        Profile profileM11361b = this.f14308d.m11361b();
        if (profileM11361b == null) {
            return false;
        }
        m11366g(profileM11361b, false);
        return true;
    }

    /* renamed from: f */
    public final void m11369f(Profile profile) {
        m11366g(profile, true);
    }
}
