package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzp {

    /* renamed from: a */
    private static zzp f17099a;

    /* renamed from: b */
    @VisibleForTesting
    private Storage f17100b;

    /* renamed from: c */
    @VisibleForTesting
    private GoogleSignInAccount f17101c;

    /* renamed from: d */
    @VisibleForTesting
    private GoogleSignInOptions f17102d;

    private zzp(Context context) {
        Storage storageM13705b = Storage.m13705b(context);
        this.f17100b = storageM13705b;
        this.f17101c = storageM13705b.m13713c();
        this.f17102d = this.f17100b.m13714d();
    }

    /* renamed from: c */
    public static synchronized zzp m13733c(Context context) {
        return m13734d(context.getApplicationContext());
    }

    /* renamed from: d */
    private static synchronized zzp m13734d(Context context) {
        if (f17099a == null) {
            f17099a = new zzp(context);
        }
        return f17099a;
    }

    /* renamed from: a */
    public final synchronized void m13735a() {
        this.f17100b.m13712a();
        this.f17101c = null;
        this.f17102d = null;
    }

    /* renamed from: b */
    public final synchronized void m13736b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f17100b.m13716f(googleSignInAccount, googleSignInOptions);
        this.f17101c = googleSignInAccount;
        this.f17102d = googleSignInOptions;
    }
}
