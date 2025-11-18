package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.C10545t;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemProps.common.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a,\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, m32267d2 = {"systemProp", HttpUrl.FRAGMENT_ENCODE_SET, "propertyName", HttpUrl.FRAGMENT_ENCODE_SET, "defaultValue", HttpUrl.FRAGMENT_ENCODE_SET, "minValue", "maxValue", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 5, m32269mv = {1, 6, 0}, m32271xi = 48, m32272xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: kotlinx.coroutines.internal.h0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10984h0 {
    /* renamed from: a */
    public static final int m39482a(String str, int i2, int i3, int i4) {
        return (int) C10980f0.m39468c(str, i2, i3, i4);
    }

    /* renamed from: b */
    public static final long m39483b(String str, long j2, long j3, long j4) {
        String strM39469d = C10980f0.m39469d(str);
        if (strM39469d == null) {
            return j2;
        }
        Long lM37505l = C10545t.m37505l(strM39469d);
        if (lM37505l == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM39469d + '\'').toString());
        }
        long jLongValue = lM37505l.longValue();
        boolean z = false;
        if (j3 <= jLongValue && jLongValue <= j4) {
            z = true;
        }
        if (z) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m39484c(String str, boolean z) {
        String strM39469d = C10980f0.m39469d(str);
        return strM39469d != null ? Boolean.parseBoolean(strM39469d) : z;
    }

    /* renamed from: d */
    public static /* synthetic */ int m39485d(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return C10980f0.m39467b(str, i2, i3, i4);
    }

    /* renamed from: e */
    public static /* synthetic */ long m39486e(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return C10980f0.m39468c(str, j2, j5, j4);
    }
}
