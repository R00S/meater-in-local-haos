package com.facebook.login;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: LoginConfiguration.kt */
/* renamed from: com.facebook.login.u */
/* loaded from: classes2.dex */
public final class C5801u {

    /* renamed from: a */
    public static final a f14840a = new a(null);

    /* renamed from: b */
    private final Set<String> f14841b;

    /* renamed from: c */
    private final String f14842c;

    /* renamed from: d */
    private final String f14843d;

    /* compiled from: LoginConfiguration.kt */
    /* renamed from: com.facebook.login.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5801u(Collection collection, String str, int i2, C9789g c9789g) {
        if ((i2 & 2) != 0) {
            str = UUID.randomUUID().toString();
            C9801m.m32345e(str, "randomUUID().toString()");
        }
        this(collection, str);
    }

    /* renamed from: a */
    public final String m12065a() {
        return this.f14843d;
    }

    /* renamed from: b */
    public final String m12066b() {
        return this.f14842c;
    }

    /* renamed from: c */
    public final Set<String> m12067c() {
        return this.f14841b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5801u(Collection<String> collection, String str) {
        this(collection, str, C5781b0.m12044c());
        C9801m.m32346f(str, "nonce");
        C5781b0 c5781b0 = C5781b0.f14789a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5801u(java.util.Collection<java.lang.String> r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "nonce"
            kotlin.jvm.internal.C9801m.m32346f(r3, r0)
            java.lang.String r0 = "codeVerifier"
            kotlin.jvm.internal.C9801m.m32346f(r4, r0)
            r1.<init>()
            com.facebook.login.a0 r0 = com.facebook.login.C5779a0.f14784a
            boolean r0 = com.facebook.login.C5779a0.m12041a(r3)
            if (r0 == 0) goto L1f
            com.facebook.login.b0 r0 = com.facebook.login.C5781b0.f14789a
            boolean r0 = com.facebook.login.C5781b0.m12045d(r4)
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L42
            java.util.HashSet r0 = new java.util.HashSet
            if (r2 == 0) goto L2a
            r0.<init>(r2)
            goto L2d
        L2a:
            r0.<init>()
        L2d:
            java.lang.String r2 = "openid"
            r0.add(r2)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r0 = "unmodifiableSet(permissions)"
            kotlin.jvm.internal.C9801m.m32345e(r2, r0)
            r1.f14841b = r2
            r1.f14842c = r3
            r1.f14843d = r4
            return
        L42:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed requirement."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C5801u.<init>(java.util.Collection, java.lang.String, java.lang.String):void");
    }
}
