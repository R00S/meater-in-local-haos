package G1;

import java.nio.ByteBuffer;

/* compiled from: MetadataItem.java */
/* loaded from: classes.dex */
public final class a extends c {
    public a f(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
        return this;
    }

    public void g(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public int h(int i10) {
        int iB = b(16);
        if (iB != 0) {
            return this.f4852b.getInt(d(iB) + (i10 * 4));
        }
        return 0;
    }

    public int i() {
        int iB = b(16);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public boolean j() {
        int iB = b(6);
        return (iB == 0 || this.f4852b.get(iB + this.f4851a) == 0) ? false : true;
    }

    public short k() {
        int iB = b(14);
        if (iB != 0) {
            return this.f4852b.getShort(iB + this.f4851a);
        }
        return (short) 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f4852b.getInt(iB + this.f4851a);
        }
        return 0;
    }

    public short m() {
        int iB = b(8);
        if (iB != 0) {
            return this.f4852b.getShort(iB + this.f4851a);
        }
        return (short) 0;
    }

    public short n() {
        int iB = b(12);
        if (iB != 0) {
            return this.f4852b.getShort(iB + this.f4851a);
        }
        return (short) 0;
    }
}
