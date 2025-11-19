package u2;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import u2.e;

/* compiled from: ProjectionRenderer.java */
/* loaded from: classes.dex */
final class g {

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f50357j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f50358k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f50359l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f50360m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f50361n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f50362a;

    /* renamed from: b, reason: collision with root package name */
    private a f50363b;

    /* renamed from: c, reason: collision with root package name */
    private a f50364c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.media3.common.util.b f50365d;

    /* renamed from: e, reason: collision with root package name */
    private int f50366e;

    /* renamed from: f, reason: collision with root package name */
    private int f50367f;

    /* renamed from: g, reason: collision with root package name */
    private int f50368g;

    /* renamed from: h, reason: collision with root package name */
    private int f50369h;

    /* renamed from: i, reason: collision with root package name */
    private int f50370i;

    /* compiled from: ProjectionRenderer.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f50371a;

        /* renamed from: b, reason: collision with root package name */
        private final FloatBuffer f50372b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f50373c;

        /* renamed from: d, reason: collision with root package name */
        private final int f50374d;

        public a(e.b bVar) {
            this.f50371a = bVar.a();
            this.f50372b = GlUtil.e(bVar.f50355c);
            this.f50373c = GlUtil.e(bVar.f50356d);
            int i10 = bVar.f50354b;
            if (i10 == 1) {
                this.f50374d = 5;
            } else if (i10 != 2) {
                this.f50374d = 4;
            } else {
                this.f50374d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f50348a;
        e.a aVar2 = eVar.f50349b;
        return aVar.b() == 1 && aVar.a(0).f50353a == 0 && aVar2.b() == 1 && aVar2.a(0).f50353a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f50364c : this.f50363b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f50362a;
        GLES20.glUniformMatrix3fv(this.f50367f, 1, false, i11 == 1 ? z10 ? f50359l : f50358k : i11 == 2 ? z10 ? f50361n : f50360m : f50357j, 0);
        GLES20.glUniformMatrix4fv(this.f50366e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f50370i, 0);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f50368g, 3, 5126, false, 12, (Buffer) aVar.f50372b);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f50369h, 2, 5126, false, 8, (Buffer) aVar.f50373c);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f50374d, 0, aVar.f50371a);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            androidx.media3.common.util.b bVar = new androidx.media3.common.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f50365d = bVar;
            this.f50366e = bVar.j("uMvpMatrix");
            this.f50367f = this.f50365d.j("uTexMatrix");
            this.f50368g = this.f50365d.e("aPosition");
            this.f50369h = this.f50365d.e("aTexCoords");
            this.f50370i = this.f50365d.j("uTexture");
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f50362a = eVar.f50350c;
            a aVar = new a(eVar.f50348a.a(0));
            this.f50363b = aVar;
            if (!eVar.f50351d) {
                aVar = new a(eVar.f50349b.a(0));
            }
            this.f50364c = aVar;
        }
    }
}
