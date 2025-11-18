package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.InterfaceC0052c;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C5641a0;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.InterfaceC5958y;
import com.facebook.InterfaceC5959z;
import com.facebook.Profile;
import com.facebook.internal.C5698q0;
import com.facebook.internal.C5704t;
import com.facebook.internal.C5733v;
import com.facebook.login.LoginClient;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.C10775u;
import kotlin.collections.C10782c0;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import org.json.JSONException;
import p024c.p038c.p039b.C0858b;

/* compiled from: LoginManager.kt */
/* renamed from: com.facebook.login.x */
/* loaded from: classes2.dex */
public class C5804x {

    /* renamed from: a */
    public static final b f14858a;

    /* renamed from: b */
    private static final Set<String> f14859b;

    /* renamed from: c */
    private static final String f14860c;

    /* renamed from: d */
    private static volatile C5804x f14861d;

    /* renamed from: g */
    private final SharedPreferences f14864g;

    /* renamed from: i */
    private String f14866i;

    /* renamed from: j */
    private boolean f14867j;

    /* renamed from: l */
    private boolean f14869l;

    /* renamed from: m */
    private boolean f14870m;

    /* renamed from: e */
    private EnumC5800t f14862e = EnumC5800t.NATIVE_WITH_FALLBACK;

    /* renamed from: f */
    private EnumC5798r f14863f = EnumC5798r.FRIENDS;

    /* renamed from: h */
    private String f14865h = "rerequest";

    /* renamed from: k */
    private EnumC5806z f14868k = EnumC5806z.FACEBOOK;

    /* compiled from: LoginManager.kt */
    /* renamed from: com.facebook.login.x$a */
    private static final class a implements InterfaceC5783c0 {

        /* renamed from: a */
        private final Activity f14871a;

        public a(Activity activity) {
            C9801m.m32346f(activity, "activity");
            this.f14871a = activity;
        }

        @Override // com.facebook.login.InterfaceC5783c0
        /* renamed from: a */
        public Activity mo12046a() {
            return this.f14871a;
        }

        @Override // com.facebook.login.InterfaceC5783c0
        public void startActivityForResult(Intent intent, int i2) {
            C9801m.m32346f(intent, "intent");
            mo12046a().startActivityForResult(intent, i2);
        }
    }

    /* compiled from: LoginManager.kt */
    /* renamed from: com.facebook.login.x$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final Set<String> m12124d() {
            return C10822w0.m38922i("ads_management", "create_event", "rsvp_event");
        }

        /* renamed from: b */
        public final C5805y m12125b(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
            C9801m.m32346f(request, "request");
            C9801m.m32346f(accessToken, "newToken");
            Set<String> setM11967n = request.m11967n();
            Set setM38572H0 = C10782c0.m38572H0(C10782c0.m38586R(accessToken.m11091j()));
            if (request.m11972s()) {
                setM38572H0.retainAll(setM11967n);
            }
            Set setM38572H02 = C10782c0.m38572H0(C10782c0.m38586R(setM11967n));
            setM38572H02.removeAll(setM38572H0);
            return new C5805y(accessToken, authenticationToken, setM38572H0, setM38572H02);
        }

        /* renamed from: c */
        public C5804x m12126c() {
            if (C5804x.f14861d == null) {
                synchronized (this) {
                    b bVar = C5804x.f14858a;
                    C5804x.f14861d = new C5804x();
                    C10775u c10775u = C10775u.f41439a;
                }
            }
            C5804x c5804x = C5804x.f14861d;
            if (c5804x != null) {
                return c5804x;
            }
            C9801m.m32363w("instance");
            throw null;
        }

