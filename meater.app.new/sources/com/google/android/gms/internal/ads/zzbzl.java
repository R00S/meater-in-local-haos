package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbzl {

    /* renamed from: a */
    private final Context f23886a;

    /* renamed from: b */
    private final zzaxb f23887b;

    /* renamed from: c */
    private final zzcxv f23888c;

    /* renamed from: d */
    private final zzbyx f23889d;

    /* renamed from: e */
    private final zzbyt f23890e;

    /* renamed from: f */
    private final zzbzt f23891f;

    /* renamed from: g */
    private final Executor f23892g;

    /* renamed from: h */
    private final Executor f23893h;

    /* renamed from: i */
    private final zzady f23894i;

    public zzbzl(Context context, zzaxb zzaxbVar, zzcxv zzcxvVar, zzbyx zzbyxVar, zzbyt zzbytVar, zzbzt zzbztVar, Executor executor, Executor executor2) {
        this.f23886a = context;
        this.f23887b = zzaxbVar;
        this.f23888c = zzcxvVar;
        this.f23894i = zzcxvVar.f25298i;
        this.f23889d = zzbyxVar;
        this.f23890e = zzbytVar;
        this.f23891f = zzbztVar;
        this.f23892g = executor;
        this.f23893h = executor2;
    }

    /* renamed from: a */
    private static void m18593a(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m18595d(zzcab zzcabVar, String[] strArr) {
        Map<String, WeakReference<View>> mapMo18587V3 = zzcabVar.mo18587V3();
        if (mapMo18587V3 == null) {
            return false;
        }
        for (String str : strArr) {
            if (mapMo18587V3.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m18596b(ViewGroup viewGroup) {
        View viewM18555z = this.f23890e.m18555z();
        if (viewM18555z == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewM18555z.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewM18555z.getParent()).removeView(viewM18555z);
        }
        viewGroup.addView(viewM18555z, ((Boolean) zzyt.m20848e().m16421c(zzacu.f21697R2)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    /* renamed from: e */
    final /* synthetic */ void m18597e(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.f23890e.m18555z() != null) {
            if (2 == this.f23890e.m18552w() || 1 == this.f23890e.m18552w()) {
                this.f23887b.mo17112z(this.f23888c.f25295f, String.valueOf(this.f23890e.m18552w()), z);
            } else if (6 == this.f23890e.m18552w()) {
                this.f23887b.mo17112z(this.f23888c.f25295f, "2", z);
                this.f23887b.mo17112z(this.f23888c.f25295f, "1", z);
            }
        }
    }

    /* renamed from: f */
    public final void m18598f(final zzcab zzcabVar) {
        this.f23892g.execute(new Runnable(this, zzcabVar) { // from class: com.google.android.gms.internal.ads.zf

            /* renamed from: f */
            private final zzbzl f21451f;

            /* renamed from: g */
            private final zzcab f21452g;

            {
                this.f21451f = this;
                this.f21452g = zzcabVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f21451f.m18600h(this.f21452g);
            }
        });
    }

    /* renamed from: g */
    public final void m18599g(zzcab zzcabVar) {
        if (zzcabVar == null || this.f23891f == null || zzcabVar.mo18583E0() == null) {
            return;
        }
        try {
            zzcabVar.mo18583E0().addView(this.f23891f.m18608c());
        } catch (zzbhj e2) {
            zzawz.m17081l("web view can not be obtained", e2);
        }
    }

    /* renamed from: h */
    final /* synthetic */ void m18600h(zzcab zzcabVar) {
        ViewGroup viewGroup;
        View viewM18553x;
        final ViewGroup viewGroup2;
        Drawable drawable;
        if (this.f23889d.mo18558c() || this.f23889d.mo18557b()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            for (int i2 = 0; i2 < 2; i2++) {
                View viewMo18588Y4 = zzcabVar.mo18588Y4(strArr[i2]);
                if (viewMo18588Y4 != null && (viewMo18588Y4 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) viewMo18588Y4;
                    break;
                }
            }
            viewGroup = null;
        } else {
            viewGroup = null;
        }
        boolean z = viewGroup != null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f23890e.m18553x() != null) {
            viewM18553x = this.f23890e.m18553x();
            zzady zzadyVar = this.f23894i;
            if (zzadyVar != null && !z) {
                m18593a(layoutParams, zzadyVar.f21965j);
                viewM18553x.setLayoutParams(layoutParams);
            }
        } else if (this.f23890e.m18528V() instanceof zzadt) {
            zzadt zzadtVar = (zzadt) this.f23890e.m18528V();
            if (!z) {
                m18593a(layoutParams, zzadtVar.m16466n7());
            }
            View zzaduVar = new zzadu(this.f23886a, zzadtVar, layoutParams);
            zzaduVar.setContentDescription((CharSequence) zzyt.m20848e().m16421c(zzacu.f21679O2));
            viewM18553x = zzaduVar;
        } else {
            viewM18553x = null;
        }
        if (viewM18553x != null) {
            if (viewM18553x.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewM18553x.getParent()).removeView(viewM18553x);
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewM18553x);
            } else {
                AdChoicesView adChoicesView = new AdChoicesView(zzcabVar.mo18589k0().getContext());
                adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                adChoicesView.addView(viewM18553x);
                FrameLayout frameLayoutMo18583E0 = zzcabVar.mo18583E0();
                if (frameLayoutMo18583E0 != null) {
                    frameLayoutMo18583E0.addView(adChoicesView);
                }
            }
            zzcabVar.mo18585H(zzcabVar.mo18582A5(), viewM18553x, true);
        }
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21735X4)).booleanValue()) {
            m18599g(zzcabVar);
        }
        String[] strArr2 = zzbzj.f23876f;
        int length = strArr2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                viewGroup2 = null;
                break;
            }
            View viewMo18588Y42 = zzcabVar.mo18588Y4(strArr2[i3]);
            if (viewMo18588Y42 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewMo18588Y42;
                break;
            }
            i3++;
        }
        this.f23893h.execute(new Runnable(this, viewGroup2) { // from class: com.google.android.gms.internal.ads.ag

            /* renamed from: f */
            private final zzbzl f18160f;

            /* renamed from: g */
            private final ViewGroup f18161g;

            {
                this.f18160f = this;
                this.f18161g = viewGroup2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18160f.m18597e(this.f18161g);
            }
        });
        if (viewGroup2 != null) {
            if (m18596b(viewGroup2)) {
                if (this.f23890e.m18513A() != null) {
                    this.f23890e.m18513A().mo14939x0(new C6524bg(this, zzcabVar, viewGroup2));
                    return;
                }
                return;
            }
            viewGroup2.removeAllViews();
            View viewMo18589k0 = zzcabVar.mo18589k0();
            Context context = viewMo18589k0 != null ? viewMo18589k0.getContext() : null;
            if (context == null || this.f23890e.m18540h() == null || this.f23890e.m18540h().isEmpty()) {
                return;
            }
            zzadw zzadwVar = this.f23890e.m18540h().get(0);
            zzaei zzaeiVarM16473h7 = zzadwVar instanceof IBinder ? zzaej.m16473h7(zzadwVar) : null;
            if (zzaeiVarM16473h7 != null) {
                try {
                    IObjectWrapper iObjectWrapperMo16470t4 = zzaeiVarM16473h7.mo16470t4();
                    if (iObjectWrapperMo16470t4 == null || (drawable = (Drawable) ObjectWrapper.m14709k0(iObjectWrapperMo16470t4)) == null) {
                        return;
                    }
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(drawable);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                } catch (RemoteException unused) {
                    zzbad.m17353i("Could not get drawable from image");
                }
            }
        }
    }
}
