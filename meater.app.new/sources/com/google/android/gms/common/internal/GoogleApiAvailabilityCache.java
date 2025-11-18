package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public class GoogleApiAvailabilityCache {

    /* renamed from: a */
    private final SparseIntArray f17766a;

    /* renamed from: b */
    private GoogleApiAvailabilityLight f17767b;

    public GoogleApiAvailabilityCache() {
        this(GoogleApiAvailability.m13803q());
    }

    /* renamed from: a */
    public void m14345a() {
        this.f17766a.clear();
    }

    /* renamed from: b */
    public int m14346b(Context context, Api.Client client) {
        Preconditions.m14372k(context);
        Preconditions.m14372k(client);
        int iMo13813j = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int i2 = this.f17766a.get(minApkVersion, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f17766a.size()) {
                iMo13813j = i2;
                break;
            }
            int iKeyAt = this.f17766a.keyAt(i3);
            if (iKeyAt > minApkVersion && this.f17766a.get(iKeyAt) == 0) {
                break;
            }
            i3++;
        }
        if (iMo13813j == -1) {
            iMo13813j = this.f17767b.mo13813j(context, minApkVersion);
        }
        this.f17766a.put(minApkVersion, iMo13813j);
        return iMo13813j;
    }

    public GoogleApiAvailabilityCache(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f17766a = new SparseIntArray();
        Preconditions.m14372k(googleApiAvailabilityLight);
        this.f17767b = googleApiAvailabilityLight;
    }
}
