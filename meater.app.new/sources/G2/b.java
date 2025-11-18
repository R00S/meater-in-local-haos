package G2;

import U1.y;
import X1.C1804a;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: EventMessageDecoder.java */
/* loaded from: classes.dex */
public final class b extends E2.c {
    @Override // E2.c
    protected y b(E2.b bVar, ByteBuffer byteBuffer) {
        return new y(c(new X1.y(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(X1.y yVar) {
        return new a((String) C1804a.e(yVar.B()), (String) C1804a.e(yVar.B()), yVar.A(), yVar.A(), Arrays.copyOfRange(yVar.e(), yVar.f(), yVar.g()));
    }
}
