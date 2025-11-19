package T8;

import T8.F;
import java.util.Arrays;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* renamed from: T8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1720g extends F.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f16465a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16466b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    /* renamed from: T8.g$b */
    static final class b extends F.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16467a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f16468b;

        b() {
        }

        @Override // T8.F.d.b.a
        public F.d.b a() {
            byte[] bArr;
            String str = this.f16467a;
            if (str != null && (bArr = this.f16468b) != null) {
                return new C1720g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16467a == null) {
                sb2.append(" filename");
            }
            if (this.f16468b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.d.b.a
        public F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f16468b = bArr;
            return this;
        }

        @Override // T8.F.d.b.a
        public F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f16467a = str;
            return this;
        }
    }

    @Override // T8.F.d.b
    public byte[] b() {
        return this.f16466b;
    }

    @Override // T8.F.d.b
    public String c() {
        return this.f16465a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d.b)) {
            return false;
        }
        F.d.b bVar = (F.d.b) obj;
        if (this.f16465a.equals(bVar.c())) {
            if (Arrays.equals(this.f16466b, bVar instanceof C1720g ? ((C1720g) bVar).f16466b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16465a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16466b);
    }

    public String toString() {
        return "File{filename=" + this.f16465a + ", contents=" + Arrays.toString(this.f16466b) + "}";
    }

    private C1720g(String str, byte[] bArr) {
        this.f16465a = str;
        this.f16466b = bArr;
    }
}
