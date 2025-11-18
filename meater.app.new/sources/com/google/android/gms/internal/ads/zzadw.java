package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzadw extends zzaej {

    /* renamed from: f */
    private final Drawable f21956f;

    /* renamed from: g */
    private final Uri f21957g;

    /* renamed from: h */
    private final double f21958h;

    /* renamed from: i */
    private final int f21959i;

    /* renamed from: j */
    private final int f21960j;

    public zzadw(Drawable drawable, Uri uri, double d2, int i2, int i3) {
        this.f21956f = drawable;
        this.f21957g = uri;
        this.f21958h = d2;
        this.f21959i = i2;
        this.f21960j = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    /* renamed from: I0 */
    public final Uri mo16468I0() throws RemoteException {
        return this.f21957g;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    /* renamed from: T3 */
    public final double mo16469T3() {
        return this.f21958h;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final int getHeight() {
        return this.f21960j;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final int getWidth() {
        return this.f21959i;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    /* renamed from: t4 */
    public final IObjectWrapper mo16470t4() throws RemoteException {
        return ObjectWrapper.m14708E0(this.f21956f);
    }
}