        /* renamed from: e */
        public final boolean m12127e(String str) {
            if (str != null) {
                return C10546u.m37511E(str, "publish", false, 2, null) || C10546u.m37511E(str, "manage", false, 2, null) || C5804x.f14859b.contains(str);
            }
            return false;
        }
    }

    /* compiled from: LoginManager.kt */
    /* renamed from: com.facebook.login.x$c */
    private static final class c {

        /* renamed from: a */
        public static final c f14872a = new c();

        /* renamed from: b */
        private static C5803w f14873b;

        private c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0011 A[Catch: all -> 0x000a, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x0011, B:14:0x0015, B:15:0x0022), top: B:20:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized com.facebook.login.C5803w m12128a(android.content.Context r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                if (r3 != 0) goto Lc
                com.facebook.a0 r3 = com.facebook.C5641a0.f14199a     // Catch: java.lang.Throwable -> La
                android.content.Context r3 = com.facebook.C5641a0.m11284c()     // Catch: java.lang.Throwable -> La
                goto Lc
            La:
                r3 = move-exception
                goto L26
            Lc:
                if (r3 != 0) goto L11
                r3 = 0
                monitor-exit(r2)
                return r3
            L11:
                com.facebook.login.w r0 = com.facebook.login.C5804x.c.f14873b     // Catch: java.lang.Throwable -> La
                if (r0 != 0) goto L22
                com.facebook.login.w r0 = new com.facebook.login.w     // Catch: java.lang.Throwable -> La
                com.facebook.a0 r1 = com.facebook.C5641a0.f14199a     // Catch: java.lang.Throwable -> La
                java.lang.String r1 = com.facebook.C5641a0.m11285d()     // Catch: java.lang.Throwable -> La
                r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> La
                com.facebook.login.C5804x.c.f14873b = r0     // Catch: java.lang.Throwable -> La
            L22:
                com.facebook.login.w r3 = com.facebook.login.C5804x.c.f14873b     // Catch: java.lang.Throwable -> La
                monitor-exit(r2)
                return r3
            L26:
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C5804x.c.m12128a(android.content.Context):com.facebook.login.w");
        }
    }

    static {
        b bVar = new b(null);
        f14858a = bVar;
        f14859b = bVar.m12124d();
        String string = C5804x.class.toString();
        C9801m.m32345e(string, "LoginManager::class.java.toString()");
        f14860c = string;
    }

    public C5804x() {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11644l();
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences sharedPreferences = C5641a0.m11284c().getSharedPreferences("com.facebook.loginManager", 0);
        C9801m.m32345e(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f14864g = sharedPreferences;
        if (C5641a0.f14215q) {
            C5733v c5733v = C5733v.f14626a;
            if (C5733v.m11803a() != null) {
                C0858b.m5392a(C5641a0.m11284c(), "com.android.chrome", new C5797q());
                C0858b.m5393b(C5641a0.m11284c(), C5641a0.m11284c().getPackageName());
            }
        }
    }

    /* renamed from: e */
    private final void m12102e(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z, InterfaceC5959z<C5805y> interfaceC5959z) {
        if (accessToken != null) {
            AccessToken.f14054f.m11108h(accessToken);
            Profile.f14188f.m11256a();
        }
        if (authenticationToken != null) {
            AuthenticationToken.f14071f.m11113a(authenticationToken);
        }
        if (interfaceC5959z != null) {
            C5805y c5805yM12125b = (accessToken == null || request == null) ? null : f14858a.m12125b(request, accessToken, authenticationToken);
            if (z || (c5805yM12125b != null && c5805yM12125b.m12130b().isEmpty())) {
                interfaceC5959z.onCancel();
                return;
            }
            if (facebookException != null) {
                interfaceC5959z.onError(facebookException);
            } else {
                if (accessToken == null || c5805yM12125b == null) {
                    return;
                }
                m12111t(true);
                interfaceC5959z.onSuccess(c5805yM12125b);
            }
        }
    }

    /* renamed from: g */
    public static C5804x m12103g() {
        return f14858a.m12126c();
    }

    /* renamed from: j */
    private final void m12106j(Context context, LoginClient.Result.EnumC5765a enumC5765a, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) throws JSONException {
        C5803w c5803wM12128a = c.f14872a.m12128a(context);
        if (c5803wM12128a == null) {
            return;
        }
        if (request == null) {
            C5803w.m12089k(c5803wM12128a, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z ? "1" : "0");
        c5803wM12128a.m12094f(request.m11955b(), map2, enumC5765a, map, exc, request.m11970q() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    /* renamed from: n */
    private final void m12107n(Context context, LoginClient.Request request) throws JSONException {
        C5803w c5803wM12128a = c.f14872a.m12128a(context);
        if (c5803wM12128a == null || request == null) {
            return;
        }
        c5803wM12128a.m12095i(request, request.m11970q() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static /* synthetic */ boolean m12108p(C5804x c5804x, int i2, Intent intent, InterfaceC5959z interfaceC5959z, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i3 & 4) != 0) {
            interfaceC5959z = null;
        }
        return c5804x.m12121o(i2, intent, interfaceC5959z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m12109r(C5804x c5804x, InterfaceC5959z interfaceC5959z, int i2, Intent intent) {
        C9801m.m32346f(c5804x, "this$0");
        return c5804x.m12121o(i2, intent, interfaceC5959z);
    }

    /* renamed from: s */
    private final boolean m12110s(Intent intent) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        return C5641a0.m11284c().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: t */
    private final void m12111t(boolean z) {
        SharedPreferences.Editor editorEdit = this.f14864g.edit();
        editorEdit.putBoolean("express_login_allowed", z);
        editorEdit.apply();
    }

    /* renamed from: u */
    private final void m12112u(InterfaceC5783c0 interfaceC5783c0, LoginClient.Request request) throws JSONException, FacebookException {
        m12107n(interfaceC5783c0.mo12046a(), request);
        C5704t.f14540a.m11711c(C5704t.c.Login.m11713k(), new C5704t.a() { // from class: com.facebook.login.m
            @Override // com.facebook.internal.C5704t.a
            /* renamed from: a */
            public final boolean mo11707a(int i2, Intent intent) {
                return C5804x.m12113v(this.f14807a, i2, intent);
            }
        });
        if (m12114w(interfaceC5783c0, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        m12106j(interfaceC5783c0.mo12046a(), LoginClient.Result.EnumC5765a.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final boolean m12113v(C5804x c5804x, int i2, Intent intent) {
        C9801m.m32346f(c5804x, "this$0");
        return m12108p(c5804x, i2, intent, null, 4, null);
    }

    /* renamed from: w */
    private final boolean m12114w(InterfaceC5783c0 interfaceC5783c0, LoginClient.Request request) {
        Intent intentM12117f = m12117f(request);
        if (!m12110s(intentM12117f)) {
            return false;
        }
        try {
            interfaceC5783c0.startActivityForResult(intentM12117f, LoginClient.f14714f.m11996b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: x */
    private final void m12115x(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (f14858a.m12127e(str)) {
                throw new FacebookException("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
            }
        }
    }

    /* renamed from: d */
    protected LoginClient.Request m12116d(C5801u c5801u) throws NoSuchAlgorithmException {
        String strM12065a;
        C9801m.m32346f(c5801u, "loginConfig");
        EnumC5796p enumC5796p = EnumC5796p.S256;
        try {
            C5781b0 c5781b0 = C5781b0.f14789a;
            strM12065a = C5781b0.m12043b(c5801u.m12065a(), enumC5796p);
        } catch (FacebookException unused) {
            enumC5796p = EnumC5796p.PLAIN;
            strM12065a = c5801u.m12065a();
        }
        String str = strM12065a;
        EnumC5800t enumC5800t = this.f14862e;
        Set setM38574I0 = C10782c0.m38574I0(c5801u.m12067c());
        EnumC5798r enumC5798r = this.f14863f;
        String str2 = this.f14865h;
        C5641a0 c5641a0 = C5641a0.f14199a;
        String strM11285d = C5641a0.m11285d();
        String string = UUID.randomUUID().toString();
        C9801m.m32345e(string, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(enumC5800t, setM38574I0, enumC5798r, str2, strM11285d, string, this.f14868k, c5801u.m12066b(), c5801u.m12065a(), str, enumC5796p);
        request.m11976w(AccessToken.f14054f.m11107g());
        request.m11974u(this.f14866i);
        request.m11977x(this.f14867j);
        request.m11973t(this.f14869l);
        request.m11978y(this.f14870m);
        return request;
    }

    /* renamed from: f */
    protected Intent m12117f(LoginClient.Request request) {
        C9801m.m32346f(request, "request");
        Intent intent = new Intent();
        C5641a0 c5641a0 = C5641a0.f14199a;
        intent.setClass(C5641a0.m11284c(), FacebookActivity.class);
        intent.setAction(request.m11963j().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: k */
    public final void m12118k(Activity activity, C5801u c5801u) throws JSONException, FacebookException, NoSuchAlgorithmException {
        C9801m.m32346f(activity, "activity");
        C9801m.m32346f(c5801u, "loginConfig");
        if (activity instanceof InterfaceC0052c) {
            Log.w(f14860c, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        m12112u(new a(activity), m12116d(c5801u));
    }

    /* renamed from: l */
    public final void m12119l(Activity activity, Collection<String> collection) throws JSONException, FacebookException, NoSuchAlgorithmException {
        C9801m.m32346f(activity, "activity");
        m12115x(collection);
        m12118k(activity, new C5801u(collection, null, 2, null));
    }

    /* renamed from: m */
    public void m12120m() {
        AccessToken.f14054f.m11108h(null);
        AuthenticationToken.f14071f.m11113a(null);
        Profile.f14188f.m11258c(null);
        m12111t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m12121o(int r16, android.content.Intent r17, com.facebook.InterfaceC5959z<com.facebook.login.C5805y> r18) throws org.json.JSONException {
        /*
            r15 = this;
            r0 = r16
            r1 = r17
            com.facebook.login.LoginClient$Result$a r2 = com.facebook.login.LoginClient.Result.EnumC5765a.ERROR
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L48
            java.lang.Class<com.facebook.login.LoginClient$Result> r6 = com.facebook.login.LoginClient.Result.class
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r1.setExtrasClassLoader(r6)
            java.lang.String r6 = "com.facebook.LoginFragment:Result"
            android.os.Parcelable r1 = r1.getParcelableExtra(r6)
            com.facebook.login.LoginClient$Result r1 = (com.facebook.login.LoginClient.Result) r1
            if (r1 == 0) goto L53
            com.facebook.login.LoginClient$Request r2 = r1.f14752l
            com.facebook.login.LoginClient$Result$a r6 = r1.f14747g
            r7 = -1
            if (r0 == r7) goto L2e
            if (r0 == 0) goto L2a
            r0 = r4
            r7 = r0
            goto L41
        L2a:
            r0 = r4
            r7 = r0
            r5 = 1
            goto L41
        L2e:
            com.facebook.login.LoginClient$Result$a r0 = com.facebook.login.LoginClient.Result.EnumC5765a.SUCCESS
            if (r6 != r0) goto L37
            com.facebook.AccessToken r0 = r1.f14748h
            com.facebook.AuthenticationToken r7 = r1.f14749i
            goto L41
        L37:
            com.facebook.FacebookAuthorizationException r0 = new com.facebook.FacebookAuthorizationException
            java.lang.String r7 = r1.f14750j
            r0.<init>(r7)
            r7 = r4
            r4 = r0
            r0 = r7
        L41:
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f14753m
            r8 = r1
            r13 = r5
            r1 = r7
            r7 = r6
            goto L59
        L48:
            if (r0 != 0) goto L53
            com.facebook.login.LoginClient$Result$a r2 = com.facebook.login.LoginClient.Result.EnumC5765a.CANCEL
            r7 = r2
            r0 = r4
            r1 = r0
            r2 = r1
            r8 = r2
            r13 = 1
            goto L59
        L53:
            r7 = r2
            r0 = r4
            r1 = r0
            r2 = r1
            r8 = r2
            r13 = 0
        L59:
            if (r4 != 0) goto L66
            if (r0 != 0) goto L66
            if (r13 != 0) goto L66
            com.facebook.FacebookException r4 = new com.facebook.FacebookException
            java.lang.String r5 = "Unexpected call to LoginManager.onActivityResult"
            r4.<init>(r5)
        L66:
            r12 = r4
            r10 = 1
            r6 = 0
            r5 = r15
            r9 = r12
            r11 = r2
            r5.m12106j(r6, r7, r8, r9, r10, r11)
            r8 = r15
            r9 = r0
            r10 = r1
            r14 = r18
            r8.m12102e(r9, r10, r11, r12, r13, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C5804x.m12121o(int, android.content.Intent, com.facebook.z):boolean");
    }

    /* renamed from: q */
    public final void m12122q(InterfaceC5958y interfaceC5958y, final InterfaceC5959z<C5805y> interfaceC5959z) {
        if (!(interfaceC5958y instanceof C5704t)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((C5704t) interfaceC5958y).m11706b(C5704t.c.Login.m11713k(), new C5704t.a() { // from class: com.facebook.login.n
            @Override // com.facebook.internal.C5704t.a
            /* renamed from: a */
            public final boolean mo11707a(int i2, Intent intent) {
                return C5804x.m12109r(this.f14808a, interfaceC5959z, i2, intent);
            }
        });
    }
}
