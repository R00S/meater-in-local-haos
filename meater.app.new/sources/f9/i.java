package f9;

import c9.C2347b;
import c9.InterfaceC2351f;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes2.dex */
class i implements InterfaceC2351f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f41408a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41409b = false;

    /* renamed from: c, reason: collision with root package name */
    private C2347b f41410c;

    /* renamed from: d, reason: collision with root package name */
    private final f f41411d;

    i(f fVar) {
        this.f41411d = fVar;
    }

    private void a() {
        if (this.f41408a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f41408a = true;
    }

    @Override // c9.InterfaceC2351f
    public InterfaceC2351f b(String str) throws IOException {
        a();
        this.f41411d.i(this.f41410c, str, this.f41409b);
        return this;
    }

    @Override // c9.InterfaceC2351f
    public InterfaceC2351f c(boolean z10) {
        a();
        this.f41411d.o(this.f41410c, z10, this.f41409b);
        return this;
    }

    void d(C2347b c2347b, boolean z10) {
        this.f41408a = false;
        this.f41410c = c2347b;
        this.f41409b = z10;
    }
}
