package com.google.zxing.p222g;

import java.util.HashMap;
import java.util.Map;

/* compiled from: CharacterSetECI.java */
/* renamed from: com.google.zxing.g.c */
/* loaded from: classes2.dex */
public enum EnumC8638c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* renamed from: G */
    private static final Map<Integer, EnumC8638c> f32805G = new HashMap();

    /* renamed from: H */
    private static final Map<String, EnumC8638c> f32806H = new HashMap();

    /* renamed from: J */
    private final int[] f32829J;

    /* renamed from: K */
    private final String[] f32830K;

    static {
        for (EnumC8638c enumC8638c : values()) {
            for (int i2 : enumC8638c.f32829J) {
                f32805G.put(Integer.valueOf(i2), enumC8638c);
            }
            f32806H.put(enumC8638c.name(), enumC8638c);
            for (String str : enumC8638c.f32830K) {
                f32806H.put(str, enumC8638c);
            }
        }
    }

    EnumC8638c(int i2) {
        this(new int[]{i2}, new String[0]);
    }

    /* renamed from: g */
    public static EnumC8638c m27301g(String str) {
        return f32806H.get(str);
    }

    /* renamed from: k */
    public int m27302k() {
        return this.f32829J[0];
    }

    EnumC8638c(int i2, String... strArr) {
        this.f32829J = new int[]{i2};
        this.f32830K = strArr;
    }

    EnumC8638c(int[] iArr, String... strArr) {
        this.f32829J = iArr;
        this.f32830K = strArr;
    }
}
