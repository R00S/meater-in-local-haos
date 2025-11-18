package com.squareup.moshi.p232x.reflect;

import cm.aptoide.p092pt.database.room.RoomNotification;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.AbstractC8725o;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.p231w.C8735c;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import okhttp3.HttpUrl;

/* compiled from: KotlinJsonAdapter.kt */
@Metadata(m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002 !BU\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0016R'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m32267d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "constructor", "Lkotlin/reflect/KFunction;", "allBindings", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", HttpUrl.FRAGMENT_ENCODE_SET, "nonIgnoredBindings", "options", "Lcom/squareup/moshi/JsonReader$Options;", "(Lkotlin/reflect/KFunction;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/JsonReader$Options;)V", "getAllBindings", "()Ljava/util/List;", "getConstructor", "()Lkotlin/reflect/KFunction;", "getNonIgnoredBindings", "getOptions", "()Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "toJson", HttpUrl.FRAGMENT_ENCODE_SET, "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Binding", "IndexedParameterMap", "reflect"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.squareup.moshi.x.a.a, reason: from Kotlin metadata and from toString */
/* loaded from: classes2.dex */
public final class KotlinJsonAdapter<T> extends AbstractC8716f<T> {

    /* renamed from: a */
    private final KFunction<T> f33236a;

    /* renamed from: b */
    private final List<Binding<T, Object>> f33237b;

    /* renamed from: c */
    private final List<Binding<T, Object>> f33238c;

    /* renamed from: d */
    private final AbstractC8719i.a f33239d;

    /* compiled from: KotlinJsonAdapter.kt */
    @Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\rHÆ\u0003J[\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\u0013\u0010\"\u001a\u00028\u00022\u0006\u0010#\u001a\u00028\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\rHÖ\u0001J\u001b\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00028\u00012\u0006\u0010#\u001a\u00028\u0002¢\u0006\u0002\u0010)J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, m32267d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "K", "P", HttpUrl.FRAGMENT_ENCODE_SET, "jsonName", HttpUrl.FRAGMENT_ENCODE_SET, "adapter", "Lcom/squareup/moshi/JsonAdapter;", "property", "Lkotlin/reflect/KProperty1;", MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Lkotlin/reflect/KParameter;", "propertyIndex", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KParameter;I)V", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "getJsonName", "()Ljava/lang/String;", "getParameter", "()Lkotlin/reflect/KParameter;", "getProperty", "()Lkotlin/reflect/KProperty1;", "getPropertyIndex", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "get", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "set", HttpUrl.FRAGMENT_ENCODE_SET, "result", "(Ljava/lang/Object;Ljava/lang/Object;)V", "toString", "reflect"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.squareup.moshi.x.a.a$a, reason: from toString */
    public static final /* data */ class Binding<K, P> {

        /* renamed from: a, reason: from toString */
        private final String jsonName;

        /* renamed from: b, reason: from toString */
        private final AbstractC8716f<P> adapter;

        /* renamed from: c, reason: from toString */
        private final KProperty1<K, P> property;

        /* renamed from: d, reason: from toString */
        private final KParameter parameter;

        /* renamed from: e, reason: from toString */
        private final int propertyIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public Binding(String str, AbstractC8716f<P> abstractC8716f, KProperty1<K, ? extends P> kProperty1, KParameter kParameter, int i2) {
            C9801m.m32346f(str, "jsonName");
            C9801m.m32346f(abstractC8716f, "adapter");
            C9801m.m32346f(kProperty1, "property");
            this.jsonName = str;
            this.adapter = abstractC8716f;
            this.property = kProperty1;
            this.parameter = kParameter;
            this.propertyIndex = i2;
        }

        /* renamed from: b */
        public static /* synthetic */ Binding m27877b(Binding binding, String str, AbstractC8716f abstractC8716f, KProperty1 kProperty1, KParameter kParameter, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = binding.jsonName;
            }
            if ((i3 & 2) != 0) {
                abstractC8716f = binding.adapter;
            }
            AbstractC8716f abstractC8716f2 = abstractC8716f;
            if ((i3 & 4) != 0) {
                kProperty1 = binding.property;
            }
            KProperty1 kProperty12 = kProperty1;
            if ((i3 & 8) != 0) {
                kParameter = binding.parameter;
            }
            KParameter kParameter2 = kParameter;
            if ((i3 & 16) != 0) {
                i2 = binding.propertyIndex;
            }
            return binding.m27878a(str, abstractC8716f2, kProperty12, kParameter2, i2);
        }

        /* renamed from: a */
        public final Binding<K, P> m27878a(String str, AbstractC8716f<P> abstractC8716f, KProperty1<K, ? extends P> kProperty1, KParameter kParameter, int i2) {
            C9801m.m32346f(str, "jsonName");
            C9801m.m32346f(abstractC8716f, "adapter");
            C9801m.m32346f(kProperty1, "property");
            return new Binding<>(str, abstractC8716f, kProperty1, kParameter, i2);
        }

        /* renamed from: c */
        public final P m27879c(K k2) {
            return this.property.get(k2);
        }

        /* renamed from: d */
        public final AbstractC8716f<P> m27880d() {
            return this.adapter;
        }

        /* renamed from: e, reason: from getter */
        public final String getJsonName() {
            return this.jsonName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Binding)) {
                return false;
            }
            Binding binding = (Binding) other;
            return C9801m.m32341a(this.jsonName, binding.jsonName) && C9801m.m32341a(this.adapter, binding.adapter) && C9801m.m32341a(this.property, binding.property) && C9801m.m32341a(this.parameter, binding.parameter) && this.propertyIndex == binding.propertyIndex;
        }

        /* renamed from: f */
        public final KProperty1<K, P> m27882f() {
            return this.property;
        }

        /* renamed from: g, reason: from getter */
        public final int getPropertyIndex() {
            return this.propertyIndex;
        }

        /* renamed from: h */
        public final void m27884h(K k2, P p) {
            if (p != C8738c.f33248b) {
                KProperty1<K, P> kProperty1 = this.property;
                C9801m.m32344d(kProperty1, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding, P of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding>");
                ((KMutableProperty1) kProperty1).mo32366s(k2, p);
            }
        }

        public int hashCode() {
            int iHashCode = ((((this.jsonName.hashCode() * 31) + this.adapter.hashCode()) * 31) + this.property.hashCode()) * 31;
            KParameter kParameter = this.parameter;
            return ((iHashCode + (kParameter == null ? 0 : kParameter.hashCode())) * 31) + this.propertyIndex;
        }

        public String toString() {
            return "Binding(jsonName=" + this.jsonName + ", adapter=" + this.adapter + ", property=" + this.property + ", parameter=" + this.parameter + ", propertyIndex=" + this.propertyIndex + ')';
        }
    }

    /* compiled from: KotlinJsonAdapter.kt */
    @Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016R(\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0015"}, m32267d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$IndexedParameterMap;", "Lkotlin/collections/AbstractMutableMap;", "Lkotlin/reflect/KParameter;", HttpUrl.FRAGMENT_ENCODE_SET, "parameterKeys", HttpUrl.FRAGMENT_ENCODE_SET, "parameterValues", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;[Ljava/lang/Object;)V", "entries", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getEntries", "()Ljava/util/Set;", "[Ljava/lang/Object;", "containsKey", HttpUrl.FRAGMENT_ENCODE_SET, RoomNotification.KEY, "get", "put", "value", "reflect"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.squareup.moshi.x.a.a$b */
    public static final class b extends AbstractMutableMap<KParameter, Object> {

        /* renamed from: f */
        private final List<KParameter> f33245f;

        /* renamed from: g */
        private final Object[] f33246g;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends KParameter> list, Object[] objArr) {
            C9801m.m32346f(list, "parameterKeys");
            C9801m.m32346f(objArr, "parameterValues");
            this.f33245f = list;
            this.f33246g = objArr;
        }

        @Override // kotlin.collections.AbstractMutableMap
        /* renamed from: a */
        public Set<Map.Entry<KParameter, Object>> mo27885a() {
            List<KParameter> list = this.f33245f;
            ArrayList arrayList = new ArrayList(C10819v.m38911u(list, 10));
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C10817u.m38898t();
                }
                arrayList.add(new AbstractMap.SimpleEntry((KParameter) t, this.f33246g[i2]));
                i2 = i3;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t2 : arrayList) {
                if (((AbstractMap.SimpleEntry) t2).getValue() != C8738c.f33248b) {
                    linkedHashSet.add(t2);
                }
            }
            return linkedHashSet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof KParameter) {
                return m27886e((KParameter) obj);
            }
            return false;
        }

        /* renamed from: e */
        public boolean m27886e(KParameter kParameter) {
            C9801m.m32346f(kParameter, RoomNotification.KEY);
            return this.f33246g[kParameter.mo32430g()] != C8738c.f33248b;
        }

        /* renamed from: f */
        public Object m27887f(KParameter kParameter) {
            C9801m.m32346f(kParameter, RoomNotification.KEY);
            Object obj = this.f33246g[kParameter.mo32430g()];
            if (obj != C8738c.f33248b) {
                return obj;
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof KParameter) {
                return m27887f((KParameter) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof KParameter) ? obj2 : m27888h((KParameter) obj, obj2);
        }

        /* renamed from: h */
        public /* bridge */ Object m27888h(KParameter kParameter, Object obj) {
            return super.getOrDefault(kParameter, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object put(KParameter kParameter, Object obj) {
            C9801m.m32346f(kParameter, RoomNotification.KEY);
            return null;
        }

        /* renamed from: j */
        public /* bridge */ Object m27890j(KParameter kParameter) {
            return super.remove(kParameter);
        }

        /* renamed from: k */
        public /* bridge */ boolean m27891k(KParameter kParameter, Object obj) {
            return super.remove(kParameter, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof KParameter) {
                return m27890j((KParameter) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof KParameter) {
                return m27891k((KParameter) obj, obj2);
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinJsonAdapter(KFunction<? extends T> kFunction, List<Binding<T, Object>> list, List<Binding<T, Object>> list2, AbstractC8719i.a aVar) {
        C9801m.m32346f(kFunction, "constructor");
        C9801m.m32346f(list, "allBindings");
        C9801m.m32346f(list2, "nonIgnoredBindings");
        C9801m.m32346f(aVar, "options");
        this.f33236a = kFunction;
        this.f33237b = list;
        this.f33238c = list2;
        this.f33239d = aVar;
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public T fromJson(AbstractC8719i abstractC8719i) throws IOException {
        C9801m.m32346f(abstractC8719i, "reader");
        int size = this.f33236a.getParameters().size();
        int size2 = this.f33237b.size();
        Object[] objArr = new Object[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            objArr[i2] = C8738c.f33248b;
        }
        abstractC8719i.mo27711b();
        while (abstractC8719i.mo27715f()) {
            int iMo27702H = abstractC8719i.mo27702H(this.f33239d);
            if (iMo27702H == -1) {
                abstractC8719i.mo27706N();
                abstractC8719i.mo27707Q();
            } else {
                Binding<T, Object> binding = this.f33238c.get(iMo27702H);
                int propertyIndex = binding.getPropertyIndex();
                if (objArr[propertyIndex] != C8738c.f33248b) {
                    throw new JsonDataException("Multiple values for '" + binding.m27882f().getF40571m() + "' at " + abstractC8719i.m27716g());
                }
                objArr[propertyIndex] = binding.m27880d().fromJson(abstractC8719i);
                if (objArr[propertyIndex] == null && !binding.m27882f().getReturnType().mo32438e()) {
                    JsonDataException jsonDataExceptionM27876v = C8735c.m27876v(binding.m27882f().getF40571m(), binding.getJsonName(), abstractC8719i);
                    C9801m.m32345e(jsonDataExceptionM27876v, "unexpectedNull(\n        …         reader\n        )");
                    throw jsonDataExceptionM27876v;
                }
            }
        }
        abstractC8719i.mo27713d();
        boolean z = this.f33237b.size() == size;
        for (int i3 = 0; i3 < size; i3++) {
            if (objArr[i3] == C8738c.f33248b) {
                if (this.f33236a.getParameters().get(i3).mo32433k()) {
                    z = false;
                } else {
                    if (!this.f33236a.getParameters().get(i3).getType().mo32438e()) {
                        String name = this.f33236a.getParameters().get(i3).getName();
                        Binding<T, Object> binding2 = this.f33237b.get(i3);
                        JsonDataException jsonDataExceptionM27868n = C8735c.m27868n(name, binding2 != null ? binding2.getJsonName() : null, abstractC8719i);
                        C9801m.m32345e(jsonDataExceptionM27868n, "missingProperty(\n       …       reader\n          )");
                        throw jsonDataExceptionM27868n;
                    }
                    objArr[i3] = null;
                }
            }
        }
        T tCall = z ? this.f33236a.call(Arrays.copyOf(objArr, size2)) : this.f33236a.callBy(new b(this.f33236a.getParameters(), objArr));
        int size3 = this.f33237b.size();
        while (size < size3) {
            Binding binding3 = this.f33237b.get(size);
            C9801m.m32343c(binding3);
            binding3.m27884h(tCall, objArr[size]);
            size++;
        }
        return tCall;
    }

    @Override // com.squareup.moshi.AbstractC8716f
    public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException {
        C9801m.m32346f(abstractC8725o, "writer");
        if (t == null) {
            throw new NullPointerException("value == null");
        }
        abstractC8725o.mo27757b();
        for (Binding<T, Object> binding : this.f33237b) {
            if (binding != null) {
                abstractC8725o.mo27760l(binding.getJsonName());
                binding.m27880d().toJson(abstractC8725o, (AbstractC8725o) binding.m27879c(t));
            }
        }
        abstractC8725o.mo27759e();
    }

    public String toString() {
        return "KotlinJsonAdapter(" + this.f33236a.getReturnType() + ')';
    }
}
