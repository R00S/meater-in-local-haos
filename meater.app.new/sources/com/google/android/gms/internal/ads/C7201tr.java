package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tr */
/* loaded from: classes2.dex */
final /* synthetic */ class C7201tr {

    /* renamed from: a */
    static final /* synthetic */ int[] f20580a;

    /* renamed from: b */
    static final /* synthetic */ int[] f20581b;

    /* renamed from: c */
    static final /* synthetic */ int[] f20582c;

    static {
        int[] iArr = new int[zzdfd.values().length];
        f20582c = iArr;
        try {
            iArr[zzdfd.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20582c[zzdfd.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20582c[zzdfd.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzdgf.values().length];
        f20581b = iArr2;
        try {
            iArr2[zzdgf.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20581b[zzdgf.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20581b[zzdgf.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzdgj.values().length];
        f20580a = iArr3;
        try {
            iArr3[zzdgj.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f20580a[zzdgj.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f20580a[zzdgj.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
