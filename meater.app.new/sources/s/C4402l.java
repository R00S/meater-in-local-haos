package s;

import kotlin.Metadata;

/* compiled from: IntIntPair.kt */
@Aa.b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u001a"}, d2 = {"Ls/l;", "", "", "first", "second", "b", "(II)J", "", "packedValue", "c", "(J)J", "", "h", "(J)Ljava/lang/String;", "g", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "e", "f", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4402l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long packedValue;

    private /* synthetic */ C4402l(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ C4402l a(long j10) {
        return new C4402l(j10);
    }

    public static long b(int i10, int i11) {
        return c((i11 & 4294967295L) | (i10 << 32));
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof C4402l) && j10 == ((C4402l) obj).getPackedValue();
    }

    public static final int e(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return '(' + e(j10) + ", " + f(j10) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    public int hashCode() {
        return g(this.packedValue);
    }

    /* renamed from: i, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return h(this.packedValue);
    }

    public static long c(long j10) {
        return j10;
    }
}
