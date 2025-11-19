package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.internal.measurement.U1;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class X5 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f35211a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f35212b;

    static {
        int[] iArr = new int[S1.a.values().length];
        f35212b = iArr;
        try {
            iArr[S1.a.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f35212b[S1.a.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f35212b[S1.a.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f35212b[S1.a.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[U1.a.values().length];
        f35211a = iArr2;
        try {
            iArr2[U1.a.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f35211a[U1.a.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f35211a[U1.a.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f35211a[U1.a.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f35211a[U1.a.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f35211a[U1.a.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
