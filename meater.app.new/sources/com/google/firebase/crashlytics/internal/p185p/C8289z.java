package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* renamed from: com.google.firebase.crashlytics.h.p.z */
/* loaded from: classes2.dex */
final class C8289z extends AbstractC8258f0.e.AbstractC11515e {

    /* renamed from: a */
    private final int f31531a;

    /* renamed from: b */
    private final String f31532b;

    /* renamed from: c */
    private final String f31533c;

    /* renamed from: d */
    private final boolean f31534d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.z$b */
    static final class b extends AbstractC8258f0.e.AbstractC11515e.a {

        /* renamed from: a */
        private Integer f31535a;

        /* renamed from: b */
        private String f31536b;

        /* renamed from: c */
        private String f31537c;

        /* renamed from: d */
        private Boolean f31538d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.AbstractC11515e.a
        /* renamed from: a */
        public AbstractC8258f0.e.AbstractC11515e mo25898a() {
            Integer num = this.f31535a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (num == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " platform";
            }
            if (this.f31536b == null) {
                str = str + " version";
            }
            if (this.f31537c == null) {
                str = str + " buildVersion";
            }
            if (this.f31538d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C8289z(this.f31535a.intValue(), this.f31536b, this.f31537c, this.f31538d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.AbstractC11515e.a
        /* renamed from: b */
        public AbstractC8258f0.e.AbstractC11515e.a mo25899b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f31537c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.AbstractC11515e.a
        /* renamed from: c */
        public AbstractC8258f0.e.AbstractC11515e.a mo25900c(boolean z) {
            this.f31538d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.AbstractC11515e.a
        /* renamed from: d */
        public AbstractC8258f0.e.AbstractC11515e.a mo25901d(int i2) {
            this.f31535a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.AbstractC11515e.a
        /* renamed from: e */
        public AbstractC8258f0.e.AbstractC11515e.a mo25902e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f31536b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.AbstractC11515e
    /* renamed from: b */
    public String mo25894b() {
        return this.f31533c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.AbstractC11515e
    /* renamed from: c */
    public int mo25895c() {
        return this.f31531a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.AbstractC11515e
    /* renamed from: d */
    public String mo25896d() {
        return this.f31532b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.AbstractC11515e
    /* renamed from: e */
    public boolean mo25897e() {
        return this.f31534d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.AbstractC11515e)) {
            return false;
        }
        AbstractC8258f0.e.AbstractC11515e abstractC11515e = (AbstractC8258f0.e.AbstractC11515e) obj;
        return this.f31531a == abstractC11515e.mo25895c() && this.f31532b.equals(abstractC11515e.mo25896d()) && this.f31533c.equals(abstractC11515e.mo25894b()) && this.f31534d == abstractC11515e.mo25897e();
    }

    public int hashCode() {
        return ((((((this.f31531a ^ 1000003) * 1000003) ^ this.f31532b.hashCode()) * 1000003) ^ this.f31533c.hashCode()) * 1000003) ^ (this.f31534d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f31531a + ", version=" + this.f31532b + ", buildVersion=" + this.f31533c + ", jailbroken=" + this.f31534d + "}";
    }

    private C8289z(int i2, String str, String str2, boolean z) {
        this.f31531a = i2;
        this.f31532b = str;
        this.f31533c = str2;
        this.f31534d = z;
    }
}
