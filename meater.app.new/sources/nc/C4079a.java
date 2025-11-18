package nc;

import Ba.l;
import ic.InterfaceC3693a;
import ic.InterfaceC3698f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.W;

/* compiled from: SerializersModule.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B×\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u00122\u0010\u000f\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\bj\u0006\u0012\u0002\b\u0003`\u000e0\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u0012*\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R8\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R<\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R4\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R@\u0010\u000f\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\bj\u0006\u0012\u0002\b\u0003`\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lnc/a;", "Lnc/b;", "", "LIa/d;", "", "class2ContextualFactory", "Lic/a;", "polyBase2Serializers", "Lkotlin/Function1;", "Lic/f;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "T", "baseClass", "value", "a", "(LIa/d;Ljava/lang/Object;)Lic/f;", "Ljava/util/Map;", "b", "c", "d", "e", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4079a extends b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Ia.d<?>, Object> class2ContextualFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Map<Ia.d<?>, Map<Ia.d<?>, InterfaceC3693a<?>>> polyBase2Serializers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Ia.d<?>, l<?, InterfaceC3698f<?>>> polyBase2DefaultSerializerProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<Ia.d<?>, Map<String, InterfaceC3693a<?>>> polyBase2NamedSerializers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<Ia.d<?>, l<String, Object>> polyBase2DefaultDeserializerProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4079a(Map<Ia.d<?>, Object> class2ContextualFactory, Map<Ia.d<?>, ? extends Map<Ia.d<?>, ? extends InterfaceC3693a<?>>> polyBase2Serializers, Map<Ia.d<?>, ? extends l<?, ? extends InterfaceC3698f<?>>> polyBase2DefaultSerializerProvider, Map<Ia.d<?>, ? extends Map<String, ? extends InterfaceC3693a<?>>> polyBase2NamedSerializers, Map<Ia.d<?>, ? extends l<? super String, Object>> polyBase2DefaultDeserializerProvider) {
        super(null);
        C3862t.g(class2ContextualFactory, "class2ContextualFactory");
        C3862t.g(polyBase2Serializers, "polyBase2Serializers");
        C3862t.g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        C3862t.g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        C3862t.g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.class2ContextualFactory = class2ContextualFactory;
        this.polyBase2Serializers = polyBase2Serializers;
        this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider;
        this.polyBase2NamedSerializers = polyBase2NamedSerializers;
        this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider;
    }

    @Override // nc.b
    public <T> InterfaceC3698f<T> a(Ia.d<? super T> baseClass, T value) {
        C3862t.g(baseClass, "baseClass");
        C3862t.g(value, "value");
        if (!baseClass.s(value)) {
            return null;
        }
        Map<Ia.d<?>, InterfaceC3693a<?>> map = this.polyBase2Serializers.get(baseClass);
        InterfaceC3693a<?> interfaceC3693a = map != null ? map.get(P.b(value.getClass())) : null;
        if (interfaceC3693a == null) {
            interfaceC3693a = null;
        }
        if (interfaceC3693a != null) {
            return interfaceC3693a;
        }
        l<?, InterfaceC3698f<?>> lVar = this.polyBase2DefaultSerializerProvider.get(baseClass);
        l<?, InterfaceC3698f<?>> lVar2 = W.m(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (InterfaceC3698f) lVar2.invoke(value);
        }
        return null;
    }
}
