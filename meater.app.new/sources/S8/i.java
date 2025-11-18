package S8;

import Q8.C1622j;
import S8.h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes2.dex */
class i implements d {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f15560d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final File f15561a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15562b;

    /* renamed from: c, reason: collision with root package name */
    private h f15563c;

    /* compiled from: QueueFileLogStore.java */
    class a implements h.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f15564a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f15565b;

        a(byte[] bArr, int[] iArr) {
            this.f15564a = bArr;
            this.f15565b = iArr;
        }

        @Override // S8.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f15564a, this.f15565b[0], i10);
                int[] iArr = this.f15565b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* compiled from: QueueFileLogStore.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f15567a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15568b;

        b(byte[] bArr, int i10) {
            this.f15567a = bArr;
            this.f15568b = i10;
        }
    }

    i(File file, int i10) {
        this.f15561a = file;
        this.f15562b = i10;
    }

    private void f(long j10, String str) {
        if (this.f15563c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f15562b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f15563c.e(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f15560d));
            while (!this.f15563c.m() && this.f15563c.C() > this.f15562b) {
                this.f15563c.u();
            }
        } catch (IOException e10) {
            N8.g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (!this.f15561a.exists()) {
            return null;
        }
        h();
        h hVar = this.f15563c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.C()];
        try {
            this.f15563c.k(new a(bArr, iArr));
        } catch (IOException e10) {
            N8.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f15563c == null) {
            try {
                this.f15563c = new h(this.f15561a);
            } catch (IOException e10) {
                N8.g.f().e("Could not open log file: " + this.f15561a, e10);
            }
        }
    }

    @Override // S8.d
    public void a() throws IOException {
        C1622j.f(this.f15563c, "There was a problem closing the Crashlytics log file.");
        this.f15563c = null;
    }

    @Override // S8.d
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f15560d);
        }
        return null;
    }

    @Override // S8.d
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f15568b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f15567a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // S8.d
    public void d() throws IOException {
        a();
        this.f15561a.delete();
    }

    @Override // S8.d
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
