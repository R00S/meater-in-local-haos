package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* renamed from: com.google.firebase.crashlytics.h.p.a0 */
/* loaded from: classes2.dex */
final class C8248a0 extends AbstractC8258f0.e.f {

    /* renamed from: a */
    private final String f31270a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a0$b */
    static final class b extends AbstractC8258f0.e.f.a {

        /* renamed from: a */
        private String f31271a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.f.a
        /* renamed from: a */
        public AbstractC8258f0.e.f mo25580a() {
            String str = this.f31271a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " identifier";
            }
            if (str2.isEmpty()) {
                return new C8248a0(this.f31271a);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.f.a
        /* renamed from: b */
        public AbstractC8258f0.e.f.a mo25581b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f31271a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.f
    /* renamed from: b */
    public String mo25579b() {
        return this.f31270a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8258f0.e.f) {
            return this.f31270a.equals(((AbstractC8258f0.e.f) obj).mo25579b());
        }
        return false;
    }

    public int hashCode() {
        return this.f31270a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f31270a + "}";
    }

    private C8248a0(String str) {
        this.f31270a = str;
    }
}
