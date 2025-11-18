package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import cm.aptoide.p092pt.notification.PullingContentService;
import com.facebook.AccessToken;
import com.facebook.C5646c0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5696p0;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONObject;
import p024c.p076q.p077a.C0997a;

/* compiled from: AccessTokenManager.kt */
/* renamed from: com.facebook.v */
/* loaded from: classes.dex */
public final class C5955v {

    /* renamed from: a */
    public static final a f15573a = new a(null);

    /* renamed from: b */
    private static C5955v f15574b;

    /* renamed from: c */
    private final C0997a f15575c;

    /* renamed from: d */
    private final C5954u f15576d;

    /* renamed from: e */
    private AccessToken f15577e;

    /* renamed from: f */
    private final AtomicBoolean f15578f;

    /* renamed from: g */
    private Date f15579g;

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final GraphRequest m12920c(AccessToken accessToken, GraphRequest.InterfaceC5631b interfaceC5631b) {
            e eVarM12922f = m12922f(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", eVarM12922f.mo12924a());
            bundle.putString("client_id", accessToken.m11084c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestM11236x = GraphRequest.f14159a.m11236x(accessToken, eVarM12922f.mo12925b(), interfaceC5631b);
            graphRequestM11236x.m11177H(bundle);
            graphRequestM11236x.m11176G(EnumC5655e0.GET);
            return graphRequestM11236x;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final GraphRequest m12921d(AccessToken accessToken, GraphRequest.InterfaceC5631b interfaceC5631b) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest graphRequestM11236x = GraphRequest.f14159a.m11236x(accessToken, "me/permissions", interfaceC5631b);
            graphRequestM11236x.m11177H(bundle);
            graphRequestM11236x.m11176G(EnumC5655e0.GET);
            return graphRequestM11236x;
        }

        /* renamed from: f */
        private final e m12922f(AccessToken accessToken) {
            String strM11089h = accessToken.m11089h();
            if (strM11089h == null) {
                strM11089h = "facebook";
            }
            return C9801m.m32341a(strM11089h, "instagram") ? new c() : new b();
        }

        /* renamed from: e */
        public final C5955v m12923e() {
            C5955v c5955v;
            C5955v c5955v2 = C5955v.f15574b;
            if (c5955v2 != null) {
                return c5955v2;
            }
            synchronized (this) {
                c5955v = C5955v.f15574b;
                if (c5955v == null) {
                    C5641a0 c5641a0 = C5641a0.f14199a;
                    C0997a c0997aM6341b = C0997a.m6341b(C5641a0.m11284c());
                    C9801m.m32345e(c0997aM6341b, "getInstance(applicationContext)");
                    C5955v c5955v3 = new C5955v(c0997aM6341b, new C5954u());
                    a aVar = C5955v.f15573a;
                    C5955v.f15574b = c5955v3;
                    c5955v = c5955v3;
                }
            }
            return c5955v;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$b */
    public static final class b implements e {

        /* renamed from: a */
        private final String f15580a = "oauth/access_token";

        /* renamed from: b */
        private final String f15581b = "fb_extend_sso_token";

        @Override // com.facebook.C5955v.e
        /* renamed from: a */
        public String mo12924a() {
            return this.f15581b;
        }

        @Override // com.facebook.C5955v.e
        /* renamed from: b */
        public String mo12925b() {
            return this.f15580a;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$c */
    public static final class c implements e {

        /* renamed from: a */
        private final String f15582a = "refresh_access_token";

        /* renamed from: b */
        private final String f15583b = "ig_refresh_token";

        @Override // com.facebook.C5955v.e
        /* renamed from: a */
        public String mo12924a() {
            return this.f15583b;
        }

        @Override // com.facebook.C5955v.e
        /* renamed from: b */
        public String mo12925b() {
            return this.f15582a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$d */
    static final class d {

        /* renamed from: a */
        private String f15584a;

        /* renamed from: b */
        private int f15585b;

        /* renamed from: c */
        private int f15586c;

        /* renamed from: d */
        private Long f15587d;

        /* renamed from: e */
        private String f15588e;

        /* renamed from: a */
        public final String m12926a() {
            return this.f15584a;
        }

        /* renamed from: b */
        public final Long m12927b() {
            return this.f15587d;
        }

        /* renamed from: c */
        public final int m12928c() {
            return this.f15585b;
        }

        /* renamed from: d */
        public final int m12929d() {
            return this.f15586c;
        }

        /* renamed from: e */
        public final String m12930e() {
            return this.f15588e;
        }

        /* renamed from: f */
        public final void m12931f(String str) {
            this.f15584a = str;
        }

        /* renamed from: g */
        public final void m12932g(Long l) {
            this.f15587d = l;
        }

        /* renamed from: h */
        public final void m12933h(int i2) {
            this.f15585b = i2;
        }

        /* renamed from: i */
        public final void m12934i(int i2) {
            this.f15586c = i2;
        }

        /* renamed from: j */
        public final void m12935j(String str) {
            this.f15588e = str;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.v$e */
    public interface e {
        /* renamed from: a */
        String mo12924a();

        /* renamed from: b */
        String mo12925b();
    }

    public C5955v(C0997a c0997a, C5954u c5954u) {
        C9801m.m32346f(c0997a, "localBroadcastManager");
        C9801m.m32346f(c5954u, "accessTokenCache");
        this.f15575c = c0997a;
        this.f15576d = c5954u;
        this.f15578f = new AtomicBoolean(false);
        this.f15579g = new Date(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m12903l(C5955v c5955v, AccessToken.InterfaceC5601a interfaceC5601a) {
        C9801m.m32346f(c5955v, "this$0");
        c5955v.m12904m(interfaceC5601a);
    }

    /* renamed from: m */
    private final void m12904m(final AccessToken.InterfaceC5601a interfaceC5601a) {
        final AccessToken accessTokenM12914e = m12914e();
        if (accessTokenM12914e == null) {
            if (interfaceC5601a == null) {
                return;
            }
            interfaceC5601a.m11097a(new FacebookException("No current access token to refresh"));
            return;
        }
        if (!this.f15578f.compareAndSet(false, true)) {
            if (interfaceC5601a == null) {
                return;
            }
            interfaceC5601a.m11097a(new FacebookException("Refresh already in progress"));
            return;
        }
        this.f15579g = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        a aVar = f15573a;
        C5646c0 c5646c0 = new C5646c0(aVar.m12921d(accessTokenM12914e, new GraphRequest.InterfaceC5631b() { // from class: com.facebook.d
            @Override // com.facebook.GraphRequest.InterfaceC5631b
            /* renamed from: b */
            public final void mo11196b(C5653d0 c5653d0) {
                C5955v.m12905n(atomicBoolean, hashSet, hashSet2, hashSet3, c5653d0);
            }
        }), aVar.m12920c(accessTokenM12914e, new GraphRequest.InterfaceC5631b() { // from class: com.facebook.b
            @Override // com.facebook.GraphRequest.InterfaceC5631b
            /* renamed from: b */
            public final void mo11196b(C5653d0 c5653d0) {
                C5955v.m12906o(dVar, c5653d0);
            }
        }));
        c5646c0.m11323g(new C5646c0.a() { // from class: com.facebook.c
            @Override // com.facebook.C5646c0.a
            /* renamed from: a */
            public final void mo11312a(C5646c0 c5646c02) throws Throwable {
                C5955v.m12907p(dVar, accessTokenM12914e, interfaceC5601a, atomicBoolean, hashSet, hashSet2, hashSet3, this, c5646c02);
            }
        });
        c5646c0.m11326o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m12905n(java.util.concurrent.atomic.AtomicBoolean r6, java.util.Set r7, java.util.Set r8, java.util.Set r9, com.facebook.C5653d0 r10) {
        /*
            java.lang.String r0 = "$permissionsCallSucceeded"
            kotlin.jvm.internal.C9801m.m32346f(r6, r0)
            java.lang.String r0 = "$permissions"
            kotlin.jvm.internal.C9801m.m32346f(r7, r0)
            java.lang.String r0 = "$declinedPermissions"
            kotlin.jvm.internal.C9801m.m32346f(r8, r0)
            java.lang.String r0 = "$expiredPermissions"
            kotlin.jvm.internal.C9801m.m32346f(r9, r0)
            java.lang.String r0 = "response"
            kotlin.jvm.internal.C9801m.m32346f(r10, r0)
            org.json.JSONObject r10 = r10.m11340d()
            if (r10 != 0) goto L20
            return
        L20:
            java.lang.String r0 = "data"
            org.json.JSONArray r10 = r10.optJSONArray(r0)
            if (r10 != 0) goto L29
            return
        L29:
            r0 = 1
            r6.set(r0)
            r6 = 0
            int r0 = r10.length()
            if (r0 <= 0) goto Lb9
        L34:
            int r1 = r6 + 1
            org.json.JSONObject r6 = r10.optJSONObject(r6)
            if (r6 != 0) goto L3e
            goto Lb3
        L3e:
            java.lang.String r2 = "permission"
            java.lang.String r2 = r6.optString(r2)
            java.lang.String r3 = "status"
            java.lang.String r6 = r6.optString(r3)
            com.facebook.internal.p0 r4 = com.facebook.internal.C5696p0.f14478a
            boolean r4 = com.facebook.internal.C5696p0.m11557a0(r2)
            if (r4 != 0) goto Lb3
            boolean r4 = com.facebook.internal.C5696p0.m11557a0(r6)
            if (r4 != 0) goto Lb3
            kotlin.jvm.internal.C9801m.m32345e(r6, r3)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "US"
            kotlin.jvm.internal.C9801m.m32345e(r4, r5)
            java.lang.String r6 = r6.toLowerCase(r4)
            java.lang.String r4 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C9801m.m32345e(r6, r4)
            kotlin.jvm.internal.C9801m.m32345e(r6, r3)
            int r3 = r6.hashCode()
            r4 = -1309235419(0xffffffffb1f6a725, float:-7.1785444E-9)
            if (r3 == r4) goto L9c
            r4 = 280295099(0x10b4f6bb, float:7.137763E-29)
            if (r3 == r4) goto L8f
            r4 = 568196142(0x21ddfc2e, float:1.5042294E-18)
            if (r3 == r4) goto L82
            goto La4
        L82:
            java.lang.String r3 = "declined"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L8b
            goto La4
        L8b:
            r8.add(r2)
            goto Lb3
        L8f:
            java.lang.String r3 = "granted"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L98
            goto La4
        L98:
            r7.add(r2)
            goto Lb3
        L9c:
            java.lang.String r3 = "expired"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto Lb0
        La4:
            java.lang.String r2 = "Unexpected status: "
            java.lang.String r6 = kotlin.jvm.internal.C9801m.m32354n(r2, r6)
            java.lang.String r2 = "AccessTokenManager"
            android.util.Log.w(r2, r6)
            goto Lb3
        Lb0:
            r9.add(r2)
        Lb3:
            if (r1 < r0) goto Lb6
            goto Lb9
        Lb6:
            r6 = r1
            goto L34
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C5955v.m12905n(java.util.concurrent.atomic.AtomicBoolean, java.util.Set, java.util.Set, java.util.Set, com.facebook.d0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m12906o(d dVar, C5653d0 c5653d0) {
        C9801m.m32346f(dVar, "$refreshResult");
        C9801m.m32346f(c5653d0, "response");
        JSONObject jSONObjectM11340d = c5653d0.m11340d();
        if (jSONObjectM11340d == null) {
            return;
        }
        dVar.m12931f(jSONObjectM11340d.optString("access_token"));
        dVar.m12933h(jSONObjectM11340d.optInt("expires_at"));
        dVar.m12934i(jSONObjectM11340d.optInt("expires_in"));
        dVar.m12932g(Long.valueOf(jSONObjectM11340d.optLong("data_access_expiration_time")));
        dVar.m12935j(jSONObjectM11340d.optString("graph_domain", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m12907p(d dVar, AccessToken accessToken, AccessToken.InterfaceC5601a interfaceC5601a, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, C5955v c5955v, C5646c0 c5646c0) throws Throwable {
        AccessToken accessToken2;
        C9801m.m32346f(dVar, "$refreshResult");
        C9801m.m32346f(atomicBoolean, "$permissionsCallSucceeded");
        C9801m.m32346f(set, "$permissions");
        C9801m.m32346f(set2, "$declinedPermissions");
        C9801m.m32346f(set3, "$expiredPermissions");
        C9801m.m32346f(c5955v, "this$0");
        C9801m.m32346f(c5646c0, "it");
        String strM12926a = dVar.m12926a();
        int iM12928c = dVar.m12928c();
        Long lM12927b = dVar.m12927b();
        String strM12930e = dVar.m12930e();
        try {
            a aVar = f15573a;
            if (aVar.m12923e().m12914e() != null) {
                AccessToken accessTokenM12914e = aVar.m12923e().m12914e();
                if ((accessTokenM12914e == null ? null : accessTokenM12914e.m11094m()) == accessToken.m11094m()) {
                    if (!atomicBoolean.get() && strM12926a == null && iM12928c == 0) {
                        if (interfaceC5601a != null) {
                            interfaceC5601a.m11097a(new FacebookException("Failed to refresh access token"));
                        }
                        c5955v.f15578f.set(false);
                        return;
                    }
                    Date dateM11088g = accessToken.m11088g();
                    if (dVar.m12928c() != 0) {
                        dateM11088g = new Date(dVar.m12928c() * 1000);
                    } else if (dVar.m12929d() != 0) {
                        dateM11088g = new Date((dVar.m12929d() * 1000) + new Date().getTime());
                    }
                    Date date = dateM11088g;
                    if (strM12926a == null) {
                        strM12926a = accessToken.m11093l();
                    }
                    String str = strM12926a;
                    String strM11084c = accessToken.m11084c();
                    String strM11094m = accessToken.m11094m();
                    Set setM11091j = atomicBoolean.get() ? set : accessToken.m11091j();
                    Set setM11086e = atomicBoolean.get() ? set2 : accessToken.m11086e();
                    Set setM11087f = atomicBoolean.get() ? set3 : accessToken.m11087f();
                    EnumC5956w enumC5956wM11092k = accessToken.m11092k();
                    Date date2 = new Date();
                    Date date3 = lM12927b != null ? new Date(lM12927b.longValue() * 1000) : accessToken.m11085d();
                    if (strM12930e == null) {
                        strM12930e = accessToken.m11089h();
                    }
                    AccessToken accessToken3 = new AccessToken(str, strM11084c, strM11094m, setM11091j, setM11086e, setM11087f, enumC5956wM11092k, date, date2, date3, strM12930e);
                    try {
                        aVar.m12923e().m12917r(accessToken3);
                        c5955v.f15578f.set(false);
                        if (interfaceC5601a != null) {
                            interfaceC5601a.m11098b(accessToken3);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        accessToken2 = accessToken3;
                        c5955v.f15578f.set(false);
                        if (interfaceC5601a != null && accessToken2 != null) {
                            interfaceC5601a.m11098b(accessToken2);
                        }
                        throw th;
                    }
                }
            }
            if (interfaceC5601a != null) {
                interfaceC5601a.m11097a(new FacebookException("No current access token to refresh"));
            }
            c5955v.f15578f.set(false);
        } catch (Throwable th2) {
            th = th2;
            accessToken2 = null;
        }
    }

    /* renamed from: q */
    private final void m12908q(AccessToken accessToken, AccessToken accessToken2) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        Intent intent = new Intent(C5641a0.m11284c(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f15575c.m6344d(intent);
    }

    /* renamed from: s */
    private final void m12909s(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f15577e;
        this.f15577e = accessToken;
        this.f15578f.set(false);
        this.f15579g = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.f15576d.m12895g(accessToken);
            } else {
                this.f15576d.m12893a();
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5641a0 c5641a0 = C5641a0.f14199a;
                C5696p0.m11568g(C5641a0.m11284c());
            }
        }
        C5696p0 c5696p02 = C5696p0.f14478a;
        if (C5696p0.m11560c(accessToken2, accessToken)) {
            return;
        }
        m12908q(accessToken2, accessToken);
        m12910t();
    }

    /* renamed from: t */
    private final void m12910t() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        AccessToken.C5603c c5603c = AccessToken.f14054f;
        AccessToken accessTokenM11105e = c5603c.m11105e();
        AlarmManager alarmManager = (AlarmManager) contextM11284c.getSystemService("alarm");
        if (c5603c.m11107g()) {
            if ((accessTokenM11105e == null ? null : accessTokenM11105e.m11088g()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextM11284c, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessTokenM11105e.m11088g().getTime(), Build.VERSION.SDK_INT >= 23 ? PendingIntent.getBroadcast(contextM11284c, 0, intent, 67108864) : PendingIntent.getBroadcast(contextM11284c, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: u */
    private final boolean m12911u() {
        AccessToken accessTokenM12914e = m12914e();
        if (accessTokenM12914e == null) {
            return false;
        }
        long time = new Date().getTime();
        return accessTokenM12914e.m11092k().m12937k() && time - this.f15579g.getTime() > 3600000 && time - accessTokenM12914e.m11090i().getTime() > PullingContentService.UPDATES_INTERVAL;
    }

    /* renamed from: c */
    public final void m12912c() {
        m12908q(m12914e(), m12914e());
    }

    /* renamed from: d */
    public final void m12913d() {
        if (m12911u()) {
            m12916k(null);
        }
    }

    /* renamed from: e */
    public final AccessToken m12914e() {
        return this.f15577e;
    }

    /* renamed from: j */
    public final boolean m12915j() {
        AccessToken accessTokenM12894f = this.f15576d.m12894f();
        if (accessTokenM12894f == null) {
            return false;
        }
        m12909s(accessTokenM12894f, false);
        return true;
    }

    /* renamed from: k */
    public final void m12916k(final AccessToken.InterfaceC5601a interfaceC5601a) {
        if (C9801m.m32341a(Looper.getMainLooper(), Looper.myLooper())) {
            m12904m(interfaceC5601a);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.a
                @Override // java.lang.Runnable
                public final void run() {
                    C5955v.m12903l(this.f14197f, interfaceC5601a);
                }
            });
        }
    }

    /* renamed from: r */
    public final void m12917r(AccessToken accessToken) {
        m12909s(accessToken, true);
    }
}
