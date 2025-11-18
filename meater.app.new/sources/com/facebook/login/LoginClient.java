package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C5641a0;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.common.C5650d;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5698q0;
import com.facebook.internal.C5704t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginClient.kt */
/* loaded from: classes2.dex */
public class LoginClient implements Parcelable {

    /* renamed from: g */
    private LoginMethodHandler[] f14715g;

    /* renamed from: h */
    private int f14716h;

    /* renamed from: i */
    private Fragment f14717i;

    /* renamed from: j */
    private InterfaceC5771d f14718j;

    /* renamed from: k */
    private InterfaceC5768a f14719k;

    /* renamed from: l */
    private boolean f14720l;

    /* renamed from: m */
    private Request f14721m;

    /* renamed from: n */
    private Map<String, String> f14722n;

    /* renamed from: o */
    private Map<String, String> f14723o;

    /* renamed from: p */
    private C5803w f14724p;

    /* renamed from: q */
    private int f14725q;

    /* renamed from: r */
    private int f14726r;

    /* renamed from: f */
    public static final C5770c f14714f = new C5770c(null);
    public static final Parcelable.Creator<LoginClient> CREATOR = new C5769b();

    /* compiled from: LoginClient.kt */
    public static final class Result implements Parcelable {

        /* renamed from: g */
        public final EnumC5765a f14747g;

        /* renamed from: h */
        public final AccessToken f14748h;

        /* renamed from: i */
        public final AuthenticationToken f14749i;

        /* renamed from: j */
        public final String f14750j;

        /* renamed from: k */
        public final String f14751k;

        /* renamed from: l */
        public final Request f14752l;

        /* renamed from: m */
        public Map<String, String> f14753m;

        /* renamed from: n */
        public Map<String, String> f14754n;

        /* renamed from: f */
        public static final C5767c f14746f = new C5767c(null);
        public static final Parcelable.Creator<Result> CREATOR = new C5766b();

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Result$a */
        public enum EnumC5765a {
            SUCCESS(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION),
            CANCEL("cancel"),
            ERROR("error");


            /* renamed from: j */
            private final String f14759j;

            EnumC5765a(String str) {
                this.f14759j = str;
            }

            /* renamed from: values, reason: to resolve conflict with enum method */
            public static EnumC5765a[] valuesCustom() {
                EnumC5765a[] enumC5765aArrValuesCustom = values();
                return (EnumC5765a[]) Arrays.copyOf(enumC5765aArrValuesCustom, enumC5765aArrValuesCustom.length);
            }

            /* renamed from: k */
            public final String m11983k() {
                return this.f14759j;
            }
        }

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Result$b */
        public static final class C5766b implements Parcelable.Creator<Result> {
            C5766b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(Parcel parcel) {
                C9801m.m32346f(parcel, "source");
                return new Result(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int i2) {
                return new Result[i2];
            }
        }

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Result$c */
        public static final class C5767c {
            private C5767c() {
            }

            public /* synthetic */ C5767c(C9789g c9789g) {
                this();
            }

            /* renamed from: d */
            public static /* synthetic */ Result m11986d(C5767c c5767c, Request request, String str, String str2, String str3, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    str3 = null;
                }
                return c5767c.m11989c(request, str, str2, str3);
            }

            /* renamed from: a */
            public final Result m11987a(Request request, String str) {
                return new Result(request, EnumC5765a.CANCEL, null, str, null);
            }

            /* renamed from: b */
            public final Result m11988b(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, EnumC5765a.SUCCESS, accessToken, authenticationToken, null, null);
            }

            /* renamed from: c */
            public final Result m11989c(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, EnumC5765a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            /* renamed from: e */
            public final Result m11990e(Request request, AccessToken accessToken) {
                C9801m.m32346f(accessToken, "token");
                return new Result(request, EnumC5765a.SUCCESS, accessToken, null, null);
            }
        }

