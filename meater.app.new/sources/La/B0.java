package La;

import Ia.n;
import La.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: KProperty0Impl.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"LLa/B0;", "V", "LIa/n;", "LLa/K0;", "LLa/d0;", "container", "LRa/Z;", "descriptor", "<init>", "(LLa/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(LLa/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "invoke", "Loa/i;", "LLa/B0$a;", "P", "Loa/i;", "_getter", "Q", "delegateValue", "o0", "()LLa/B0$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class B0<V> extends K0<V> implements Ia.n<V> {

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<a<V>> _getter;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<Object> delegateValue;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LLa/B0$a;", "R", "LLa/K0$c;", "LIa/n$a;", "LLa/B0;", "property", "<init>", "(LLa/B0;)V", "invoke", "()Ljava/lang/Object;", "K", "LLa/B0;", "g0", "()LLa/B0;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<R> extends K0.c<R> implements n.a<R> {

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private final B0<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(B0<? extends R> property) {
            C3862t.g(property, "property");
            this.property = property;
        }

        @Override // Ia.m.a
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public B0<R> c() {
            return this.property;
        }

        @Override // Ba.a
        public R invoke() {
            return c().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC1422d0 container, Ra.Z descriptor) {
        super(container, descriptor);
        C3862t.g(container, "container");
        C3862t.g(descriptor, "descriptor");
        EnumC4168m enumC4168m = EnumC4168m.f46627C;
        this._getter = C4165j.b(enumC4168m, new C1465z0(this));
        this.delegateValue = C4165j.b(enumC4168m, new A0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k0(B0 b02) {
        return new a(b02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n0(B0 b02) {
        return b02.f0(b02.d0(), null, null);
    }

    @Override // Ia.n
    public V get() {
        return h0().call(new Object[0]);
    }

    @Override // Ba.a
    public V invoke() {
        return get();
    }

    @Override // La.K0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public a<V> h0() {
        return this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC1422d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        C3862t.g(container, "container");
        C3862t.g(name, "name");
        C3862t.g(signature, "signature");
        EnumC4168m enumC4168m = EnumC4168m.f46627C;
        this._getter = C4165j.b(enumC4168m, new C1465z0(this));
        this.delegateValue = C4165j.b(enumC4168m, new A0(this));
    }
}
