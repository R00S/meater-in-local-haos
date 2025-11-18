package L6;

import L6.q;
import java.util.Arrays;

/* compiled from: AutoValue_ExperimentIds.java */
/* loaded from: classes2.dex */
final class g extends q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10934a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f10935b;

    /* compiled from: AutoValue_ExperimentIds.java */
    static final class b extends q.a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f10936a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f10937b;

        b() {
        }

        @Override // L6.q.a
        public q a() {
            return new g(this.f10936a, this.f10937b);
        }

        @Override // L6.q.a
        public q.a b(byte[] bArr) {
            this.f10936a = bArr;
            return this;
        }

        @Override // L6.q.a
        public q.a c(byte[] bArr) {
            this.f10937b = bArr;
            return this;
        }
    }

    @Override // L6.q
    public byte[] b() {
        return this.f10934a;
    }

    @Override // L6.q
    public byte[] c() {
        return this.f10935b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z10 = qVar instanceof g;
        if (Arrays.equals(this.f10934a, z10 ? ((g) qVar).f10934a : qVar.b())) {
            if (Arrays.equals(this.f10935b, z10 ? ((g) qVar).f10935b : qVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f10934a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10935b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f10934a) + ", encryptedBlob=" + Arrays.toString(this.f10935b) + "}";
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f10934a = bArr;
        this.f10935b = bArr2;
    }
}
