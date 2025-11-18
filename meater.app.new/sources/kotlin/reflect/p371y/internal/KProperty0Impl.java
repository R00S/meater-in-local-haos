package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.p371y.internal.C9879a0;
import kotlin.reflect.p371y.internal.KPropertyImpl;
import okhttp3.HttpUrl;

/* compiled from: KProperty0Impl.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\r\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u001b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0019R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u0010X\u0088\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.SIGNATURE, "boundReceiver", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "kotlin.jvm.PlatformType", "delegateValue", "Lkotlin/Lazy;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.q, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public class KProperty0Impl<V> extends KPropertyImpl<V> implements KProperty0<V> {

    /* renamed from: r */
    private final C9879a0.b<a<V>> f40553r;

    /* renamed from: s */
    private final Lazy<Object> f40554s;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "property", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "(Lkotlin/reflect/jvm/internal/KProperty0Impl;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty0Impl;", "invoke", "()Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.q$a */
    public static final class a<R> extends KPropertyImpl.c<R> implements KProperty0.a<R> {

        /* renamed from: m */
        private final KProperty0Impl<R> f40555m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(KProperty0Impl<? extends R> kProperty0Impl) {
            C9801m.m32346f(kProperty0Impl, "property");
            this.f40555m = kProperty0Impl;
        }

        @Override // kotlin.reflect.KProperty.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public KProperty0Impl<R> mo32435n() {
            return this.f40555m;
        }

        @Override // kotlin.jvm.functions.Function0
        public R invoke() {
            return mo32435n().get();
        }
    }

    /* compiled from: KProperty0Impl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "V", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.q$b */
    static final class b extends Lambda implements Function0<a<? extends V>> {

        /* renamed from: f */
        final /* synthetic */ KProperty0Impl<V> f40556f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(KProperty0Impl<? extends V> kProperty0Impl) {
            super(0);
            this.f40556f = kProperty0Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a<V> invoke() {
            return new a<>(this.f40556f);
        }
    }

    /* compiled from: KProperty0Impl.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "V", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.q$c */
    static final class c extends Lambda implements Function0<Object> {

        /* renamed from: f */
        final /* synthetic */ KProperty0Impl<V> f40557f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(KProperty0Impl<? extends V> kProperty0Impl) {
            super(0);
            this.f40557f = kProperty0Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KProperty0Impl<V> kProperty0Impl = this.f40557f;
            return kProperty0Impl.m37300H(kProperty0Impl.m37298F(), null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC10729t0 interfaceC10729t0) {
        super(kDeclarationContainerImpl, interfaceC10729t0);
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(interfaceC10729t0, "descriptor");
        C9879a0.b<a<V>> bVarM32478b = C9879a0.m32478b(new b(this));
        C9801m.m32345e(bVarM32478b, "lazy { Getter(this) }");
        this.f40553r = bVarM32478b;
        this.f40554s = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new c(this));
    }

    @Override // kotlin.reflect.KProperty
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public a<V> getGetter() {
        a<V> aVarInvoke = this.f40553r.invoke();
        C9801m.m32345e(aVarInvoke, "_getter()");
        return aVarInvoke;
    }

    @Override // kotlin.reflect.KProperty0
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // kotlin.reflect.KProperty0
    public Object getDelegate() {
        return this.f40554s.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public V invoke() {
        return get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        C9801m.m32346f(kDeclarationContainerImpl, "container");
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, RoomInstalled.SIGNATURE);
        C9879a0.b<a<V>> bVarM32478b = C9879a0.m32478b(new b(this));
        C9801m.m32345e(bVarM32478b, "lazy { Getter(this) }");
        this.f40553r = bVarM32478b;
        this.f40554s = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new c(this));
    }
}
