package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.d */
/* loaded from: classes2.dex */
final class C7645d implements Comparator<DetectedActivity> {
    C7645d() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
        DetectedActivity detectedActivity3 = detectedActivity;
        DetectedActivity detectedActivity4 = detectedActivity2;
        int iCompareTo = Integer.valueOf(detectedActivity4.m22641y()).compareTo(Integer.valueOf(detectedActivity3.m22641y()));
        return iCompareTo == 0 ? Integer.valueOf(detectedActivity3.m22642z()).compareTo(Integer.valueOf(detectedActivity4.m22642z())) : iCompareTo;
    }
}
