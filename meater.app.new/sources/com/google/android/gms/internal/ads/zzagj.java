package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzagj extends UnifiedNativeAd {

    /* renamed from: a */
    private final zzagg f22001a;

    /* renamed from: c */
    private final zzael f22003c;

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f22005e;

    /* renamed from: g */
    private final UnifiedNativeAd.zza f22007g;

    /* renamed from: b */
    private final List<NativeAd.Image> f22002b = new ArrayList();

    /* renamed from: d */
    private final VideoController f22004d = new VideoController();

    /* renamed from: f */
    private final List<MuteThisAdReason> f22006f = new ArrayList();

    public zzagj(zzagg zzaggVar) {
        zzaei zzaeiVarMo16549n;
        zzaei zzaekVar;
        IBinder iBinder;
        this.f22001a = zzaggVar;
        zzaeh zzaehVar = null;
        try {
            List listMo16548k = zzaggVar.mo16548k();
            if (listMo16548k != null) {
                for (Object obj : listMo16548k) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzaekVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzaekVar = iInterfaceQueryLocalInterface instanceof zzaei ? (zzaei) iInterfaceQueryLocalInterface : new zzaek(iBinder);
                    }
                    if (zzaekVar != null) {
                        this.f22002b.add(new zzael(zzaekVar));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        try {
            List listMo16555u4 = this.f22001a.mo16555u4();
            if (listMo16555u4 != null) {
                for (Object obj2 : listMo16555u4) {
                    zzaak zzaakVarM16187h7 = obj2 instanceof IBinder ? zzaal.m16187h7((IBinder) obj2) : null;
                    if (zzaakVarM16187h7 != null) {
                        this.f22006f.add(new zzaan(zzaakVarM16187h7));
                    }
                }
            }
        } catch (RemoteException e3) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
        }
        try {
            zzaeiVarMo16549n = this.f22001a.mo16549n();
        } catch (RemoteException e4) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e4);
        }
        zzael zzaelVar = zzaeiVarMo16549n != null ? new zzael(zzaeiVarMo16549n) : null;
        this.f22003c = zzaelVar;
        try {
        } catch (RemoteException e5) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e5);
        }
        zzaed zzaedVar = this.f22001a.mo16542f() != null ? new zzaed(this.f22001a.mo16542f()) : null;
        this.f22005e = zzaedVar;
        try {
            if (this.f22001a.mo16550n2() != null) {
                zzaehVar = new zzaeh(this.f22001a.mo16550n2());
            }
        } catch (RemoteException e6) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e6);
        }
        this.f22007g = zzaehVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IObjectWrapper zzkq() {
        try {
            return this.f22001a.mo16552r();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.f22001a.mo16539W();
        } catch (RemoteException e2) {
            zzbad.m17347c("Failed to cancelUnconfirmedClick", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.f22001a.destroy();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.f22001a.mo16547j0();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f22005e;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.f22001a.mo16556w();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.f22001a.mo16545i();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.f22001a.mo16544h();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle extras = this.f22001a.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.f22001a.mo16543g();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.f22003c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.f22002b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.f22001a.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f22006f;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.f22001a.mo16551o();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double dMo16553t = this.f22001a.mo16553t();
            if (dMo16553t == -1.0d) {
                return null;
            }
            return Double.valueOf(dMo16553t);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.f22001a.getStore();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.f22001a.getVideoController() != null) {
                this.f22004d.zza(this.f22001a.getVideoController());
            }
        } catch (RemoteException e2) {
            zzbad.m17347c("Exception occurred while getting video controller", e2);
        }
        return this.f22004d;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f22001a.mo16554u2();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzbad.m17351g("Ad is not custom mute enabled");
                return;
            }
            if (muteThisAdReason == null) {
                this.f22001a.mo16541e0(null);
            } else if (muteThisAdReason instanceof zzaan) {
                this.f22001a.mo16541e0(((zzaan) muteThisAdReason).m16188a());
            } else {
                zzbad.m17351g("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f22001a.mo16557z(bundle);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.f22001a.mo16535D6();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f22001a.mo16536E(bundle);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f22001a.mo16538L(bundle);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f22001a.mo16537G0(new zzaaj(muteThisAdListener));
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f22001a.mo16540d0(new zzagt(unconfirmedClickListener));
        } catch (RemoteException e2) {
            zzbad.m17347c("Failed to setUnconfirmedClickListener", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzkv() {
        try {
            IObjectWrapper iObjectWrapperMo16546j = this.f22001a.mo16546j();
            if (iObjectWrapperMo16546j != null) {
                return ObjectWrapper.m14709k0(iObjectWrapperMo16546j);
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }
}
