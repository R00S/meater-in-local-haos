package La;

import Ia.p;
import La.K0;
import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3849f;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: KProperty2Impl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0013R,\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"LLa/H0;", "D", "E", "V", "LIa/p;", "LLa/K0;", "LLa/d0;", "container", "LRa/Z;", "descriptor", "<init>", "(LLa/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(LLa/d0;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "t", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Loa/i;", "LLa/H0$a;", "P", "Loa/i;", "_getter", "Ljava/lang/reflect/Member;", "Q", "delegateSource", "o0", "()LLa/H0$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class H0<D, E, V> extends K0<V> implements Ia.p<D, E, V> {

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<a<D, E, V>> _getter;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<Member> delegateSource;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LLa/H0$a;", "D", "E", "V", "LLa/K0$c;", "LIa/p$a;", "LLa/H0;", "property", "<init>", "(LLa/H0;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "K", "LLa/H0;", "g0", "()LLa/H0;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<D, E, V> extends K0.c<V> implements p.a<D, E, V> {

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private final H0<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(H0<D, E, ? extends V> property) {
            C3862t.g(property, "property");
            this.property = property;
        }

        @Override // Ia.m.a
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public H0<D, E, V> c() {
            return this.property;
        }

        @Override // Ba.p
        public V invoke(D receiver1, E receiver2) {
            return c().t(receiver1, receiver2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC1422d0 container, String name, String signature) {
        super(container, name, signature, AbstractC3849f.NO_RECEIVER);
        C3862t.g(container, "container");
        C3862t.g(name, "name");
        C3862t.g(signature, "signature");
        EnumC4168m enumC4168m = EnumC4168m.f46627C;
        this._getter = C4165j.b(enumC4168m, new F0(this));
        this.delegateSource = C4165j.b(enumC4168m, new G0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k0(H0 h02) {
        return new a(h02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member n0(H0 h02) {
        return h02.d0();
    }

    @Override // Ba.p
    public V invoke(D receiver1, E receiver2) {
        return t(receiver1, receiver2);
    }

    @Override // La.K0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> h0() {
        return this._getter.getValue();
    }

    @Override // Ia.p
    public V t(D receiver1, E receiver2) {
        return h0().call(receiver1, receiver2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC1422d0 container, Ra.Z descriptor) {
        super(container, descriptor);
        C3862t.g(container, "container");
        C3862t.g(descriptor, "descriptor");
        EnumC4168m enumC4168m = EnumC4168m.f46627C;
        this._getter = C4165j.b(enumC4168m, new F0(this));
        this.delegateSource = C4165j.b(enumC4168m, new G0(this));
    }
}
