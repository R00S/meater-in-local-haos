package com.google.android.gms.internal.ads;

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
/* loaded from: classes2.dex */
public class zzdri {

    /* renamed from: f */
    public static final zzdri f25809f;

    /* renamed from: g */
    public static final zzdri f25810g;

    /* renamed from: h */
    public static final zzdri f25811h;

    /* renamed from: i */
    public static final zzdri f25812i;

    /* renamed from: j */
    public static final zzdri f25813j;

    /* renamed from: k */
    public static final zzdri f25814k;

    /* renamed from: l */
    public static final zzdri f25815l;

    /* renamed from: m */
    public static final zzdri f25816m;

    /* renamed from: n */
    public static final zzdri f25817n;

    /* renamed from: o */
    public static final zzdri f25818o;

    /* renamed from: p */
    public static final zzdri f25819p;

    /* renamed from: q */
    public static final zzdri f25820q;

    /* renamed from: r */
    public static final zzdri f25821r;

    /* renamed from: s */
    public static final zzdri f25822s;

    /* renamed from: t */
    public static final zzdri f25823t;

    /* renamed from: u */
    public static final zzdri f25824u;

    /* renamed from: v */
    public static final zzdri f25825v;

    /* renamed from: w */
    public static final zzdri f25826w;

    /* renamed from: x */
    private static final /* synthetic */ zzdri[] f25827x;

    /* renamed from: y */
    private final zzdrn f25828y;

    /* renamed from: z */
    private final int f25829z;

    static {
        zzdri zzdriVar = new zzdri("DOUBLE", 0, zzdrn.DOUBLE, 1);
        f25809f = zzdriVar;
        zzdri zzdriVar2 = new zzdri("FLOAT", 1, zzdrn.FLOAT, 5);
        f25810g = zzdriVar2;
        zzdrn zzdrnVar = zzdrn.LONG;
        final int i2 = 2;
        zzdri zzdriVar3 = new zzdri("INT64", 2, zzdrnVar, 0);
        f25811h = zzdriVar3;
        final int i3 = 3;
        zzdri zzdriVar4 = new zzdri("UINT64", 3, zzdrnVar, 0);
        f25812i = zzdriVar4;
        zzdrn zzdrnVar2 = zzdrn.INT;
        zzdri zzdriVar5 = new zzdri("INT32", 4, zzdrnVar2, 0);
        f25813j = zzdriVar5;
        zzdri zzdriVar6 = new zzdri("FIXED64", 5, zzdrnVar, 1);
        f25814k = zzdriVar6;
        zzdri zzdriVar7 = new zzdri("FIXED32", 6, zzdrnVar2, 5);
        f25815l = zzdriVar7;
        zzdri zzdriVar8 = new zzdri("BOOL", 7, zzdrn.BOOLEAN, 0);
        f25816m = zzdriVar8;
        final zzdrn zzdrnVar3 = zzdrn.STRING;
        final String str = "STRING";
        final int i4 = 8;
        zzdri zzdriVar9 = new zzdri(str, i4, zzdrnVar3, i2) { // from class: com.google.android.gms.internal.ads.qx
            {
                int i5 = 8;
                int i6 = 2;
            }
        };
        f25817n = zzdriVar9;
        final zzdrn zzdrnVar4 = zzdrn.MESSAGE;
        final String str2 = "GROUP";
        final int i5 = 9;
        zzdri zzdriVar10 = new zzdri(str2, i5, zzdrnVar4, i3) { // from class: com.google.android.gms.internal.ads.rx
            {
                int i6 = 9;
                int i7 = 3;
            }
        };
        f25818o = zzdriVar10;
        final String str3 = "MESSAGE";
        final int i6 = 10;
        final int i7 = 2;
        zzdri zzdriVar11 = new zzdri(str3, i6, zzdrnVar4, i7) { // from class: com.google.android.gms.internal.ads.sx
            {
                int i8 = 10;
                int i9 = 2;
            }
        };
        f25819p = zzdriVar11;
        final zzdrn zzdrnVar5 = zzdrn.BYTE_STRING;
        final String str4 = "BYTES";
        final int i8 = 11;
        zzdri zzdriVar12 = new zzdri(str4, i8, zzdrnVar5, i7) { // from class: com.google.android.gms.internal.ads.tx
            {
                int i9 = 11;
                int i10 = 2;
            }
        };
        f25820q = zzdriVar12;
        zzdri zzdriVar13 = new zzdri("UINT32", 12, zzdrnVar2, 0);
        f25821r = zzdriVar13;
        zzdri zzdriVar14 = new zzdri("ENUM", 13, zzdrn.ENUM, 0);
        f25822s = zzdriVar14;
        zzdri zzdriVar15 = new zzdri("SFIXED32", 14, zzdrnVar2, 5);
        f25823t = zzdriVar15;
        zzdri zzdriVar16 = new zzdri("SFIXED64", 15, zzdrnVar, 1);
        f25824u = zzdriVar16;
        zzdri zzdriVar17 = new zzdri("SINT32", 16, zzdrnVar2, 0);
        f25825v = zzdriVar17;
        zzdri zzdriVar18 = new zzdri("SINT64", 17, zzdrnVar, 0);
        f25826w = zzdriVar18;
        f25827x = new zzdri[]{zzdriVar, zzdriVar2, zzdriVar3, zzdriVar4, zzdriVar5, zzdriVar6, zzdriVar7, zzdriVar8, zzdriVar9, zzdriVar10, zzdriVar11, zzdriVar12, zzdriVar13, zzdriVar14, zzdriVar15, zzdriVar16, zzdriVar17, zzdriVar18};
    }

    private zzdri(String str, int i2, zzdrn zzdrnVar, int i3) {
        this.f25828y = zzdrnVar;
        this.f25829z = i3;
    }

    public static zzdri[] values() {
        return (zzdri[]) f25827x.clone();
    }

    /* renamed from: g */
    public final zzdrn m19793g() {
        return this.f25828y;
    }
}
