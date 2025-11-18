package Zc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: FactoryInstanceFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LZc/a;", "T", "LZc/b;", "LXc/b;", "beanDefinition", "<init>", "(LXc/b;)V", "LZc/d;", "context", "b", "(LZc/d;)Ljava/lang/Object;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a<T> extends b<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Xc.b<T> beanDefinition) {
        super(beanDefinition);
        C3862t.g(beanDefinition, "beanDefinition");
    }

    @Override // Zc.b
    public T b(d context) {
        C3862t.g(context, "context");
        return a(context);
    }
}
