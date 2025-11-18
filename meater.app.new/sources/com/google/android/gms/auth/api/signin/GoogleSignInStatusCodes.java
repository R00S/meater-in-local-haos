package com.google.android.gms.auth.api.signin;

import cm.aptoide.p092pt.account.AccountAnalytics;
import com.google.android.gms.common.api.CommonStatusCodes;

/* loaded from: classes2.dex */
public final class GoogleSignInStatusCodes extends CommonStatusCodes {
    private GoogleSignInStatusCodes() {
    }

    /* renamed from: a */
    public static String m13694a(int i2) {
        switch (i2) {
            case 12500:
                return "A non-recoverable sign in failure occurred";
            case AccountAnalytics.UNKNOWN_STATUS_CODE /* 12501 */:
                return "Sign in action cancelled";
            case 12502:
                return "Sign-in in progress";
            default:
                return CommonStatusCodes.m13848a(i2);
        }
    }
}
