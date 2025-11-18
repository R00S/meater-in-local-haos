package kotlin.reflect.p371y.internal.p374j0.p422m;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.Iterator;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;

/* compiled from: ArrayMapOwner.kt */
/* renamed from: kotlin.f0.y.e.j0.m.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10465a<K, V> implements Iterable<V>, KMappedMarker {

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.a$a */
    public static abstract class a<K, V, T extends V> {

        /* renamed from: a */
        private final KClass<? extends K> f40398a;

        /* renamed from: b */
        private final int f40399b;

        public a(KClass<? extends K> kClass, int i2) {
            C9801m.m32346f(kClass, RoomNotification.KEY);
            this.f40398a = kClass;
            this.f40399b = i2;
        }

        /* renamed from: c */
        protected final T m37185c(AbstractC10465a<K, V> abstractC10465a) {
            C9801m.m32346f(abstractC10465a, "thisRef");
            return abstractC10465a.mo37184c().get(this.f40399b);
        }
    }

    /* renamed from: c */
    protected abstract AbstractC10467c<V> mo37184c();

    /* renamed from: f */
    protected abstract AbstractC10483s<K, V> mo36568f();

    public final boolean isEmpty() {
        return mo37184c().mo37188c() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return mo37184c().iterator();
    }
}
