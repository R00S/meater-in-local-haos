package kotlin.collections;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4149B;
import oa.C4152E;
import qa.C4322a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Arrays.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "other", "", "c", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3833n extends C3832m {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean c(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object[] objArr = tArr[i10];
            Object[] objArr2 = tArr2[i10];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!C3831l.c(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof oa.x) && (objArr2 instanceof oa.x)) {
                    if (!C4322a.c(((oa.x) objArr).getStorage(), ((oa.x) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof C4152E) && (objArr2 instanceof C4152E)) {
                    if (!C4322a.a(((C4152E) objArr).getStorage(), ((C4152E) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof oa.z) && (objArr2 instanceof oa.z)) {
                    if (!C4322a.b(((oa.z) objArr).getStorage(), ((oa.z) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof C4149B) && (objArr2 instanceof C4149B)) {
                    if (!C4322a.d(((C4149B) objArr).getStorage(), ((C4149B) objArr2).getStorage())) {
                        return false;
                    }
                } else if (!C3862t.b(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
