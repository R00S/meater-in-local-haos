package E2;

import U1.y;
import X1.C1804a;
import java.nio.ByteBuffer;

/* compiled from: SimpleMetadataDecoder.java */
/* loaded from: classes.dex */
public abstract class c implements a {
    @Override // E2.a
    public final y a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C1804a.e(bVar.f26293E);
        C1804a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    protected abstract y b(b bVar, ByteBuffer byteBuffer);
}
