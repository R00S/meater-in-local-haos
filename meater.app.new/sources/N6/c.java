package N6;

import android.content.Context;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes2.dex */
final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12538a;

    /* renamed from: b, reason: collision with root package name */
    private final W6.a f12539b;

    /* renamed from: c, reason: collision with root package name */
    private final W6.a f12540c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12541d;

    c(Context context, W6.a aVar, W6.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f12538a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f12539b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f12540c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f12541d = str;
    }

    @Override // N6.h
    public Context b() {
        return this.f12538a;
    }

    @Override // N6.h
    public String c() {
        return this.f12541d;
    }

    @Override // N6.h
    public W6.a d() {
        return this.f12540c;
    }

    @Override // N6.h
    public W6.a e() {
        return this.f12539b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f12538a.equals(hVar.b()) && this.f12539b.equals(hVar.e()) && this.f12540c.equals(hVar.d()) && this.f12541d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f12538a.hashCode() ^ 1000003) * 1000003) ^ this.f12539b.hashCode()) * 1000003) ^ this.f12540c.hashCode()) * 1000003) ^ this.f12541d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f12538a + ", wallClock=" + this.f12539b + ", monotonicClock=" + this.f12540c + ", backendName=" + this.f12541d + "}";
    }
}
