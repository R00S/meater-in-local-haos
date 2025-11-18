package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public class zza implements IInterface {

    /* renamed from: f */
    private final IBinder f27496f;

    /* renamed from: g */
    private final String f27497g;

    protected zza(IBinder iBinder, String str) {
        this.f27496f = iBinder;
        this.f27497g = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f27496f;
    }
}
