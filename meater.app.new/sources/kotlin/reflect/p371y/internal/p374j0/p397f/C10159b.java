package kotlin.reflect.p371y.internal.p374j0.p397f;

import okhttp3.HttpUrl;

/* compiled from: ClassId.java */
/* renamed from: kotlin.f0.y.e.j0.f.b */
/* loaded from: classes3.dex */
public final class C10159b {

    /* renamed from: a */
    private final C10160c f39247a;

    /* renamed from: b */
    private final C10160c f39248b;

    /* renamed from: c */
    private final boolean f39249c;

    public C10159b(C10160c c10160c, C10160c c10160c2, boolean z) {
        if (c10160c == null) {
            m35405a(1);
        }
        if (c10160c2 == null) {
            m35405a(2);
        }
        this.f39247a = c10160c;
        this.f39248b = c10160c2;
        this.f39249c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m35405a(int r10) {
        /*
            r0 = 9
            r1 = 7
            r2 = 6
            r3 = 5
            if (r10 == r3) goto L13
            if (r10 == r2) goto L13
            if (r10 == r1) goto L13
            if (r10 == r0) goto L13
            switch(r10) {
                case 13: goto L13;
                case 14: goto L13;
                case 15: goto L13;
                case 16: goto L13;
                default: goto L10;
            }
        L10:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L15
        L13:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L15:
            r5 = 2
            if (r10 == r3) goto L23
            if (r10 == r2) goto L23
            if (r10 == r1) goto L23
            if (r10 == r0) goto L23
            switch(r10) {
                case 13: goto L23;
                case 14: goto L23;
                case 15: goto L23;
                case 16: goto L23;
                default: goto L21;
            }
        L21:
            r6 = 3
            goto L24
        L23:
            r6 = 2
        L24:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/name/ClassId"
            r8 = 0
            switch(r10) {
                case 1: goto L4d;
                case 2: goto L48;
                case 3: goto L4d;
                case 4: goto L43;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                case 8: goto L3b;
                case 9: goto L40;
                case 10: goto L36;
                case 11: goto L31;
                case 12: goto L31;
                case 13: goto L40;
                case 14: goto L40;
                case 15: goto L40;
                case 16: goto L40;
                default: goto L2c;
            }
        L2c:
            java.lang.String r9 = "topLevelFqName"
            r6[r8] = r9
            goto L51
        L31:
            java.lang.String r9 = "string"
            r6[r8] = r9
            goto L51
        L36:
            java.lang.String r9 = "segment"
            r6[r8] = r9
            goto L51
        L3b:
            java.lang.String r9 = "name"
            r6[r8] = r9
            goto L51
        L40:
            r6[r8] = r7
            goto L51
        L43:
            java.lang.String r9 = "topLevelName"
            r6[r8] = r9
            goto L51
        L48:
            java.lang.String r9 = "relativeClassName"
            r6[r8] = r9
            goto L51
        L4d:
            java.lang.String r9 = "packageFqName"
            r6[r8] = r9
        L51:
            r8 = 1
            if (r10 == r3) goto L79
            if (r10 == r2) goto L74
            if (r10 == r1) goto L6f
            if (r10 == r0) goto L6a
            switch(r10) {
                case 13: goto L65;
                case 14: goto L65;
                case 15: goto L60;
                case 16: goto L60;
                default: goto L5d;
            }
        L5d:
            r6[r8] = r7
            goto L7d
        L60:
            java.lang.String r7 = "asFqNameString"
            r6[r8] = r7
            goto L7d
        L65:
            java.lang.String r7 = "asString"
            r6[r8] = r7
            goto L7d
        L6a:
            java.lang.String r7 = "asSingleFqName"
            r6[r8] = r7
            goto L7d
        L6f:
            java.lang.String r7 = "getShortClassName"
            r6[r8] = r7
            goto L7d
        L74:
            java.lang.String r7 = "getRelativeClassName"
            r6[r8] = r7
            goto L7d
        L79:
            java.lang.String r7 = "getPackageFqName"
            r6[r8] = r7
        L7d:
            switch(r10) {
                case 1: goto L94;
                case 2: goto L94;
                case 3: goto L94;
                case 4: goto L94;
                case 5: goto L98;
                case 6: goto L98;
                case 7: goto L98;
                case 8: goto L8f;
                case 9: goto L98;
                case 10: goto L8a;
                case 11: goto L85;
                case 12: goto L85;
                case 13: goto L98;
                case 14: goto L98;
                case 15: goto L98;
                case 16: goto L98;
                default: goto L80;
            }
        L80:
            java.lang.String r7 = "topLevel"
            r6[r5] = r7
            goto L98
        L85:
            java.lang.String r7 = "fromString"
            r6[r5] = r7
            goto L98
        L8a:
            java.lang.String r7 = "startsWith"
            r6[r5] = r7
            goto L98
        L8f:
            java.lang.String r7 = "createNestedClassId"
            r6[r5] = r7
            goto L98
        L94:
            java.lang.String r7 = "<init>"
            r6[r5] = r7
        L98:
            java.lang.String r4 = java.lang.String.format(r4, r6)
            if (r10 == r3) goto Lad
            if (r10 == r2) goto Lad
            if (r10 == r1) goto Lad
            if (r10 == r0) goto Lad
            switch(r10) {
                case 13: goto Lad;
                case 14: goto Lad;
                case 15: goto Lad;
                case 16: goto Lad;
                default: goto La7;
            }
        La7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
            goto Lb2
        Lad:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
        Lb2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p397f.C10159b.m35405a(int):void");
    }

    /* renamed from: e */
    public static C10159b m35406e(String str) {
        if (str == null) {
            m35405a(11);
        }
        return m35407f(str, false);
    }

    /* renamed from: f */
    public static C10159b m35407f(String str, boolean z) {
        String str2;
        if (str == null) {
            m35405a(12);
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace('/', '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new C10159b(new C10160c(str2), new C10160c(str), z);
    }

    /* renamed from: m */
    public static C10159b m35408m(C10160c c10160c) {
        if (c10160c == null) {
            m35405a(0);
        }
        return new C10159b(c10160c.m35423e(), c10160c.m35425g());
    }

    /* renamed from: b */
    public C10160c m35409b() {
        if (this.f39247a.m35422d()) {
            C10160c c10160c = this.f39248b;
            if (c10160c == null) {
                m35405a(9);
            }
            return c10160c;
        }
        return new C10160c(this.f39247a.m35420b() + "." + this.f39248b.m35420b());
    }

    /* renamed from: c */
    public String m35410c() {
        if (this.f39247a.m35422d()) {
            String strM35420b = this.f39248b.m35420b();
            if (strM35420b == null) {
                m35405a(13);
            }
            return strM35420b;
        }
        String str = this.f39247a.m35420b().replace('.', '/') + "/" + this.f39248b.m35420b();
        if (str == null) {
            m35405a(14);
        }
        return str;
    }

    /* renamed from: d */
    public C10159b m35411d(C10163f c10163f) {
        if (c10163f == null) {
            m35405a(8);
        }
        return new C10159b(m35413h(), this.f39248b.m35421c(c10163f), this.f39249c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10159b.class != obj.getClass()) {
            return false;
        }
        C10159b c10159b = (C10159b) obj;
        return this.f39247a.equals(c10159b.f39247a) && this.f39248b.equals(c10159b.f39248b) && this.f39249c == c10159b.f39249c;
    }

    /* renamed from: g */
    public C10159b m35412g() {
        C10160c c10160cM35423e = this.f39248b.m35423e();
        if (c10160cM35423e.m35422d()) {
            return null;
        }
        return new C10159b(m35413h(), c10160cM35423e, this.f39249c);
    }

    /* renamed from: h */
    public C10160c m35413h() {
        C10160c c10160c = this.f39247a;
        if (c10160c == null) {
            m35405a(5);
        }
        return c10160c;
    }

    public int hashCode() {
        return (((this.f39247a.hashCode() * 31) + this.f39248b.hashCode()) * 31) + Boolean.valueOf(this.f39249c).hashCode();
    }

    /* renamed from: i */
    public C10160c m35414i() {
        C10160c c10160c = this.f39248b;
        if (c10160c == null) {
            m35405a(6);
        }
        return c10160c;
    }

    /* renamed from: j */
    public C10163f m35415j() {
        C10163f c10163fM35425g = this.f39248b.m35425g();
        if (c10163fM35425g == null) {
            m35405a(7);
        }
        return c10163fM35425g;
    }

    /* renamed from: k */
    public boolean m35416k() {
        return this.f39249c;
    }

    /* renamed from: l */
    public boolean m35417l() {
        return !this.f39248b.m35423e().m35422d();
    }

    public String toString() {
        if (!this.f39247a.m35422d()) {
            return m35410c();
        }
        return "/" + m35410c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10159b(C10160c c10160c, C10163f c10163f) {
        this(c10160c, C10160c.m35419k(c10163f), false);
        if (c10160c == null) {
            m35405a(3);
        }
        if (c10163f == null) {
            m35405a(4);
        }
    }
}
