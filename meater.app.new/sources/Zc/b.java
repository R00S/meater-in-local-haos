package Zc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import org.koin.core.error.InstanceCreationException;

/* compiled from: InstanceFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0001\fB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LZc/b;", "T", "", "Lorg/koin/mp/Lockable;", "LXc/b;", "beanDefinition", "<init>", "(LXc/b;)V", "LZc/d;", "context", "b", "(LZc/d;)Ljava/lang/Object;", "a", "LXc/b;", "c", "()LXc/b;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Xc.b<T> beanDefinition;

    public b(Xc.b<T> beanDefinition) {
        C3862t.g(beanDefinition, "beanDefinition");
        this.beanDefinition = beanDefinition;
    }

    public T a(d context) throws InstanceCreationException {
        C3862t.g(context, "context");
        context.getLogger().a("| (+) '" + this.beanDefinition + '\'');
        try {
            cd.a parameters = context.getParameters();
            if (parameters == null) {
                parameters = cd.b.a();
            }
            return this.beanDefinition.b().invoke(context.getScope(), parameters);
        } catch (Exception e10) {
            String strE = kd.a.f43922a.e(e10);
            context.getLogger().c("* Instance creation error : could not create instance for '" + this.beanDefinition + "': " + strE);
            throw new InstanceCreationException("Could not create instance for '" + this.beanDefinition + '\'', e10);
        }
    }

    public abstract T b(d context);

    public final Xc.b<T> c() {
        return this.beanDefinition;
    }
}
