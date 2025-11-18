package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzaqd {

    /* renamed from: a */
    private static final Object f22279a = new Object();

    /* renamed from: b */
    @VisibleForTesting
    private static boolean f22280b = false;

    /* renamed from: c */
    @VisibleForTesting
    private static boolean f22281c = false;

    /* renamed from: d */
    @VisibleForTesting
    private zzdah f22282d;

    @VisibleForTesting
    /* renamed from: h */
    private final void m16868h(Context context) {
        synchronized (f22279a) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21760b4)).booleanValue() && !f22281c) {
                try {
                    f22281c = true;
                    this.f22282d = (zzdah) zzbae.m17356a(context, "com.google.android.gms.ads.omid.DynamiteOmid", C6955n3.f19981a);
                } catch (zzbag e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public final String m16869a(Context context) {
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21760b4)).booleanValue()) {
            return null;
        }
        try {
            m16868h(context);
            String strValueOf = String.valueOf(this.f22282d.mo19139H0());
            return strValueOf.length() != 0 ? "a.".concat(strValueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    /* renamed from: b */
    public final IObjectWrapper m16870b(String str, WebView webView, String str2, String str3, String str4) {
        return m16871c(str, webView, str2, str3, str4, "Google");
    }

    /* renamed from: c */
    public final IObjectWrapper m16871c(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f22279a) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21760b4)).booleanValue() && f22280b) {
                    try {
                        return this.f22282d.mo19142d3(str, ObjectWrapper.m14708E0(webView), str2, str3, str4, str5);
                    } catch (RemoteException | NullPointerException e2) {
                        zzbad.m17350f("#007 Could not call remote method.", e2);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m16872d(IObjectWrapper iObjectWrapper, View view) {
        synchronized (f22279a) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21760b4)).booleanValue() && f22280b) {
                try {
                    this.f22282d.mo19143p1(iObjectWrapper, ObjectWrapper.m14708E0(view));
                } catch (RemoteException | NullPointerException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m16873e(IObjectWrapper iObjectWrapper) {
        synchronized (f22279a) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21760b4)).booleanValue() && f22280b) {
                try {
                    this.f22282d.mo19144w6(iObjectWrapper);
                } catch (RemoteException | NullPointerException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m16874f(IObjectWrapper iObjectWrapper) {
        synchronized (f22279a) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21760b4)).booleanValue() && f22280b) {
                try {
                    this.f22282d.mo19141a7(iObjectWrapper);
                } catch (RemoteException | NullPointerException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean m16875g(Context context) {
        synchronized (f22279a) {
            if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21760b4)).booleanValue()) {
                return false;
            }
            if (f22280b) {
                return true;
            }
            try {
                m16868h(context);
                boolean zMo19140H1 = this.f22282d.mo19140H1(ObjectWrapper.m14708E0(context));
                f22280b = zMo19140H1;
                return zMo19140H1;
            } catch (RemoteException e2) {
                e = e2;
                zzbad.m17350f("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e3) {
                e = e3;
                zzbad.m17350f("#007 Could not call remote method.", e);
                return false;
            }
        }
    }
}
