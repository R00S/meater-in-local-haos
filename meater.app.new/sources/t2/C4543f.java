package t2;

import X1.C1804a;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.media3.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: VideoDecoderGLSurfaceView.java */
/* renamed from: t2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4543f extends GLSurfaceView implements g {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f49836C = 0;

    /* renamed from: B, reason: collision with root package name */
    private final a f49837B;

    /* compiled from: VideoDecoderGLSurfaceView.java */
    /* renamed from: t2.f$a */
    private static final class a implements GLSurfaceView.Renderer {

        /* renamed from: L, reason: collision with root package name */
        private static final float[] f49838L = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: M, reason: collision with root package name */
        private static final float[] f49839M = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: N, reason: collision with root package name */
        private static final float[] f49840N = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: O, reason: collision with root package name */
        private static final String[] f49841O = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: P, reason: collision with root package name */
        private static final FloatBuffer f49842P = GlUtil.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: B, reason: collision with root package name */
        private final GLSurfaceView f49843B;

        /* renamed from: C, reason: collision with root package name */
        private final int[] f49844C = new int[3];

        /* renamed from: D, reason: collision with root package name */
        private final int[] f49845D = new int[3];

        /* renamed from: E, reason: collision with root package name */
        private final int[] f49846E = new int[3];

        /* renamed from: F, reason: collision with root package name */
        private final int[] f49847F = new int[3];

        /* renamed from: G, reason: collision with root package name */
        private final AtomicReference<c2.g> f49848G = new AtomicReference<>();

        /* renamed from: H, reason: collision with root package name */
        private final FloatBuffer[] f49849H = new FloatBuffer[3];

        /* renamed from: I, reason: collision with root package name */
        private androidx.media3.common.util.b f49850I;

        /* renamed from: J, reason: collision with root package name */
        private int f49851J;

        /* renamed from: K, reason: collision with root package name */
        private c2.g f49852K;

        public a(GLSurfaceView gLSurfaceView) {
            this.f49843B = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f49846E;
                this.f49847F[i10] = -1;
                iArr[i10] = -1;
            }
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.f49844C, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f49850I.j(f49841O[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    GlUtil.a(3553, this.f49844C[i10], 9729);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        public void a(c2.g gVar) {
            c2.g andSet = this.f49848G.getAndSet(gVar);
            if (andSet != null) {
                andSet.C();
            }
            this.f49843B.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            c2.g andSet = this.f49848G.getAndSet(null);
            if (andSet == null && this.f49852K == null) {
                return;
            }
            if (andSet != null) {
                c2.g gVar = this.f49852K;
                if (gVar != null) {
                    gVar.C();
                }
                this.f49852K = andSet;
            }
            c2.g gVar2 = (c2.g) C1804a.e(this.f49852K);
            float[] fArr = f49839M;
            int i10 = gVar2.f30951J;
            if (i10 == 1) {
                fArr = f49838L;
            } else if (i10 == 3) {
                fArr = f49840N;
            }
            GLES20.glUniformMatrix3fv(this.f49851J, 1, false, fArr, 0);
            int[] iArr = (int[]) C1804a.e(gVar2.f30950I);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) C1804a.e(gVar2.f30949H);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = gVar2.f30948G;
                if (i11 != 0) {
                    i12 = (i12 + 1) / 2;
                }
                int i13 = i12;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f49844C[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i13, 0, 6409, 5121, byteBufferArr[i11]);
            }
            int i14 = gVar2.f30947F;
            int i15 = (i14 + 1) / 2;
            int[] iArr2 = {i14, i15, i15};
            for (int i16 = 0; i16 < 3; i16++) {
                if (this.f49846E[i16] != iArr2[i16] || this.f49847F[i16] != iArr[i16]) {
                    C1804a.g(iArr[i16] != 0);
                    float f10 = iArr2[i16] / iArr[i16];
                    this.f49849H[i16] = GlUtil.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f49845D[i16], 2, 5126, false, 0, (Buffer) this.f49849H[i16]);
                    this.f49846E[i16] = iArr2[i16];
                    this.f49847F[i16] = iArr[i16];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f49850I = bVar;
                GLES20.glVertexAttribPointer(bVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f49842P);
                this.f49845D[0] = this.f49850I.e("in_tc_y");
                this.f49845D[1] = this.f49850I.e("in_tc_u");
                this.f49845D[2] = this.f49850I.e("in_tc_v");
                this.f49851J = this.f49850I.j("mColorConversion");
                GlUtil.b();
                b();
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }
    }

    public C4543f(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(c2.g gVar) {
        this.f49837B.a(gVar);
    }

    public C4543f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f49837B = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public g getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
