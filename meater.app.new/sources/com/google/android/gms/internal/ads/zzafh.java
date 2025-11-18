package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzafh implements NativeCustomTemplateAd {

    /* renamed from: a */
    private static WeakHashMap<IBinder, zzafh> f21991a = new WeakHashMap<>();

    /* renamed from: b */
    private final zzafe f21992b;

    /* renamed from: c */
    private final MediaView f21993c;

    /* renamed from: d */
    private final VideoController f21994d = new VideoController();

    @VisibleForTesting
    private zzafh(zzafe zzafeVar) {
        Context context;
        this.f21992b = zzafeVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.m14709k0(zzafeVar.mo16508U4());
        } catch (RemoteException | NullPointerException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f21992b.mo16506F3(ObjectWrapper.m14708E0(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e3) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
            }
        }
        this.f21993c = mediaView;
    }

    /* renamed from: a */
    public static zzafh m16512a(zzafe zzafeVar) {
        synchronized (f21991a) {
            zzafh zzafhVar = f21991a.get(zzafeVar.asBinder());
            if (zzafhVar != null) {
                return zzafhVar;
            }
            zzafh zzafhVar2 = new zzafh(zzafeVar);
            f21991a.put(zzafeVar.asBinder(), zzafhVar2);
            return zzafhVar2;
        }
    }

    /* renamed from: b */
    public final zzafe m16513b() {
        return this.f21992b;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.f21992b.destroy();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.f21992b.getAvailableAssetNames();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.f21992b.getCustomTemplateId();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            zzaei zzaeiVarMo16507N1 = this.f21992b.mo16507N1(str);
            if (zzaeiVarMo16507N1 != null) {
                return new zzael(zzaeiVarMo16507N1);
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String str) {
        try {
            return this.f21992b.mo16509Y0(str);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            zzaar videoController = this.f21992b.getVideoController();
            if (videoController != null) {
                this.f21994d.zza(videoController);
            }
        } catch (RemoteException e2) {
            zzbad.m17347c("Exception occurred while getting video controller", e2);
        }
        return this.f21994d;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.f21993c;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.f21992b.performClick(str);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.f21992b.recordImpression();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
