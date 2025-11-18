package com.google.zxing.p228k.p229b;

/* compiled from: Mode.java */
/* renamed from: com.google.zxing.k.b.b */
/* loaded from: classes2.dex */
public enum EnumC8683b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: q */
    private final int[] f32940q;

    /* renamed from: r */
    private final int f32941r;

    EnumC8683b(int[] iArr, int i2) {
        this.f32940q = iArr;
        this.f32941r = i2;
    }

    /* renamed from: g */
    public int m27436g() {
        return this.f32941r;
    }

    /* renamed from: k */
    public int m27437k(C8684c c8684c) {
        int iM27443f = c8684c.m27443f();
        return this.f32940q[iM27443f <= 9 ? (char) 0 : iM27443f <= 26 ? (char) 1 : (char) 2];
    }
}
