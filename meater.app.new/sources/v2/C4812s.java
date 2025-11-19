package v2;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* compiled from: ExtractorUtil.java */
/* renamed from: v2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4812s {
    public static void a(boolean z10, String str) throws ParserException {
        if (!z10) {
            throw ParserException.a(str, null);
        }
    }

    public static boolean b(InterfaceC4811q interfaceC4811q, byte[] bArr, int i10, int i11, boolean z10) throws EOFException {
        try {
            return interfaceC4811q.h(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(InterfaceC4811q interfaceC4811q, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iK = interfaceC4811q.k(bArr, i10 + i12, i11 - i12);
            if (iK == -1) {
                break;
            }
            i12 += iK;
        }
        return i12;
    }

    public static boolean d(InterfaceC4811q interfaceC4811q, byte[] bArr, int i10, int i11) {
        try {
            interfaceC4811q.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(InterfaceC4811q interfaceC4811q, int i10) {
        try {
            interfaceC4811q.n(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
