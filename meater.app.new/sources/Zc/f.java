package Zc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SingleInstanceFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LZc/f;", "T", "LZc/b;", "LXc/b;", "beanDefinition", "<init>", "(LXc/b;)V", "f", "()Ljava/lang/Object;", "LZc/d;", "context", "", "g", "(LZc/d;)Z", "a", "(LZc/d;)Ljava/lang/Object;", "b", "c", "Ljava/lang/Object;", "value", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f<T> extends b<T> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Xc.b<T> beanDefinition) {
        super(beanDefinition);
        C3862t.g(beanDefinition, "beanDefinition");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F e(f fVar, d dVar) {
        if (!fVar.g(dVar)) {
            fVar.value = (T) fVar.a(dVar);
        }
        return C4153F.f46609a;
    }

    private final T f() {
        T t10 = this.value;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // Zc.b
    public T a(d context) {
        C3862t.g(context, "context");
        return this.value == null ? (T) super.a(context) : f();
    }

    @Override // Zc.b
    public T b(final d context) {
        C3862t.g(context, "context");
        kd.a.f43922a.h(this, new Ba.a() { // from class: Zc.e
            @Override // Ba.a
            public final Object invoke() {
                return f.e(this.f19724B, context);
            }
        });
        return f();
    }

    public boolean g(d context) {
        return this.value != null;
    }
}
