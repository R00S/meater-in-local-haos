package kotlin.reflect;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KMutableProperty;
import okhttp3.HttpUrl;

/* compiled from: KProperty.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\fJ\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bR\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m32267d2 = {"Lkotlin/reflect/KMutableProperty0;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/KMutableProperty;", "setter", "Lkotlin/reflect/KMutableProperty0$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty0$Setter;", "set", HttpUrl.FRAGMENT_ENCODE_SET, "value", "(Ljava/lang/Object;)V", "Setter", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.i, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface KMutableProperty0<V> extends KProperty0<V>, KMutableProperty<V> {

    /* compiled from: KProperty.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m32267d2 = {"Lkotlin/reflect/KMutableProperty0$Setter;", "V", "Lkotlin/reflect/KMutableProperty$Setter;", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.i$a */
    public interface a<V> extends KMutableProperty.a<V>, Function1<V, C10775u> {
    }

    @Override // kotlin.reflect.KMutableProperty
    a<V> getSetter();
}
