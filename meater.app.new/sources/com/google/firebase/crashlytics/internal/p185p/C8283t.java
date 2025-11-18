package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* renamed from: com.google.firebase.crashlytics.h.p.t */
/* loaded from: classes2.dex */
final class C8283t extends AbstractC8258f0.e.d.a.c {

    /* renamed from: a */
    private final String f31495a;

    /* renamed from: b */
    private final int f31496b;

    /* renamed from: c */
    private final int f31497c;

    /* renamed from: d */
    private final boolean f31498d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.t$b */
    static final class b extends AbstractC8258f0.e.d.a.c.AbstractC11512a {

        /* renamed from: a */
        private String f31499a;

        /* renamed from: b */
        private Integer f31500b;

        /* renamed from: c */
        private Integer f31501c;

        /* renamed from: d */
        private Boolean f31502d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.c.AbstractC11512a
        /* renamed from: a */
        public AbstractC8258f0.e.d.a.c mo25843a() {
            String str = this.f31499a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " processName";
            }
            if (this.f31500b == null) {
                str2 = str2 + " pid";
            }
            if (this.f31501c == null) {
                str2 = str2 + " importance";
            }
            if (this.f31502d == null) {
                str2 = str2 + " defaultProcess";
            }
            if (str2.isEmpty()) {
                return new C8283t(this.f31499a, this.f31500b.intValue(), this.f31501c.intValue(), this.f31502d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.c.AbstractC11512a
        /* renamed from: b */
        public AbstractC8258f0.e.d.a.c.AbstractC11512a mo25844b(boolean z) {
            this.f31502d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.c.AbstractC11512a
        /* renamed from: c */
        public AbstractC8258f0.e.d.a.c.AbstractC11512a mo25845c(int i2) {
            this.f31501c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.c.AbstractC11512a
        /* renamed from: d */
        public AbstractC8258f0.e.d.a.c.AbstractC11512a mo25846d(int i2) {
            this.f31500b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.c.AbstractC11512a
        /* renamed from: e */
        public AbstractC8258f0.e.d.a.c.AbstractC11512a mo25847e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f31499a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.c
    /* renamed from: b */
    public int mo25839b() {
        return this.f31497c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.c
    /* renamed from: c */
    public int mo25840c() {
        return this.f31496b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.c
    /* renamed from: d */
    public String mo25841d() {
        return this.f31495a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.c
    /* renamed from: e */
    public boolean mo25842e() {
        return this.f31498d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.a.c)) {
            return false;
        }
        AbstractC8258f0.e.d.a.c cVar = (AbstractC8258f0.e.d.a.c) obj;
        return this.f31495a.equals(cVar.mo25841d()) && this.f31496b == cVar.mo25840c() && this.f31497c == cVar.mo25839b() && this.f31498d == cVar.mo25842e();
    }

    public int hashCode() {
        return ((((((this.f31495a.hashCode() ^ 1000003) * 1000003) ^ this.f31496b) * 1000003) ^ this.f31497c) * 1000003) ^ (this.f31498d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f31495a + ", pid=" + this.f31496b + ", importance=" + this.f31497c + ", defaultProcess=" + this.f31498d + "}";
    }

    private C8283t(String str, int i2, int i3, boolean z) {
        this.f31495a = str;
        this.f31496b = i2;
        this.f31497c = i3;
        this.f31498d = z;
    }
}
