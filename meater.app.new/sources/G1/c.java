package G1;

import java.nio.ByteBuffer;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f4851a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f4852b;

    /* renamed from: c, reason: collision with root package name */
    private int f4853c;

    /* renamed from: d, reason: collision with root package name */
    private int f4854d;

    /* renamed from: e, reason: collision with root package name */
    d f4855e = d.a();

    protected int a(int i10) {
        return i10 + this.f4852b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f4854d) {
            return this.f4852b.getShort(this.f4853c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f4852b = byteBuffer;
        if (byteBuffer == null) {
            this.f4851a = 0;
            this.f4853c = 0;
            this.f4854d = 0;
        } else {
            this.f4851a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f4853c = i11;
            this.f4854d = this.f4852b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f4851a;
        return i11 + this.f4852b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f4851a;
        return this.f4852b.getInt(i11 + this.f4852b.getInt(i11));
    }
}
