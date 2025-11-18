package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Member;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9781c;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.KPropertyImpl;
import okhttp3.HttpUrl;

/* compiled from: KProperty2Impl.kt */
@Metadata(m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001 B\u001f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u0019\u001a\u00028\u00022\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001f\u001a\u00028\u00022\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u001cR@\u0010\u000f\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u0012*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00110\u00110\u0010X\u0088\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", "E", "V", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.SIGNATURE, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "kotlin.jvm.PlatformType", "delegateSource", "Lkotlin/Lazy;", "Ljava/lang/reflect/Member;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "get", "receiver1", "receiver2", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "Getter", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.s, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public class KProperty2Impl<D, E, V> extends KPropertyImpl<V> implements KProperty2<D, E, V> {

    /* renamed from: r */
    private final C9879a0.b<a<D, E, V>> f40563r;

    /* renamed from: s */
    private final Lazy<Member> f40564s;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005B\u001f\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\u00028\u00052\u0006\u0010\f\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0002\u0010\u000eR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty2$Getter;", "property", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "(Lkotlin/reflect/jvm/internal/KProperty2Impl;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty2Impl;", "invoke", "receiver1", "receiver2", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.s$a */
    public static final class a<D, E, V> extends KPropertyImpl.c<V> implements KProperty2.a<D, E, V> {

        /* renamed from: m */
        private final KProperty2Impl<D, E, V> f40565m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
            C9801m.m32346f(kProperty2Impl, "property");
            this.f40565m = kProperty2Impl;
        }

        @Override // kotlin.reflect.KProperty.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public KProperty2Impl<D, E, V> mo32435n() {
            return this.f40565m;
        }

        @Override // kotlin.jvm.functions.Function2
        public V invoke(D receiver1, E receiver2) {
            return mo37234G().mo32280t(receiver1, receiver2);
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a.\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004 \u0005*\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "V", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.s$b */
    static final class b extends Lambda implements Function0<a<D, E, ? extends V>> {

        /* renamed from: f */
        final /* synthetic */ KProperty2Impl<D, E, V> f40566f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
            super(0);
            this.f40566f = kProperty2Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a<D, E, V> invoke() {
            return new a<>(this.f40566f);
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Ljava/lang/reflect/Member;", "D", "E", "V", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.s$c */
    static final class c extends Lambda implements Function0<Member> {

        /* renamed from: f */
        final /* synthetic */ KProperty2Impl<D, E, V> f40567f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
            super(0);
            this.f40567f = kProperty2Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Member invoke() {
            return this.f40567f.m37298F();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2) {
        super(kDeclarationContainerImpl, str, str2, AbstractC9781c.NO_RECEIVER);
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, RoomInstalled.SIGNATURE);
        C9879a0.b<a<D, E, V>> bVarM32478b = C9879a0.m32478b(new b(this));
        C9801m.m32345e(bVarM32478b, "lazy { Getter(this) }");
        this.f40563r = bVarM32478b;
        this.f40564s = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new c(this));
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: M, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a<D, E, V> getGetter() {
        a<D, E, V> aVarInvoke = this.f40563r.invoke();
        C9801m.m32345e(aVarInvoke, "_getter()");
        return aVarInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public V invoke(D receiver1, E receiver2) {
        return mo32280t(receiver1, receiver2);
    }

    @Override // kotlin.reflect.KProperty2
    /* renamed from: t */
    public V mo32280t(D d2, E e2) {
        return mo37286J().call(d2, e2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC10729t0 interfaceC10729t0) {
        super(kDeclarationContainerImpl, interfaceC10729t0);
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(interfaceC10729t0, "descriptor");
        C9879a0.b<a<D, E, V>> bVarM32478b = C9879a0.m32478b(new b(this));
        C9801m.m32345e(bVarM32478b, "lazy { Getter(this) }");
        this.f40563r = bVarM32478b;
        this.f40564s = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new c(this));
    }
}
