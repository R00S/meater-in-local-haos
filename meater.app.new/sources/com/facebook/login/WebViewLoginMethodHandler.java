package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.account.view.LoginActivity;
import com.facebook.EnumC5956w;
import com.facebook.FacebookException;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5737w;
import com.facebook.internal.DialogC5700r0;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: WebViewLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    /* renamed from: l */
    private DialogC5700r0 f14767l;

    /* renamed from: m */
    private String f14768m;

    /* renamed from: n */
    private final String f14769n;

    /* renamed from: o */
    private final EnumC5956w f14770o;

    /* renamed from: k */
    public static final C5776c f14766k = new C5776c(null);
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C5775b();

    /* compiled from: WebViewLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    public final class C5774a extends DialogC5700r0.a {

        /* renamed from: h */
        private String f14771h;

        /* renamed from: i */
        private EnumC5800t f14772i;

        /* renamed from: j */
        private EnumC5806z f14773j;

        /* renamed from: k */
        private boolean f14774k;

        /* renamed from: l */
        private boolean f14775l;

        /* renamed from: m */
        public String f14776m;

        /* renamed from: n */
        public String f14777n;

        /* renamed from: o */
        final /* synthetic */ WebViewLoginMethodHandler f14778o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5774a(WebViewLoginMethodHandler webViewLoginMethodHandler, Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            C9801m.m32346f(webViewLoginMethodHandler, "this$0");
            C9801m.m32346f(context, "context");
            C9801m.m32346f(str, "applicationId");
            C9801m.m32346f(bundle, "parameters");
            this.f14778o = webViewLoginMethodHandler;
            this.f14771h = "fbconnect://success";
            this.f14772i = EnumC5800t.NATIVE_WITH_FALLBACK;
            this.f14773j = EnumC5806z.FACEBOOK;
        }

        @Override // com.facebook.internal.DialogC5700r0.a
        /* renamed from: a */
        public DialogC5700r0 mo11682a() {
            Bundle bundleM11686f = m11686f();
            if (bundleM11686f == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            bundleM11686f.putString("redirect_uri", this.f14771h);
            bundleM11686f.putString("client_id", m11683c());
            bundleM11686f.putString("e2e", m12029j());
            bundleM11686f.putString("response_type", this.f14773j == EnumC5806z.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            bundleM11686f.putString("return_scopes", "true");
            bundleM11686f.putString(LoginActivity.AUTH_TYPE, m12028i());
            bundleM11686f.putString("login_behavior", this.f14772i.name());
            if (this.f14774k) {
                bundleM11686f.putString("fx_app", this.f14773j.toString());
            }
            if (this.f14775l) {
                bundleM11686f.putString("skip_dedupe", "true");
            }
            DialogC5700r0.b bVar = DialogC5700r0.f14506f;
            Context contextM11684d = m11684d();
            if (contextM11684d != null) {
                return bVar.m11692d(contextM11684d, "oauth", bundleM11686f, m11687g(), this.f14773j, m11685e());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }

        /* renamed from: i */
        public final String m12028i() {
            String str = this.f14777n;
            if (str != null) {
                return str;
            }
            C9801m.m32363w("authType");
            throw null;
        }

        /* renamed from: j */
        public final String m12029j() {
            String str = this.f14776m;
            if (str != null) {
                return str;
            }
            C9801m.m32363w("e2e");
            throw null;
        }

        /* renamed from: k */
        public final C5774a m12030k(String str) {
            C9801m.m32346f(str, "authType");
            m12031l(str);
            return this;
        }

        /* renamed from: l */
        public final void m12031l(String str) {
            C9801m.m32346f(str, "<set-?>");
            this.f14777n = str;
        }

        /* renamed from: m */
        public final C5774a m12032m(String str) {
            C9801m.m32346f(str, "e2e");
            m12033n(str);
            return this;
        }

        /* renamed from: n */
        public final void m12033n(String str) {
            C9801m.m32346f(str, "<set-?>");
            this.f14776m = str;
        }

        /* renamed from: o */
        public final C5774a m12034o(boolean z) {
            this.f14774k = z;
            return this;
        }

        /* renamed from: p */
        public final C5774a m12035p(boolean z) {
            this.f14771h = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        /* renamed from: q */
        public final C5774a m12036q(EnumC5800t enumC5800t) {
            C9801m.m32346f(enumC5800t, "loginBehavior");
            this.f14772i = enumC5800t;
            return this;
        }

        /* renamed from: r */
        public final C5774a m12037r(EnumC5806z enumC5806z) {
            C9801m.m32346f(enumC5806z, "targetApp");
            this.f14773j = enumC5806z;
            return this;
        }

        /* renamed from: s */
        public final C5774a m12038s(boolean z) {
            this.f14775l = z;
            return this;
        }
    }

    /* compiled from: WebViewLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    public static final class C5775b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        C5775b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new WebViewLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int i2) {
            return new WebViewLoginMethodHandler[i2];
        }
    }

    /* compiled from: WebViewLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$c */
    public static final class C5776c {
        private C5776c() {
        }

        public /* synthetic */ C5776c(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: WebViewLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$d */
    public static final class C5777d implements DialogC5700r0.e {

        /* renamed from: b */
        final /* synthetic */ LoginClient.Request f14780b;

        C5777d(LoginClient.Request request) {
            this.f14780b = request;
        }

        @Override // com.facebook.internal.DialogC5700r0.e
        /* renamed from: a */
        public void mo11371a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.m12027w(this.f14780b, bundle, facebookException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9801m.m32346f(loginClient, "loginClient");
        this.f14769n = "web_view";
        this.f14770o = EnumC5956w.WEB_VIEW;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: b */
    public void mo11914b() {
        DialogC5700r0 dialogC5700r0 = this.f14767l;
        if (dialogC5700r0 != null) {
            if (dialogC5700r0 != null) {
                dialogC5700r0.cancel();
            }
            this.f14767l = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo11848f() {
        return this.f14769n;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: i */
    public boolean mo12003i() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo11852o(LoginClient.Request request) {
        C9801m.m32346f(request, "request");
        Bundle bundleM12025q = m12025q(request);
        C5777d c5777d = new C5777d(request);
        String strM11995a = LoginClient.f14714f.m11995a();
        this.f14768m = strM11995a;
        m11998a("e2e", strM11995a);
        ActivityC0468d activityC0468dM11940i = m12000d().m11940i();
        if (activityC0468dM11940i == null) {
            return 0;
        }
        C5696p0 c5696p0 = C5696p0.f14478a;
        boolean zM11550U = C5696p0.m11550U(activityC0468dM11940i);
        C5774a c5774a = new C5774a(this, activityC0468dM11940i, request.m11954a(), bundleM12025q);
        String str = this.f14768m;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f14767l = c5774a.m12032m(str).m12035p(zM11550U).m12030k(request.m11956c()).m12036q(request.m11963j()).m12037r(request.m11964k()).m12034o(request.m11970q()).m12038s(request.m11979z()).m11688h(c5777d).mo11682a();
        C5737w c5737w = new C5737w();
        c5737w.setRetainInstance(true);
        c5737w.m11819k(this.f14767l);
        c5737w.show(activityC0468dM11940i.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: s */
    public EnumC5956w mo11854s() {
        return this.f14770o;
    }

    /* renamed from: w */
    public final void m12027w(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        C9801m.m32346f(request, "request");
        super.m12026u(request, bundle, facebookException);
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9801m.m32346f(parcel, "dest");
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f14768m);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9801m.m32346f(parcel, "source");
        this.f14769n = "web_view";
        this.f14770o = EnumC5956w.WEB_VIEW;
        this.f14768m = parcel.readString();
    }
}
