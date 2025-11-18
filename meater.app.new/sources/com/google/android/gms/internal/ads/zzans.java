package com.google.android.gms.internal.ads;

import android.location.Location;
import cm.aptoide.p092pt.account.AdultContentAnalytics;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzans implements NativeMediationAdRequest {

    /* renamed from: a */
    private final Date f22198a;

    /* renamed from: b */
    private final int f22199b;

    /* renamed from: c */
    private final Set<String> f22200c;

    /* renamed from: d */
    private final boolean f22201d;

    /* renamed from: e */
    private final Location f22202e;

    /* renamed from: f */
    private final int f22203f;

    /* renamed from: g */
    private final zzady f22204g;

    /* renamed from: i */
    private final boolean f22206i;

    /* renamed from: k */
    private final int f22208k;

    /* renamed from: l */
    private final String f22209l;

    /* renamed from: h */
    private final List<String> f22205h = new ArrayList();

    /* renamed from: j */
    private final Map<String, Boolean> f22207j = new HashMap();

    public zzans(Date date, int i2, Set<String> set, Location location, boolean z, int i3, zzady zzadyVar, List<String> list, boolean z2, int i4, String str) {
        this.f22198a = date;
        this.f22199b = i2;
        this.f22200c = set;
        this.f22202e = location;
        this.f22201d = z;
        this.f22203f = i3;
        this.f22204g = zzadyVar;
        this.f22206i = z2;
        this.f22208k = i4;
        this.f22209l = str;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f22207j.put(strArrSplit[1], Boolean.TRUE);
                        } else if (AdultContentAnalytics.UNLOCK.equals(strArrSplit[2])) {
                            this.f22207j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f22205h.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzabe.m16315j().m16323h();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.f22198a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f22199b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f22200c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f22202e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        zzacd zzacdVar;
        if (this.f22204g == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.f22204g.f21962g).setImageOrientation(this.f22204g.f21963h).setRequestMultipleImages(this.f22204g.f21964i);
        zzady zzadyVar = this.f22204g;
        if (zzadyVar.f21961f >= 2) {
            requestMultipleImages.setAdChoicesPlacement(zzadyVar.f21965j);
        }
        zzady zzadyVar2 = this.f22204g;
        if (zzadyVar2.f21961f >= 3 && (zzacdVar = zzadyVar2.f21966k) != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(zzacdVar));
        }
        return requestMultipleImages.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzabe.m16315j().m16324i();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAppInstallAdRequested() {
        List<String> list = this.f22205h;
        if (list != null) {
            return list.contains("2") || this.f22205h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isContentAdRequested() {
        List<String> list = this.f22205h;
        if (list != null) {
            return list.contains("1") || this.f22205h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f22206i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f22201d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.f22205h;
        return list != null && list.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f22203f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzsu() {
        List<String> list = this.f22205h;
        return list != null && list.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map<String, Boolean> zzsv() {
        return this.f22207j;
    }
}
