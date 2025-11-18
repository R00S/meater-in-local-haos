package p241e.p254e.p256b.p257a.p258i;

import java.util.Arrays;
import p241e.p254e.p256b.p257a.C8785b;

/* compiled from: EncodedPayload.java */
/* renamed from: e.e.b.a.i.i */
/* loaded from: classes2.dex */
public final class C8866i {

    /* renamed from: a */
    private final C8785b f33603a;

    /* renamed from: b */
    private final byte[] f33604b;

    public C8866i(C8785b c8785b, byte[] bArr) {
        if (c8785b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f33603a = c8785b;
        this.f33604b = bArr;
    }

    /* renamed from: a */
    public byte[] m28148a() {
        return this.f33604b;
    }

    /* renamed from: b */
    public C8785b m28149b() {
        return this.f33603a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8866i)) {
            return false;
        }
        C8866i c8866i = (C8866i) obj;
        if (this.f33603a.equals(c8866i.f33603a)) {
            return Arrays.equals(this.f33604b, c8866i.f33604b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f33603a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f33604b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f33603a + ", bytes=[...]}";
    }
}
