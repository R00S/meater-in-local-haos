package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KClass;

/* compiled from: AttributeArrayOwner.kt */
/* renamed from: kotlin.f0.y.e.j0.m.e */
/* loaded from: classes3.dex */
public abstract class AbstractC10469e<K, T> extends AbstractC10465a<K, T> {

    /* renamed from: f */
    private AbstractC10467c<T> f40405f;

    protected AbstractC10469e(AbstractC10467c<T> abstractC10467c) {
        C9801m.m32346f(abstractC10467c, "arrayMap");
        this.f40405f = abstractC10467c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10465a
    /* renamed from: c */
    protected final AbstractC10467c<T> mo37184c() {
        return this.f40405f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    protected final void m37193h(KClass<? extends K> kClass, T t) {
        C9801m.m32346f(kClass, "tClass");
        C9801m.m32346f(t, "value");
        int iM37221d = mo36568f().m37221d(kClass);
        int iMo37188c = this.f40405f.mo37188c();
        if (iMo37188c == 0) {
            this.f40405f = new C10479o(t, iM37221d);
            return;
        }
        if (iMo37188c == 1) {
            AbstractC10467c<T> abstractC10467c = this.f40405f;
            C9801m.m32344d(abstractC10467c, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            C10479o c10479o = (C10479o) abstractC10467c;
            if (c10479o.m37208h() == iM37221d) {
                this.f40405f = new C10479o(t, iM37221d);
                return;
            } else {
                C10468d c10468d = new C10468d();
                this.f40405f = c10468d;
                c10468d.mo37189f(c10479o.m37208h(), c10479o.m37209i());
            }
        }
        this.f40405f.mo37189f(iM37221d, t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC10469e() {
        C10473i c10473i = C10473i.f40418f;
        C9801m.m32344d(c10473i, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(c10473i);
    }
}
