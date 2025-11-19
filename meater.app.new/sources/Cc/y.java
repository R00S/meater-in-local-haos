package Cc;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: SegmentedByteString.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0010¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)J/\u0010,\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0003H\u0010¢\u0006\u0004\b.\u0010\u001bJ\u001a\u00100\u001a\u00020%2\b\u0010#\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b2\u0010\u0019J\u000f\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"LCc/y;", "LCc/h;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "R", "()LCc/h;", "", "c", "()Ljava/lang/String;", "y", "L", "algorithm", "p", "(Ljava/lang/String;)LCc/h;", "", "pos", "", "A", "(I)B", "w", "()I", "M", "()[B", "LCc/e;", "buffer", "offset", "byteCount", "Loa/F;", "O", "(LCc/e;II)V", "other", "otherOffset", "", "D", "(ILCc/h;II)Z", "E", "(I[BII)Z", "target", "targetOffset", "n", "(I[BII)V", "z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "G", "[[B", "Q", "()[[B", "H", "[I", "P", "()[I", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y extends h {

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final transient byte[][] segments;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final transient int[] directory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(byte[][] segments, int[] directory) {
        super(h.f3238F.getData());
        C3862t.g(segments, "segments");
        C3862t.g(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final h R() {
        return new h(M());
    }

    @Override // Cc.h
    public byte A(int pos) {
        C0979b.b(getDirectory()[getSegments().length - 1], pos, 1L);
        int iB = Dc.c.b(this, pos);
        return getSegments()[iB][(pos - (iB == 0 ? 0 : getDirectory()[iB - 1])) + getDirectory()[getSegments().length + iB]];
    }

    @Override // Cc.h
    public boolean D(int offset, h other, int otherOffset, int byteCount) {
        C3862t.g(other, "other");
        if (offset < 0 || offset > J() - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iB = Dc.c.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!other.E(otherOffset, getSegments()[iB], i13 + (offset - i11), iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }

    @Override // Cc.h
    public boolean E(int offset, byte[] other, int otherOffset, int byteCount) {
        C3862t.g(other, "other");
        if (offset < 0 || offset > J() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iB = Dc.c.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!C0979b.a(getSegments()[iB], i13 + (offset - i11), other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }

    @Override // Cc.h
    public h L() {
        return R().L();
    }

    @Override // Cc.h
    public byte[] M() {
        byte[] bArr = new byte[J()];
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            int i15 = i14 - i11;
            C3831l.h(getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // Cc.h
    public void O(C0982e buffer, int offset, int byteCount) {
        C3862t.g(buffer, "buffer");
        int i10 = offset + byteCount;
        int iB = Dc.c.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = i13 + (offset - i11);
            w wVar = new w(getSegments()[iB], i14, i14 + iMin, true, false);
            w wVar2 = buffer.head;
            if (wVar2 == null) {
                wVar.prev = wVar;
                wVar.next = wVar;
                buffer.head = wVar;
            } else {
                C3862t.d(wVar2);
                w wVar3 = wVar2.prev;
                C3862t.d(wVar3);
                wVar3.c(wVar);
            }
            offset += iMin;
            iB++;
        }
        buffer.W(buffer.getSize() + byteCount);
    }

    /* renamed from: P, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    /* renamed from: Q, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    @Override // Cc.h
    public String c() {
        return R().c();
    }

    @Override // Cc.h
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof h) {
            h hVar = (h) other;
            if (hVar.J() == J() && D(0, hVar, 0, J())) {
                return true;
            }
        }
        return false;
    }

    @Override // Cc.h
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            byte[] bArr = getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        F(i11);
        return i11;
    }

    @Override // Cc.h
    public void n(int offset, byte[] target, int targetOffset, int byteCount) {
        C3862t.g(target, "target");
        long j10 = byteCount;
        C0979b.b(J(), offset, j10);
        C0979b.b(target.length, targetOffset, j10);
        int i10 = byteCount + offset;
        int iB = Dc.c.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = i13 + (offset - i11);
            C3831l.h(getSegments()[iB], target, targetOffset, i14, i14 + iMin);
            targetOffset += iMin;
            offset += iMin;
            iB++;
        }
    }

    @Override // Cc.h
    public h p(String algorithm) throws NoSuchAlgorithmException {
        C3862t.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory()[length + i10];
            int i13 = getDirectory()[i10];
            messageDigest.update(getSegments()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        C3862t.d(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // Cc.h
    public String toString() {
        return R().toString();
    }

    @Override // Cc.h
    public int w() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // Cc.h
    public String y() {
        return R().y();
    }

    @Override // Cc.h
    public byte[] z() {
        return M();
    }
}
