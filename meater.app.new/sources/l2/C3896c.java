package l2;

import U1.s;
import U1.y;
import X1.C1804a;
import X1.L;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.AbstractC2123e;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.u0;
import d2.C3025C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MetadataRenderer.java */
/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3896c extends AbstractC2123e implements Handler.Callback {

    /* renamed from: S, reason: collision with root package name */
    private final InterfaceC3894a f44343S;

    /* renamed from: T, reason: collision with root package name */
    private final InterfaceC3895b f44344T;

    /* renamed from: U, reason: collision with root package name */
    private final Handler f44345U;

    /* renamed from: V, reason: collision with root package name */
    private final E2.b f44346V;

    /* renamed from: W, reason: collision with root package name */
    private final boolean f44347W;

    /* renamed from: X, reason: collision with root package name */
    private E2.a f44348X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f44349Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f44350Z;

    /* renamed from: a0, reason: collision with root package name */
    private long f44351a0;

    /* renamed from: b0, reason: collision with root package name */
    private y f44352b0;

    /* renamed from: c0, reason: collision with root package name */
    private long f44353c0;

    public C3896c(InterfaceC3895b interfaceC3895b, Looper looper) {
        this(interfaceC3895b, looper, InterfaceC3894a.f44342a);
    }

    private void u0(y yVar, List<y.b> list) {
        for (int i10 = 0; i10 < yVar.e(); i10++) {
            s sVarE0 = yVar.d(i10).e0();
            if (sVarE0 == null || !this.f44343S.a(sVarE0)) {
                list.add(yVar.d(i10));
            } else {
                E2.a aVarB = this.f44343S.b(sVarE0);
                byte[] bArr = (byte[]) C1804a.e(yVar.d(i10).q1());
                this.f44346V.t();
                this.f44346V.D(bArr.length);
                ((ByteBuffer) L.i(this.f44346V.f26293E)).put(bArr);
                this.f44346V.E();
                y yVarA = aVarB.a(this.f44346V);
                if (yVarA != null) {
                    u0(yVarA, list);
                }
            }
        }
    }

    private long v0(long j10) {
        C1804a.g(j10 != -9223372036854775807L);
        C1804a.g(this.f44353c0 != -9223372036854775807L);
        return j10 - this.f44353c0;
    }

    private void w0(y yVar) {
        Handler handler = this.f44345U;
        if (handler != null) {
            handler.obtainMessage(1, yVar).sendToTarget();
        } else {
            x0(yVar);
        }
    }

    private void x0(y yVar) {
        this.f44344T.z(yVar);
    }

    private boolean y0(long j10) {
        boolean z10;
        y yVar = this.f44352b0;
        if (yVar == null || (!this.f44347W && yVar.f17472C > v0(j10))) {
            z10 = false;
        } else {
            w0(this.f44352b0);
            this.f44352b0 = null;
            z10 = true;
        }
        if (this.f44349Y && this.f44352b0 == null) {
            this.f44350Z = true;
        }
        return z10;
    }

    private void z0() {
        if (this.f44349Y || this.f44352b0 != null) {
            return;
        }
        this.f44346V.t();
        C3025C c3025cY = Y();
        int iR0 = r0(c3025cY, this.f44346V, 0);
        if (iR0 != -4) {
            if (iR0 == -5) {
                this.f44351a0 = ((s) C1804a.e(c3025cY.f39668b)).f17167t;
                return;
            }
            return;
        }
        if (this.f44346V.w()) {
            this.f44349Y = true;
            return;
        }
        if (this.f44346V.f26295G >= a0()) {
            E2.b bVar = this.f44346V;
            bVar.f3815K = this.f44351a0;
            bVar.E();
            y yVarA = ((E2.a) L.i(this.f44348X)).a(this.f44346V);
            if (yVarA != null) {
                ArrayList arrayList = new ArrayList(yVarA.e());
                u0(yVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f44352b0 = new y(v0(this.f44346V.f26295G), arrayList);
            }
        }
    }

    @Override // androidx.media3.exoplayer.u0
    public int a(s sVar) {
        if (this.f44343S.a(sVar)) {
            return u0.G(sVar.f17146M == 0 ? 4 : 2);
        }
        return u0.G(0);
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean d() {
        return this.f44350Z;
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean f() {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void g0() {
        this.f44352b0 = null;
        this.f44348X = null;
        this.f44353c0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        x0((y) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.t0
    public void j(long j10, long j11) {
        boolean zY0 = true;
        while (zY0) {
            z0();
            zY0 = y0(j10);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void j0(long j10, boolean z10) {
        this.f44352b0 = null;
        this.f44349Y = false;
        this.f44350Z = false;
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void p0(s[] sVarArr, long j10, long j11, r.b bVar) {
        this.f44348X = this.f44343S.b(sVarArr[0]);
        y yVar = this.f44352b0;
        if (yVar != null) {
            this.f44352b0 = yVar.c((yVar.f17472C + this.f44353c0) - j11);
        }
        this.f44353c0 = j11;
    }

    public C3896c(InterfaceC3895b interfaceC3895b, Looper looper, InterfaceC3894a interfaceC3894a) {
        this(interfaceC3895b, looper, interfaceC3894a, false);
    }

    public C3896c(InterfaceC3895b interfaceC3895b, Looper looper, InterfaceC3894a interfaceC3894a, boolean z10) {
        super(5);
        this.f44344T = (InterfaceC3895b) C1804a.e(interfaceC3895b);
        this.f44345U = looper == null ? null : L.z(looper, this);
        this.f44343S = (InterfaceC3894a) C1804a.e(interfaceC3894a);
        this.f44347W = z10;
        this.f44346V = new E2.b();
        this.f44353c0 = -9223372036854775807L;
    }
}
