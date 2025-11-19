package m8;

/* compiled from: CollectPreconditions.java */
/* renamed from: m8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3994i {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    static int b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    static void c(boolean z10) {
        l8.m.r(z10, "no calls to next() since the last call to remove()");
    }
}
