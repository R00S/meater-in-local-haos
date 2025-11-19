package W3;

import Cc.C0982e;
import Cc.g;
import Cc.h;
import Cc.r;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: JsonReader.java */
/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: H, reason: collision with root package name */
    private static final String[] f18394H = new String[128];

    /* renamed from: B, reason: collision with root package name */
    int f18395B;

    /* renamed from: C, reason: collision with root package name */
    int[] f18396C = new int[32];

    /* renamed from: D, reason: collision with root package name */
    String[] f18397D = new String[32];

    /* renamed from: E, reason: collision with root package name */
    int[] f18398E = new int[32];

    /* renamed from: F, reason: collision with root package name */
    boolean f18399F;

    /* renamed from: G, reason: collision with root package name */
    boolean f18400G;

    /* compiled from: JsonReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String[] f18401a;

        /* renamed from: b, reason: collision with root package name */
        final r f18402b;

        private a(String[] strArr, r rVar) {
            this.f18401a = strArr;
            this.f18402b = rVar;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                C0982e c0982e = new C0982e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.u(c0982e, strArr[i10]);
                    c0982e.readByte();
                    hVarArr[i10] = c0982e.u();
                }
                return new a((String[]) strArr.clone(), r.y(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* compiled from: JsonReader.java */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f18394H[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f18394H;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    c() {
    }

    public static c n(g gVar) {
        return new e(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void u(Cc.f r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = W3.c.f18394H
            r1 = 34
            r7.d0(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.J0(r8, r4, r3)
        L2e:
            r7.A0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.J0(r8, r4, r2)
        L3b:
            r7.d0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.c.u(Cc.f, java.lang.String):void");
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g();

    public final String h() {
        return d.a(this.f18395B, this.f18396C, this.f18397D, this.f18398E);
    }

    public abstract double j();

    public abstract int k();

    public abstract String l();

    public abstract String m();

    public abstract b o();

    final void p(int i10) {
        int i11 = this.f18395B;
        int[] iArr = this.f18396C;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new W3.a("Nesting too deep at " + h());
            }
            this.f18396C = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f18397D;
            this.f18397D = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f18398E;
            this.f18398E = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f18396C;
        int i12 = this.f18395B;
        this.f18395B = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int q(a aVar);

    public abstract void s();

    public abstract void t();

    final W3.b x(String str) throws W3.b {
        throw new W3.b(str + " at path " + h());
    }
}
