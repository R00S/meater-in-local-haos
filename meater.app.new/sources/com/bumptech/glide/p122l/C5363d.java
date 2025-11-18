package com.bumptech.glide.p122l;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: GifHeaderParser.java */
/* renamed from: com.bumptech.glide.l.d */
/* loaded from: classes.dex */
public class C5363d {

    /* renamed from: b */
    private ByteBuffer f13191b;

    /* renamed from: c */
    private C5362c f13192c;

    /* renamed from: a */
    private final byte[] f13190a = new byte[256];

    /* renamed from: d */
    private int f13193d = 0;

    /* renamed from: b */
    private boolean m10124b() {
        return this.f13192c.f13178b != 0;
    }

    /* renamed from: d */
    private int m10125d() {
        try {
            return this.f13191b.get() & 255;
        } catch (Exception unused) {
            this.f13192c.f13178b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m10126e() {
        this.f13192c.f13180d.f13166a = m10135n();
        this.f13192c.f13180d.f13167b = m10135n();
        this.f13192c.f13180d.f13168c = m10135n();
        this.f13192c.f13180d.f13169d = m10135n();
        int iM10125d = m10125d();
        boolean z = (iM10125d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM10125d & 7) + 1);
        C5361b c5361b = this.f13192c.f13180d;
        c5361b.f13170e = (iM10125d & 64) != 0;
        if (z) {
            c5361b.f13176k = m10128g(iPow);
        } else {
            c5361b.f13176k = null;
        }
        this.f13192c.f13180d.f13175j = this.f13191b.position();
        m10138r();
        if (m10124b()) {
            return;
        }
        C5362c c5362c = this.f13192c;
        c5362c.f13179c++;
        c5362c.f13181e.add(c5362c.f13180d);
    }

    /* renamed from: f */
    private void m10127f() {
        int iM10125d = m10125d();
        this.f13193d = iM10125d;
        if (iM10125d <= 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                i3 = this.f13193d;
                if (i2 >= i3) {
                    return;
                }
                i3 -= i2;
                this.f13191b.get(this.f13190a, i2, i3);
                i2 += i3;
            } catch (Exception e2) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.f13193d, e2);
                }
                this.f13192c.f13178b = 1;
                return;
            }
        }
    }

    /* renamed from: g */
    private int[] m10128g(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.f13191b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | (-16777216) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.f13192c.f13178b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m10129h() {
        m10130i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m10130i(int i2) {
        boolean z = false;
        while (!z && !m10124b() && this.f13192c.f13179c <= i2) {
            int iM10125d = m10125d();
            if (iM10125d == 33) {
                int iM10125d2 = m10125d();
                if (iM10125d2 == 1) {
                    m10137q();
                } else if (iM10125d2 == 249) {
                    this.f13192c.f13180d = new C5361b();
                    m10131j();
                } else if (iM10125d2 == 254) {
                    m10137q();
                } else if (iM10125d2 != 255) {
                    m10137q();
                } else {
                    m10127f();
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < 11; i3++) {
                        sb.append((char) this.f13190a[i3]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m10134m();
                    } else {
                        m10137q();
                    }
                }
            } else if (iM10125d == 44) {
                C5362c c5362c = this.f13192c;
                if (c5362c.f13180d == null) {
                    c5362c.f13180d = new C5361b();
                }
                m10126e();
            } else if (iM10125d != 59) {
                this.f13192c.f13178b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m10131j() {
        m10125d();
        int iM10125d = m10125d();
        C5361b c5361b = this.f13192c.f13180d;
        int i2 = (iM10125d & 28) >> 2;
        c5361b.f13172g = i2;
        if (i2 == 0) {
            c5361b.f13172g = 1;
        }
        c5361b.f13171f = (iM10125d & 1) != 0;
        int iM10135n = m10135n();
        if (iM10135n < 2) {
            iM10135n = 10;
        }
        C5361b c5361b2 = this.f13192c.f13180d;
        c5361b2.f13174i = iM10135n * 10;
        c5361b2.f13173h = m10125d();
        m10125d();
    }

    /* renamed from: k */
    private void m10132k() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb.append((char) m10125d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f13192c.f13178b = 1;
            return;
        }
        m10133l();
        if (!this.f13192c.f13184h || m10124b()) {
            return;
        }
        C5362c c5362c = this.f13192c;
        c5362c.f13177a = m10128g(c5362c.f13185i);
        C5362c c5362c2 = this.f13192c;
        c5362c2.f13188l = c5362c2.f13177a[c5362c2.f13186j];
    }

    /* renamed from: l */
    private void m10133l() {
        this.f13192c.f13182f = m10135n();
        this.f13192c.f13183g = m10135n();
        int iM10125d = m10125d();
        C5362c c5362c = this.f13192c;
        c5362c.f13184h = (iM10125d & 128) != 0;
        c5362c.f13185i = (int) Math.pow(2.0d, (iM10125d & 7) + 1);
        this.f13192c.f13186j = m10125d();
        this.f13192c.f13187k = m10125d();
    }

    /* renamed from: m */
    private void m10134m() {
        do {
            m10127f();
            byte[] bArr = this.f13190a;
            if (bArr[0] == 1) {
                this.f13192c.f13189m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f13193d <= 0) {
                return;
            }
        } while (!m10124b());
    }

    /* renamed from: n */
    private int m10135n() {
        return this.f13191b.getShort();
    }

    /* renamed from: o */
    private void m10136o() {
        this.f13191b = null;
        Arrays.fill(this.f13190a, (byte) 0);
        this.f13192c = new C5362c();
        this.f13193d = 0;
    }

    /* renamed from: q */
    private void m10137q() {
        int iM10125d;
        do {
            iM10125d = m10125d();
            this.f13191b.position(Math.min(this.f13191b.position() + iM10125d, this.f13191b.limit()));
        } while (iM10125d > 0);
    }

    /* renamed from: r */
    private void m10138r() {
        m10125d();
        m10137q();
    }

    /* renamed from: a */
    public void m10139a() {
        this.f13191b = null;
        this.f13192c = null;
    }

    /* renamed from: c */
    public C5362c m10140c() {
        if (this.f13191b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m10124b()) {
            return this.f13192c;
        }
        m10132k();
        if (!m10124b()) {
            m10129h();
            C5362c c5362c = this.f13192c;
            if (c5362c.f13179c < 0) {
                c5362c.f13178b = 1;
            }
        }
        return this.f13192c;
    }

    /* renamed from: p */
    public C5363d m10141p(ByteBuffer byteBuffer) {
        m10136o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f13191b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f13191b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
