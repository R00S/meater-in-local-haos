package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzael extends NativeAd.Image {

    /* renamed from: a */
    private final zzaei f21973a;

    /* renamed from: b */
    private final Drawable f21974b;

    /* renamed from: c */
    private final Uri f21975c;

    /* renamed from: d */
    private final double f21976d;

    /* renamed from: e */
    private final int f21977e;

    /* renamed from: f */
    private final int f21978f;

    public zzael(zzaei zzaeiVar) {
        int width;
        IObjectWrapper iObjectWrapperMo16470t4;
        this.f21973a = zzaeiVar;
        Uri uriMo16468I0 = null;
        try {
            iObjectWrapperMo16470t4 = zzaeiVar.mo16470t4();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        Drawable drawable = iObjectWrapperMo16470t4 != null ? (Drawable) ObjectWrapper.m14709k0(iObjectWrapperMo16470t4) : null;
        this.f21974b = drawable;
        try {
            uriMo16468I0 = this.f21973a.mo16468I0();
        } catch (RemoteException e3) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
        }
        this.f21975c = uriMo16468I0;
        double dMo16469T3 = 1.0d;
        try {
            dMo16469T3 = this.f21973a.mo16469T3();
        } catch (RemoteException e4) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e4);
        }
        this.f21976d = dMo16469T3;
        int height = -1;
        try {
            width = this.f21973a.getWidth();
        } catch (RemoteException e5) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e5);
            width = -1;
        }
        this.f21977e = width;
        try {
            height = this.f21973a.getHeight();
        } catch (RemoteException e6) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e6);
        }
        this.f21978f = height;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f21974b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int getHeight() {
        return this.f21978f;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f21976d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f21975c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int getWidth() {
        return this.f21977e;
    }
}
