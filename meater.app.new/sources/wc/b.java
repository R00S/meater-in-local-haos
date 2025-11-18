package wc;

import Cc.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lwc/b;", "", "LCc/h;", "name", "value", "<init>", "(LCc/h;LCc/h;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(LCc/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "()LCc/h;", "b", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LCc/h;", "c", "I", "hpackSize", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b {

    /* renamed from: e, reason: collision with root package name */
    public static final Cc.h f52034e;

    /* renamed from: f, reason: collision with root package name */
    public static final Cc.h f52035f;

    /* renamed from: g, reason: collision with root package name */
    public static final Cc.h f52036g;

    /* renamed from: h, reason: collision with root package name */
    public static final Cc.h f52037h;

    /* renamed from: i, reason: collision with root package name */
    public static final Cc.h f52038i;

    /* renamed from: j, reason: collision with root package name */
    public static final Cc.h f52039j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Cc.h name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Cc.h value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int hpackSize;

    static {
        h.Companion companion = Cc.h.INSTANCE;
        f52034e = companion.d(":");
        f52035f = companion.d(":status");
        f52036g = companion.d(":method");
        f52037h = companion.d(":path");
        f52038i = companion.d(":scheme");
        f52039j = companion.d(":authority");
    }

    public b(Cc.h name, Cc.h value) {
        C3862t.g(name, "name");
        C3862t.g(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.J() + 32 + value.J();
    }

    /* renamed from: a, reason: from getter */
    public final Cc.h getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final Cc.h getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return C3862t.b(this.name, bVar.name) && C3862t.b(this.value, bVar.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.N() + ": " + this.value.N();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String name, String value) {
        C3862t.g(name, "name");
        C3862t.g(value, "value");
        h.Companion companion = Cc.h.INSTANCE;
        this(companion.d(name), companion.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Cc.h name, String value) {
        this(name, Cc.h.INSTANCE.d(value));
        C3862t.g(name, "name");
        C3862t.g(value, "value");
    }
}
