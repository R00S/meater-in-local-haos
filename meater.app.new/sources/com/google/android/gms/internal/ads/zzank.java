package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzank implements MediationAdRequest {

    /* renamed from: a */
    private final Date f22176a;

    /* renamed from: b */
    private final int f22177b;

    /* renamed from: c */
    private final Set<String> f22178c;

    /* renamed from: d */
    private final boolean f22179d;

    /* renamed from: e */
    private final Location f22180e;

    /* renamed from: f */
    private final int f22181f;

    /* renamed from: g */
    private final boolean f22182g;

    /* renamed from: h */
    private final int f22183h;

    /* renamed from: i */
    private final String f22184i;

    public zzank(Date date, int i2, Set<String> set, Location location, boolean z, int i3, boolean z2, int i4, String str) {
        this.f22176a = date;
        this.f22177b = i2;
        this.f22178c = set;
        this.f22180e = location;
        this.f22179d = z;
        this.f22181f = i3;
        this.f22182g = z2;
        this.f22183h = i4;
        this.f22184i = str;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.f22176a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f22177b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f22178c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f22180e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f22182g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f22179d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f22181f;
    }
}