        public /* synthetic */ Result(Parcel parcel, C9789g c9789g) {
            this(parcel);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, EnumC5765a enumC5765a, AccessToken accessToken, String str, String str2) {
            this(request, enumC5765a, accessToken, null, str, str2);
            C9801m.m32346f(enumC5765a, "code");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            C9801m.m32346f(parcel, "dest");
            parcel.writeString(this.f14747g.name());
            parcel.writeParcelable(this.f14748h, i2);
            parcel.writeParcelable(this.f14749i, i2);
            parcel.writeString(this.f14750j);
            parcel.writeString(this.f14751k);
            parcel.writeParcelable(this.f14752l, i2);
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11536G0(parcel, this.f14753m);
            C5696p0.m11536G0(parcel, this.f14754n);
        }

        public Result(Request request, EnumC5765a enumC5765a, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            C9801m.m32346f(enumC5765a, "code");
            this.f14752l = request;
            this.f14748h = accessToken;
            this.f14749i = authenticationToken;
            this.f14750j = str;
            this.f14747g = enumC5765a;
            this.f14751k = str2;
        }

        private Result(Parcel parcel) {
            String string = parcel.readString();
            this.f14747g = EnumC5765a.valueOf(string == null ? "error" : string);
            this.f14748h = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f14749i = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.f14750j = parcel.readString();
            this.f14751k = parcel.readString();
            this.f14752l = (Request) parcel.readParcelable(Request.class.getClassLoader());
            C5696p0 c5696p0 = C5696p0.f14478a;
            this.f14753m = C5696p0.m11591r0(parcel);
            this.f14754n = C5696p0.m11591r0(parcel);
        }
    }

    /* compiled from: LoginClient.kt */
    /* renamed from: com.facebook.login.LoginClient$a */
    public interface InterfaceC5768a {
        /* renamed from: a */
        void mo11991a();

        /* renamed from: b */
        void mo11992b();
    }

    /* compiled from: LoginClient.kt */
    /* renamed from: com.facebook.login.LoginClient$b */
    public static final class C5769b implements Parcelable.Creator<LoginClient> {
        C5769b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new LoginClient(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int i2) {
            return new LoginClient[i2];
        }
    }

    /* compiled from: LoginClient.kt */
    /* renamed from: com.facebook.login.LoginClient$c */
    public static final class C5770c {
        private C5770c() {
        }

        public /* synthetic */ C5770c(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final String m11995a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            C9801m.m32345e(string, "e2e.toString()");
            return string;
        }

        /* renamed from: b */
        public final int m11996b() {
            return C5704t.c.Login.m11713k();
        }
    }

    /* compiled from: LoginClient.kt */
    /* renamed from: com.facebook.login.LoginClient$d */
    public interface InterfaceC5771d {
        /* renamed from: a */
        void mo11997a(Result result);
    }

    public LoginClient(Fragment fragment) {
        C9801m.m32346f(fragment, "fragment");
        this.f14716h = -1;
        m11950w(fragment);
    }

