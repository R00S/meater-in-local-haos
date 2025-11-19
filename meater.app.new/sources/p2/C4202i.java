package p2;

import S2.k;
import S2.l;
import S2.o;
import S2.p;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.L;
import X1.n;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC2123e;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.u0;
import androidx.media3.extractor.text.SubtitleDecoderException;
import d2.C3025C;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import m8.AbstractC4009y;

/* compiled from: TextRenderer.java */
/* renamed from: p2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4202i extends AbstractC2123e implements Handler.Callback {

    /* renamed from: S, reason: collision with root package name */
    private final S2.b f47395S;

    /* renamed from: T, reason: collision with root package name */
    private final DecoderInputBuffer f47396T;

    /* renamed from: U, reason: collision with root package name */
    private InterfaceC4194a f47397U;

    /* renamed from: V, reason: collision with root package name */
    private final InterfaceC4200g f47398V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f47399W;

    /* renamed from: X, reason: collision with root package name */
    private int f47400X;

    /* renamed from: Y, reason: collision with root package name */
    private l f47401Y;

    /* renamed from: Z, reason: collision with root package name */
    private o f47402Z;

    /* renamed from: a0, reason: collision with root package name */
    private p f47403a0;

    /* renamed from: b0, reason: collision with root package name */
    private p f47404b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f47405c0;

    /* renamed from: d0, reason: collision with root package name */
    private final Handler f47406d0;

    /* renamed from: e0, reason: collision with root package name */
    private final InterfaceC4201h f47407e0;

    /* renamed from: f0, reason: collision with root package name */
    private final C3025C f47408f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f47409g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f47410h0;

    /* renamed from: i0, reason: collision with root package name */
    private s f47411i0;

    /* renamed from: j0, reason: collision with root package name */
    private long f47412j0;

    /* renamed from: k0, reason: collision with root package name */
    private long f47413k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f47414l0;

    /* renamed from: m0, reason: collision with root package name */
    private IOException f47415m0;

    public C4202i(InterfaceC4201h interfaceC4201h, Looper looper) {
        this(interfaceC4201h, looper, InterfaceC4200g.f47393a);
    }

    private static boolean A0(k kVar, long j10) {
        return kVar == null || kVar.j(kVar.p() - 1) <= j10;
    }

    private void B0() {
        this.f47399W = true;
        l lVarB = this.f47398V.b((s) C1804a.e(this.f47411i0));
        this.f47401Y = lVarB;
        lVarB.b(a0());
    }

    private void C0(W1.b bVar) {
        this.f47407e0.s(bVar.f18336a);
        this.f47407e0.i(bVar);
    }

    private static boolean D0(s sVar) {
        return Objects.equals(sVar.f17162o, "application/x-media3-cues");
    }

    private boolean E0(long j10) {
        if (this.f47409g0 || r0(this.f47408f0, this.f47396T, 0) != -4) {
            return false;
        }
        if (this.f47396T.w()) {
            this.f47409g0 = true;
            return false;
        }
        this.f47396T.E();
        ByteBuffer byteBuffer = (ByteBuffer) C1804a.e(this.f47396T.f26293E);
        S2.e eVarA = this.f47395S.a(this.f47396T.f26295G, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f47396T.t();
        return this.f47397U.a(eVarA, j10);
    }

    private void F0() {
        this.f47402Z = null;
        this.f47405c0 = -1;
        p pVar = this.f47403a0;
        if (pVar != null) {
            pVar.C();
            this.f47403a0 = null;
        }
        p pVar2 = this.f47404b0;
        if (pVar2 != null) {
            pVar2.C();
            this.f47404b0 = null;
        }
    }

    private void G0() {
        F0();
        ((l) C1804a.e(this.f47401Y)).c();
        this.f47401Y = null;
        this.f47400X = 0;
    }

    private void H0(long j10) {
        boolean zE0 = E0(j10);
        long jB = this.f47397U.b(this.f47412j0);
        if (jB == Long.MIN_VALUE && this.f47409g0 && !zE0) {
            this.f47410h0 = true;
        }
        if (jB != Long.MIN_VALUE && jB <= j10) {
            zE0 = true;
        }
        if (zE0) {
            AbstractC4009y<W1.a> abstractC4009yC = this.f47397U.c(j10);
            long jD = this.f47397U.d(j10);
            L0(new W1.b(abstractC4009yC, y0(jD)));
            this.f47397U.e(jD);
        }
        this.f47412j0 = j10;
    }

    private void I0(long j10) {
        boolean z10;
        this.f47412j0 = j10;
        if (this.f47404b0 == null) {
            ((l) C1804a.e(this.f47401Y)).d(j10);
            try {
                this.f47404b0 = ((l) C1804a.e(this.f47401Y)).a();
            } catch (SubtitleDecoderException e10) {
                z0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f47403a0 != null) {
            long jX0 = x0();
            z10 = false;
            while (jX0 <= j10) {
                this.f47405c0++;
                jX0 = x0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        p pVar = this.f47404b0;
        if (pVar != null) {
            if (pVar.w()) {
                if (!z10 && x0() == Long.MAX_VALUE) {
                    if (this.f47400X == 2) {
                        J0();
                    } else {
                        F0();
                        this.f47410h0 = true;
                    }
                }
            } else if (pVar.f30929C <= j10) {
                p pVar2 = this.f47403a0;
                if (pVar2 != null) {
                    pVar2.C();
                }
                this.f47405c0 = pVar.c(j10);
                this.f47403a0 = pVar;
                this.f47404b0 = null;
                z10 = true;
            }
        }
        if (z10) {
            C1804a.e(this.f47403a0);
            L0(new W1.b(this.f47403a0.n(j10), y0(w0(j10))));
        }
        if (this.f47400X == 2) {
            return;
        }
        while (!this.f47409g0) {
            try {
                o oVarE = this.f47402Z;
                if (oVarE == null) {
                    oVarE = ((l) C1804a.e(this.f47401Y)).e();
                    if (oVarE == null) {
                        return;
                    } else {
                        this.f47402Z = oVarE;
                    }
                }
                if (this.f47400X == 1) {
                    oVarE.B(4);
                    ((l) C1804a.e(this.f47401Y)).g(oVarE);
                    this.f47402Z = null;
                    this.f47400X = 2;
                    return;
                }
                int iR0 = r0(this.f47408f0, oVarE, 0);
                if (iR0 == -4) {
                    if (oVarE.w()) {
                        this.f47409g0 = true;
                        this.f47399W = false;
                    } else {
                        s sVar = this.f47408f0.f39668b;
                        if (sVar == null) {
                            return;
                        }
                        oVarE.f15288K = sVar.f17167t;
                        oVarE.E();
                        this.f47399W &= !oVarE.y();
                    }
                    if (!this.f47399W) {
                        ((l) C1804a.e(this.f47401Y)).g(oVarE);
                        this.f47402Z = null;
                    }
                } else if (iR0 == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                z0(e11);
                return;
            }
        }
    }

    private void J0() {
        G0();
        B0();
    }

    private void L0(W1.b bVar) {
        Handler handler = this.f47406d0;
        if (handler != null) {
            handler.obtainMessage(1, bVar).sendToTarget();
        } else {
            C0(bVar);
        }
    }

    private void u0() {
        C1804a.h(this.f47414l0 || Objects.equals(this.f47411i0.f17162o, "application/cea-608") || Objects.equals(this.f47411i0.f17162o, "application/x-mp4-cea-608") || Objects.equals(this.f47411i0.f17162o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f47411i0.f17162o + " samples (expected application/x-media3-cues).");
    }

    private void v0() {
        L0(new W1.b(AbstractC4009y.G(), y0(this.f47412j0)));
    }

    private long w0(long j10) {
        int iC = this.f47403a0.c(j10);
        if (iC == 0 || this.f47403a0.p() == 0) {
            return this.f47403a0.f30929C;
        }
        if (iC != -1) {
            return this.f47403a0.j(iC - 1);
        }
        return this.f47403a0.j(r2.p() - 1);
    }

    private long x0() {
        if (this.f47405c0 == -1) {
            return Long.MAX_VALUE;
        }
        C1804a.e(this.f47403a0);
        if (this.f47405c0 >= this.f47403a0.p()) {
            return Long.MAX_VALUE;
        }
        return this.f47403a0.j(this.f47405c0);
    }

    private long y0(long j10) {
        C1804a.g(j10 != -9223372036854775807L);
        return j10 - d0();
    }

    private void z0(SubtitleDecoderException subtitleDecoderException) {
        n.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f47411i0, subtitleDecoderException);
        v0();
        J0();
    }

    public void K0(long j10) {
        C1804a.g(Q());
        this.f47413k0 = j10;
    }

    @Override // androidx.media3.exoplayer.u0
    public int a(s sVar) {
        if (D0(sVar) || this.f47398V.a(sVar)) {
            return u0.G(sVar.f17146M == 0 ? 4 : 2);
        }
        return z.r(sVar.f17162o) ? u0.G(1) : u0.G(0);
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean d() {
        return this.f47410h0;
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean f() {
        if (this.f47411i0 == null) {
            return true;
        }
        if (this.f47415m0 == null) {
            try {
                K();
            } catch (IOException e10) {
                this.f47415m0 = e10;
            }
        }
        if (this.f47415m0 != null) {
            if (D0((s) C1804a.e(this.f47411i0))) {
                return ((InterfaceC4194a) C1804a.e(this.f47397U)).b(this.f47412j0) != Long.MIN_VALUE;
            }
            if (this.f47410h0 || (this.f47409g0 && A0(this.f47403a0, this.f47412j0) && A0(this.f47404b0, this.f47412j0) && this.f47402Z != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void g0() {
        this.f47411i0 = null;
        this.f47413k0 = -9223372036854775807L;
        v0();
        this.f47412j0 = -9223372036854775807L;
        if (this.f47401Y != null) {
            G0();
        }
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        C0((W1.b) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.t0
    public void j(long j10, long j11) {
        if (Q()) {
            long j12 = this.f47413k0;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                F0();
                this.f47410h0 = true;
            }
        }
        if (this.f47410h0) {
            return;
        }
        if (D0((s) C1804a.e(this.f47411i0))) {
            C1804a.e(this.f47397U);
            H0(j10);
        } else {
            u0();
            I0(j10);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void j0(long j10, boolean z10) {
        this.f47412j0 = j10;
        InterfaceC4194a interfaceC4194a = this.f47397U;
        if (interfaceC4194a != null) {
            interfaceC4194a.clear();
        }
        v0();
        this.f47409g0 = false;
        this.f47410h0 = false;
        this.f47413k0 = -9223372036854775807L;
        s sVar = this.f47411i0;
        if (sVar == null || D0(sVar)) {
            return;
        }
        if (this.f47400X != 0) {
            J0();
            return;
        }
        F0();
        l lVar = (l) C1804a.e(this.f47401Y);
        lVar.flush();
        lVar.b(a0());
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void p0(s[] sVarArr, long j10, long j11, r.b bVar) {
        s sVar = sVarArr[0];
        this.f47411i0 = sVar;
        if (D0(sVar)) {
            this.f47397U = this.f47411i0.f17143J == 1 ? new C4198e() : new C4199f();
            return;
        }
        u0();
        if (this.f47401Y != null) {
            this.f47400X = 1;
        } else {
            B0();
        }
    }

    public C4202i(InterfaceC4201h interfaceC4201h, Looper looper, InterfaceC4200g interfaceC4200g) {
        super(3);
        this.f47407e0 = (InterfaceC4201h) C1804a.e(interfaceC4201h);
        this.f47406d0 = looper == null ? null : L.z(looper, this);
        this.f47398V = interfaceC4200g;
        this.f47395S = new S2.b();
        this.f47396T = new DecoderInputBuffer(1);
        this.f47408f0 = new C3025C();
        this.f47413k0 = -9223372036854775807L;
        this.f47412j0 = -9223372036854775807L;
        this.f47414l0 = false;
    }
}
