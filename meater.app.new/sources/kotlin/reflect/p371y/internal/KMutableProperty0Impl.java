package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.KPropertyImpl;
import okhttp3.HttpUrl;

/* compiled from: KProperty0Impl.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001aB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "V", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "Lkotlin/reflect/KMutableProperty0;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.SIGNATURE, "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_setter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "kotlin.jvm.PlatformType", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "set", HttpUrl.FRAGMENT_ENCODE_SET, "value", "(Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.k, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> implements KMutableProperty0<V> {

    /* renamed from: t */
    private final C9879a0.b<a<V>> f40499t;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty0$Setter;", "property", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "(Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "invoke", HttpUrl.FRAGMENT_ENCODE_SET, "value", "(Ljava/lang/Object;)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.k$a */
    public static final class a<R> extends KPropertyImpl.d<R> implements KMutableProperty0.a<R> {

        /* renamed from: m */
        private final KMutableProperty0Impl<R> f40500m;

        public a(KMutableProperty0Impl<R> kMutableProperty0Impl) {
            C9801m.m32346f(kMutableProperty0Impl, "property");
            this.f40500m = kMutableProperty0Impl;
        }

        @Override // kotlin.reflect.KProperty.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public KMutableProperty0Impl<R> mo32435n() {
            return this.f40500m;
        }

        /* renamed from: J */
        public void m37236J(R r) throws IllegalCallableAccessException {
            mo32435n().m37233O(r);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Object obj) throws IllegalCallableAccessException {
            m37236J(obj);
            return C10775u.f41439a;
        }
    }

    /* compiled from: KProperty0Impl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "V", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.k$b */
    static final class b extends Lambda implements Function0<a<V>> {

        /* renamed from: f */
        final /* synthetic */ KMutableProperty0Impl<V> f40501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(KMutableProperty0Impl<V> kMutableProperty0Impl) {
            super(0);
            this.f40501f = kMutableProperty0Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a<V> invoke() {
            return new a<>(this.f40501f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC10729t0 interfaceC10729t0) {
        super(kDeclarationContainerImpl, interfaceC10729t0);
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(interfaceC10729t0, "descriptor");
        C9879a0.b<a<V>> bVarM32478b = C9879a0.m32478b(new b(this));
        C9801m.m32345e(bVarM32478b, "lazy { Setter(this) }");
        this.f40499t = bVarM32478b;
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.reflect.KMutableProperty
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public a<V> getSetter() {
        a<V> aVarInvoke = this.f40499t.invoke();
        C9801m.m32345e(aVarInvoke, "_setter()");
        return aVarInvoke;
    }

    /* renamed from: O */
    public void m37233O(V v) throws IllegalCallableAccessException {
        getSetter().call(v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, RoomInstalled.SIGNATURE);
        C9879a0.b<a<V>> bVarM32478b = C9879a0.m32478b(new b(this));
        C9801m.m32345e(bVarM32478b, "lazy { Setter(this) }");
        this.f40499t = bVarM32478b;
    }
}
