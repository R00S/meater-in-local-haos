package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzcjm {

    /* renamed from: a */
    private static final SparseArray<zzwt.zzi.zzc> f24402a;

    /* renamed from: b */
    private final Context f24403b;

    /* renamed from: c */
    private final zzbbh<Bundle> f24404c;

    /* renamed from: d */
    private final TelephonyManager f24405d;

    /* renamed from: e */
    private final zzcji f24406e;

    /* renamed from: f */
    private final zzcjc f24407f;

    /* renamed from: g */
    private zzwx f24408g;

    static {
        SparseArray<zzwt.zzi.zzc> sparseArray = new SparseArray<>();
        f24402a = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzwt.zzi.zzc.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzwt.zzi.zzc zzcVar = zzwt.zzi.zzc.CONNECTING;
        sparseArray.put(iOrdinal, zzcVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzcVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzcVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzwt.zzi.zzc.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzwt.zzi.zzc zzcVar2 = zzwt.zzi.zzc.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzcVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzwt.zzi.zzc.SUSPENDED);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzcVar);
        }
        if (i2 >= 16) {
            sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzcVar);
        }
    }

    zzcjm(Context context, zzbbh<Bundle> zzbbhVar, zzcji zzcjiVar, zzcjc zzcjcVar) {
        this.f24403b = context;
        this.f24404c = zzbbhVar;
        this.f24406e = zzcjiVar;
        this.f24407f = zzcjcVar;
        this.f24405d = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final byte[] m18833d(boolean z, ArrayList<zzwt.zza.EnumC11490zza> arrayList, zzwt.zzg zzgVar, zzwt.zzi.zzc zzcVar) {
        return ((zzwt.zzi.zza) ((zzdob) zzwt.zzi.zza.m20761W().m20777w(arrayList).m20772G(m18834e(zzk.zzli().mo17203o(this.f24403b.getContentResolver()) != 0)).m20773H(zzk.zzli().mo17197h(this.f24403b, this.f24405d)).m20768C(this.f24406e.m18821b()).m20769D(this.f24406e.m18823d()).m20766A(this.f24406e.m18820a()).m20776v(zzcVar).m20775u(zzgVar).m20774I(this.f24408g).m20770E(m18834e(z)).m20767B(zzk.zzln().mo14608a()).m20771F(m18834e(zzk.zzli().mo17193d(this.f24403b.getContentResolver()) != 0)).mo19736p0())).mo19587g();
    }

    /* renamed from: e */
    private static zzwx m18834e(boolean z) {
        return z ? zzwx.ENUM_TRUE : zzwx.ENUM_FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final zzwt.zzg m18837i(Bundle bundle) {
        zzwt.zzg.zzb zzbVar;
        zzwt.zzg.zza zzaVarM20713B = zzwt.zzg.m20713B();
        int i2 = bundle.getInt("cnt", -2);
        int i3 = bundle.getInt("gnt", 0);
        if (i2 == -1) {
            this.f24408g = zzwx.ENUM_TRUE;
        } else {
            this.f24408g = zzwx.ENUM_FALSE;
            if (i2 == 0) {
                zzaVarM20713B.m20719v(zzwt.zzg.zzc.CELL);
            } else if (i2 != 1) {
                zzaVarM20713B.m20719v(zzwt.zzg.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarM20713B.m20719v(zzwt.zzg.zzc.WIFI);
            }
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzwt.zzg.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzwt.zzg.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzwt.zzg.zzb.LTE;
                    break;
                default:
                    zzbVar = zzwt.zzg.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarM20713B.m20718u(zzbVar);
        }
        return (zzwt.zzg) ((zzdob) zzaVarM20713B.mo19736p0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static zzwt.zzi.zzc m18838j(Bundle bundle) {
        return f24402a.get(zzcxz.m19059a(zzcxz.m19059a(bundle, "device"), "network").getInt("active_network_state", -1), zzwt.zzi.zzc.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.zzwt.zza.EnumC11490zza> m18839k(android.os.Bundle r4) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r4 = r4.get(r0)
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto Ld
            java.util.List r4 = (java.util.List) r4
            goto L17
        Ld:
            boolean r0 = r4 instanceof java.lang.String[]
            if (r0 == 0) goto L3d
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.util.List r4 = java.util.Arrays.asList(r4)
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L24
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L24
        L38:
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            goto L41
        L3d:
            java.util.List r4 = java.util.Collections.emptyList()
        L41:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1396342996: goto L83;
                case -1052618729: goto L78;
                case -239580146: goto L6d;
                case 604727084: goto L62;
                default: goto L61;
            }
        L61:
            goto L8d
        L62:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6b
            goto L8d
        L6b:
            r2 = 3
            goto L8d
        L6d:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L76
            goto L8d
        L76:
            r2 = 2
            goto L8d
        L78:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L81
            goto L8d
        L81:
            r2 = 1
            goto L8d
        L83:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L8c
            goto L8d
        L8c:
            r2 = 0
        L8d:
            switch(r2) {
                case 0: goto L9c;
                case 1: goto L99;
                case 2: goto L96;
                case 3: goto L93;
                default: goto L90;
            }
        L90:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC11490zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L9e
        L93:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC11490zza.INTERSTITIAL
            goto L9e
        L96:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC11490zza.REWARD_BASED_VIDEO_AD
            goto L9e
        L99:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC11490zza.NATIVE_APP_INSTALL
            goto L9e
        L9c:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.EnumC11490zza.BANNER
        L9e:
            r0.add(r1)
            goto L4a
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjm.m18839k(android.os.Bundle):java.util.ArrayList");
    }

    /* renamed from: g */
    public final void m18840g(boolean z) {
        zzbar.m17369f(this.f24404c, new C7415zj(this, z), zzbbm.f22758b);
    }
}
