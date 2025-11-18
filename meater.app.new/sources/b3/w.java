package b3;

import X1.C1804a;
import java.util.Arrays;

/* compiled from: NalUnitTargetBuffer.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final int f30498a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30499b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30500c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f30501d;

    /* renamed from: e, reason: collision with root package name */
    public int f30502e;

    public w(int i10, int i11) {
        this.f30498a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f30501d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f30499b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f30501d;
            int length = bArr2.length;
            int i13 = this.f30502e;
            if (length < i13 + i12) {
                this.f30501d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f30501d, this.f30502e, i12);
            this.f30502e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f30499b) {
            return false;
        }
        this.f30502e -= i10;
        this.f30499b = false;
        this.f30500c = true;
        return true;
    }

    public boolean c() {
        return this.f30500c;
    }

    public void d() {
        this.f30499b = false;
        this.f30500c = false;
    }

    public void e(int i10) {
        C1804a.g(!this.f30499b);
        boolean z10 = i10 == this.f30498a;
        this.f30499b = z10;
        if (z10) {
            this.f30502e = 3;
            this.f30500c = false;
        }
    }
}
