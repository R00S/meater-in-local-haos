package La;

import Ia.o;
import La.K0;
import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: KProperty1Impl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0013R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"LLa/E0;", "T", "V", "LIa/o;", "LLa/K0;", "LLa/d0;", "container", "LRa/Z;", "descriptor", "<init>", "(LLa/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(LLa/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Loa/i;", "LLa/E0$a;", "P", "Loa/i;", "_getter", "Ljava/lang/reflect/Member;", "Q", "delegateSource", "o0", "()LLa/E0$a;", "getter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class E0<T, V> extends K0<V> implements Ia.o<T, V> {

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<a<T, V>> _getter;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<Member> delegateSource;

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LLa/E0$a;", "T", "V", "LLa/K0$c;", "LIa/o$a;", "LLa/E0;", "property", "<init>", "(LLa/E0;)V", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "K", "LLa/E0;", "g0", "()LLa/E0;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T, V> extends K0.c<V> implements o.a<T, V> {

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private final E0<T, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public a(E0<T, ? extends V> property) {
            C3862t.g(property, "property");
            this.property = property;
        }

        @Override // Ia.m.a
        /* renamed from: g0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public E0<T, V> c() {
            return this.property;
        }

        @Override // Ba.l
        public V invoke(T receiver) {
            return a0().get(receiver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC1422d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        C3862t.g(container, "container");
        C3862t.g(name, "name");
        C3862t.g(signature, "signature");
        EnumC4168m enumC4168m = EnumC4168m.f46627C;
        this._getter = C4165j.b(enumC4168m, new C0(this));
        this.delegateSource = C4165j.b(enumC4168m, new D0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k0(E0 e02) {
        return new a(e02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member n0(E0 e02) {
        return e02.d0();
    }

    @Override // Ia.o
    public V get(T receiver) {
        return e().call(receiver);
    }

    @Override // Ba.l
    public V invoke(T receiver) {
        return get(receiver);
    }

    @Override // La.K0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a<T, V> h0() {
        return this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC1422d0 container, Ra.Z descriptor) {
        super(container, descriptor);
        C3862t.g(container, "container");
        C3862t.g(descriptor, "descriptor");
        EnumC4168m enumC4168m = EnumC4168m.f46627C;
        this._getter = C4165j.b(enumC4168m, new C0(this));
        this.delegateSource = C4165j.b(enumC4168m, new D0(this));
    }
}
