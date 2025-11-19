package La;

import Ia.j;
import La.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.full.IllegalCallableAccessException;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: KProperty0Impl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"LLa/k0;", "V", "LLa/B0;", "LIa/j;", "LLa/d0;", "container", "LRa/Z;", "descriptor", "<init>", "(LLa/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(LLa/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "value", "Loa/F;", "s0", "(Ljava/lang/Object;)V", "Loa/i;", "LLa/k0$a;", "R", "Loa/i;", "_setter", "r0", "()LLa/k0$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1436k0<V> extends B0<V> implements Ia.j<V> {

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<a<V>> _setter;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LLa/k0$a;", "R", "LLa/K0$d;", "LIa/j$a;", "LLa/k0;", "property", "<init>", "(LLa/k0;)V", "value", "Loa/F;", "h0", "(Ljava/lang/Object;)V", "K", "LLa/k0;", "g0", "()LLa/k0;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.k0$a */
    public static final class a<R> extends K0.d<R> implements j.a<R> {

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private final C1436k0<R> property;

        public a(C1436k0<R> property) {
            C3862t.g(property, "property");
            this.property = property;
        }

        @Override // Ia.m.a
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public C1436k0<R> c() {
            return this.property;
        }

        public void h0(R value) throws IllegalCallableAccessException {
            c().s0(value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) throws IllegalCallableAccessException {
            h0(obj);
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436k0(AbstractC1422d0 container, Ra.Z descriptor) {
        super(container, descriptor);
        C3862t.g(container, "container");
        C3862t.g(descriptor, "descriptor");
        this._setter = C4165j.b(EnumC4168m.f46627C, new C1434j0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a p0(C1436k0 c1436k0) {
        return new a(c1436k0);
    }

    @Override // Ia.j, Ia.i
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public a<V> h() {
        return this._setter.getValue();
    }

    public void s0(V value) throws IllegalCallableAccessException {
        h().call(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436k0(AbstractC1422d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        C3862t.g(container, "container");
        C3862t.g(name, "name");
        C3862t.g(signature, "signature");
        this._setter = C4165j.b(EnumC4168m.f46627C, new C1434j0(this));
    }
}
