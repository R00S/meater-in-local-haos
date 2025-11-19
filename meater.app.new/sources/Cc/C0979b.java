package Cc;

import Cc.C0982e;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Util.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\n*\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\n*\u00020\u000f2\u0006\u0010#\u001a\u00020\nH\u0000¢\u0006\u0004\b$\u0010%\" \u0010+\u001a\u00020\u001b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(\"\u001a\u0010/\u001a\u00020\n8\u0000X\u0080D¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"", "size", "offset", "byteCount", "Loa/F;", "b", "(JJJ)V", "", "i", "(S)S", "", "g", "(I)I", "h", "(J)J", "", "a", "aOffset", "bOffset", "", "([BI[BII)Z", "", "", "j", "(B)Ljava/lang/String;", "k", "(I)Ljava/lang/String;", "LCc/e$a;", "unsafeCursor", "f", "(LCc/e$a;)LCc/e$a;", "LCc/h;", "position", "d", "(LCc/h;I)I", "sizeParam", "e", "([BI)I", "LCc/e$a;", "getDEFAULT__new_UnsafeCursor", "()LCc/e$a;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "DEFAULT__new_UnsafeCursor", "I", "c", "()I", "DEFAULT__ByteString_size", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0979b {

    /* renamed from: a, reason: collision with root package name */
    private static final C0982e.a f3211a = new C0982e.a();

    /* renamed from: b, reason: collision with root package name */
    private static final int f3212b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        C3862t.g(a10, "a");
        C3862t.g(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f3212b;
    }

    public static final int d(h hVar, int i10) {
        C3862t.g(hVar, "<this>");
        return i10 == f3212b ? hVar.J() : i10;
    }

    public static final int e(byte[] bArr, int i10) {
        C3862t.g(bArr, "<this>");
        return i10 == f3212b ? bArr.length : i10;
    }

    public static final C0982e.a f(C0982e.a unsafeCursor) {
        C3862t.g(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f3211a ? new C0982e.a() : unsafeCursor;
    }

    public static final int g(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long h(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short i(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String j(byte b10) {
        return Ub.n.n(new char[]{Dc.b.f()[(b10 >> 4) & 15], Dc.b.f()[b10 & 15]});
    }

    public static final String k(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = {Dc.b.f()[(i10 >> 28) & 15], Dc.b.f()[(i10 >> 24) & 15], Dc.b.f()[(i10 >> 20) & 15], Dc.b.f()[(i10 >> 16) & 15], Dc.b.f()[(i10 >> 12) & 15], Dc.b.f()[(i10 >> 8) & 15], Dc.b.f()[(i10 >> 4) & 15], Dc.b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return Ub.n.o(cArr, i11, 8);
    }
}
