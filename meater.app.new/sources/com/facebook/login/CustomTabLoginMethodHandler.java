package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import com.facebook.C5641a0;
import com.facebook.CustomTabMainActivity;
import com.facebook.EnumC5956w;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C5676f0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5731u;
import com.facebook.internal.C5733v;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CustomTabLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    /* renamed from: l */
    public static boolean f14669l;

    /* renamed from: m */
    private String f14670m;

    /* renamed from: n */
    private String f14671n;

    /* renamed from: o */
    private String f14672o;

    /* renamed from: p */
    private final String f14673p;

    /* renamed from: q */
    private final EnumC5956w f14674q;

    /* renamed from: k */
    public static final C5748b f14668k = new C5748b(null);
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C5747a();

    /* compiled from: CustomTabLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    public static final class C5747a implements Parcelable.Creator<CustomTabLoginMethodHandler> {
        C5747a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i2) {
            return new CustomTabLoginMethodHandler[i2];
        }
    }

    /* compiled from: CustomTabLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$b */
    public static final class C5748b {
        private C5748b() {
        }

        public /* synthetic */ C5748b(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9801m.m32346f(loginClient, "loginClient");
        this.f14673p = "custom_tab";
        this.f14674q = EnumC5956w.CHROME_CUSTOM_TAB;
        C5696p0 c5696p0 = C5696p0.f14478a;
        this.f14671n = C5696p0.m11588q(20);
        f14669l = false;
        C5733v c5733v = C5733v.f14626a;
        this.f14672o = C5733v.m11805c(m11845x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m11842B(CustomTabLoginMethodHandler customTabLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        C9801m.m32346f(customTabLoginMethodHandler, "this$0");
        C9801m.m32346f(request, "$request");
        C9801m.m32346f(bundle, "$values");
        try {
            customTabLoginMethodHandler.m12026u(request, customTabLoginMethodHandler.m12004k(request, bundle), null);
        } catch (FacebookException e2) {
            customTabLoginMethodHandler.m12026u(request, null, e2);
        }
    }

    /* renamed from: C */
    private final boolean m11843C(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return C9801m.m32341a(new JSONObject(string).getString("7_challenge"), this.f14671n);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: w */
    private final String m11844w() {
        String str = this.f14670m;
        if (str != null) {
            return str;
        }
        C5733v c5733v = C5733v.f14626a;
        String strM11803a = C5733v.m11803a();
        this.f14670m = strM11803a;
        return strM11803a;
    }

    /* renamed from: x */
    private final String m11845x() {
        return super.mo11849g();
    }

    /* renamed from: z */
    private final void m11847z(String str, final LoginClient.Request request) throws NumberFormatException {
        int i2;
        if (str != null) {
            if (C10546u.m37511E(str, "fbconnect://cct.", false, 2, null) || C10546u.m37511E(str, super.mo11849g(), false, 2, null)) {
                Uri uri = Uri.parse(str);
                C5696p0 c5696p0 = C5696p0.f14478a;
                final Bundle bundleM11585o0 = C5696p0.m11585o0(uri.getQuery());
                bundleM11585o0.putAll(C5696p0.m11585o0(uri.getFragment()));
                if (!m11843C(bundleM11585o0)) {
                    super.m12026u(request, null, new FacebookException("Invalid state parameter"));
                    return;
                }
                String string = bundleM11585o0.getString("error");
                if (string == null) {
                    string = bundleM11585o0.getString("error_type");
                }
                String string2 = bundleM11585o0.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleM11585o0.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleM11585o0.getString("error_description");
                }
                String string3 = bundleM11585o0.getString("error_code");
                if (string3 == null) {
                    i2 = -1;
                } else {
                    try {
                        i2 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                }
                C5696p0 c5696p02 = C5696p0.f14478a;
                if (C5696p0.m11557a0(string) && C5696p0.m11557a0(string2) && i2 == -1) {
                    if (bundleM11585o0.containsKey("access_token")) {
                        super.m12026u(request, bundleM11585o0, null);
                        return;
                    } else {
                        C5641a0 c5641a0 = C5641a0.f14199a;
                        C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.login.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                CustomTabLoginMethodHandler.m11842B(this.f14781f, request, bundleM11585o0);
                            }
                        });
                        return;
                    }
                }
                if (string != null && (C9801m.m32341a(string, "access_denied") || C9801m.m32341a(string, "OAuthAccessDeniedException"))) {
                    super.m12026u(request, null, new FacebookOperationCanceledException());
                } else if (i2 == 4201) {
                    super.m12026u(request, null, new FacebookOperationCanceledException());
                } else {
                    super.m12026u(request, null, new FacebookServiceException(new FacebookRequestError(i2, string, string2), string2));
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo11848f() {
        return this.f14673p;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g */
    protected String mo11849g() {
        return this.f14672o;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: j */
    public boolean mo11850j(int i2, int i3, Intent intent) throws NumberFormatException {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f14119m, false)) {
            return super.mo11850j(i2, i3, intent);
        }
        if (i2 != 1) {
            return super.mo11850j(i2, i3, intent);
        }
        LoginClient.Request requestM11945o = m12000d().m11945o();
        if (requestM11945o == null) {
            return false;
        }
        if (i3 == -1) {
            m11847z(intent != null ? intent.getStringExtra(CustomTabMainActivity.f14116j) : null, requestM11945o);
            return true;
        }
        super.m12026u(requestM11945o, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: l */
    public void mo11851l(JSONObject jSONObject) throws JSONException {
        C9801m.m32346f(jSONObject, "param");
        jSONObject.put("7_challenge", this.f14671n);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo11852o(LoginClient.Request request) {
        C9801m.m32346f(request, "request");
        LoginClient loginClientM12000d = m12000d();
        if (mo11849g().length() == 0) {
            return 0;
        }
        Bundle bundleM12024p = m12024p(m12025q(request), request);
        if (f14669l) {
            bundleM12024p.putString("cct_over_app_switch", "1");
        }
        if (C5641a0.f14215q) {
            if (request.m11971r()) {
                C5797q.f14816f.m12055c(C5676f0.f14415c.m11434a("oauth", bundleM12024p));
            } else {
                C5797q.f14816f.m12055c(C5731u.f14621a.m11800a("oauth", bundleM12024p));
            }
        }
        ActivityC0468d activityC0468dM11940i = loginClientM12000d.m11940i();
        if (activityC0468dM11940i == null) {
            return 0;
        }
        Intent intent = new Intent(activityC0468dM11940i, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f14113g, "oauth");
        intent.putExtra(CustomTabMainActivity.f14114h, bundleM12024p);
        intent.putExtra(CustomTabMainActivity.f14115i, m11844w());
        intent.putExtra(CustomTabMainActivity.f14117k, request.m11964k().toString());
        Fragment fragmentM11942k = loginClientM12000d.m11942k();
        if (fragmentM11942k != null) {
            fragmentM11942k.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: r */
    protected String mo11853r() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: s */
    public EnumC5956w mo11854s() {
        return this.f14674q;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9801m.m32346f(parcel, "dest");
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f14671n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9801m.m32346f(parcel, "source");
        this.f14673p = "custom_tab";
        this.f14674q = EnumC5956w.CHROME_CUSTOM_TAB;
        this.f14671n = parcel.readString();
        C5733v c5733v = C5733v.f14626a;
        this.f14672o = C5733v.m11805c(m11845x());
    }
}
