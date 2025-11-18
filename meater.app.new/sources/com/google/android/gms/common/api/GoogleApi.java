package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;

@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleApi<O extends Api.ApiOptions> {

    /* renamed from: a */
    private final Context f17248a;

    /* renamed from: b */
    private final Api<O> f17249b;

    /* renamed from: c */
    private final O f17250c;

    /* renamed from: d */
    private final zai<O> f17251d;

    /* renamed from: e */
    private final Looper f17252e;

    /* renamed from: f */
    private final int f17253f;

    /* renamed from: g */
    private final GoogleApiClient f17254g;

    /* renamed from: h */
    private final StatusExceptionMapper f17255h;

    /* renamed from: i */
    protected final GoogleApiManager f17256i;

    @KeepForSdk
    public static class Settings {

        /* renamed from: a */
        @KeepForSdk
        public static final Settings f17257a = new Builder().m13862a();

        /* renamed from: b */
        public final StatusExceptionMapper f17258b;

        /* renamed from: c */
        public final Looper f17259c;

        @KeepForSdk
        public static class Builder {

            /* renamed from: a */
            private StatusExceptionMapper f17260a;

            /* renamed from: b */
            private Looper f17261b;

            @KeepForSdk
            public Builder() {
            }

            @KeepForSdk
            /* renamed from: a */
            public Settings m13862a() {
                if (this.f17260a == null) {
                    this.f17260a = new ApiExceptionMapper();
                }
                if (this.f17261b == null) {
                    this.f17261b = Looper.getMainLooper();
                }
                return new Settings(this.f17260a, this.f17261b);
            }

            @KeepForSdk
            /* renamed from: b */
            public Builder m13863b(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.m14373l(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.f17260a = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.f17258b = statusExceptionMapper;
            this.f17259c = looper;
        }
    }

    @KeepForSdk
    protected GoogleApi(Context context, Api<O> api, Looper looper) {
        Preconditions.m14373l(context, "Null context is not permitted.");
        Preconditions.m14373l(api, "Api must not be null.");
        Preconditions.m14373l(looper, "Looper must not be null.");
        Context applicationContext = context.getApplicationContext();
        this.f17248a = applicationContext;
        this.f17249b = api;
        this.f17250c = null;
        this.f17252e = looper;
        this.f17251d = zai.m14206a(api);
        this.f17254g = new zabp(this);
        GoogleApiManager googleApiManagerM13949k = GoogleApiManager.m13949k(applicationContext);
        this.f17256i = googleApiManagerM13949k;
        this.f17253f = googleApiManagerM13949k.m13971o();
        this.f17255h = new ApiExceptionMapper();
    }

    /* renamed from: j */
    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T m13850j(int i2, T t) {
        t.m13944r();
        this.f17256i.m13968h(this, i2, t);
        return t;
    }

    @KeepForSdk
    /* renamed from: a */
    public GoogleApiClient m13851a() {
        return this.f17254g;
    }

    @KeepForSdk
    /* renamed from: b */
    protected ClientSettings.Builder m13852b() {
        Account account;
        GoogleSignInAccount googleSignInAccountM13842x;
        GoogleSignInAccount googleSignInAccountM13842x2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o = this.f17250c;
        if (!(o instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccountM13842x2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o).m13842x()) == null) {
            O o2 = this.f17250c;
            account = o2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o2).getAccount() : null;
        } else {
            account = googleSignInAccountM13842x2.getAccount();
        }
        ClientSettings.Builder builderM14303c = builder.m14303c(account);
        O o3 = this.f17250c;
        return builderM14303c.m14301a((!(o3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccountM13842x = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o3).m13842x()) == null) ? Collections.emptySet() : googleSignInAccountM13842x.m13649J0()).m14304d(this.f17248a.getClass().getName()).m14305e(this.f17248a.getPackageName());
    }

    @KeepForSdk
    /* renamed from: c */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T m13853c(T t) {
        return (T) m13850j(0, t);
    }

    @KeepForSdk
    /* renamed from: d */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T m13854d(T t) {
        return (T) m13850j(1, t);
    }

    /* renamed from: e */
    public final Api<O> m13855e() {
        return this.f17249b;
    }

    @KeepForSdk
    /* renamed from: f */
    public Context m13856f() {
        return this.f17248a;
    }

    /* renamed from: g */
    public final int m13857g() {
        return this.f17253f;
    }

    @KeepForSdk
    /* renamed from: h */
    public Looper m13858h() {
        return this.f17252e;
    }

    /* renamed from: i */
    public Api.Client mo13859i(Looper looper, GoogleApiManager.zaa<O> zaaVar) {
        return this.f17249b.m13841d().mo13600c(this.f17248a, looper, m13852b().m14302b(), this.f17250c, zaaVar, zaaVar);
    }

    /* renamed from: k */
    public zace mo13860k(Context context, Handler handler) {
        return new zace(context, handler, m13852b().m14302b());
    }

    /* renamed from: l */
    public final zai<O> m13861l() {
        return this.f17251d;
    }

    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, O o, Settings settings) {
        Preconditions.m14373l(context, "Null context is not permitted.");
        Preconditions.m14373l(api, "Api must not be null.");
        Preconditions.m14373l(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f17248a = applicationContext;
        this.f17249b = api;
        this.f17250c = o;
        this.f17252e = settings.f17259c;
        this.f17251d = zai.m14207b(api, o);
        this.f17254g = new zabp(this);
        GoogleApiManager googleApiManagerM13949k = GoogleApiManager.m13949k(applicationContext);
        this.f17256i = googleApiManagerM13949k;
        this.f17253f = googleApiManagerM13949k.m13971o();
        this.f17255h = settings.f17258b;
        googleApiManagerM13949k.m13967g(this);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new Settings.Builder().m13863b(statusExceptionMapper).m13862a());
    }
}
