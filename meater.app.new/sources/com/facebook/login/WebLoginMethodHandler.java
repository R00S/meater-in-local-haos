package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.account.view.LoginActivity;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.facebook.AccessToken;
import com.facebook.C5641a0;
import com.facebook.EnumC5956w;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C5696p0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: WebLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: i */
    public static final C5773a f14764i = new C5773a(null);

    /* renamed from: j */
    private String f14765j;

    /* compiled from: WebLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.WebLoginMethodHandler$a */
    public static final class C5773a {
        private C5773a() {
        }

        public /* synthetic */ C5773a(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9801m.m32346f(loginClient, "loginClient");
    }

    /* renamed from: t */
    private final String m12022t() {
        Context contextM11940i = m12000d().m11940i();
        if (contextM11940i == null) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            contextM11940i = C5641a0.m11284c();
        }
        return contextM11940i.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: v */
    private final void m12023v(String str) {
        Context contextM11940i = m12000d().m11940i();
        if (contextM11940i == null) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            contextM11940i = C5641a0.m11284c();
        }
        contextM11940i.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* renamed from: p */
    protected Bundle m12024p(Bundle bundle, LoginClient.Request request) {
        C9801m.m32346f(bundle, "parameters");
        C9801m.m32346f(request, "request");
        bundle.putString("redirect_uri", mo11849g());
        if (request.m11971r()) {
            bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, request.m11954a());
        } else {
            bundle.putString("client_id", request.m11954a());
        }
        bundle.putString("e2e", LoginClient.f14714f.m11995a());
        if (request.m11971r()) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.m11967n().contains("openid")) {
                bundle.putString("nonce", request.m11966m());
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", request.m11957d());
        EnumC5796p enumC5796pM11958e = request.m11958e();
        bundle.putString("code_challenge_method", enumC5796pM11958e == null ? null : enumC5796pM11958e.name());
        bundle.putString("return_scopes", "true");
        bundle.putString(LoginActivity.AUTH_TYPE, request.m11956c());
        bundle.putString("login_behavior", request.m11963j().name());
        C5641a0 c5641a0 = C5641a0.f14199a;
        bundle.putString("sdk", C9801m.m32354n("android-", C5641a0.m11300s()));
        if (mo11853r() != null) {
            bundle.putString("sso", mo11853r());
        }
        bundle.putString("cct_prefetching", C5641a0.f14215q ? "1" : "0");
        if (request.m11970q()) {
            bundle.putString("fx_app", request.m11964k().toString());
        }
        if (request.m11979z()) {
            bundle.putString("skip_dedupe", "true");
        }
        if (request.m11965l() != null) {
            bundle.putString("messenger_page_id", request.m11965l());
            bundle.putString("reset_messenger_state", request.m11968o() ? "1" : "0");
        }
        return bundle;
    }

    /* renamed from: q */
    protected Bundle m12025q(LoginClient.Request request) {
        C9801m.m32346f(request, "request");
        Bundle bundle = new Bundle();
        C5696p0 c5696p0 = C5696p0.f14478a;
        if (!C5696p0.m11559b0(request.m11967n())) {
            String strJoin = TextUtils.join(",", request.m11967n());
            bundle.putString("scope", strJoin);
            m11998a("scope", strJoin);
        }
        EnumC5798r enumC5798rM11960g = request.m11960g();
        if (enumC5798rM11960g == null) {
            enumC5798rM11960g = EnumC5798r.NONE;
        }
        bundle.putString("default_audience", enumC5798rM11960g.m12057k());
        bundle.putString("state", m11999c(request.m11955b()));
        AccessToken accessTokenM11105e = AccessToken.f14054f.m11105e();
        String strM11093l = accessTokenM11105e == null ? null : accessTokenM11105e.m11093l();
        if (strM11093l == null || !C9801m.m32341a(strM11093l, m12022t())) {
            ActivityC0468d activityC0468dM11940i = m12000d().m11940i();
            if (activityC0468dM11940i != null) {
                C5696p0.m11568g(activityC0468dM11940i);
            }
            m11998a("access_token", "0");
        } else {
            bundle.putString("access_token", strM11093l);
            m11998a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        C5641a0 c5641a0 = C5641a0.f14199a;
        bundle.putString("ies", C5641a0.m11288g() ? "1" : "0");
        return bundle;
    }

    /* renamed from: r */
    protected String mo11853r() {
        return null;
    }

    /* renamed from: s */
    public abstract EnumC5956w mo11854s();

    /* renamed from: u */
    public void m12026u(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        String strValueOf;
        LoginClient.Result resultM11989c;
        C9801m.m32346f(request, "request");
        LoginClient loginClientM12000d = m12000d();
        this.f14765j = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f14765j = bundle.getString("e2e");
            }
            try {
                LoginMethodHandler.C5772a c5772a = LoginMethodHandler.f14760f;
                AccessToken accessTokenM12007b = c5772a.m12007b(request.m11967n(), bundle, mo11854s(), request.m11954a());
                resultM11989c = LoginClient.Result.f14746f.m11988b(loginClientM12000d.m11945o(), accessTokenM12007b, c5772a.m12009d(bundle, request.m11966m()));
                if (loginClientM12000d.m11940i() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientM12000d.m11940i()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenM12007b != null) {
                        m12023v(accessTokenM12007b.m11093l());
                    }
                }
            } catch (FacebookException e2) {
                resultM11989c = LoginClient.Result.C5767c.m11986d(LoginClient.Result.f14746f, loginClientM12000d.m11945o(), null, e2.getMessage(), null, 8, null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            resultM11989c = LoginClient.Result.f14746f.m11987a(loginClientM12000d.m11945o(), "User canceled log in.");
        } else {
            this.f14765j = null;
            String message = facebookException == null ? null : facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) facebookException).getRequestError();
                strValueOf = String.valueOf(requestError.m11140b());
                message = requestError.toString();
            } else {
                strValueOf = null;
            }
            resultM11989c = LoginClient.Result.f14746f.m11989c(loginClientM12000d.m11945o(), null, message, strValueOf);
        }
        C5696p0 c5696p0 = C5696p0.f14478a;
        if (!C5696p0.m11557a0(this.f14765j)) {
            m12002h(this.f14765j);
        }
        loginClientM12000d.m11939g(resultM11989c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9801m.m32346f(parcel, "source");
    }
}
