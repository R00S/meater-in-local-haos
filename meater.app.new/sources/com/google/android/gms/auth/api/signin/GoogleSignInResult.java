package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public class GoogleSignInResult implements Result {

    /* renamed from: f */
    private Status f17066f;

    /* renamed from: g */
    private GoogleSignInAccount f17067g;

    public GoogleSignInResult(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f17067g = googleSignInAccount;
        this.f17066f = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount m13692a() {
        return this.f17067g;
    }

    /* renamed from: b */
    public boolean m13693b() {
        return this.f17066f.m13915e0();
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.f17066f;
    }
}
