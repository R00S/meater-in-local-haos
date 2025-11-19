package La;

import Ia.k;
import La.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.full.IllegalCallableAccessException;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: KProperty1Impl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"LLa/m0;", "T", "V", "LLa/E0;", "LIa/k;", "LLa/d0;", "container", "LRa/Z;", "descriptor", "<init>", "(LLa/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(LLa/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "value", "Loa/F;", "s0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Loa/i;", "LLa/m0$a;", "R", "Loa/i;", "_setter", "r0", "()LLa/m0$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1440m0<T, V> extends E0<T, V> implements Ia.k<T, V> {

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<a<T, V>> _setter;

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LLa/m0$a;", "T", "V", "LLa/K0$d;", "LIa/k$a;", "LLa/m0;", "property", "<init>", "(LLa/m0;)V", "receiver", "value", "Loa/F;", "h0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "K", "LLa/m0;", "g0", "()LLa/m0;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.m0$a */
    public static final class a<T, V> extends K0.d<V> implements k.a<T, V> {

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private final C1440m0<T, V> property;

        public a(C1440m0<T, V> property) {
            C3862t.g(property, "property");
            this.property = property;
        }

        @Override // Ia.m.a
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public C1440m0<T, V> c() {
            return this.property;
        }

        public void h0(T receiver, V value) throws IllegalCallableAccessException {
            c().s0(receiver, value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            h0(obj, obj2);
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1440m0(AbstractC1422d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        C3862t.g(container, "container");
        C3862t.g(name, "name");
        C3862t.g(signature, "signature");
        this._setter = C4165j.b(EnumC4168m.f46627C, new C1438l0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a p0(C1440m0 c1440m0) {
        return new a(c1440m0);
    }

    @Override // Ia.k, Ia.i
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public a<T, V> h() {
        return this._setter.getValue();
    }

    public void s0(T receiver, V value) throws IllegalCallableAccessException {
        h().call(receiver, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1440m0(AbstractC1422d0 container, Ra.Z descriptor) {
        super(container, descriptor);
        C3862t.g(container, "container");
        C3862t.g(descriptor, "descriptor");
        this._setter = C4165j.b(EnumC4168m.f46627C, new C1438l0(this));
    }
}
