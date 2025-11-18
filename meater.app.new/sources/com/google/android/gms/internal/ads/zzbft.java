package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public abstract class zzbft implements Releasable {

    /* renamed from: f */
    protected Context f22970f;

    /* renamed from: g */
    protected String f22971g;

    /* renamed from: h */
    protected WeakReference<zzbdf> f22972h;

    public zzbft(zzbdf zzbdfVar) {
        this.f22970f = zzbdfVar.getContext();
        this.f22971g = zzk.zzlg().m17177g0(this.f22970f, zzbdfVar.mo14899b().f22750f);
        this.f22972h = new WeakReference<>(zzbdfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: A */
    public static String m17623A(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c2 = 2;
                    break;
                }
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c2 = 3;
                    break;
                }
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c2 = 4;
                    break;
                }
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c2 = 5;
                    break;
                }
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c2 = 6;
                    break;
                }
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c2 = 7;
                    break;
                }
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c2 = 11;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 2:
            case 4:
            case 5:
            case '\b':
            case '\t':
            default:
                return "internal";
            case 1:
            case 3:
                return "network";
            case 6:
            case 7:
                return "policy";
            case '\n':
            case 11:
                return "io";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m17626r(String str, Map<String, String> map) {
        zzbdf zzbdfVar = this.f22972h.get();
        if (zzbdfVar != null) {
            zzbdfVar.mo14940y(str, map);
        }
    }

    /* renamed from: b */
    public abstract void mo17627b();

    @Override // com.google.android.gms.common.api.Releasable
    /* renamed from: c */
    public void mo13849c() {
    }

    /* renamed from: j */
    protected final void m17628j(String str, String str2, int i2) {
        zzazt.f22735a.post(new RunnableC6629ea(this, str, str2, i2));
    }

    @VisibleForTesting
    /* renamed from: k */
    public final void m17629k(String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        zzazt.f22735a.post(new RunnableC6592da(this, str, str2, i2, i3, j2, j3, z, i4, i5));
    }

    @VisibleForTesting
    /* renamed from: l */
    public final void m17630l(String str, String str2, int i2, int i3, boolean z, int i4, int i5) {
        zzazt.f22735a.post(new RunnableC6481aa(this, str, str2, i2, 0, z, i4, i5));
    }

    @VisibleForTesting
    /* renamed from: m */
    public final void m17631m(String str, String str2, long j2, long j3, boolean z) {
        zzazt.f22735a.post(new RunnableC6518ba(this, str, str2, j2, j3, z));
    }

    @VisibleForTesting
    /* renamed from: p */
    public final void m17632p(String str, String str2, long j2, long j3, boolean z, int i2, int i3) {
        zzazt.f22735a.post(new RunnableC6555ca(this, str, str2, j2, j3, z, i2, i3));
    }

    @VisibleForTesting
    /* renamed from: q */
    public final void m17633q(String str, String str2, String str3, String str4) {
        zzazt.f22735a.post(new RunnableC6703ga(this, str, str2, str3, str4));
    }

    @VisibleForTesting
    /* renamed from: s */
    public final void m17634s(String str, String str2, long j2) {
        zzazt.f22735a.post(new RunnableC6666fa(this, str, str2, j2));
    }

    /* renamed from: t */
    protected void mo17635t(int i2) {
    }

    /* renamed from: u */
    protected void mo17636u(int i2) {
    }

    /* renamed from: v */
    protected void mo17637v(int i2) {
    }

    /* renamed from: w */
    protected void mo17638w(int i2) {
    }

    /* renamed from: x */
    public boolean mo17639x(String str, String[] strArr) {
        return mo17640y(str);
    }

    /* renamed from: y */
    public abstract boolean mo17640y(String str);

    /* renamed from: z */
    protected String mo17641z(String str) {
        zzyt.m20844a();
        return zzazt.m17315t(str);
    }
}
