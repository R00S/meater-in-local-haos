package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.c */
/* loaded from: classes2.dex */
final class C7644c implements Comparator<ActivityTransition> {
    C7644c() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
        ActivityTransition activityTransition3 = activityTransition;
        ActivityTransition activityTransition4 = activityTransition2;
        int iM22634y = activityTransition3.m22634y();
        int iM22634y2 = activityTransition4.m22634y();
        if (iM22634y != iM22634y2) {
            return iM22634y < iM22634y2 ? -1 : 1;
        }
        int iM22635z = activityTransition3.m22635z();
        int iM22635z2 = activityTransition4.m22635z();
        if (iM22635z == iM22635z2) {
            return 0;
        }
        return iM22635z < iM22635z2 ? -1 : 1;
    }
}
