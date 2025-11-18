package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
public final class zzw extends zzr {

    /* renamed from: f */
    private final Context f17103f;

    public zzw(Context context) {
        this.f17103f = context;
    }

    /* renamed from: P */
    private final void m13742P() {
        if (GooglePlayServicesUtilLight.isGooglePlayServicesUid(this.f17103f, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    /* renamed from: O */
    public final void mo13737O() {
        m13742P();
        zzp.m13733c(this.f17103f).m13735a();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    /* renamed from: v */
    public final void mo13738v() {
        m13742P();
        Storage storageM13705b = Storage.m13705b(this.f17103f);
        GoogleSignInAccount googleSignInAccountM13713c = storageM13705b.m13713c();
        GoogleSignInOptions googleSignInOptionsM13714d = GoogleSignInOptions.f17045k;
        if (googleSignInAccountM13713c != null) {
            googleSignInOptionsM13714d = storageM13705b.m13714d();
        }
        GoogleApiClient googleApiClientM13890e = new GoogleApiClient.Builder(this.f17103f).m13887b(Auth.f16903g, googleSignInOptionsM13714d).m13890e();
        try {
            if (googleApiClientM13890e.mo13868d().m13795e0()) {
                if (googleSignInAccountM13713c != null) {
                    Auth.f16906j.mo13662c(googleApiClientM13890e);
                } else {
                    googleApiClientM13890e.mo13869e();
                }
            }
        } finally {
            googleApiClientM13890e.mo13872h();
        }
    }
}
