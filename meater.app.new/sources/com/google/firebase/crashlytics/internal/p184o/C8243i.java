package com.google.firebase.crashlytics.internal.p184o;

import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p183n.C8228t;
import com.google.firebase.crashlytics.internal.p184o.C8242h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: QueueFileLogStore.java */
/* renamed from: com.google.firebase.crashlytics.h.o.i */
/* loaded from: classes2.dex */
class C8243i implements InterfaceC8238d {

    /* renamed from: a */
    private static final Charset f31101a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final File f31102b;

    /* renamed from: c */
    private final int f31103c;

    /* renamed from: d */
    private C8242h f31104d;

    /* compiled from: QueueFileLogStore.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.i$a */
    class a implements C8242h.d {

        /* renamed from: a */
        final /* synthetic */ byte[] f31105a;

        /* renamed from: b */
        final /* synthetic */ int[] f31106b;

        a(byte[] bArr, int[] iArr) {
            this.f31105a = bArr;
            this.f31106b = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.p184o.C8242h.d
        /* renamed from: a */
        public void mo25525a(InputStream inputStream, int i2) throws IOException {
            try {
                inputStream.read(this.f31105a, this.f31106b[0], i2);
                int[] iArr = this.f31106b;
                iArr[0] = iArr[0] + i2;
            } finally {
                inputStream.close();
            }
        }
    }

    /* compiled from: QueueFileLogStore.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.i$b */
    private static class b {

        /* renamed from: a */
        public final byte[] f31108a;

        /* renamed from: b */
        public final int f31109b;

        b(byte[] bArr, int i2) {
            this.f31108a = bArr;
            this.f31109b = i2;
        }
    }

    C8243i(File file, int i2) {
        this.f31102b = file;
        this.f31103c = i2;
    }

    /* renamed from: f */
    private void m25526f(long j2, String str) {
        if (this.f31104d == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i2 = this.f31103c / 4;
            if (str.length() > i2) {
                str = "..." + str.substring(str.length() - i2);
            }
            this.f31104d.m25520e(String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f31101a));
            while (!this.f31104d.m25524p() && this.f31104d.m25519N() > this.f31103c) {
                this.f31104d.m25518H();
            }
        } catch (IOException e2) {
            C8179h.m25176f().m25180e("There was a problem writing to the Crashlytics log.", e2);
        }
    }

    /* renamed from: g */
    private b m25527g() {
        if (!this.f31102b.exists()) {
            return null;
        }
        m25528h();
        C8242h c8242h = this.f31104d;
        if (c8242h == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[c8242h.m25519N()];
        try {
            this.f31104d.m25523l(new a(bArr, iArr));
        } catch (IOException e2) {
            C8179h.m25176f().m25180e("A problem occurred while reading the Crashlytics log file.", e2);
        }
        return new b(bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m25528h() {
        if (this.f31104d == null) {
            try {
                this.f31104d = new C8242h(this.f31102b);
            } catch (IOException e2) {
                C8179h.m25176f().m25180e("Could not open log file: " + this.f31102b, e2);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
    /* renamed from: a */
    public void mo25463a() throws IOException {
        C8228t.m25335f(this.f31104d, "There was a problem closing the Crashlytics log file.");
        this.f31104d = null;
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
    /* renamed from: b */
    public String mo25464b() {
        byte[] bArrMo25465c = mo25465c();
        if (bArrMo25465c != null) {
            return new String(bArrMo25465c, f31101a);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
    /* renamed from: c */
    public byte[] mo25465c() {
        b bVarM25527g = m25527g();
        if (bVarM25527g == null) {
            return null;
        }
        int i2 = bVarM25527g.f31109b;
        byte[] bArr = new byte[i2];
        System.arraycopy(bVarM25527g.f31108a, 0, bArr, 0, i2);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
    /* renamed from: d */
    public void mo25466d() throws IOException {
        mo25463a();
        this.f31102b.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
    /* renamed from: e */
    public void mo25467e(long j2, String str) {
        m25528h();
        m25526f(j2, str);
    }
}
