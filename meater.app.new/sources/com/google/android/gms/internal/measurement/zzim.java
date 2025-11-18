package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public class zzim {

    /* renamed from: f */
    public static final zzim f28177f;

    /* renamed from: g */
    public static final zzim f28178g;

    /* renamed from: h */
    public static final zzim f28179h;

    /* renamed from: i */
    public static final zzim f28180i;

    /* renamed from: j */
    public static final zzim f28181j;

    /* renamed from: k */
    public static final zzim f28182k;

    /* renamed from: l */
    public static final zzim f28183l;

    /* renamed from: m */
    public static final zzim f28184m;

    /* renamed from: n */
    public static final zzim f28185n;

    /* renamed from: o */
    public static final zzim f28186o;

    /* renamed from: p */
    public static final zzim f28187p;

    /* renamed from: q */
    public static final zzim f28188q;

    /* renamed from: r */
    public static final zzim f28189r;

    /* renamed from: s */
    public static final zzim f28190s;

    /* renamed from: t */
    public static final zzim f28191t;

    /* renamed from: u */
    public static final zzim f28192u;

    /* renamed from: v */
    public static final zzim f28193v;

    /* renamed from: w */
    public static final zzim f28194w;

    /* renamed from: x */
    private static final /* synthetic */ zzim[] f28195x;

    /* renamed from: y */
    private final zzip f28196y;

    /* renamed from: z */
    private final int f28197z;

    static {
        zzim zzimVar = new zzim("DOUBLE", 0, zzip.DOUBLE, 1);
        f28177f = zzimVar;
        zzim zzimVar2 = new zzim("FLOAT", 1, zzip.FLOAT, 5);
        f28178g = zzimVar2;
        zzip zzipVar = zzip.LONG;
        final int i2 = 2;
        zzim zzimVar3 = new zzim("INT64", 2, zzipVar, 0);
        f28179h = zzimVar3;
        final int i3 = 3;
        zzim zzimVar4 = new zzim("UINT64", 3, zzipVar, 0);
        f28180i = zzimVar4;
        zzip zzipVar2 = zzip.INT;
        zzim zzimVar5 = new zzim("INT32", 4, zzipVar2, 0);
        f28181j = zzimVar5;
        zzim zzimVar6 = new zzim("FIXED64", 5, zzipVar, 1);
        f28182k = zzimVar6;
        zzim zzimVar7 = new zzim("FIXED32", 6, zzipVar2, 5);
        f28183l = zzimVar7;
        zzim zzimVar8 = new zzim("BOOL", 7, zzip.BOOLEAN, 0);
        f28184m = zzimVar8;
        final zzip zzipVar3 = zzip.STRING;
        final String str = "STRING";
        final int i4 = 8;
        zzim zzimVar9 = new zzim(str, i4, zzipVar3, i2) { // from class: com.google.android.gms.internal.measurement.u4
            {
                int i5 = 8;
                int i6 = 2;
            }
        };
        f28185n = zzimVar9;
        final zzip zzipVar4 = zzip.MESSAGE;
        final String str2 = "GROUP";
        final int i5 = 9;
        zzim zzimVar10 = new zzim(str2, i5, zzipVar4, i3) { // from class: com.google.android.gms.internal.measurement.w4
            {
                int i6 = 9;
                int i7 = 3;
            }
        };
        f28186o = zzimVar10;
        final String str3 = "MESSAGE";
        final int i6 = 10;
        final int i7 = 2;
        zzim zzimVar11 = new zzim(str3, i6, zzipVar4, i7) { // from class: com.google.android.gms.internal.measurement.v4
            {
                int i8 = 10;
                int i9 = 2;
            }
        };
        f28187p = zzimVar11;
        final zzip zzipVar5 = zzip.BYTE_STRING;
        final String str4 = "BYTES";
        final int i8 = 11;
        zzim zzimVar12 = new zzim(str4, i8, zzipVar5, i7) { // from class: com.google.android.gms.internal.measurement.x4
            {
                int i9 = 11;
                int i10 = 2;
            }
        };
        f28188q = zzimVar12;
        zzim zzimVar13 = new zzim("UINT32", 12, zzipVar2, 0);
        f28189r = zzimVar13;
        zzim zzimVar14 = new zzim("ENUM", 13, zzip.ENUM, 0);
        f28190s = zzimVar14;
        zzim zzimVar15 = new zzim("SFIXED32", 14, zzipVar2, 5);
        f28191t = zzimVar15;
        zzim zzimVar16 = new zzim("SFIXED64", 15, zzipVar, 1);
        f28192u = zzimVar16;
        zzim zzimVar17 = new zzim("SINT32", 16, zzipVar2, 0);
        f28193v = zzimVar17;
        zzim zzimVar18 = new zzim("SINT64", 17, zzipVar, 0);
        f28194w = zzimVar18;
        f28195x = new zzim[]{zzimVar, zzimVar2, zzimVar3, zzimVar4, zzimVar5, zzimVar6, zzimVar7, zzimVar8, zzimVar9, zzimVar10, zzimVar11, zzimVar12, zzimVar13, zzimVar14, zzimVar15, zzimVar16, zzimVar17, zzimVar18};
    }

    private zzim(String str, int i2, zzip zzipVar, int i3) {
        this.f28196y = zzipVar;
        this.f28197z = i3;
    }

    public static zzim[] values() {
        return (zzim[]) f28195x.clone();
    }

    /* renamed from: g */
    public final zzip m22342g() {
        return this.f28196y;
    }
}
