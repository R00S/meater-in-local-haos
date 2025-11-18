package kotlin.reflect;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: KProperty.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u000e\u000fR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000bR\u001a\u0010\f\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\u000b¨\u0006\u0010"}, m32267d2 = {"Lkotlin/reflect/KProperty;", "V", "Lkotlin/reflect/KCallable;", "getter", "Lkotlin/reflect/KProperty$Getter;", "getGetter", "()Lkotlin/reflect/KProperty$Getter;", "isConst", HttpUrl.FRAGMENT_ENCODE_SET, "isConst$annotations", "()V", "()Z", "isLateinit", "isLateinit$annotations", "Accessor", "Getter", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.l, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface KProperty<V> extends KCallable<V> {

    /* compiled from: KProperty.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlin/reflect/KProperty$Accessor;", "V", HttpUrl.FRAGMENT_ENCODE_SET, "property", "Lkotlin/reflect/KProperty;", "getProperty", "()Lkotlin/reflect/KProperty;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.l$a */
    public interface a<V> {
        /* renamed from: n */
        KProperty<V> mo32435n();
    }

    /* compiled from: KProperty.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003¨\u0006\u0004"}, m32267d2 = {"Lkotlin/reflect/KProperty$Getter;", "V", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.l$b */
    public interface b<V> extends a<V>, KFunction<V> {
    }

    b<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