    /* renamed from: a */
    private final void m11926a(String str, String str2, boolean z) {
        Map<String, String> map = this.f14722n;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f14722n == null) {
            this.f14722n = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    /* renamed from: h */
    private final void m11927h() {
        m11938f(Result.C5767c.m11986d(Result.f14746f, this.f14721m, "Login attempt failed.", null, null, 8, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.login.C5803w m11928n() {
        /*
            r3 = this;
            com.facebook.login.w r0 = r3.f14724p
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.m12090a()
            com.facebook.login.LoginClient$Request r2 = r3.f14721m
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.String r2 = r2.m11954a()
        L12:
            boolean r1 = kotlin.jvm.internal.C9801m.m32341a(r1, r2)
            if (r1 != 0) goto L3a
        L18:
            com.facebook.login.w r0 = new com.facebook.login.w
            androidx.fragment.app.d r1 = r3.m11940i()
            if (r1 != 0) goto L26
            com.facebook.a0 r1 = com.facebook.C5641a0.f14199a
            android.content.Context r1 = com.facebook.C5641a0.m11284c()
        L26:
            com.facebook.login.LoginClient$Request r2 = r3.f14721m
            if (r2 != 0) goto L31
            com.facebook.a0 r2 = com.facebook.C5641a0.f14199a
            java.lang.String r2 = com.facebook.C5641a0.m11285d()
            goto L35
        L31:
            java.lang.String r2 = r2.m11954a()
        L35:
            r0.<init>(r1, r2)
            r3.f14724p = r0
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.m11928n():com.facebook.login.w");
    }

    /* renamed from: p */
    private final void m11929p(String str, Result result, Map<String, String> map) {
        m11930q(str, result.f14747g.m11983k(), result.f14750j, result.f14751k, map);
    }

    /* renamed from: q */
    private final void m11930q(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.f14721m;
        if (request == null) {
            m11928n().m12096j("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m11928n().m12091c(request.m11955b(), str, str2, str3, str4, map, request.m11970q() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    /* renamed from: t */
    private final void m11931t(Result result) {
        InterfaceC5771d interfaceC5771d = this.f14718j;
        if (interfaceC5771d == null) {
            return;
        }
        interfaceC5771d.mo11997a(result);
    }

    /* renamed from: B */
    public final void m11932B() {
        LoginMethodHandler loginMethodHandlerM11941j = m11941j();
        if (loginMethodHandlerM11941j != null) {
            m11930q(loginMethodHandlerM11941j.mo11848f(), "skipped", null, null, loginMethodHandlerM11941j.m12001e());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.f14715g;
        while (loginMethodHandlerArr != null) {
            int i2 = this.f14716h;
            if (i2 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.f14716h = i2 + 1;
            if (m11953z()) {
                return;
            }
        }
        if (this.f14721m != null) {
            m11927h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:6:0x0013, B:8:0x0021, B:10:0x003d, B:9:0x002e), top: B:17:0x0013 }] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11933C(com.facebook.login.LoginClient.Result r8) {
        /*
            r7 = this;
            java.lang.String r0 = "pendingResult"
            kotlin.jvm.internal.C9801m.m32346f(r8, r0)
            com.facebook.AccessToken r0 = r8.f14748h
            if (r0 == 0) goto L58
            com.facebook.AccessToken$c r0 = com.facebook.AccessToken.f14054f
            com.facebook.AccessToken r0 = r0.m11105e()
            com.facebook.AccessToken r1 = r8.f14748h
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.m11094m()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r1.m11094m()     // Catch: java.lang.Exception -> L41
            boolean r0 = kotlin.jvm.internal.C9801m.m32341a(r0, r1)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L2e
            com.facebook.login.LoginClient$Result$c r0 = com.facebook.login.LoginClient.Result.f14746f     // Catch: java.lang.Exception -> L41
            com.facebook.login.LoginClient$Request r1 = r7.f14721m     // Catch: java.lang.Exception -> L41
            com.facebook.AccessToken r2 = r8.f14748h     // Catch: java.lang.Exception -> L41
            com.facebook.AuthenticationToken r8 = r8.f14749i     // Catch: java.lang.Exception -> L41
            com.facebook.login.LoginClient$Result r8 = r0.m11988b(r1, r2, r8)     // Catch: java.lang.Exception -> L41
            goto L3d
        L2e:
            com.facebook.login.LoginClient$Result$c r0 = com.facebook.login.LoginClient.Result.f14746f     // Catch: java.lang.Exception -> L41
            com.facebook.login.LoginClient$Request r1 = r7.f14721m     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "User logged in as different Facebook user."
            r3 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            com.facebook.login.LoginClient$Result r8 = com.facebook.login.LoginClient.Result.C5767c.m11986d(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L41
        L3d:
            r7.m11938f(r8)     // Catch: java.lang.Exception -> L41
            goto L57
        L41:
            r8 = move-exception
            com.facebook.login.LoginClient$Result$c r0 = com.facebook.login.LoginClient.Result.f14746f
            com.facebook.login.LoginClient$Request r1 = r7.f14721m
            java.lang.String r3 = r8.getMessage()
            r4 = 0
            r5 = 8
            r6 = 0
            java.lang.String r2 = "Caught exception"
            com.facebook.login.LoginClient$Result r8 = com.facebook.login.LoginClient.Result.C5767c.m11986d(r0, r1, r2, r3, r4, r5, r6)
            r7.m11938f(r8)
        L57:
            return
        L58:
            com.facebook.FacebookException r8 = new com.facebook.FacebookException
            java.lang.String r0 = "Can't validate without a token"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.m11933C(com.facebook.login.LoginClient$Result):void");
    }

    /* renamed from: b */
    public final void m11934b(Request request) {
        if (request == null) {
            return;
        }
        if (this.f14721m != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.f14054f.m11107g() || m11936d()) {
            this.f14721m = request;
            this.f14715g = m11943l(request);
            m11932B();
        }
    }

    /* renamed from: c */
    public final void m11935c() {
        LoginMethodHandler loginMethodHandlerM11941j = m11941j();
        if (loginMethodHandlerM11941j == null) {
            return;
        }
        loginMethodHandlerM11941j.mo11914b();
    }

    /* renamed from: d */
    public final boolean m11936d() {
        if (this.f14720l) {
            return true;
        }
        if (m11937e("android.permission.INTERNET") == 0) {
            this.f14720l = true;
            return true;
        }
        ActivityC0468d activityC0468dM11940i = m11940i();
        m11938f(Result.C5767c.m11986d(Result.f14746f, this.f14721m, activityC0468dM11940i == null ? null : activityC0468dM11940i.getString(C5650d.f14260c), activityC0468dM11940i != null ? activityC0468dM11940i.getString(C5650d.f14259b) : null, null, 8, null));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m11937e(String str) {
        C9801m.m32346f(str, "permission");
        ActivityC0468d activityC0468dM11940i = m11940i();
        if (activityC0468dM11940i == null) {
            return -1;
        }
        return activityC0468dM11940i.checkCallingOrSelfPermission(str);
    }

    /* renamed from: f */
    public final void m11938f(Result result) {
        C9801m.m32346f(result, "outcome");
        LoginMethodHandler loginMethodHandlerM11941j = m11941j();
        if (loginMethodHandlerM11941j != null) {
            m11929p(loginMethodHandlerM11941j.mo11848f(), result, loginMethodHandlerM11941j.m12001e());
        }
        Map<String, String> map = this.f14722n;
        if (map != null) {
            result.f14753m = map;
        }
        Map<String, String> map2 = this.f14723o;
        if (map2 != null) {
            result.f14754n = map2;
        }
        this.f14715g = null;
        this.f14716h = -1;
        this.f14721m = null;
        this.f14722n = null;
        this.f14725q = 0;
        this.f14726r = 0;
        m11931t(result);
    }

    /* renamed from: g */
    public final void m11939g(Result result) {
        C9801m.m32346f(result, "outcome");
        if (result.f14748h == null || !AccessToken.f14054f.m11107g()) {
            m11938f(result);
        } else {
            m11933C(result);
        }
    }

    /* renamed from: i */
    public final ActivityC0468d m11940i() {
        Fragment fragment = this.f14717i;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    /* renamed from: j */
    public final LoginMethodHandler m11941j() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i2 = this.f14716h;
        if (i2 < 0 || (loginMethodHandlerArr = this.f14715g) == null) {
            return null;
        }
        return loginMethodHandlerArr[i2];
    }

    /* renamed from: k */
    public final Fragment m11942k() {
        return this.f14717i;
    }

    /* renamed from: l */
    public LoginMethodHandler[] m11943l(Request request) {
        C9801m.m32346f(request, "request");
        ArrayList arrayList = new ArrayList();
        EnumC5800t enumC5800tM11963j = request.m11963j();
        if (!request.m11971r()) {
            if (enumC5800tM11963j.m12061u()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!C5641a0.f14217s && enumC5800tM11963j.m12063x()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!C5641a0.f14217s && enumC5800tM11963j.m12062v()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (enumC5800tM11963j.m12059k()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (enumC5800tM11963j.m12064y()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.m11971r() && enumC5800tM11963j.m12060q()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            return (LoginMethodHandler[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: m */
    public final boolean m11944m() {
        return this.f14721m != null && this.f14716h >= 0;
    }

    /* renamed from: o */
    public final Request m11945o() {
        return this.f14721m;
    }

    /* renamed from: r */
    public final void m11946r() {
        InterfaceC5768a interfaceC5768a = this.f14719k;
        if (interfaceC5768a == null) {
            return;
        }
        interfaceC5768a.mo11991a();
    }

    /* renamed from: s */
    public final void m11947s() {
        InterfaceC5768a interfaceC5768a = this.f14719k;
        if (interfaceC5768a == null) {
            return;
        }
        interfaceC5768a.mo11992b();
    }

    /* renamed from: u */
    public final boolean m11948u(int i2, int i3, Intent intent) {
        this.f14725q++;
        if (this.f14721m != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f14119m, false)) {
                m11932B();
                return false;
            }
            LoginMethodHandler loginMethodHandlerM11941j = m11941j();
            if (loginMethodHandlerM11941j != null && (!loginMethodHandlerM11941j.mo11923n() || intent != null || this.f14725q >= this.f14726r)) {
                return loginMethodHandlerM11941j.mo11850j(i2, i3, intent);
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m11949v(InterfaceC5768a interfaceC5768a) {
        this.f14719k = interfaceC5768a;
    }

    /* renamed from: w */
    public final void m11950w(Fragment fragment) {
        if (this.f14717i != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.f14717i = fragment;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9801m.m32346f(parcel, "dest");
        parcel.writeParcelableArray(this.f14715g, i2);
        parcel.writeInt(this.f14716h);
        parcel.writeParcelable(this.f14721m, i2);
        C5696p0 c5696p0 = C5696p0.f14478a;
        C5696p0.m11536G0(parcel, this.f14722n);
        C5696p0.m11536G0(parcel, this.f14723o);
    }

    /* renamed from: x */
    public final void m11951x(InterfaceC5771d interfaceC5771d) {
        this.f14718j = interfaceC5771d;
    }

    /* renamed from: y */
    public final void m11952y(Request request) {
        if (m11944m()) {
            return;
        }
        m11934b(request);
    }

    /* renamed from: z */
    public final boolean m11953z() {
        LoginMethodHandler loginMethodHandlerM11941j = m11941j();
        if (loginMethodHandlerM11941j == null) {
            return false;
        }
        if (loginMethodHandlerM11941j.mo12003i() && !m11936d()) {
            m11926a("no_internet_permission", "1", false);
            return false;
        }
        Request request = this.f14721m;
        if (request == null) {
            return false;
        }
        int iMo11852o = loginMethodHandlerM11941j.mo11852o(request);
        this.f14725q = 0;
        if (iMo11852o > 0) {
            m11928n().m12093e(request.m11955b(), loginMethodHandlerM11941j.mo11848f(), request.m11970q() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.f14726r = iMo11852o;
        } else {
            m11928n().m12092d(request.m11955b(), loginMethodHandlerM11941j.mo11848f(), request.m11970q() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            m11926a("not_tried", loginMethodHandlerM11941j.mo11848f(), true);
        }
        return iMo11852o > 0;
    }

    public LoginClient(Parcel parcel) {
        C9801m.m32346f(parcel, "source");
        this.f14716h = -1;
        Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i2];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.m12005m(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i2++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            this.f14715g = (LoginMethodHandler[]) array;
            this.f14716h = parcel.readInt();
            this.f14721m = (Request) parcel.readParcelable(Request.class.getClassLoader());
            C5696p0 c5696p0 = C5696p0.f14478a;
            Map<String, String> mapM11591r0 = C5696p0.m11591r0(parcel);
            this.f14722n = mapM11591r0 == null ? null : C10810q0.m38809u(mapM11591r0);
            Map<String, String> mapM11591r02 = C5696p0.m11591r0(parcel);
            this.f14723o = mapM11591r02 != null ? C10810q0.m38809u(mapM11591r02) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* compiled from: LoginClient.kt */
    public static final class Request implements Parcelable {

        /* renamed from: g */
        private final EnumC5800t f14728g;

        /* renamed from: h */
        private Set<String> f14729h;

        /* renamed from: i */
        private final EnumC5798r f14730i;

        /* renamed from: j */
        private final String f14731j;

        /* renamed from: k */
        private String f14732k;

        /* renamed from: l */
        private boolean f14733l;

        /* renamed from: m */
        private String f14734m;

        /* renamed from: n */
        private String f14735n;

        /* renamed from: o */
        private String f14736o;

        /* renamed from: p */
        private String f14737p;

        /* renamed from: q */
        private boolean f14738q;

        /* renamed from: r */
        private final EnumC5806z f14739r;

        /* renamed from: s */
        private boolean f14740s;

        /* renamed from: t */
        private boolean f14741t;

        /* renamed from: u */
        private final String f14742u;

        /* renamed from: v */
        private final String f14743v;

        /* renamed from: w */
        private final String f14744w;

        /* renamed from: x */
        private final EnumC5796p f14745x;

        /* renamed from: f */
        public static final C5764b f14727f = new C5764b(null);
        public static final Parcelable.Creator<Request> CREATOR = new C5763a();

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Request$a */
        public static final class C5763a implements Parcelable.Creator<Request> {
            C5763a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(Parcel parcel) {
                C9801m.m32346f(parcel, "source");
                return new Request(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int i2) {
                return new Request[i2];
            }
        }

        /* compiled from: LoginClient.kt */
        /* renamed from: com.facebook.login.LoginClient$Request$b */
        public static final class C5764b {
            private C5764b() {
            }

            public /* synthetic */ C5764b(C9789g c9789g) {
                this();
            }
        }

        public /* synthetic */ Request(Parcel parcel, C9789g c9789g) {
            this(parcel);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Request(com.facebook.login.EnumC5800t r2, java.util.Set<java.lang.String> r3, com.facebook.login.EnumC5798r r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.facebook.login.EnumC5806z r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.facebook.login.EnumC5796p r12) {
            /*
                r1 = this;
                java.lang.String r0 = "loginBehavior"
                kotlin.jvm.internal.C9801m.m32346f(r2, r0)
                java.lang.String r0 = "defaultAudience"
                kotlin.jvm.internal.C9801m.m32346f(r4, r0)
                java.lang.String r0 = "authType"
                kotlin.jvm.internal.C9801m.m32346f(r5, r0)
                java.lang.String r0 = "applicationId"
                kotlin.jvm.internal.C9801m.m32346f(r6, r0)
                java.lang.String r0 = "authId"
                kotlin.jvm.internal.C9801m.m32346f(r7, r0)
                r1.<init>()
                r1.f14728g = r2
                if (r3 != 0) goto L25
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
            L25:
                r1.f14729h = r3
                r1.f14730i = r4
                r1.f14735n = r5
                r1.f14731j = r6
                r1.f14732k = r7
                if (r8 != 0) goto L33
                com.facebook.login.z r8 = com.facebook.login.EnumC5806z.FACEBOOK
            L33:
                r1.f14739r = r8
                if (r9 == 0) goto L46
                int r2 = r9.length()
                if (r2 != 0) goto L3f
                r2 = 1
                goto L40
            L3f:
                r2 = 0
            L40:
                if (r2 == 0) goto L43
                goto L46
            L43:
                r1.f14742u = r9
                goto L55
            L46:
                java.util.UUID r2 = java.util.UUID.randomUUID()
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "randomUUID().toString()"
                kotlin.jvm.internal.C9801m.m32345e(r2, r3)
                r1.f14742u = r2
            L55:
                r1.f14743v = r10
                r1.f14744w = r11
                r1.f14745x = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(com.facebook.login.t, java.util.Set, com.facebook.login.r, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.z, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.p):void");
        }

        /* renamed from: a */
        public final String m11954a() {
            return this.f14731j;
        }

        /* renamed from: b */
        public final String m11955b() {
            return this.f14732k;
        }

        /* renamed from: c */
        public final String m11956c() {
            return this.f14735n;
        }

        /* renamed from: d */
        public final String m11957d() {
            return this.f14744w;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final EnumC5796p m11958e() {
            return this.f14745x;
        }

        /* renamed from: f */
        public final String m11959f() {
            return this.f14743v;
        }

        /* renamed from: g */
        public final EnumC5798r m11960g() {
            return this.f14730i;
        }

        /* renamed from: h */
        public final String m11961h() {
            return this.f14736o;
        }

        /* renamed from: i */
        public final String m11962i() {
            return this.f14734m;
        }

        /* renamed from: j */
        public final EnumC5800t m11963j() {
            return this.f14728g;
        }

        /* renamed from: k */
        public final EnumC5806z m11964k() {
            return this.f14739r;
        }

        /* renamed from: l */
        public final String m11965l() {
            return this.f14737p;
        }

        /* renamed from: m */
        public final String m11966m() {
            return this.f14742u;
        }

        /* renamed from: n */
        public final Set<String> m11967n() {
            return this.f14729h;
        }

        /* renamed from: o */
        public final boolean m11968o() {
            return this.f14738q;
        }

        /* renamed from: p */
        public final boolean m11969p() {
            Iterator<String> it = this.f14729h.iterator();
            while (it.hasNext()) {
                if (C5804x.f14858a.m12127e(it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q */
        public final boolean m11970q() {
            return this.f14740s;
        }

        /* renamed from: r */
        public final boolean m11971r() {
            return this.f14739r == EnumC5806z.INSTAGRAM;
        }

        /* renamed from: s */
        public final boolean m11972s() {
            return this.f14733l;
        }

        /* renamed from: t */
        public final void m11973t(boolean z) {
            this.f14740s = z;
        }

        /* renamed from: u */
        public final void m11974u(String str) {
            this.f14737p = str;
        }

        /* renamed from: v */
        public final void m11975v(Set<String> set) {
            C9801m.m32346f(set, "<set-?>");
            this.f14729h = set;
        }

        /* renamed from: w */
        public final void m11976w(boolean z) {
            this.f14733l = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            C9801m.m32346f(parcel, "dest");
            parcel.writeString(this.f14728g.name());
            parcel.writeStringList(new ArrayList(this.f14729h));
            parcel.writeString(this.f14730i.name());
            parcel.writeString(this.f14731j);
            parcel.writeString(this.f14732k);
            parcel.writeByte(this.f14733l ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f14734m);
            parcel.writeString(this.f14735n);
            parcel.writeString(this.f14736o);
            parcel.writeString(this.f14737p);
            parcel.writeByte(this.f14738q ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f14739r.name());
            parcel.writeByte(this.f14740s ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f14741t ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f14742u);
            parcel.writeString(this.f14743v);
            parcel.writeString(this.f14744w);
            EnumC5796p enumC5796p = this.f14745x;
            parcel.writeString(enumC5796p == null ? null : enumC5796p.name());
        }

        /* renamed from: x */
        public final void m11977x(boolean z) {
            this.f14738q = z;
        }

        /* renamed from: y */
        public final void m11978y(boolean z) {
            this.f14741t = z;
        }

        /* renamed from: z */
        public final boolean m11979z() {
            return this.f14741t;
        }

        private Request(Parcel parcel) {
            EnumC5798r enumC5798rValueOf;
            EnumC5806z enumC5806zValueOf;
            C5698q0 c5698q0 = C5698q0.f14500a;
            this.f14728g = EnumC5800t.valueOf(C5698q0.m11643k(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f14729h = new HashSet(arrayList);
            String string = parcel.readString();
            if (string != null) {
                enumC5798rValueOf = EnumC5798r.valueOf(string);
            } else {
                enumC5798rValueOf = EnumC5798r.NONE;
            }
            this.f14730i = enumC5798rValueOf;
            this.f14731j = C5698q0.m11643k(parcel.readString(), "applicationId");
            this.f14732k = C5698q0.m11643k(parcel.readString(), "authId");
            this.f14733l = parcel.readByte() != 0;
            this.f14734m = parcel.readString();
            this.f14735n = C5698q0.m11643k(parcel.readString(), "authType");
            this.f14736o = parcel.readString();
            this.f14737p = parcel.readString();
            this.f14738q = parcel.readByte() != 0;
            String string2 = parcel.readString();
            if (string2 != null) {
                enumC5806zValueOf = EnumC5806z.valueOf(string2);
            } else {
                enumC5806zValueOf = EnumC5806z.FACEBOOK;
            }
            this.f14739r = enumC5806zValueOf;
            this.f14740s = parcel.readByte() != 0;
            this.f14741t = parcel.readByte() != 0;
            this.f14742u = C5698q0.m11643k(parcel.readString(), "nonce");
            this.f14743v = parcel.readString();
            this.f14744w = parcel.readString();
            String string3 = parcel.readString();
            this.f14745x = string3 == null ? null : EnumC5796p.valueOf(string3);
        }
    }
}
