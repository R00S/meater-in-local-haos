package com.google.android.gms.internal.ads;

import p241e.p254e.p255a.EnumC8781a;
import p241e.p254e.p255a.EnumC8782b;

/* renamed from: com.google.android.gms.internal.ads.x2 */
/* loaded from: classes2.dex */
final /* synthetic */ class C7324x2 {

    /* renamed from: a */
    private static final /* synthetic */ int[] f20898a;

    /* renamed from: b */
    static final /* synthetic */ int[] f20899b;

    static {
        int[] iArr = new int[EnumC8781a.values().length];
        f20899b = iArr;
        try {
            iArr[EnumC8781a.INTERNAL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20899b[EnumC8781a.INVALID_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20899b[EnumC8781a.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20899b[EnumC8781a.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[EnumC8782b.values().length];
        f20898a = iArr2;
        try {
            iArr2[EnumC8782b.FEMALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20898a[EnumC8782b.MALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f20898a[EnumC8782b.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
