package kotlin.collections.builders;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ListBuilder.kt */
@Metadata(m32266d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\t\u001a%\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\r\u001a-\u0010\u000e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u001a\u001a/\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, m32267d2 = {"arrayOfUninitializedElements", HttpUrl.FRAGMENT_ENCODE_SET, "E", "size", HttpUrl.FRAGMENT_ENCODE_SET, "(I)[Ljava/lang/Object;", "copyOfUninitializedElements", "T", "newSize", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "resetAt", HttpUrl.FRAGMENT_ENCODE_SET, "index", "([Ljava/lang/Object;I)V", "resetRange", "fromIndex", "toIndex", "([Ljava/lang/Object;II)V", "subarrayContentEquals", HttpUrl.FRAGMENT_ENCODE_SET, "offset", "length", "other", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;IILjava/util/List;)Z", "subarrayContentHashCode", "([Ljava/lang/Object;II)I", "subarrayContentToString", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;II)Ljava/lang/String;", "kotlin-stdlib"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.z0.c */
/* loaded from: classes2.dex */
public final class C10830c {
    /* renamed from: d */
    public static final <E> E[] m38955d(int i2) {
        if (i2 >= 0) {
            return (E[]) new Object[i2];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: e */
    public static final <T> T[] m38956e(T[] tArr, int i2) {
        C9801m.m32346f(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i2);
        C9801m.m32345e(tArr2, "copyOf(this, newSize)");
        C9801m.m32344d(tArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements>");
        return tArr2;
    }

    /* renamed from: f */
    public static final <E> void m38957f(E[] eArr, int i2) {
        C9801m.m32346f(eArr, "<this>");
        eArr[i2] = null;
    }

    /* renamed from: g */
    public static final <E> void m38958g(E[] eArr, int i2, int i3) {
        C9801m.m32346f(eArr, "<this>");
        while (i2 < i3) {
            m38957f(eArr, i2);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final <T> boolean m38959h(T[] tArr, int i2, int i3, List<?> list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C9801m.m32341a(tArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final <T> int m38960i(T[] tArr, int i2, int i3) {
        int iHashCode = 1;
        for (int i4 = 0; i4 < i3; i4++) {
            T t = tArr[i2 + i4];
            iHashCode = (iHashCode * 31) + (t != null ? t.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final <T> String m38961j(T[] tArr, int i2, int i3) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i2 + i4]);
        }
        sb.append("]");
        String string = sb.toString();
        C9801m.m32345e(string, "sb.toString()");
        return string;
    }
}
