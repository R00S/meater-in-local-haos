package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzws {

    /* renamed from: a */
    private final byte[] f27288a;

    /* renamed from: b */
    private int f27289b;

    /* renamed from: c */
    private int f27290c;

    /* renamed from: d */
    private final /* synthetic */ zzwo f27291d;

    private zzws(zzwo zzwoVar, byte[] bArr) {
        this.f27291d = zzwoVar;
        this.f27288a = bArr;
    }

    /* renamed from: a */
    public final zzws m20701a(int i2) {
        this.f27289b = i2;
        return this;
    }

    /* renamed from: b */
    public final zzws m20702b(int i2) {
        this.f27290c = i2;
        return this;
    }

    /* renamed from: c */
    public final synchronized void m20703c() {
        try {
            zzwo zzwoVar = this.f27291d;
            if (zzwoVar.f27287b) {
                zzwoVar.f27286a.mo19956U0(this.f27288a);
                this.f27291d.f27286a.mo19960z3(this.f27289b);
                this.f27291d.f27286a.mo19957a1(this.f27290c);
                this.f27291d.f27286a.mo19958a3(null);
                this.f27291d.f27286a.mo19959b6();
            }
        } catch (RemoteException e2) {
            zzbad.m17346b("Clearcut log failed", e2);
        }
    }
}
