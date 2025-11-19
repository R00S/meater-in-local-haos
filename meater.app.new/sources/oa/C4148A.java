package oa;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: ULong.kt */
@Aa.b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Loa/A;", "", "", "data", "j", "(J)J", "", "t", "(J)Ljava/lang/String;", "", "s", "(J)I", "", "other", "", "n", "(JLjava/lang/Object;)Z", "B", "J", "getData$annotations", "()V", "C", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oa.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4148A implements Comparable<C4148A> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final long data;

    /* compiled from: ULong.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b!¨\u0006\f"}, d2 = {"Loa/A$a;", "", "<init>", "()V", "Loa/A;", "MAX_VALUE", "J", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oa.A$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    private /* synthetic */ C4148A(long j10) {
        this.data = j10;
    }

    public static final /* synthetic */ C4148A c(long j10) {
        return new C4148A(j10);
    }

    public static boolean n(long j10, Object obj) {
        return (obj instanceof C4148A) && j10 == ((C4148A) obj).getData();
    }

    public static final boolean p(long j10, long j11) {
        return j10 == j11;
    }

    public static int s(long j10) {
        return Long.hashCode(j10);
    }

    public static String t(long j10) {
        return C4155H.d(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C4148A c4148a) {
        return C4155H.b(getData(), c4148a.getData());
    }

    public boolean equals(Object obj) {
        return n(this.data, obj);
    }

    public int hashCode() {
        return s(this.data);
    }

    public String toString() {
        return t(this.data);
    }

    /* renamed from: u, reason: from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    public static long j(long j10) {
        return j10;
    }
}
