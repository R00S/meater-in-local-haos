package oa;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: UInt.kt */
@Aa.b
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Loa/y;", "", "", "data", "j", "(I)I", "", "s", "(I)Ljava/lang/String;", "p", "", "other", "", "n", "(ILjava/lang/Object;)Z", "B", "I", "getData$annotations", "()V", "C", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class y implements Comparable<y> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int data;

    /* compiled from: UInt.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000b"}, d2 = {"Loa/y$a;", "", "<init>", "()V", "Loa/y;", "MAX_VALUE", "I", "MIN_VALUE", "", "SIZE_BITS", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oa.y$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    private /* synthetic */ y(int i10) {
        this.data = i10;
    }

    public static final /* synthetic */ y c(int i10) {
        return new y(i10);
    }

    public static boolean n(int i10, Object obj) {
        return (obj instanceof y) && i10 == ((y) obj).getData();
    }

    public static int p(int i10) {
        return Integer.hashCode(i10);
    }

    public static String s(int i10) {
        return String.valueOf(i10 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(y yVar) {
        return C4155H.a(getData(), yVar.getData());
    }

    public boolean equals(Object obj) {
        return n(this.data, obj);
    }

    public int hashCode() {
        return p(this.data);
    }

    /* renamed from: t, reason: from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    public String toString() {
        return s(this.data);
    }

    public static int j(int i10) {
        return i10;
    }
}
