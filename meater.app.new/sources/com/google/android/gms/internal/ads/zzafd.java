package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzafd extends NativeContentAd {

    /* renamed from: a */
    private final zzafa f21986a;

    /* renamed from: c */
    private final zzael f21988c;

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f21990e;

    /* renamed from: b */
    private final List<NativeAd.Image> f21987b = new ArrayList();

    /* renamed from: d */
    private final VideoController f21989d = new VideoController();

    public zzafd(zzafa zzafaVar) {
        zzaei zzaeiVarMo16493D0;
        zzaei zzaekVar;
        IBinder iBinder;
        this.f21986a = zzafaVar;
        zzaed zzaedVar = null;
        try {
            List listMo16501k = zzafaVar.mo16501k();
            if (listMo16501k != null) {
                for (Object obj : listMo16501k) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzaekVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzaekVar = iInterfaceQueryLocalInterface instanceof zzaei ? (zzaei) iInterfaceQueryLocalInterface : new zzaek(iBinder);
                    }
                    if (zzaekVar != null) {
                        this.f21987b.add(new zzael(zzaekVar));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        try {
            zzaeiVarMo16493D0 = this.f21986a.mo16493D0();
        } catch (RemoteException e3) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
        }
        zzael zzaelVar = zzaeiVarMo16493D0 != null ? new zzael(zzaeiVarMo16493D0) : null;
        this.f21988c = zzaelVar;
        try {
            if (this.f21986a.mo16496f() != null) {
                zzaedVar = new zzaed(this.f21986a.mo16496f());
            }
        } catch (RemoteException e4) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e4);
        }
        this.f21990e = zzaedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.NativeAd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IObjectWrapper zzkq() {
        try {
            return this.f21986a.mo16502r();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final void destroy() {
        try {
            this.f21986a.destroy();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f21990e;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getAdvertiser() {
        try {
            return this.f21986a.mo16503w();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getBody() {
        try {
            return this.f21986a.mo16499i();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getCallToAction() {
        try {
            return this.f21986a.mo16498h();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final Bundle getExtras() {
        try {
            return this.f21986a.getExtras();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getHeadline() {
        try {
            return this.f21986a.mo16497g();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final List<NativeAd.Image> getImages() {
        return this.f21987b;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final NativeAd.Image getLogo() {
        return this.f21988c;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.f21986a.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final VideoController getVideoController() {
        try {
            if (this.f21986a.getVideoController() != null) {
                this.f21989d.zza(this.f21986a.getVideoController());
            }
        } catch (RemoteException e2) {
            zzbad.m17347c("Exception occurred while getting video controller", e2);
        }
        return this.f21989d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f21986a.mo16504z(bundle);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f21986a.mo16494E(bundle);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f21986a.mo16495L(bundle);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
