package r8;

import D8.C;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: BinaryKeysetReader.java */
/* renamed from: r8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4364b implements p {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f48433a;

    private C4364b(InputStream inputStream) {
        this.f48433a = inputStream;
    }

    public static p b(byte[] bArr) {
        return new C4364b(new ByteArrayInputStream(bArr));
    }

    @Override // r8.p
    public D8.t a() throws IOException {
        try {
            return D8.t.c0(this.f48433a, C2905o.b());
        } finally {
            this.f48433a.close();
        }
    }

    @Override // r8.p
    public C read() throws IOException {
        try {
            return C.i0(this.f48433a, C2905o.b());
        } finally {
            this.f48433a.close();
        }
    }
}
