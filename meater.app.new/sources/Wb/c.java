package Wb;

import Ub.n;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4148A;

/* compiled from: Uuid.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001dB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, d2 = {"LWb/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "B", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "C", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "D", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements Serializable {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: E, reason: collision with root package name */
    private static final c f18498E = new c(0, 0);

    /* renamed from: F, reason: collision with root package name */
    private static final Comparator<c> f18499F = new Comparator() { // from class: Wb.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return c.b((c) obj, (c) obj2);
        }
    };

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final long mostSignificantBits;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final long leastSignificantBits;

    /* compiled from: Uuid.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LWb/c$a;", "", "<init>", "()V", "", "mostSignificantBits", "leastSignificantBits", "LWb/c;", "b", "(JJ)LWb/c;", "", "byteArray", "a", "([B)LWb/c;", "d", "()LWb/c;", "NIL", "LWb/c;", "c", "", "SIZE_BITS", "I", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wb.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final c a(byte[] byteArray) {
            C3862t.g(byteArray, "byteArray");
            if (byteArray.length == 16) {
                return b(e.e(byteArray, 0), e.e(byteArray, 8));
            }
            throw new IllegalArgumentException("Expected exactly 16 bytes");
        }

        public final c b(long mostSignificantBits, long leastSignificantBits) {
            return (mostSignificantBits == 0 && leastSignificantBits == 0) ? c() : new c(mostSignificantBits, leastSignificantBits);
        }

        public final c c() {
            return c.f18498E;
        }

        public final c d() {
            return d.a();
        }

        private Companion() {
        }
    }

    public c(long j10, long j11) {
        this.mostSignificantBits = j10;
        this.leastSignificantBits = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(c cVar, c cVar2) {
        long j10 = cVar.mostSignificantBits;
        return j10 != cVar2.mostSignificantBits ? Long.compareUnsigned(C4148A.j(j10), C4148A.j(cVar2.mostSignificantBits)) : Long.compareUnsigned(C4148A.j(cVar.leastSignificantBits), C4148A.j(cVar2.leastSignificantBits));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return this.mostSignificantBits == cVar.mostSignificantBits && this.leastSignificantBits == cVar.leastSignificantBits;
    }

    public int hashCode() {
        long j10 = this.mostSignificantBits ^ this.leastSignificantBits;
        return ((int) j10) ^ ((int) (j10 >> 32));
    }

    public String toString() {
        byte[] bArr = new byte[36];
        e.d(this.leastSignificantBits, bArr, 24, 6);
        bArr[23] = 45;
        e.d(this.leastSignificantBits >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        e.d(this.mostSignificantBits, bArr, 14, 2);
        bArr[13] = 45;
        e.d(this.mostSignificantBits >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        e.d(this.mostSignificantBits >>> 32, bArr, 0, 4);
        return n.p(bArr);
    }
}
