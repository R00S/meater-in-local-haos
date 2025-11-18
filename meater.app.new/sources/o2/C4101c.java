package o2;

import androidx.media3.exoplayer.source.F;
import o2.InterfaceC4104f;
import v2.C4807m;
import v2.O;

/* compiled from: BaseMediaChunkOutput.java */
/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4101c implements InterfaceC4104f.b {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f46323a;

    /* renamed from: b, reason: collision with root package name */
    private final F[] f46324b;

    public C4101c(int[] iArr, F[] fArr) {
        this.f46323a = iArr;
        this.f46324b = fArr;
    }

    @Override // o2.InterfaceC4104f.b
    public O a(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f46323a;
            if (i12 >= iArr.length) {
                X1.n.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new C4807m();
            }
            if (i11 == iArr[i12]) {
                return this.f46324b[i12];
            }
            i12++;
        }
    }

    public int[] b() {
        int[] iArr = new int[this.f46324b.length];
        int i10 = 0;
        while (true) {
            F[] fArr = this.f46324b;
            if (i10 >= fArr.length) {
                return iArr;
            }
            iArr[i10] = fArr[i10].H();
            i10++;
        }
    }

    public void c(long j10) {
        for (F f10 : this.f46324b) {
            f10.a0(j10);
        }
    }
}
