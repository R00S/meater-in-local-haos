package T8;

import T8.F;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* renamed from: T8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1719f extends F.d {

    /* renamed from: a, reason: collision with root package name */
    private final List<F.d.b> f16461a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16462b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    /* renamed from: T8.f$b */
    static final class b extends F.d.a {

        /* renamed from: a, reason: collision with root package name */
        private List<F.d.b> f16463a;

        /* renamed from: b, reason: collision with root package name */
        private String f16464b;

        b() {
        }

        @Override // T8.F.d.a
        public F.d a() {
            List<F.d.b> list = this.f16463a;
            if (list != null) {
                return new C1719f(list, this.f16464b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // T8.F.d.a
        public F.d.a b(List<F.d.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f16463a = list;
            return this;
        }

        @Override // T8.F.d.a
        public F.d.a c(String str) {
            this.f16464b = str;
            return this;
        }
    }

    @Override // T8.F.d
    public List<F.d.b> b() {
        return this.f16461a;
    }

    @Override // T8.F.d
    public String c() {
        return this.f16462b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d)) {
            return false;
        }
        F.d dVar = (F.d) obj;
        if (this.f16461a.equals(dVar.b())) {
            String str = this.f16462b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f16461a.hashCode() ^ 1000003) * 1000003;
        String str = this.f16462b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f16461a + ", orgId=" + this.f16462b + "}";
    }

    private C1719f(List<F.d.b> list, String str) {
        this.f16461a = list;
        this.f16462b = str;
    }
}
