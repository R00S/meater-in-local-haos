package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2439b2;
import com.google.android.gms.internal.measurement.w7;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class H2 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f34863a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f34864b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f34865c;

    static {
        int[] iArr = new int[C2439b2.d.values().length];
        f34865c = iArr;
        try {
            iArr[C2439b2.d.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f34865c[C2439b2.d.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[C2439b2.e.values().length];
        f34864b = iArr2;
        try {
            iArr2[C2439b2.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f34864b[C2439b2.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f34864b[C2439b2.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f34864b[C2439b2.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[w7.values().length];
        f34863a = iArr3;
        try {
            iArr3[w7.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f34863a[w7.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f34863a[w7.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f34863a[w7.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
