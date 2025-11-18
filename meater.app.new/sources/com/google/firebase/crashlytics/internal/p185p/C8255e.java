package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* renamed from: com.google.firebase.crashlytics.h.p.e */
/* loaded from: classes2.dex */
final class C8255e extends AbstractC8258f0.c {

    /* renamed from: a */
    private final String f31336a;

    /* renamed from: b */
    private final String f31337b;

    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.e$b */
    static final class b extends AbstractC8258f0.c.a {

        /* renamed from: a */
        private String f31338a;

        /* renamed from: b */
        private String f31339b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.c.a
        /* renamed from: a */
        public AbstractC8258f0.c mo25652a() {
            String str = this.f31338a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " key";
            }
            if (this.f31339b == null) {
                str2 = str2 + " value";
            }
            if (str2.isEmpty()) {
                return new C8255e(this.f31338a, this.f31339b);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.c.a
        /* renamed from: b */
        public AbstractC8258f0.c.a mo25653b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f31338a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.c.a
        /* renamed from: c */
        public AbstractC8258f0.c.a mo25654c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f31339b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.c
    /* renamed from: b */
    public String mo25650b() {
        return this.f31336a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.c
    /* renamed from: c */
    public String mo25651c() {
        return this.f31337b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.c)) {
            return false;
        }
        AbstractC8258f0.c cVar = (AbstractC8258f0.c) obj;
        return this.f31336a.equals(cVar.mo25650b()) && this.f31337b.equals(cVar.mo25651c());
    }

    public int hashCode() {
        return ((this.f31336a.hashCode() ^ 1000003) * 1000003) ^ this.f31337b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f31336a + ", value=" + this.f31337b + "}";
    }

    private C8255e(String str, String str2) {
        this.f31336a = str;
        this.f31337b = str2;
    }
}
