package kotlin.reflect.p371y.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.KMutableProperty2Impl;

/* JADX INFO: Add missing generic type declarations: [D, E, V] */
/* compiled from: KProperty2Impl.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a.\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004 \u0005*\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "D", "E", "V", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.n */
/* loaded from: classes2.dex */
final class C10495n<D, E, V> extends Lambda implements Function0<KMutableProperty2Impl.a<D, E, V>> {

    /* renamed from: f */
    final /* synthetic */ KMutableProperty2Impl<D, E, V> f40525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10495n(KMutableProperty2Impl<D, E, V> kMutableProperty2Impl) {
        super(0);
        this.f40525f = kMutableProperty2Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final KMutableProperty2Impl.a<D, E, V> invoke() {
        return new KMutableProperty2Impl.a<>(this.f40525f);
    }
}
