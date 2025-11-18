package l4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Resource.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000b\bB!\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Ll4/b;", "T", "", "data", "Ll4/a;", "error", "<init>", "(Ljava/lang/Object;Ll4/a;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Ll4/a;", "()Ll4/a;", "Ll4/b$a;", "Ll4/b$b;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3900b<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3899a error;

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll4/b$a;", "T", "Ll4/b;", "Ll4/a;", "error", "data", "<init>", "(Ll4/a;Ljava/lang/Object;)V", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l4.b$a */
    public static final class a<T> extends AbstractC3900b<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3899a error, T t10) {
            super(t10, error, null);
            C3862t.g(error, "error");
        }

        public /* synthetic */ a(InterfaceC3899a interfaceC3899a, Object obj, int i10, C3854k c3854k) {
            this(interfaceC3899a, (i10 & 2) != 0 ? null : obj);
        }
    }

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll4/b$b;", "T", "Ll4/b;", "data", "<init>", "(Ljava/lang/Object;)V", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l4.b$b, reason: collision with other inner class name */
    public static final class C0590b<T> extends AbstractC3900b<T> {
        public C0590b(T t10) {
            super(t10, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ AbstractC3900b(Object obj, InterfaceC3899a interfaceC3899a, C3854k c3854k) {
        this(obj, interfaceC3899a);
    }

    public final T a() {
        return this.data;
    }

    /* renamed from: b, reason: from getter */
    public final InterfaceC3899a getError() {
        return this.error;
    }

    private AbstractC3900b(T t10, InterfaceC3899a interfaceC3899a) {
        this.data = t10;
        this.error = interfaceC3899a;
    }

    public /* synthetic */ AbstractC3900b(Object obj, InterfaceC3899a interfaceC3899a, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : interfaceC3899a, null);
    }
}
