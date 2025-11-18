package La;

import Ia.i;
import La.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.full.IllegalCallableAccessException;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: KProperty2Impl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"LLa/o0;", "D", "E", "V", "LLa/H0;", "", "LLa/d0;", "container", "LRa/Z;", "descriptor", "<init>", "(LLa/d0;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "receiver1", "receiver2", "value", "Loa/F;", "s0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Loa/i;", "LLa/o0$a;", "R", "Loa/i;", "_setter", "r0", "()LLa/o0$a;", "setter", "a", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1444o0<D, E, V> extends H0<D, E, V> implements Ia.p, Ia.i {

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i<a<D, E, V>> _setter;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u00042\u0006\u0010\f\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LLa/o0$a;", "D", "E", "V", "LLa/K0$d;", "", "LLa/o0;", "property", "<init>", "(LLa/o0;)V", "receiver1", "receiver2", "value", "Loa/F;", "h0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "K", "LLa/o0;", "g0", "()LLa/o0;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: La.o0$a */
    public static final class a<D, E, V> extends K0.d<V> implements i.a, Ba.q {

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private final C1444o0<D, E, V> property;

        public a(C1444o0<D, E, V> property) {
            C3862t.g(property, "property");
            this.property = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.q
        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            h0(obj, obj2, obj3);
            return C4153F.f46609a;
        }

        @Override // Ia.m.a
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public C1444o0<D, E, V> c() {
            return this.property;
        }

        public void h0(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
            c().s0(receiver1, receiver2, value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444o0(AbstractC1422d0 container, Ra.Z descriptor) {
        super(container, descriptor);
        C3862t.g(container, "container");
        C3862t.g(descriptor, "descriptor");
        this._setter = C4165j.b(EnumC4168m.f46627C, new C1442n0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a p0(C1444o0 c1444o0) {
        return new a(c1444o0);
    }

    @Override // Ia.i
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public a<D, E, V> h() {
        return this._setter.getValue();
    }

    public void s0(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
        h().call(receiver1, receiver2, value);
    }
}
