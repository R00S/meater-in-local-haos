package yb;

import Oa.m;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: JvmPrimitiveType.java */
/* renamed from: yb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC5149e {
    BOOLEAN(m.f13338H, "boolean", "Z", "java.lang.Boolean"),
    CHAR(m.f13339I, "char", "C", "java.lang.Character"),
    BYTE(m.f13340J, "byte", "B", "java.lang.Byte"),
    SHORT(m.f13341K, "short", "S", "java.lang.Short"),
    INT(m.f13342L, "int", "I", "java.lang.Integer"),
    FLOAT(m.f13343M, "float", "F", "java.lang.Float"),
    LONG(m.f13344N, "long", "J", "java.lang.Long"),
    DOUBLE(m.f13345O, "double", "D", "java.lang.Double");


    /* renamed from: N, reason: collision with root package name */
    private static final Map<String, EnumC5149e> f53269N = new HashMap();

    /* renamed from: O, reason: collision with root package name */
    private static final Map<m, EnumC5149e> f53270O = new EnumMap(m.class);

    /* renamed from: P, reason: collision with root package name */
    private static final Map<String, EnumC5149e> f53271P = new HashMap();

    /* renamed from: Q, reason: collision with root package name */
    private static final Set<String> f53272Q = new HashSet();

    /* renamed from: R, reason: collision with root package name */
    private static final Map<String, String> f53273R = new HashMap();

    /* renamed from: B, reason: collision with root package name */
    private final m f53275B;

    /* renamed from: C, reason: collision with root package name */
    private final String f53276C;

    /* renamed from: D, reason: collision with root package name */
    private final String f53277D;

    /* renamed from: E, reason: collision with root package name */
    private final qb.c f53278E;

    static {
        for (EnumC5149e enumC5149e : values()) {
            f53269N.put(enumC5149e.s(), enumC5149e);
            f53270O.put(enumC5149e.t(), enumC5149e);
            f53271P.put(enumC5149e.p(), enumC5149e);
            String strReplace = enumC5149e.f53278E.b().replace('.', '/');
            f53272Q.add(strReplace);
            f53273R.put(strReplace, "(" + enumC5149e.f53277D + ")L" + strReplace + ";");
        }
    }

    EnumC5149e(m mVar, String str, String str2, String str3) {
        if (mVar == null) {
            c(8);
        }
        if (str == null) {
            c(9);
        }
        if (str2 == null) {
            c(10);
        }
        if (str3 == null) {
            c(11);
        }
        this.f53275B = mVar;
        this.f53276C = str;
        this.f53277D = str2;
        this.f53278E = new qb.c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void c(int r8) {
        /*
            r0 = 6
            r1 = 4
            if (r8 == r1) goto Lc
            if (r8 == r0) goto Lc
            switch(r8) {
                case 12: goto Lc;
                case 13: goto Lc;
                case 14: goto Lc;
                case 15: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            r3 = 2
            if (r8 == r1) goto L18
            if (r8 == r0) goto L18
            switch(r8) {
                case 12: goto L18;
                case 13: goto L18;
                case 14: goto L18;
                case 15: goto L18;
                default: goto L16;
            }
        L16:
            r4 = 3
            goto L19
        L18:
            r4 = r3
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r6 = 0
            switch(r8) {
                case 1: goto L47;
                case 2: goto L42;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L35;
                case 6: goto L3a;
                case 7: goto L30;
                case 8: goto L2b;
                case 9: goto L3d;
                case 10: goto L30;
                case 11: goto L26;
                case 12: goto L3a;
                case 13: goto L3a;
                case 14: goto L3a;
                case 15: goto L3a;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "internalName"
            r4[r6] = r7
            goto L4b
        L26:
            java.lang.String r7 = "wrapperClassName"
            r4[r6] = r7
            goto L4b
        L2b:
            java.lang.String r7 = "primitiveType"
            r4[r6] = r7
            goto L4b
        L30:
            java.lang.String r7 = "desc"
            r4[r6] = r7
            goto L4b
        L35:
            java.lang.String r7 = "type"
            r4[r6] = r7
            goto L4b
        L3a:
            r4[r6] = r5
            goto L4b
        L3d:
            java.lang.String r7 = "name"
            r4[r6] = r7
            goto L4b
        L42:
            java.lang.String r7 = "methodDescriptor"
            r4[r6] = r7
            goto L4b
        L47:
            java.lang.String r7 = "owner"
            r4[r6] = r7
        L4b:
            java.lang.String r6 = "get"
            r7 = 1
            if (r8 == r1) goto L6c
            if (r8 == r0) goto L6c
            switch(r8) {
                case 12: goto L67;
                case 13: goto L62;
                case 14: goto L5d;
                case 15: goto L58;
                default: goto L55;
            }
        L55:
            r4[r7] = r5
            goto L6e
        L58:
            java.lang.String r5 = "getWrapperFqName"
            r4[r7] = r5
            goto L6e
        L5d:
            java.lang.String r5 = "getDesc"
            r4[r7] = r5
            goto L6e
        L62:
            java.lang.String r5 = "getJavaKeywordName"
            r4[r7] = r5
            goto L6e
        L67:
            java.lang.String r5 = "getPrimitiveType"
            r4[r7] = r5
            goto L6e
        L6c:
            r4[r7] = r6
        L6e:
            switch(r8) {
                case 1: goto L83;
                case 2: goto L83;
                case 3: goto L80;
                case 4: goto L87;
                case 5: goto L80;
                case 6: goto L87;
                case 7: goto L7b;
                case 8: goto L76;
                case 9: goto L76;
                case 10: goto L76;
                case 11: goto L76;
                case 12: goto L87;
                case 13: goto L87;
                case 14: goto L87;
                case 15: goto L87;
                default: goto L71;
            }
        L71:
            java.lang.String r5 = "isWrapperClassInternalName"
            r4[r3] = r5
            goto L87
        L76:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L87
        L7b:
            java.lang.String r5 = "getByDesc"
            r4[r3] = r5
            goto L87
        L80:
            r4[r3] = r6
            goto L87
        L83:
            java.lang.String r5 = "isBoxingMethodDescriptor"
            r4[r3] = r5
        L87:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r8 == r1) goto L98
            if (r8 == r0) goto L98
            switch(r8) {
                case 12: goto L98;
                case 13: goto L98;
                case 14: goto L98;
                case 15: goto L98;
                default: goto L92;
            }
        L92:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            goto L9d
        L98:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
        L9d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.EnumC5149e.c(int):void");
    }

    public static EnumC5149e j(m mVar) {
        if (mVar == null) {
            c(5);
        }
        EnumC5149e enumC5149e = f53270O.get(mVar);
        if (enumC5149e == null) {
            c(6);
        }
        return enumC5149e;
    }

    public static EnumC5149e n(String str) {
        if (str == null) {
            c(3);
        }
        EnumC5149e enumC5149e = f53269N.get(str);
        if (enumC5149e != null) {
            return enumC5149e;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String p() {
        String str = this.f53277D;
        if (str == null) {
            c(14);
        }
        return str;
    }

    public String s() {
        String str = this.f53276C;
        if (str == null) {
            c(13);
        }
        return str;
    }

    public m t() {
        m mVar = this.f53275B;
        if (mVar == null) {
            c(12);
        }
        return mVar;
    }

    public qb.c u() {
        qb.c cVar = this.f53278E;
        if (cVar == null) {
            c(15);
        }
        return cVar;
    }
}
