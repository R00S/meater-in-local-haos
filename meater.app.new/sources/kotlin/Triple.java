package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Tuples.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0011\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001c"}, m32267d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.r, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final /* data */ class Triple<A, B, C> implements Serializable {

    /* renamed from: f */
    private final A f40724f;

    /* renamed from: g */
    private final B f40725g;

    /* renamed from: h */
    private final C f40726h;

    public Triple(A a, B b2, C c2) {
        this.f40724f = a;
        this.f40725g = b2;
        this.f40726h = c2;
    }

    /* renamed from: a */
    public final A m37658a() {
        return this.f40724f;
    }

    /* renamed from: b */
    public final B m37659b() {
        return this.f40725g;
    }

    /* renamed from: c */
    public final C m37660c() {
        return this.f40726h;
    }

    /* renamed from: d */
    public final C m37661d() {
        return this.f40726h;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) other;
        return C9801m.m32341a(this.f40724f, triple.f40724f) && C9801m.m32341a(this.f40725g, triple.f40725g) && C9801m.m32341a(this.f40726h, triple.f40726h);
    }

    public int hashCode() {
        A a = this.f40724f;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b2 = this.f40725g;
        int iHashCode2 = (iHashCode + (b2 == null ? 0 : b2.hashCode())) * 31;
        C c2 = this.f40726h;
        return iHashCode2 + (c2 != null ? c2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f40724f + ", " + this.f40725g + ", " + this.f40726h + ')';
    }
}
