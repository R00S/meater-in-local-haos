package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: ObservableProperty.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J)\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u000eJ)\u0010\u000f\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011J$\u0010\u0012\u001a\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0096\u0002¢\u0006\u0002\u0010\u0014J,\u0010\u0015\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016R\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0017"}, m32267d2 = {"Lkotlin/properties/ObservableProperty;", "V", "Lkotlin/properties/ReadWriteProperty;", HttpUrl.FRAGMENT_ENCODE_SET, "initialValue", "(Ljava/lang/Object;)V", "value", "Ljava/lang/Object;", "afterChange", HttpUrl.FRAGMENT_ENCODE_SET, "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "beforeChange", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "getValue", "thisRef", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.c0.b, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {

    /* renamed from: a */
    private V f37192a;

    public ObservableProperty(V v) {
        this.f37192a = v;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    /* renamed from: a */
    public V mo6183a(Object obj, KProperty<?> kProperty) {
        C9801m.m32346f(kProperty, "property");
        return this.f37192a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    /* renamed from: b */
    public void mo32371b(Object obj, KProperty<?> kProperty, V v) {
        C9801m.m32346f(kProperty, "property");
        V v2 = this.f37192a;
        if (mo32373d(kProperty, v2, v)) {
            this.f37192a = v;
            m32372c(kProperty, v2, v);
        }
    }

    /* renamed from: c */
    protected void m32372c(KProperty<?> kProperty, V v, V v2) {
        C9801m.m32346f(kProperty, "property");
    }

    /* renamed from: d */
    protected boolean mo32373d(KProperty<?> kProperty, V v, V v2) {
        C9801m.m32346f(kProperty, "property");
        return true;
    }
}
