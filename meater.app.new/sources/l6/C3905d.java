package l6;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: GifHeaderParser.java */
/* renamed from: l6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3905d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f44393b;

    /* renamed from: c, reason: collision with root package name */
    private C3904c f44394c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f44392a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f44395d = 0;

    private boolean b() {
        return this.f44394c.f44380b != 0;
    }

    private int d() {
        try {
            return this.f44393b.get() & 255;
        } catch (Exception unused) {
            this.f44394c.f44380b = 1;
            return 0;
        }
    }

    private void e() {
        this.f44394c.f44382d.f44368a = n();
        this.f44394c.f44382d.f44369b = n();
        this.f44394c.f44382d.f44370c = n();
        this.f44394c.f44382d.f44371d = n();
        int iD = d();
        boolean z10 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        C3903b c3903b = this.f44394c.f44382d;
        c3903b.f44372e = (iD & 64) != 0;
        if (z10) {
            c3903b.f44378k = g(iPow);
        } else {
            c3903b.f44378k = null;
        }
        this.f44394c.f44382d.f44377j = this.f44393b.position();
        r();
        if (b()) {
            return;
        }
        C3904c c3904c = this.f44394c;
        c3904c.f44381c++;
        c3904c.f44383e.add(c3904c.f44382d);
    }

    private void f() {
        int iD = d();
        this.f44395d = iD;
        if (iD <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f44395d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f44393b.get(this.f44392a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f44395d, e10);
                }
                this.f44394c.f44380b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f44393b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f44394c.f44380b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f44394c.f44381c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f44394c.f44382d = new C3903b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f44392a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                C3904c c3904c = this.f44394c;
                if (c3904c.f44382d == null) {
                    c3904c.f44382d = new C3903b();
                }
                e();
            } else if (iD != 59) {
                this.f44394c.f44380b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        C3903b c3903b = this.f44394c.f44382d;
        int i10 = (iD & 28) >> 2;
        c3903b.f44374g = i10;
        if (i10 == 0) {
            c3903b.f44374g = 1;
        }
        c3903b.f44373f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        C3903b c3903b2 = this.f44394c.f44382d;
        c3903b2.f44376i = iN * 10;
        c3903b2.f44375h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f44394c.f44380b = 1;
            return;
        }
        l();
        if (!this.f44394c.f44386h || b()) {
            return;
        }
        C3904c c3904c = this.f44394c;
        c3904c.f44379a = g(c3904c.f44387i);
        C3904c c3904c2 = this.f44394c;
        c3904c2.f44390l = c3904c2.f44379a[c3904c2.f44388j];
    }

    private void l() {
        this.f44394c.f44384f = n();
        this.f44394c.f44385g = n();
        int iD = d();
        C3904c c3904c = this.f44394c;
        c3904c.f44386h = (iD & 128) != 0;
        c3904c.f44387i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f44394c.f44388j = d();
        this.f44394c.f44389k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f44392a;
            if (bArr[0] == 1) {
                this.f44394c.f44391m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f44395d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f44393b.getShort();
    }

    private void o() {
        this.f44393b = null;
        Arrays.fill(this.f44392a, (byte) 0);
        this.f44394c = new C3904c();
        this.f44395d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f44393b.position(Math.min(this.f44393b.position() + iD, this.f44393b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f44393b = null;
        this.f44394c = null;
    }

    public C3904c c() {
        if (this.f44393b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f44394c;
        }
        k();
        if (!b()) {
            h();
            C3904c c3904c = this.f44394c;
            if (c3904c.f44381c < 0) {
                c3904c.f44380b = 1;
            }
        }
        return this.f44394c;
    }

    public C3905d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f44393b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f44393b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
