package Dc;

import Cc.C0979b;
import Cc.C0982e;
import Cc.E;
import Cc.r;
import Cc.w;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0016*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\" \u0010\u001f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"LCc/w;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "c", "(LCc/w;I[BII)Z", "LCc/e;", "", "newline", "", "d", "(LCc/e;J)Ljava/lang/String;", "LCc/r;", "options", "selectTruncated", "e", "(LCc/e;LCc/r;Z)I", "LCc/e$a;", "unsafeCursor", "a", "(LCc/e;LCc/e$a;)LCc/e$a;", "[B", "b", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "HEX_DIGIT_BYTES", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f3743a = E.a("0123456789abcdef");

    public static final C0982e.a a(C0982e c0982e, C0982e.a unsafeCursor) {
        C3862t.g(c0982e, "<this>");
        C3862t.g(unsafeCursor, "unsafeCursor");
        C0982e.a aVarF = C0979b.f(unsafeCursor);
        if (aVarF.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarF.buffer = c0982e;
        aVarF.readWrite = true;
        return aVarF;
    }

    public static final byte[] b() {
        return f3743a;
    }

    public static final boolean c(w segment, int i10, byte[] bytes, int i11, int i12) {
        C3862t.g(segment, "segment");
        C3862t.g(bytes, "bytes");
        int i13 = segment.limit;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.next;
                C3862t.d(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.pos;
                i13 = segment.limit;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(C0982e c0982e, long j10) throws EOFException {
        C3862t.g(c0982e, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c0982e.m(j11) == 13) {
                String strD = c0982e.D(j11);
                c0982e.w(2L);
                return strD;
            }
        }
        String strD2 = c0982e.D(j10);
        c0982e.w(1L);
        return strD2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int e(Cc.C0982e r17, Cc.r r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Dc.a.e(Cc.e, Cc.r, boolean):int");
    }

    public static /* synthetic */ int f(C0982e c0982e, r rVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(c0982e, rVar, z10);
    }
}
