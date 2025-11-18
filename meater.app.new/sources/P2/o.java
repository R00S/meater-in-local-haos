package P2;

import X1.y;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PsshAtomUtil.java */
/* loaded from: classes.dex */
public final class o {

    /* compiled from: PsshAtomUtil.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f13860a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13861b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f13862c;

        /* renamed from: d, reason: collision with root package name */
        public final UUID[] f13863d;

        a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f13860a = uuid;
            this.f13861b = i10;
            this.f13862c = bArr;
            this.f13863d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        y yVar = new y(bArr);
        if (yVar.g() < 32) {
            return null;
        }
        yVar.W(0);
        int iA = yVar.a();
        int iQ = yVar.q();
        if (iQ != iA) {
            X1.n.h("PsshAtomUtil", "Advertised atom size (" + iQ + ") does not match buffer size: " + iA);
            return null;
        }
        int iQ2 = yVar.q();
        if (iQ2 != 1886614376) {
            X1.n.h("PsshAtomUtil", "Atom type is not pssh: " + iQ2);
            return null;
        }
        int iM = b.m(yVar.q());
        if (iM > 1) {
            X1.n.h("PsshAtomUtil", "Unsupported pssh version: " + iM);
            return null;
        }
        UUID uuid = new UUID(yVar.A(), yVar.A());
        if (iM == 1) {
            int iL = yVar.L();
            uuidArr = new UUID[iL];
            for (int i10 = 0; i10 < iL; i10++) {
                uuidArr[i10] = new UUID(yVar.A(), yVar.A());
            }
        } else {
            uuidArr = null;
        }
        int iL2 = yVar.L();
        int iA2 = yVar.a();
        if (iL2 == iA2) {
            byte[] bArr2 = new byte[iL2];
            yVar.l(bArr2, 0, iL2);
            return new a(uuid, iM, bArr2, uuidArr);
        }
        X1.n.h("PsshAtomUtil", "Atom data size (" + iL2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f13860a)) {
            return aVarD.f13862c;
        }
        X1.n.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f13860a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f13860a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f13861b;
    }
}
