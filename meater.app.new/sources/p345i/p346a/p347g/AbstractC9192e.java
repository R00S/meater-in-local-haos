package p345i.p346a.p347g;

import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: DNSMessage.java */
/* renamed from: i.a.g.e */
/* loaded from: classes2.dex */
public abstract class AbstractC9192e {

    /* renamed from: a */
    private int f35316a;

    /* renamed from: b */
    boolean f35317b;

    /* renamed from: c */
    private int f35318c;

    /* renamed from: d */
    protected final List<C9194g> f35319d = Collections.synchronizedList(new LinkedList());

    /* renamed from: e */
    protected final List<AbstractC9195h> f35320e = Collections.synchronizedList(new LinkedList());

    /* renamed from: f */
    protected final List<AbstractC9195h> f35321f = Collections.synchronizedList(new LinkedList());

    /* renamed from: g */
    protected final List<AbstractC9195h> f35322g = Collections.synchronizedList(new LinkedList());

    protected AbstractC9192e(int i2, int i3, boolean z) {
        this.f35318c = i2;
        this.f35316a = i3;
        this.f35317b = z;
    }

    /* renamed from: a */
    public Collection<? extends AbstractC9195h> m29484a() {
        return this.f35322g;
    }

    /* renamed from: b */
    public List<AbstractC9195h> m29485b() {
        ArrayList arrayList = new ArrayList(this.f35320e.size() + this.f35321f.size() + this.f35322g.size());
        arrayList.addAll(this.f35320e);
        arrayList.addAll(this.f35321f);
        arrayList.addAll(this.f35322g);
        return arrayList;
    }

    /* renamed from: c */
    public Collection<? extends AbstractC9195h> m29486c() {
        return this.f35320e;
    }

    /* renamed from: d */
    public Collection<? extends AbstractC9195h> m29487d() {
        return this.f35321f;
    }

    /* renamed from: e */
    public int m29488e() {
        return this.f35318c;
    }

    /* renamed from: f */
    public int m29489f() {
        if (this.f35317b) {
            return 0;
        }
        return this.f35316a;
    }

    /* renamed from: g */
    public int m29490g() {
        return m29484a().size();
    }

    /* renamed from: h */
    public int m29491h() {
        return m29486c().size();
    }

    /* renamed from: i */
    public int m29492i() {
        return m29487d().size();
    }

    /* renamed from: j */
    public int m29493j() {
        return m29495l().size();
    }

    /* renamed from: k */
    public int m29494k() {
        return (this.f35318c & 30720) >> 11;
    }

    /* renamed from: l */
    public Collection<? extends C9194g> m29495l() {
        return this.f35319d;
    }

    /* renamed from: m */
    public boolean m29496m() {
        return (this.f35318c & 1024) != 0;
    }

    /* renamed from: n */
    public boolean m29497n() {
        return ((m29493j() + m29491h()) + m29492i()) + m29490g() == 0;
    }

    /* renamed from: o */
    public boolean m29498o() {
        return this.f35317b;
    }

    /* renamed from: p */
    public boolean m29499p() {
        return (this.f35318c & 32768) == 0;
    }

    /* renamed from: q */
    public boolean m29500q() {
        return (this.f35318c & 32768) == 32768;
    }

    /* renamed from: r */
    public boolean m29501r() {
        return (this.f35318c & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
    }

    /* renamed from: s */
    public boolean m29502s() {
        return (this.f35318c & 15) == 0;
    }

    /* renamed from: t */
    String m29503t() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append(toString());
        stringBuffer.append("\n");
        for (C9194g c9194g : this.f35319d) {
            stringBuffer.append("\tquestion:      ");
            stringBuffer.append(c9194g);
            stringBuffer.append("\n");
        }
        for (AbstractC9195h abstractC9195h : this.f35320e) {
            stringBuffer.append("\tanswer:        ");
            stringBuffer.append(abstractC9195h);
            stringBuffer.append("\n");
        }
        for (AbstractC9195h abstractC9195h2 : this.f35321f) {
            stringBuffer.append("\tauthoritative: ");
            stringBuffer.append(abstractC9195h2);
            stringBuffer.append("\n");
        }
        for (AbstractC9195h abstractC9195h3 : this.f35322g) {
            stringBuffer.append("\tadditional:    ");
            stringBuffer.append(abstractC9195h3);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* renamed from: u */
    protected String m29504u(byte[] bArr) {
        StringBuilder sb = new StringBuilder(4000);
        int length = bArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int iMin = Math.min(32, length - i2);
            if (i2 < 16) {
                sb.append(' ');
            }
            if (i2 < 256) {
                sb.append(' ');
            }
            if (i2 < 4096) {
                sb.append(' ');
            }
            sb.append(Integer.toHexString(i2));
            sb.append(':');
            int i3 = 0;
            while (i3 < iMin) {
                if (i3 % 8 == 0) {
                    sb.append(' ');
                }
                int i4 = i2 + i3;
                sb.append(Integer.toHexString((bArr[i4] & 240) >> 4));
                sb.append(Integer.toHexString((bArr[i4] & 15) >> 0));
                i3++;
            }
            if (i3 < 32) {
                while (i3 < 32) {
                    if (i3 % 8 == 0) {
                        sb.append(' ');
                    }
                    sb.append("  ");
                    i3++;
                }
            }
            sb.append("    ");
            for (int i5 = 0; i5 < iMin; i5++) {
                if (i5 % 8 == 0) {
                    sb.append(' ');
                }
                int i6 = bArr[i2 + i5] & 255;
                sb.append((i6 <= 32 || i6 >= 127) ? '.' : (char) i6);
            }
            sb.append("\n");
            i2 += 32;
            if (i2 >= 2048) {
                sb.append("....\n");
                break;
            }
        }
        return sb.toString();
    }

    /* renamed from: v */
    public void m29505v(int i2) {
        this.f35318c = i2;
    }

    /* renamed from: w */
    public void m29506w(int i2) {
        this.f35316a = i2;
    }
}
