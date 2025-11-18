package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Tuples.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m32267d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.m, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final /* data */ class Pair<A, B> implements Serializable {

    /* renamed from: f */
    private final A f40712f;

    /* renamed from: g */
    private final B f40713g;

    public Pair(A a, B b2) {
        this.f40712f = a;
        this.f40713g = b2;
    }

    /* renamed from: a */
    public final A m37646a() {
        return this.f40712f;
    }

    /* renamed from: b */
    public final B m37647b() {
        return this.f40713g;
    }

    /* renamed from: c */
    public final A m37648c() {
        return this.f40712f;
    }

    /* renamed from: d */
    public final B m37649d() {
        return this.f40713g;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) other;
        return C9801m.m32341a(this.f40712f, pair.f40712f) && C9801m.m32341a(this.f40713g, pair.f40713g);
    }

    public int hashCode() {
        A a = this.f40712f;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b2 = this.f40713g;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f40712f + ", " + this.f40713g + ')';
    }
}
