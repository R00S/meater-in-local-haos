package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzbym extends zzaef {

    /* renamed from: f */
    private final zzbyt f23777f;

    public zzbym(zzbyt zzbytVar) {
        this.f23777f = zzbytVar;
    }

    /* renamed from: h7 */
    private final float m18476h7() {
        try {
            return this.f23777f.m18545m().mo16195T();
        } catch (RemoteException e2) {
            zzbad.m17347c("Remote exception getting video controller aspect ratio.", e2);
            return 0.0f;
        }
    }

    /* renamed from: i7 */
    private final float m18477i7() {
        zzadw zzadwVar = this.f23777f.m18540h().get(0);
        if (zzadwVar.getWidth() != -1 && zzadwVar.getHeight() != -1) {
            return zzadwVar.getWidth() / zzadwVar.getHeight();
        }
        try {
            Drawable drawable = (Drawable) ObjectWrapper.m14709k0(zzadwVar.mo16470t4());
            if (drawable == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
                return 0.0f;
            }
            return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        } catch (RemoteException e2) {
            zzbad.m17347c("RemoteException getting Drawable for aspect ratio calculation.", e2);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaee
    /* renamed from: T */
    public final float mo16472T() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21782e5)).booleanValue()) {
            return this.f23777f.m18531Y() != 0.0f ? this.f23777f.m18531Y() : this.f23777f.m18545m() != null ? m18476h7() : m18477i7();
        }
        return 0.0f;
    }
}
