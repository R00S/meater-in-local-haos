package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzaed extends NativeAd.AdChoicesInfo {

    /* renamed from: a */
    private final zzaea f21969a;

    /* renamed from: b */
    private final List<NativeAd.Image> f21970b = new ArrayList();

    /* renamed from: c */
    private String f21971c;

    public zzaed(zzaea zzaeaVar) {
        zzaei zzaekVar;
        IBinder iBinder;
        this.f21969a = zzaeaVar;
        try {
            this.f21971c = zzaeaVar.mo16464m1();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            this.f21971c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            for (zzaei zzaeiVar : zzaeaVar.mo16459M0()) {
                if (!(zzaeiVar instanceof IBinder) || (iBinder = (IBinder) zzaeiVar) == null) {
                    zzaekVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzaekVar = iInterfaceQueryLocalInterface instanceof zzaei ? (zzaei) iInterfaceQueryLocalInterface : new zzaek(iBinder);
                }
                if (zzaekVar != null) {
                    this.f21970b.add(new zzael(zzaekVar));
                }
            }
        } catch (RemoteException e3) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.f21970b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f21971c;
    }
}
