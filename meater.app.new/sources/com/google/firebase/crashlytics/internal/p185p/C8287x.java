package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* renamed from: com.google.firebase.crashlytics.h.p.x */
/* loaded from: classes2.dex */
final class C8287x extends AbstractC8258f0.e.d.AbstractC11514e.b {

    /* renamed from: a */
    private final String f31525a;

    /* renamed from: b */
    private final String f31526b;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.x$b */
    static final class b extends AbstractC8258f0.e.d.AbstractC11514e.b.a {

        /* renamed from: a */
        private String f31527a;

        /* renamed from: b */
        private String f31528b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.AbstractC11514e.b.a
        /* renamed from: a */
        public AbstractC8258f0.e.d.AbstractC11514e.b mo25886a() {
            String str = this.f31527a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " rolloutId";
            }
            if (this.f31528b == null) {
                str2 = str2 + " variantId";
            }
            if (str2.isEmpty()) {
                return new C8287x(this.f31527a, this.f31528b);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.AbstractC11514e.b.a
        /* renamed from: b */
        public AbstractC8258f0.e.d.AbstractC11514e.b.a mo25887b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f31527a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.AbstractC11514e.b.a
        /* renamed from: c */
        public AbstractC8258f0.e.d.AbstractC11514e.b.a mo25888c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f31528b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.AbstractC11514e.b
    /* renamed from: b */
    public String mo25884b() {
        return this.f31525a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.AbstractC11514e.b
    /* renamed from: c */
    public String mo25885c() {
        return this.f31526b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.AbstractC11514e.b)) {
            return false;
        }
        AbstractC8258f0.e.d.AbstractC11514e.b bVar = (AbstractC8258f0.e.d.AbstractC11514e.b) obj;
        return this.f31525a.equals(bVar.mo25884b()) && this.f31526b.equals(bVar.mo25885c());
    }

    public int hashCode() {
        return ((this.f31525a.hashCode() ^ 1000003) * 1000003) ^ this.f31526b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f31525a + ", variantId=" + this.f31526b + "}";
    }

    private C8287x(String str, String str2) {
        this.f31525a = str;
        this.f31526b = str2;
    }
}
