package p241e.p254e.p256b.p257a;

/* compiled from: AutoValue_Event.java */
/* renamed from: e.e.b.a.a */
/* loaded from: classes2.dex */
final class C8784a<T> extends AbstractC8786c<T> {

    /* renamed from: a */
    private final Integer f33410a;

    /* renamed from: b */
    private final T f33411b;

    /* renamed from: c */
    private final EnumC8787d f33412c;

    C8784a(Integer num, T t, EnumC8787d enumC8787d) {
        this.f33410a = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.f33411b = t;
        if (enumC8787d == null) {
            throw new NullPointerException("Null priority");
        }
        this.f33412c = enumC8787d;
    }

    @Override // p241e.p254e.p256b.p257a.AbstractC8786c
    /* renamed from: a */
    public Integer mo27942a() {
        return this.f33410a;
    }

    @Override // p241e.p254e.p256b.p257a.AbstractC8786c
    /* renamed from: b */
    public T mo27943b() {
        return this.f33411b;
    }

    @Override // p241e.p254e.p256b.p257a.AbstractC8786c
    /* renamed from: c */
    public EnumC8787d mo27944c() {
        return this.f33412c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8786c)) {
            return false;
        }
        AbstractC8786c abstractC8786c = (AbstractC8786c) obj;
        Integer num = this.f33410a;
        if (num != null ? num.equals(abstractC8786c.mo27942a()) : abstractC8786c.mo27942a() == null) {
            if (this.f33411b.equals(abstractC8786c.mo27943b()) && this.f33412c.equals(abstractC8786c.mo27944c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f33410a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f33411b.hashCode()) * 1000003) ^ this.f33412c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f33410a + ", payload=" + this.f33411b + ", priority=" + this.f33412c + "}";
    }
}
