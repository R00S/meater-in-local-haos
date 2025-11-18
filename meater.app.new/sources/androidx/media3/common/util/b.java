package androidx.media3.common.util;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlProgram.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f26108a;

    /* renamed from: b, reason: collision with root package name */
    private final a[] f26109b;

    /* renamed from: c, reason: collision with root package name */
    private final C0370b[] f26110c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f26111d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, C0370b> f26112e;

    /* compiled from: GlProgram.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f26113a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26114b;

        private a(String str, int i10) {
            this.f26113a = str;
            this.f26114b = i10;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new a(str, b.f(i10, str));
        }
    }

    /* compiled from: GlProgram.java */
    /* renamed from: androidx.media3.common.util.b$b, reason: collision with other inner class name */
    private static final class C0370b {

        /* renamed from: a, reason: collision with root package name */
        public final String f26115a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26116b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26117c;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f26118d = new float[16];

        /* renamed from: e, reason: collision with root package name */
        private final int[] f26119e = new int[4];

        private C0370b(String str, int i10, int i11) {
            this.f26115a = str;
            this.f26116b = i10;
            this.f26117c = i11;
        }

        public static C0370b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new C0370b(str, b.i(i10, str), iArr2[0]);
        }
    }

    public b(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f26108a = iGlCreateProgram;
        GlUtil.b();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f26111d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f26109b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarA = a.a(this.f26108a, i10);
            this.f26109b[i10] = aVarA;
            this.f26111d.put(aVarA.f26113a, aVarA);
        }
        this.f26112e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f26108a, 35718, iArr3, 0);
        this.f26110c = new C0370b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            C0370b c0370bA = C0370b.a(this.f26108a, i11);
            this.f26110c[i11] = c0370bA;
            this.f26112e.put(c0370bA.f26115a, c0370bA);
        }
        GlUtil.b();
    }

    private static void d(int i10, int i11, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int g(String str) {
        return f(this.f26108a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public int e(String str) throws GlUtil.GlException {
        int iG = g(str);
        GLES20.glEnableVertexAttribArray(iG);
        GlUtil.b();
        return iG;
    }

    public int j(String str) {
        return i(this.f26108a, str);
    }
}
