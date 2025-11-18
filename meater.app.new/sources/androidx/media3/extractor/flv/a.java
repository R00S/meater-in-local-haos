package androidx.media3.extractor.flv;

import U1.s;
import X1.y;
import androidx.media3.extractor.flv.TagPayloadReader;
import java.util.Collections;
import v2.C4795a;
import v2.O;

/* compiled from: AudioTagPayloadReader.java */
/* loaded from: classes.dex */
final class a extends TagPayloadReader {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f28037e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f28038b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28039c;

    /* renamed from: d, reason: collision with root package name */
    private int f28040d;

    public a(O o10) {
        super(o10);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(y yVar) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f28038b) {
            yVar.X(1);
        } else {
            int iH = yVar.H();
            int i10 = (iH >> 4) & 15;
            this.f28040d = i10;
            if (i10 == 2) {
                this.f28036a.f(new s.b().s0("audio/mpeg").Q(1).t0(f28037e[(iH >> 2) & 3]).M());
                this.f28039c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f28036a.f(new s.b().s0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").Q(1).t0(8000).M());
                this.f28039c = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f28040d);
            }
            this.f28038b = true;
        }
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(y yVar, long j10) {
        if (this.f28040d == 2) {
            int iA = yVar.a();
            this.f28036a.d(yVar, iA);
            this.f28036a.e(j10, 1, iA, 0, null);
            return true;
        }
        int iH = yVar.H();
        if (iH != 0 || this.f28039c) {
            if (this.f28040d == 10 && iH != 1) {
                return false;
            }
            int iA2 = yVar.a();
            this.f28036a.d(yVar, iA2);
            this.f28036a.e(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = yVar.a();
        byte[] bArr = new byte[iA3];
        yVar.l(bArr, 0, iA3);
        C4795a.b bVarE = C4795a.e(bArr);
        this.f28036a.f(new s.b().s0("audio/mp4a-latm").R(bVarE.f51101c).Q(bVarE.f51100b).t0(bVarE.f51099a).f0(Collections.singletonList(bArr)).M());
        this.f28039c = true;
        return false;
    }
}
