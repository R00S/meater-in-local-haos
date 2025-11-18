package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* renamed from: com.google.firebase.crashlytics.h.p.f */
/* loaded from: classes2.dex */
final class C8257f extends AbstractC8258f0.d {

    /* renamed from: a */
    private final List<AbstractC8258f0.d.b> f31343a;

    /* renamed from: b */
    private final String f31344b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.f$b */
    static final class b extends AbstractC8258f0.d.a {

        /* renamed from: a */
        private List<AbstractC8258f0.d.b> f31345a;

        /* renamed from: b */
        private String f31346b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d.a
        /* renamed from: a */
        public AbstractC8258f0.d mo25660a() {
            List<AbstractC8258f0.d.b> list = this.f31345a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (list == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " files";
            }
            if (str.isEmpty()) {
                return new C8257f(this.f31345a, this.f31346b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d.a
        /* renamed from: b */
        public AbstractC8258f0.d.a mo25661b(List<AbstractC8258f0.d.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f31345a = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d.a
        /* renamed from: c */
        public AbstractC8258f0.d.a mo25662c(String str) {
            this.f31346b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d
    /* renamed from: b */
    public List<AbstractC8258f0.d.b> mo25658b() {
        return this.f31343a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.d
    /* renamed from: c */
    public String mo25659c() {
        return this.f31344b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.d)) {
            return false;
        }
        AbstractC8258f0.d dVar = (AbstractC8258f0.d) obj;
        if (this.f31343a.equals(dVar.mo25658b())) {
            String str = this.f31344b;
            if (str == null) {
                if (dVar.mo25659c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.mo25659c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f31343a.hashCode() ^ 1000003) * 1000003;
        String str = this.f31344b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f31343a + ", orgId=" + this.f31344b + "}";
    }

    private C8257f(List<AbstractC8258f0.d.b> list, String str) {
        this.f31343a = list;
        this.f31344b = str;
    }
}
