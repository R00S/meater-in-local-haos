package Y;

import Y.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.r;

/* compiled from: SaveableStateRegistry.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R(\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR.\u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00120\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001e"}, d2 = {"LY/h;", "LY/g;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;LBa/l;)V", "value", "a", "(Ljava/lang/Object;)Z", "key", "c", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "LY/g$a;", "d", "(Ljava/lang/String;LBa/a;)LY/g$a;", "b", "()Ljava/util/Map;", "LBa/l;", "", "Ljava/util/Map;", "", "valueProviders", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Object, Boolean> canBeSaved;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<Object>> restored;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<Ba.a<Object>>> valueProviders;

    /* compiled from: SaveableStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Y/h$a", "LY/g$a;", "Loa/F;", "a", "()V", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements g.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19177b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ba.a<Object> f19178c;

        a(String str, Ba.a<? extends Object> aVar) {
            this.f19177b = str;
            this.f19178c = aVar;
        }

        @Override // Y.g.a
        public void a() {
            List list = (List) h.this.valueProviders.remove(this.f19177b);
            if (list != null) {
                list.remove(this.f19178c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            h.this.valueProviders.put(this.f19177b, list);
        }
    }

    public h(Map<String, ? extends List<? extends Object>> map, Ba.l<Object, Boolean> lVar) {
        Map<String, List<Object>> mapT;
        this.canBeSaved = lVar;
        this.restored = (map == null || (mapT = M.t(map)) == null) ? new LinkedHashMap<>() : mapT;
        this.valueProviders = new LinkedHashMap();
    }

    @Override // Y.g
    public boolean a(Object value) {
        return this.canBeSaved.invoke(value).booleanValue();
    }

    @Override // Y.g
    public Map<String, List<Object>> b() {
        Map<String, List<Object>> mapT = M.t(this.restored);
        for (Map.Entry<String, List<Ba.a<Object>>> entry : this.valueProviders.entrySet()) {
            String key = entry.getKey();
            List<Ba.a<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object objInvoke = value.get(0).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException(b.b(objInvoke).toString());
                    }
                    mapT.put(key, r.g(objInvoke));
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objInvoke2 = value.get(i10).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException(b.b(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mapT.put(key, arrayList);
            }
        }
        return mapT;
    }

    @Override // Y.g
    public Object c(String key) {
        List<Object> listRemove = this.restored.remove(key);
        if (listRemove == null || listRemove.isEmpty()) {
            return null;
        }
        if (listRemove.size() > 1) {
            this.restored.put(key, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }

    @Override // Y.g
    public g.a d(String key, Ba.a<? extends Object> valueProvider) {
        if (i.c(key)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map<String, List<Ba.a<Object>>> map = this.valueProviders;
        List<Ba.a<Object>> arrayList = map.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(key, arrayList);
        }
        arrayList.add(valueProvider);
        return new a(key, valueProvider);
    }
}
