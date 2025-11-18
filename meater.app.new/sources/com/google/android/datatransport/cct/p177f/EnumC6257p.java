package com.google.android.datatransport.cct.p177f;

import android.util.SparseArray;

/* compiled from: QosTier.java */
/* renamed from: com.google.android.datatransport.cct.f.p */
/* loaded from: classes2.dex */
public enum EnumC6257p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: l */
    private static final SparseArray<EnumC6257p> f16756l;

    /* renamed from: n */
    private final int f16758n;

    static {
        EnumC6257p enumC6257p = DEFAULT;
        EnumC6257p enumC6257p2 = UNMETERED_ONLY;
        EnumC6257p enumC6257p3 = UNMETERED_OR_DAILY;
        EnumC6257p enumC6257p4 = FAST_IF_RADIO_AWAKE;
        EnumC6257p enumC6257p5 = NEVER;
        EnumC6257p enumC6257p6 = UNRECOGNIZED;
        SparseArray<EnumC6257p> sparseArray = new SparseArray<>();
        f16756l = sparseArray;
        sparseArray.put(0, enumC6257p);
        sparseArray.put(1, enumC6257p2);
        sparseArray.put(2, enumC6257p3);
        sparseArray.put(3, enumC6257p4);
        sparseArray.put(4, enumC6257p5);
        sparseArray.put(-1, enumC6257p6);
    }

    EnumC6257p(int i2) {
        this.f16758n = i2;
    }
}
