package androidx.media3.extractor.flv;

import U1.s;
import X1.y;
import Y1.e;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.flv.TagPayloadReader;
import v2.C4798d;
import v2.O;

/* compiled from: VideoTagPayloadReader.java */
/* loaded from: classes.dex */
final class d extends TagPayloadReader {

    /* renamed from: b, reason: collision with root package name */
    private final y f28061b;

    /* renamed from: c, reason: collision with root package name */
    private final y f28062c;

    /* renamed from: d, reason: collision with root package name */
    private int f28063d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28064e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f28065f;

    /* renamed from: g, reason: collision with root package name */
    private int f28066g;

    public d(O o10) {
        super(o10);
        this.f28061b = new y(e.f19226a);
        this.f28062c = new y(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(y yVar) throws TagPayloadReader.UnsupportedFormatException {
        int iH = yVar.H();
        int i10 = (iH >> 4) & 15;
        int i11 = iH & 15;
        if (i11 == 7) {
            this.f28066g = i10;
            return i10 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i11);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(y yVar, long j10) throws ParserException {
        int iH = yVar.H();
        long jR = j10 + (yVar.r() * 1000);
        if (iH == 0 && !this.f28064e) {
            y yVar2 = new y(new byte[yVar.a()]);
            yVar.l(yVar2.e(), 0, yVar.a());
            C4798d c4798dB = C4798d.b(yVar2);
            this.f28063d = c4798dB.f51128b;
            this.f28036a.f(new s.b().s0("video/avc").R(c4798dB.f51138l).z0(c4798dB.f51129c).c0(c4798dB.f51130d).o0(c4798dB.f51137k).f0(c4798dB.f51127a).M());
            this.f28064e = true;
            return false;
        }
        if (iH != 1 || !this.f28064e) {
            return false;
        }
        int i10 = this.f28066g == 1 ? 1 : 0;
        if (!this.f28065f && i10 == 0) {
            return false;
        }
        byte[] bArrE = this.f28062c.e();
        bArrE[0] = 0;
        bArrE[1] = 0;
        bArrE[2] = 0;
        int i11 = 4 - this.f28063d;
        int i12 = 0;
        while (yVar.a() > 0) {
            yVar.l(this.f28062c.e(), i11, this.f28063d);
            this.f28062c.W(0);
            int iL = this.f28062c.L();
            this.f28061b.W(0);
            this.f28036a.d(this.f28061b, 4);
            this.f28036a.d(yVar, iL);
            i12 = i12 + 4 + iL;
        }
        this.f28036a.e(jR, i10, i12, 0, null);
        this.f28065f = true;
        return true;
    }
}
