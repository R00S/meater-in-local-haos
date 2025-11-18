package Ia;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: KTypeProjection.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u000bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"LIa/s;", "", "LIa/t;", "variance", "LIa/q;", "type", "<init>", "(LIa/t;LIa/q;)V", "", "toString", "()Ljava/lang/String;", "a", "()LIa/t;", "b", "()LIa/q;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LIa/t;", "d", "LIa/q;", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class s {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final s f6942d = new s(null, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t variance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q type;

    /* compiled from: KTypeProjection.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LIa/s$a;", "", "<init>", "()V", "LIa/q;", "type", "LIa/s;", "d", "(LIa/q;)LIa/s;", "a", "b", "c", "()LIa/s;", "STAR", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ia.s$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final s a(q type) {
            C3862t.g(type, "type");
            return new s(t.f6947C, type);
        }

        public final s b(q type) {
            C3862t.g(type, "type");
            return new s(t.f6948D, type);
        }

        public final s c() {
            return s.f6942d;
        }

        public final s d(q type) {
            C3862t.g(type, "type");
            return new s(t.f6946B, type);
        }

        private Companion() {
        }
    }

    /* compiled from: KTypeProjection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6945a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f6946B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f6947C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.f6948D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6945a = iArr;
        }
    }

    public s(t tVar, q qVar) {
        String str;
        this.variance = tVar;
        this.type = qVar;
        if ((tVar == null) == (qVar == null)) {
            return;
        }
        if (tVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + tVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* renamed from: a, reason: from getter */
    public final t getVariance() {
        return this.variance;
    }

    /* renamed from: b, reason: from getter */
    public final q getType() {
        return this.type;
    }

    public final q c() {
        return this.type;
    }

    public final t d() {
        return this.variance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return this.variance == sVar.variance && C3862t.b(this.type, sVar.type);
    }

    public int hashCode() {
        t tVar = this.variance;
        int iHashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        q qVar = this.type;
        return iHashCode + (qVar != null ? qVar.hashCode() : 0);
    }

    public String toString() {
        t tVar = this.variance;
        int i10 = tVar == null ? -1 : b.f6945a[tVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.type);
        }
        if (i10 == 2) {
            return "in " + this.type;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.type;
    }
}
