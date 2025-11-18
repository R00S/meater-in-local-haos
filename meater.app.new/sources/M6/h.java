package M6;

import java.util.Arrays;

/* compiled from: EncodedPayload.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final K6.c f12098a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12099b;

    public h(K6.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f12098a = cVar;
        this.f12099b = bArr;
    }

    public byte[] a() {
        return this.f12099b;
    }

    public K6.c b() {
        return this.f12098a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f12098a.equals(hVar.f12098a)) {
            return Arrays.equals(this.f12099b, hVar.f12099b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12098a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12099b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f12098a + ", bytes=[...]}";
    }
}
