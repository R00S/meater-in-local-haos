package com.facebook.p157o0;

import com.facebook.AccessToken;
import com.facebook.C5641a0;
import com.facebook.internal.C5696p0;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: AccessTokenAppIdPair.kt */
/* renamed from: com.facebook.o0.t */
/* loaded from: classes.dex */
public final class C5928t implements Serializable {

    /* renamed from: f */
    public static final a f15475f = new a(null);

    /* renamed from: g */
    private final String f15476g;

    /* renamed from: h */
    private final String f15477h;

    /* compiled from: AccessTokenAppIdPair.kt */
    /* renamed from: com.facebook.o0.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: AccessTokenAppIdPair.kt */
    /* renamed from: com.facebook.o0.t$b */
    public static final class b implements Serializable {

        /* renamed from: f */
        public static final a f15478f = new a(null);

        /* renamed from: g */
        private final String f15479g;

        /* renamed from: h */
        private final String f15480h;

        /* compiled from: AccessTokenAppIdPair.kt */
        /* renamed from: com.facebook.o0.t$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9789g c9789g) {
                this();
            }
        }

        public b(String str, String str2) {
            C9801m.m32346f(str2, "appId");
            this.f15479g = str;
            this.f15480h = str2;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new C5928t(this.f15479g, this.f15480h);
        }
    }

    public C5928t(String str, String str2) {
        C9801m.m32346f(str2, "applicationId");
        this.f15476g = str2;
        C5696p0 c5696p0 = C5696p0.f14478a;
        this.f15477h = C5696p0.m11557a0(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new b(this.f15477h, this.f15476g);
    }

    /* renamed from: a */
    public final String m12759a() {
        return this.f15477h;
    }

    /* renamed from: b */
    public final String m12760b() {
        return this.f15476g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5928t)) {
            return false;
        }
        C5696p0 c5696p0 = C5696p0.f14478a;
        C5928t c5928t = (C5928t) obj;
        return C5696p0.m11560c(c5928t.f15477h, this.f15477h) && C5696p0.m11560c(c5928t.f15476g, this.f15476g);
    }

    public int hashCode() {
        String str = this.f15477h;
        return (str == null ? 0 : str.hashCode()) ^ this.f15476g.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5928t(AccessToken accessToken) {
        C9801m.m32346f(accessToken, "accessToken");
        String strM11093l = accessToken.m11093l();
        C5641a0 c5641a0 = C5641a0.f14199a;
        this(strM11093l, C5641a0.m11285d());
    }
}
