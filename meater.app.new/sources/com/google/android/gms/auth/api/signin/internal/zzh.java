package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzh {

    /* renamed from: a */
    private static Logger f17098a = new Logger("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static GoogleSignInResult m13728a(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount")) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.f17291g;
        }
        return new GoogleSignInResult(googleSignInAccount, status);
    }

    /* renamed from: b */
    public static Intent m13729b(Context context, GoogleSignInOptions googleSignInOptions) {
        f17098a.m14528a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: c */
    public static PendingResult<Status> m13730c(GoogleApiClient googleApiClient, Context context, boolean z) {
        f17098a.m14528a("Signing out", new Object[0]);
        m13731d(context);
        return z ? PendingResults.m13903b(Status.f17291g, googleApiClient) : googleApiClient.mo13875k(new C6319a(googleApiClient));
    }

    /* renamed from: d */
    private static void m13731d(Context context) {
        zzp.m13733c(context).m13735a();
        Iterator<GoogleApiClient> it = GoogleApiClient.m13866l().iterator();
        while (it.hasNext()) {
            it.next().mo13881r();
        }
        GoogleApiManager.m13946b();
    }

    /* renamed from: e */
    public static PendingResult<Status> m13732e(GoogleApiClient googleApiClient, Context context, boolean z) {
        f17098a.m14528a("Revoking access", new Object[0]);
        String strM13715e = Storage.m13705b(context).m13715e();
        m13731d(context);
        return z ? zzd.m13723a(strM13715e) : googleApiClient.mo13875k(new C6321c(googleApiClient));
    }
}
