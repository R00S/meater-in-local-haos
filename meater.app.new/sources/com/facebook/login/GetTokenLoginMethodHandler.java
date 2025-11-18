package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.facebook.C5641a0;
import com.facebook.EnumC5956w;
import com.facebook.FacebookException;
import com.facebook.internal.AbstractServiceConnectionC5688l0;
import com.facebook.internal.C5696p0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GetTokenLoginMethodHandler.kt */
/* loaded from: classes2.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: j */
    private C5799s f14704j;

    /* renamed from: k */
    private final String f14705k;

    /* renamed from: i */
    public static final C5757b f14703i = new C5757b(null);
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C5756a();

    /* compiled from: GetTokenLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    public static final class C5756a implements Parcelable.Creator<GetTokenLoginMethodHandler> {
        C5756a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int i2) {
            return new GetTokenLoginMethodHandler[i2];
        }
    }

    /* compiled from: GetTokenLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$b */
    public static final class C5757b {
        private C5757b() {
        }

        public /* synthetic */ C5757b(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: GetTokenLoginMethodHandler.kt */
    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$c */
    public static final class C5758c implements C5696p0.a {

        /* renamed from: a */
        final /* synthetic */ Bundle f14706a;

        /* renamed from: b */
        final /* synthetic */ GetTokenLoginMethodHandler f14707b;

        /* renamed from: c */
        final /* synthetic */ LoginClient.Request f14708c;

        C5758c(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f14706a = bundle;
            this.f14707b = getTokenLoginMethodHandler;
            this.f14708c = request;
        }

        @Override // com.facebook.internal.C5696p0.a
        /* renamed from: a */
        public void mo11259a(JSONObject jSONObject) throws NumberFormatException {
            try {
                this.f14706a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID));
                this.f14707b.m11917s(this.f14708c, this.f14706a);
            } catch (JSONException e2) {
                this.f14707b.m12000d().m11938f(LoginClient.Result.C5767c.m11986d(LoginClient.Result.f14746f, this.f14707b.m12000d().m11945o(), "Caught exception", e2.getMessage(), null, 8, null));
            }
        }

        @Override // com.facebook.internal.C5696p0.a
        /* renamed from: b */
        public void mo11260b(FacebookException facebookException) {
            this.f14707b.m12000d().m11938f(LoginClient.Result.C5767c.m11986d(LoginClient.Result.f14746f, this.f14707b.m12000d().m11945o(), "Caught exception", facebookException == null ? null : facebookException.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        C9801m.m32346f(loginClient, "loginClient");
        this.f14705k = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m11913t(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        C9801m.m32346f(getTokenLoginMethodHandler, "this$0");
        C9801m.m32346f(request, "$request");
        getTokenLoginMethodHandler.m11916q(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: b */
    public void mo11914b() {
        C5799s c5799s = this.f14704j;
        if (c5799s == null) {
            return;
        }
        c5799s.m11501b();
        c5799s.m11505g(null);
        this.f14704j = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo11848f() {
        return this.f14705k;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo11852o(final LoginClient.Request request) {
        C9801m.m32346f(request, "request");
        Context contextM11940i = m12000d().m11940i();
        if (contextM11940i == null) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            contextM11940i = C5641a0.m11284c();
        }
        C5799s c5799s = new C5799s(contextM11940i, request);
        this.f14704j = c5799s;
        if (C9801m.m32341a(c5799s == null ? null : Boolean.valueOf(c5799s.m11506h()), Boolean.FALSE)) {
            return 0;
        }
        m12000d().m11946r();
        AbstractServiceConnectionC5688l0.b bVar = new AbstractServiceConnectionC5688l0.b() { // from class: com.facebook.login.i
            @Override // com.facebook.internal.AbstractServiceConnectionC5688l0.b
            /* renamed from: a */
            public final void mo11507a(Bundle bundle) throws NumberFormatException {
                GetTokenLoginMethodHandler.m11913t(this.f14801a, request, bundle);
            }
        };
        C5799s c5799s2 = this.f14704j;
        if (c5799s2 == null) {
            return 1;
        }
        c5799s2.m11505g(bVar);
        return 1;
    }

    /* renamed from: p */
    public final void m11915p(LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        C9801m.m32346f(request, "request");
        C9801m.m32346f(bundle, "result");
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (!(string == null || string.length() == 0)) {
            m11917s(request, bundle);
            return;
        }
        m12000d().m11946r();
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        C5696p0 c5696p0 = C5696p0.f14478a;
        C5696p0.m11532E(string2, new C5758c(bundle, this, request));
    }

    /* renamed from: q */
    public final void m11916q(LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        C9801m.m32346f(request, "request");
        C5799s c5799s = this.f14704j;
        if (c5799s != null) {
            c5799s.m11505g(null);
        }
        this.f14704j = null;
        m12000d().m11947s();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = C10817u.m38888j();
            }
            Set<String> setM11967n = request.m11967n();
            if (setM11967n == null) {
                setM11967n = C10822w0.m38917d();
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (setM11967n.contains("openid")) {
                if (string == null || string.length() == 0) {
                    m12000d().m11932B();
                    return;
                }
            }
            if (stringArrayList.containsAll(setM11967n)) {
                m11915p(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : setM11967n) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                m11998a("new_permissions", TextUtils.join(",", hashSet));
            }
            request.m11975v(hashSet);
        }
        m12000d().m11932B();
    }

    /* renamed from: s */
    public final void m11917s(LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        LoginClient.Result resultM11986d;
        C9801m.m32346f(request, "request");
        C9801m.m32346f(bundle, "result");
        try {
            LoginMethodHandler.C5772a c5772a = LoginMethodHandler.f14760f;
            resultM11986d = LoginClient.Result.f14746f.m11988b(request, c5772a.m12006a(bundle, EnumC5956w.FACEBOOK_APPLICATION_SERVICE, request.m11954a()), c5772a.m12008c(bundle, request.m11966m()));
        } catch (FacebookException e2) {
            resultM11986d = LoginClient.Result.C5767c.m11986d(LoginClient.Result.f14746f, m12000d().m11945o(), null, e2.getMessage(), null, 8, null);
        }
        m12000d().m11939g(resultM11986d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C9801m.m32346f(parcel, "source");
        this.f14705k = "get_token";
    }
}
