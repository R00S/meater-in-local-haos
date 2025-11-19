package L2;

import U1.y;
import X1.E;
import X1.x;
import X1.y;
import java.nio.ByteBuffer;

/* compiled from: SpliceInfoDecoder.java */
/* loaded from: classes.dex */
public final class c extends E2.c {

    /* renamed from: a, reason: collision with root package name */
    private final y f9068a = new y();

    /* renamed from: b, reason: collision with root package name */
    private final x f9069b = new x();

    /* renamed from: c, reason: collision with root package name */
    private E f9070c;

    @Override // E2.c
    protected U1.y b(E2.b bVar, ByteBuffer byteBuffer) {
        E e10 = this.f9070c;
        if (e10 == null || bVar.f3815K != e10.f()) {
            E e11 = new E(bVar.f26295G);
            this.f9070c = e11;
            e11.a(bVar.f26295G - bVar.f3815K);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f9068a.U(bArrArray, iLimit);
        this.f9069b.o(bArrArray, iLimit);
        this.f9069b.r(39);
        long jH = (this.f9069b.h(1) << 32) | this.f9069b.h(32);
        this.f9069b.r(20);
        int iH = this.f9069b.h(12);
        int iH2 = this.f9069b.h(8);
        this.f9068a.X(14);
        y.b bVarA = iH2 != 0 ? iH2 != 255 ? iH2 != 4 ? iH2 != 5 ? iH2 != 6 ? null : g.a(this.f9068a, jH, this.f9070c) : d.a(this.f9068a, jH, this.f9070c) : f.a(this.f9068a) : a.a(this.f9068a, iH, jH) : new e();
        return bVarA == null ? new U1.y(new y.b[0]) : new U1.y(bVarA);
    }
}
