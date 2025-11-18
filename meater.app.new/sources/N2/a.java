package N2;

import X1.C1804a;
import androidx.media3.common.ParserException;
import java.util.ArrayDeque;
import v2.InterfaceC4811q;

/* compiled from: DefaultEbmlReader.java */
/* loaded from: classes.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f12228a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f12229b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final g f12230c = new g();

    /* renamed from: d, reason: collision with root package name */
    private N2.b f12231d;

    /* renamed from: e, reason: collision with root package name */
    private int f12232e;

    /* renamed from: f, reason: collision with root package name */
    private int f12233f;

    /* renamed from: g, reason: collision with root package name */
    private long f12234g;

    /* compiled from: DefaultEbmlReader.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f12235a;

        /* renamed from: b, reason: collision with root package name */
        private final long f12236b;

        private b(int i10, long j10) {
            this.f12235a = i10;
            this.f12236b = j10;
        }
    }

    private long a(InterfaceC4811q interfaceC4811q) {
        interfaceC4811q.m();
        while (true) {
            interfaceC4811q.p(this.f12228a, 0, 4);
            int iC = g.c(this.f12228a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f12228a, iC, false);
                if (this.f12231d.c(iA)) {
                    interfaceC4811q.n(iC);
                    return iA;
                }
            }
            interfaceC4811q.n(1);
        }
    }

    private double c(InterfaceC4811q interfaceC4811q, int i10) {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(f(interfaceC4811q, i10));
    }

    private long f(InterfaceC4811q interfaceC4811q, int i10) {
        interfaceC4811q.readFully(this.f12228a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f12228a[i11] & 255);
        }
        return j10;
    }

    private static String g(InterfaceC4811q interfaceC4811q, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC4811q.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // N2.c
    public void b() {
        this.f12232e = 0;
        this.f12229b.clear();
        this.f12230c.e();
    }

    @Override // N2.c
    public boolean d(InterfaceC4811q interfaceC4811q) throws ParserException {
        C1804a.i(this.f12231d);
        while (true) {
            b bVarPeek = this.f12229b.peek();
            if (bVarPeek != null && interfaceC4811q.getPosition() >= bVarPeek.f12236b) {
                this.f12231d.a(this.f12229b.pop().f12235a);
                return true;
            }
            if (this.f12232e == 0) {
                long jD = this.f12230c.d(interfaceC4811q, true, false, 4);
                if (jD == -2) {
                    jD = a(interfaceC4811q);
                }
                if (jD == -1) {
                    return false;
                }
                this.f12233f = (int) jD;
                this.f12232e = 1;
            }
            if (this.f12232e == 1) {
                this.f12234g = this.f12230c.d(interfaceC4811q, false, true, 8);
                this.f12232e = 2;
            }
            int iB = this.f12231d.b(this.f12233f);
            if (iB != 0) {
                if (iB == 1) {
                    long position = interfaceC4811q.getPosition();
                    this.f12229b.push(new b(this.f12233f, this.f12234g + position));
                    this.f12231d.g(this.f12233f, position, this.f12234g);
                    this.f12232e = 0;
                    return true;
                }
                if (iB == 2) {
                    long j10 = this.f12234g;
                    if (j10 <= 8) {
                        this.f12231d.h(this.f12233f, f(interfaceC4811q, (int) j10));
                        this.f12232e = 0;
                        return true;
                    }
                    throw ParserException.a("Invalid integer size: " + this.f12234g, null);
                }
                if (iB == 3) {
                    long j11 = this.f12234g;
                    if (j11 <= 2147483647L) {
                        this.f12231d.d(this.f12233f, g(interfaceC4811q, (int) j11));
                        this.f12232e = 0;
                        return true;
                    }
                    throw ParserException.a("String element size: " + this.f12234g, null);
                }
                if (iB == 4) {
                    this.f12231d.f(this.f12233f, (int) this.f12234g, interfaceC4811q);
                    this.f12232e = 0;
                    return true;
                }
                if (iB != 5) {
                    throw ParserException.a("Invalid element type " + iB, null);
                }
                long j12 = this.f12234g;
                if (j12 == 4 || j12 == 8) {
                    this.f12231d.e(this.f12233f, c(interfaceC4811q, (int) j12));
                    this.f12232e = 0;
                    return true;
                }
                throw ParserException.a("Invalid float size: " + this.f12234g, null);
            }
            interfaceC4811q.n((int) this.f12234g);
            this.f12232e = 0;
        }
    }

    @Override // N2.c
    public void e(N2.b bVar) {
        this.f12231d = bVar;
    }
}
