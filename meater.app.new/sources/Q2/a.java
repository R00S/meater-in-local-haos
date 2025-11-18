package Q2;

import X1.C1804a;
import X1.L;
import androidx.media3.common.ParserException;
import com.apptionlabs.meater_app.data.Config;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import v2.C4812s;
import v2.InterfaceC4811q;
import v2.J;
import v2.K;

/* compiled from: DefaultOggSeeker.java */
/* loaded from: classes.dex */
final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final f f14215a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14216b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14217c;

    /* renamed from: d, reason: collision with root package name */
    private final i f14218d;

    /* renamed from: e, reason: collision with root package name */
    private int f14219e;

    /* renamed from: f, reason: collision with root package name */
    private long f14220f;

    /* renamed from: g, reason: collision with root package name */
    private long f14221g;

    /* renamed from: h, reason: collision with root package name */
    private long f14222h;

    /* renamed from: i, reason: collision with root package name */
    private long f14223i;

    /* renamed from: j, reason: collision with root package name */
    private long f14224j;

    /* renamed from: k, reason: collision with root package name */
    private long f14225k;

    /* renamed from: l, reason: collision with root package name */
    private long f14226l;

    /* compiled from: DefaultOggSeeker.java */
    private final class b implements J {
        private b() {
        }

        @Override // v2.J
        public boolean g() {
            return true;
        }

        @Override // v2.J
        public J.a k(long j10) {
            return new J.a(new K(j10, L.q((a.this.f14216b + BigInteger.valueOf(a.this.f14218d.c(j10)).multiply(BigInteger.valueOf(a.this.f14217c - a.this.f14216b)).divide(BigInteger.valueOf(a.this.f14220f)).longValue()) - Config.MC_STATS_INTERVAL, a.this.f14216b, a.this.f14217c - 1)));
        }

        @Override // v2.J
        public long m() {
            return a.this.f14218d.b(a.this.f14220f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        C1804a.a(j10 >= 0 && j11 > j10);
        this.f14218d = iVar;
        this.f14216b = j10;
        this.f14217c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f14220f = j13;
            this.f14219e = 4;
        } else {
            this.f14219e = 0;
        }
        this.f14215a = new f();
    }

    private long i(InterfaceC4811q interfaceC4811q) throws IOException {
        if (this.f14223i == this.f14224j) {
            return -1L;
        }
        long position = interfaceC4811q.getPosition();
        if (!this.f14215a.d(interfaceC4811q, this.f14224j)) {
            long j10 = this.f14223i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f14215a.a(interfaceC4811q, false);
        interfaceC4811q.m();
        long j11 = this.f14222h;
        f fVar = this.f14215a;
        long j12 = fVar.f14245c;
        long j13 = j11 - j12;
        int i10 = fVar.f14250h + fVar.f14251i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f14224j = position;
            this.f14226l = j12;
        } else {
            this.f14223i = interfaceC4811q.getPosition() + i10;
            this.f14225k = this.f14215a.f14245c;
        }
        long j14 = this.f14224j;
        long j15 = this.f14223i;
        if (j14 - j15 < 100000) {
            this.f14224j = j15;
            return j15;
        }
        long position2 = interfaceC4811q.getPosition() - (i10 * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f14224j;
        long j17 = this.f14223i;
        return L.q(position2 + ((j13 * (j16 - j17)) / (this.f14226l - this.f14225k)), j17, j16 - 1);
    }

    private void k(InterfaceC4811q interfaceC4811q) throws ParserException {
        while (true) {
            this.f14215a.c(interfaceC4811q);
            this.f14215a.a(interfaceC4811q, false);
            f fVar = this.f14215a;
            if (fVar.f14245c > this.f14222h) {
                interfaceC4811q.m();
                return;
            } else {
                interfaceC4811q.n(fVar.f14250h + fVar.f14251i);
                this.f14223i = interfaceC4811q.getPosition();
                this.f14225k = this.f14215a.f14245c;
            }
        }
    }

    @Override // Q2.g
    public void b(long j10) {
        this.f14222h = L.q(j10, 0L, this.f14220f - 1);
        this.f14219e = 2;
        this.f14223i = this.f14216b;
        this.f14224j = this.f14217c;
        this.f14225k = 0L;
        this.f14226l = this.f14220f;
    }

    @Override // Q2.g
    public long d(InterfaceC4811q interfaceC4811q) throws IOException {
        int i10 = this.f14219e;
        if (i10 == 0) {
            long position = interfaceC4811q.getPosition();
            this.f14221g = position;
            this.f14219e = 1;
            long j10 = this.f14217c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jI = i(interfaceC4811q);
                if (jI != -1) {
                    return jI;
                }
                this.f14219e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC4811q);
            this.f14219e = 4;
            return -(this.f14225k + 2);
        }
        this.f14220f = j(interfaceC4811q);
        this.f14219e = 4;
        return this.f14221g;
    }

    @Override // Q2.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b a() {
        if (this.f14220f != 0) {
            return new b();
        }
        return null;
    }

    long j(InterfaceC4811q interfaceC4811q) throws ParserException, EOFException {
        this.f14215a.b();
        if (!this.f14215a.c(interfaceC4811q)) {
            throw new EOFException();
        }
        this.f14215a.a(interfaceC4811q, false);
        f fVar = this.f14215a;
        interfaceC4811q.n(fVar.f14250h + fVar.f14251i);
        long j10 = this.f14215a.f14245c;
        while (true) {
            f fVar2 = this.f14215a;
            if ((fVar2.f14244b & 4) == 4 || !fVar2.c(interfaceC4811q) || interfaceC4811q.getPosition() >= this.f14217c || !this.f14215a.a(interfaceC4811q, true)) {
                break;
            }
            f fVar3 = this.f14215a;
            if (!C4812s.e(interfaceC4811q, fVar3.f14250h + fVar3.f14251i)) {
                break;
            }
            j10 = this.f14215a.f14245c;
        }
        return j10;
    }
}
