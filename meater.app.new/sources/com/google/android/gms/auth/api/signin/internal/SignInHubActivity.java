package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.account.AccountAnalytics;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p024c.p073p.p074a.AbstractC0992a;
import p024c.p073p.p075b.C0995b;

@KeepName
/* loaded from: classes2.dex */
public class SignInHubActivity extends ActivityC0468d {

    /* renamed from: f */
    private static boolean f17079f = false;

    /* renamed from: g */
    private boolean f17080g = false;

    /* renamed from: h */
    private SignInConfiguration f17081h;

    /* renamed from: i */
    private boolean f17082i;

    /* renamed from: j */
    private int f17083j;

    /* renamed from: k */
    private Intent f17084k;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    private class C6318a implements AbstractC0992a.a<Void> {
        private C6318a() {
        }

        @Override // p024c.p073p.p074a.AbstractC0992a.a
        /* renamed from: a */
        public final /* synthetic */ void mo6276a(C0995b<Void> c0995b, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f17083j, SignInHubActivity.this.f17084k);
            SignInHubActivity.this.finish();
        }

        @Override // p024c.p073p.p074a.AbstractC0992a.a
        /* renamed from: b */
        public final C0995b<Void> mo6277b(int i2, Bundle bundle) {
            return new zze(SignInHubActivity.this, GoogleApiClient.m13866l());
        }

        @Override // p024c.p073p.p074a.AbstractC0992a.a
        /* renamed from: c */
        public final void mo6278c(C0995b<Void> c0995b) {
        }
    }

    /* renamed from: b */
    private final void m13702b(int i2) {
        Status status = new Status(i2);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f17079f = false;
    }

    /* renamed from: d */
    private final void m13704d() {
        getSupportLoaderManager().mo6274c(0, null, new C6318a());
        f17079f = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f17080g) {
            return;
        }
        setResult(0);
        if (i2 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.m13695x() != null) {
                GoogleSignInAccount googleSignInAccountM13695x = signInAccount.m13695x();
                zzp.m13733c(this).m13736b(this.f17081h.m13700y(), googleSignInAccountM13695x);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountM13695x);
                this.f17082i = true;
                this.f17083j = i3;
                this.f17084k = intent;
                m13704d();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = AccountAnalytics.UNKNOWN_STATUS_CODE;
                }
                m13702b(intExtra);
                return;
            }
        }
        m13702b(8);
    }

    @Override // androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m13702b(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String strValueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", strValueOf.length() != 0 ? "Unknown action: ".concat(strValueOf) : new String("Unknown action: "));
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
        this.f17081h = signInConfiguration;
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        if (!(bundle == null)) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f17082i = z;
            if (z) {
                this.f17083j = bundle.getInt("signInResultCode");
                this.f17084k = (Intent) bundle.getParcelable("signInResultData");
                m13704d();
                return;
            }
            return;
        }
        if (f17079f) {
            setResult(0);
            m13702b(12502);
            return;
        }
        f17079f = true;
        Intent intent2 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent2.setPackage("com.google.android.gms");
        } else {
            intent2.setPackage(getPackageName());
        }
        intent2.putExtra("config", this.f17081h);
        try {
            startActivityForResult(intent2, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f17080g = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m13702b(17);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f17082i);
        if (this.f17082i) {
            bundle.putInt("signInResultCode", this.f17083j);
            bundle.putParcelable("signInResultData", this.f17084k);
        }
    }
}
