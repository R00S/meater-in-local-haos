package u2;

import U1.s;
import X1.L;
import X1.y;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC2123e;
import androidx.media3.exoplayer.u0;
import java.nio.ByteBuffer;

/* compiled from: CameraMotionRenderer.java */
/* loaded from: classes.dex */
public final class b extends AbstractC2123e {

    /* renamed from: S, reason: collision with root package name */
    private final DecoderInputBuffer f50333S;

    /* renamed from: T, reason: collision with root package name */
    private final y f50334T;

    /* renamed from: U, reason: collision with root package name */
    private InterfaceC4662a f50335U;

    /* renamed from: V, reason: collision with root package name */
    private long f50336V;

    public b() {
        super(6);
        this.f50333S = new DecoderInputBuffer(1);
        this.f50334T = new y();
    }

    private float[] u0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f50334T.U(byteBuffer.array(), byteBuffer.limit());
        this.f50334T.W(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f50334T.u());
        }
        return fArr;
    }

    private void v0() {
        InterfaceC4662a interfaceC4662a = this.f50335U;
        if (interfaceC4662a != null) {
            interfaceC4662a.e();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e, androidx.media3.exoplayer.r0.b
    public void J(int i10, Object obj) {
        if (i10 == 8) {
            this.f50335U = (InterfaceC4662a) obj;
        } else {
            super.J(i10, obj);
        }
    }

    @Override // androidx.media3.exoplayer.u0
    public int a(s sVar) {
        return "application/x-camera-motion".equals(sVar.f17162o) ? u0.G(4) : u0.G(0);
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean d() {
        return p();
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean f() {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void g0() {
        v0();
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.t0
    public void j(long j10, long j11) {
        while (!p() && this.f50336V < 100000 + j10) {
            this.f50333S.t();
            if (r0(Y(), this.f50333S, 0) != -4 || this.f50333S.w()) {
                return;
            }
            long j12 = this.f50333S.f26295G;
            this.f50336V = j12;
            boolean z10 = j12 < a0();
            if (this.f50335U != null && !z10) {
                this.f50333S.E();
                float[] fArrU0 = u0((ByteBuffer) L.i(this.f50333S.f26293E));
                if (fArrU0 != null) {
                    ((InterfaceC4662a) L.i(this.f50335U)).a(this.f50336V - d0(), fArrU0);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void j0(long j10, boolean z10) {
        this.f50336V = Long.MIN_VALUE;
        v0();
    }
}
