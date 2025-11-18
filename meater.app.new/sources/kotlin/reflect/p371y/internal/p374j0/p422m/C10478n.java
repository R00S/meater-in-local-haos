package kotlin.reflect.p371y.internal.p374j0.p422m;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.jvm.internal.C9801m;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10465a;

/* compiled from: ArrayMapOwner.kt */
/* renamed from: kotlin.f0.y.e.j0.m.n */
/* loaded from: classes3.dex */
public final class C10478n<K, V, T extends V> extends AbstractC10465a.a<K, V, T> implements ReadOnlyProperty<AbstractC10465a<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10478n(KClass<? extends K> kClass, int i2) {
        super(kClass, i2);
        C9801m.m32346f(kClass, RoomNotification.KEY);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public T mo6183a(AbstractC10465a<K, V> abstractC10465a, KProperty<?> kProperty) {
        C9801m.m32346f(abstractC10465a, "thisRef");
        C9801m.m32346f(kProperty, "property");
        return m37185c(abstractC10465a);
    }
}
