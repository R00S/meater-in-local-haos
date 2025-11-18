package u2;

import U1.s;
import X1.C1804a;
import X1.D;
import X1.n;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SceneRenderer.java */
/* loaded from: classes.dex */
final class i implements t2.h, InterfaceC4662a {

    /* renamed from: J, reason: collision with root package name */
    private int f50384J;

    /* renamed from: K, reason: collision with root package name */
    private SurfaceTexture f50385K;

    /* renamed from: N, reason: collision with root package name */
    private byte[] f50388N;

    /* renamed from: B, reason: collision with root package name */
    private final AtomicBoolean f50376B = new AtomicBoolean();

    /* renamed from: C, reason: collision with root package name */
    private final AtomicBoolean f50377C = new AtomicBoolean(true);

    /* renamed from: D, reason: collision with root package name */
    private final g f50378D = new g();

    /* renamed from: E, reason: collision with root package name */
    private final c f50379E = new c();

    /* renamed from: F, reason: collision with root package name */
    private final D<Long> f50380F = new D<>();

    /* renamed from: G, reason: collision with root package name */
    private final D<e> f50381G = new D<>();

    /* renamed from: H, reason: collision with root package name */
    private final float[] f50382H = new float[16];

    /* renamed from: I, reason: collision with root package name */
    private final float[] f50383I = new float[16];

    /* renamed from: L, reason: collision with root package name */
    private volatile int f50386L = 0;

    /* renamed from: M, reason: collision with root package name */
    private int f50387M = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        this.f50376B.set(true);
    }

    private void i(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f50388N;
        int i11 = this.f50387M;
        this.f50388N = bArr;
        if (i10 == -1) {
            i10 = this.f50386L;
        }
        this.f50387M = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f50388N)) {
            return;
        }
        byte[] bArr3 = this.f50388N;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f50387M) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f50387M);
        }
        this.f50381G.a(j10, eVarA);
    }

    @Override // u2.InterfaceC4662a
    public void a(long j10, float[] fArr) {
        this.f50379E.e(j10, fArr);
    }

    public void c(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            n.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f50376B.compareAndSet(true, false)) {
            ((SurfaceTexture) C1804a.e(this.f50385K)).updateTexImage();
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                n.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f50377C.compareAndSet(true, false)) {
                GlUtil.k(this.f50382H);
            }
            long timestamp = this.f50385K.getTimestamp();
            Long lG = this.f50380F.g(timestamp);
            if (lG != null) {
                this.f50379E.c(this.f50382H, lG.longValue());
            }
            e eVarJ = this.f50381G.j(timestamp);
            if (eVarJ != null) {
                this.f50378D.d(eVarJ);
            }
        }
        Matrix.multiplyMM(this.f50383I, 0, fArr, 0, this.f50382H, 0);
        this.f50378D.a(this.f50384J, this.f50383I, z10);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f50378D.b();
            GlUtil.b();
            this.f50384J = GlUtil.f();
        } catch (GlUtil.GlException e10) {
            n.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f50384J);
        this.f50385K = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: u2.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f50375B.f(surfaceTexture2);
            }
        });
        return this.f50385K;
    }

    @Override // u2.InterfaceC4662a
    public void e() {
        this.f50380F.c();
        this.f50379E.d();
        this.f50377C.set(true);
    }

    public void g(int i10) {
        this.f50386L = i10;
    }

    @Override // t2.h
    public void h(long j10, long j11, s sVar, MediaFormat mediaFormat) {
        this.f50380F.a(j11, Long.valueOf(j10));
        i(sVar.f17134A, sVar.f17135B, j11);
    }
}
