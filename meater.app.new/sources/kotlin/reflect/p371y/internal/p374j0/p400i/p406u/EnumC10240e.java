package kotlin.reflect.p371y.internal.p374j0.p400i.p406u;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9915i;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: JvmPrimitiveType.java */
/* renamed from: kotlin.f0.y.e.j0.i.u.e */
/* loaded from: classes3.dex */
public enum EnumC10240e {
    BOOLEAN(EnumC9915i.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC9915i.CHAR, "char", "C", "java.lang.Character"),
    BYTE(EnumC9915i.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC9915i.SHORT, "short", "S", "java.lang.Short"),
    INT(EnumC9915i.INT, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC9915i.FLOAT, "float", "F", "java.lang.Float"),
    LONG(EnumC9915i.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC9915i.DOUBLE, "double", "D", "java.lang.Double");


    /* renamed from: n */
    private static final Set<C10160c> f39610n = new HashSet();

    /* renamed from: o */
    private static final Map<String, EnumC10240e> f39611o = new HashMap();

    /* renamed from: p */
    private static final Map<EnumC9915i, EnumC10240e> f39612p = new EnumMap(EnumC9915i.class);

    /* renamed from: q */
    private static final Map<String, EnumC10240e> f39613q = new HashMap();

    /* renamed from: s */
    private final EnumC9915i f39615s;

    /* renamed from: t */
    private final String f39616t;

    /* renamed from: u */
    private final String f39617u;

    /* renamed from: v */
    private final C10160c f39618v;

    static {
        for (EnumC10240e enumC10240e : values()) {
            f39610n.add(enumC10240e.m36119y());
            f39611o.put(enumC10240e.m36117v(), enumC10240e);
            f39612p.put(enumC10240e.m36118x(), enumC10240e);
            f39613q.put(enumC10240e.m36116u(), enumC10240e);
        }
    }

    EnumC10240e(EnumC9915i enumC9915i, String str, String str2, String str3) {
        if (enumC9915i == null) {
            m36113g(6);
        }
        if (str == null) {
            m36113g(7);
        }
        if (str2 == null) {
            m36113g(8);
        }
        if (str3 == null) {
            m36113g(9);
        }
        this.f39615s = enumC9915i;
        this.f39616t = str;
        this.f39617u = str2;
        this.f39618v = new C10160c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m36113g(int r7) {
        /*
            r0 = 4
            r1 = 2
            if (r7 == r1) goto Lc
            if (r7 == r0) goto Lc
            switch(r7) {
                case 10: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            if (r7 == r1) goto L17
            if (r7 == r0) goto L17
            switch(r7) {
                case 10: goto L17;
                case 11: goto L17;
                case 12: goto L17;
                case 13: goto L17;
                default: goto L15;
            }
        L15:
            r3 = 3
            goto L18
        L17:
            r3 = 2
        L18:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r5 = 0
            switch(r7) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L34;
                case 4: goto L39;
                case 5: goto L2f;
                case 6: goto L2a;
                case 7: goto L3c;
                case 8: goto L2f;
                case 9: goto L25;
                case 10: goto L39;
                case 11: goto L39;
                case 12: goto L39;
                case 13: goto L39;
                default: goto L20;
            }
        L20:
            java.lang.String r6 = "className"
            r3[r5] = r6
            goto L40
        L25:
            java.lang.String r6 = "wrapperClassName"
            r3[r5] = r6
            goto L40
        L2a:
            java.lang.String r6 = "primitiveType"
            r3[r5] = r6
            goto L40
        L2f:
            java.lang.String r6 = "desc"
            r3[r5] = r6
            goto L40
        L34:
            java.lang.String r6 = "type"
            r3[r5] = r6
            goto L40
        L39:
            r3[r5] = r4
            goto L40
        L3c:
            java.lang.String r6 = "name"
            r3[r5] = r6
        L40:
            java.lang.String r5 = "get"
            r6 = 1
            if (r7 == r1) goto L61
            if (r7 == r0) goto L61
            switch(r7) {
                case 10: goto L5c;
                case 11: goto L57;
                case 12: goto L52;
                case 13: goto L4d;
                default: goto L4a;
            }
        L4a:
            r3[r6] = r4
            goto L63
        L4d:
            java.lang.String r4 = "getWrapperFqName"
            r3[r6] = r4
            goto L63
        L52:
            java.lang.String r4 = "getDesc"
            r3[r6] = r4
            goto L63
        L57:
            java.lang.String r4 = "getJavaKeywordName"
            r3[r6] = r4
            goto L63
        L5c:
            java.lang.String r4 = "getPrimitiveType"
            r3[r6] = r4
            goto L63
        L61:
            r3[r6] = r5
        L63:
            switch(r7) {
                case 1: goto L75;
                case 2: goto L77;
                case 3: goto L75;
                case 4: goto L77;
                case 5: goto L70;
                case 6: goto L6b;
                case 7: goto L6b;
                case 8: goto L6b;
                case 9: goto L6b;
                case 10: goto L77;
                case 11: goto L77;
                case 12: goto L77;
                case 13: goto L77;
                default: goto L66;
            }
        L66:
            java.lang.String r4 = "isWrapperClassName"
            r3[r1] = r4
            goto L77
        L6b:
            java.lang.String r4 = "<init>"
            r3[r1] = r4
            goto L77
        L70:
            java.lang.String r4 = "getByDesc"
            r3[r1] = r4
            goto L77
        L75:
            r3[r1] = r5
        L77:
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r7 == r1) goto L88
            if (r7 == r0) goto L88
            switch(r7) {
                case 10: goto L88;
                case 11: goto L88;
                case 12: goto L88;
                case 13: goto L88;
                default: goto L82;
            }
        L82:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            goto L8d
        L88:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
        L8d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e.m36113g(int):void");
    }

    /* renamed from: k */
    public static EnumC10240e m36114k(String str) {
        if (str == null) {
            m36113g(1);
        }
        EnumC10240e enumC10240e = f39611o.get(str);
        if (enumC10240e != null) {
            return enumC10240e;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    /* renamed from: q */
    public static EnumC10240e m36115q(EnumC9915i enumC9915i) {
        if (enumC9915i == null) {
            m36113g(3);
        }
        EnumC10240e enumC10240e = f39612p.get(enumC9915i);
        if (enumC10240e == null) {
            m36113g(4);
        }
        return enumC10240e;
    }

    /* renamed from: u */
    public String m36116u() {
        String str = this.f39617u;
        if (str == null) {
            m36113g(12);
        }
        return str;
    }

    /* renamed from: v */
    public String m36117v() {
        String str = this.f39616t;
        if (str == null) {
            m36113g(11);
        }
        return str;
    }

    /* renamed from: x */
    public EnumC9915i m36118x() {
        EnumC9915i enumC9915i = this.f39615s;
        if (enumC9915i == null) {
            m36113g(10);
        }
        return enumC9915i;
    }

    /* renamed from: y */
    public C10160c m36119y() {
        C10160c c10160c = this.f39618v;
        if (c10160c == null) {
            m36113g(13);
        }
        return c10160c;
    }
}
