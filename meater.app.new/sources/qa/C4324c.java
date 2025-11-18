package qa;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UArrays.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005H\u0087\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\t\u001a\u00020\u0002*\u0004\u0018\u00010\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\bH\u0087\u0004¢\u0006\u0004\b\t\u0010\n\u001a \u0010\f\u001a\u00020\u0002*\u0004\u0018\u00010\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u000bH\u0087\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Loa/z;", "other", "", "b", "([I[I)Z", "Loa/B;", "d", "([J[J)Z", "Loa/x;", "c", "([B[B)Z", "Loa/E;", "a", "([S[S)Z", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
/* renamed from: qa.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4324c extends C4323b {
    public static boolean a(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean d(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }
}
