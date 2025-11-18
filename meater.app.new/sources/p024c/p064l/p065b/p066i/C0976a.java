package p024c.p064l.p065b.p066i;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import p024c.p064l.p065b.p066i.AbstractC0979d;

/* compiled from: Preferences.kt */
/* renamed from: c.l.b.i.a */
/* loaded from: classes.dex */
public final class C0976a extends AbstractC0979d {

    /* renamed from: a */
    private final Map<AbstractC0979d.a<?>, Object> f6482a;

    /* renamed from: b */
    private final AtomicBoolean f6483b;

    /* compiled from: Preferences.kt */
    /* renamed from: c.l.b.i.a$a */
    static final class a extends Lambda implements Function1<Map.Entry<AbstractC0979d.a<?>, Object>, CharSequence> {

        /* renamed from: f */
        public static final a f6484f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<AbstractC0979d.a<?>, Object> entry) {
            C9801m.m32346f(entry, "entry");
            return "  " + entry.getKey().m6251a() + " = " + entry.getValue();
        }
    }

    public C0976a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ C0976a(Map map, boolean z, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? new LinkedHashMap() : map, (i2 & 2) != 0 ? true : z);
    }

    @Override // p024c.p064l.p065b.p066i.AbstractC0979d
    /* renamed from: a */
    public Map<AbstractC0979d.a<?>, Object> mo6237a() {
        Map<AbstractC0979d.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.f6482a);
        C9801m.m32345e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // p024c.p064l.p065b.p066i.AbstractC0979d
    /* renamed from: b */
    public <T> T mo6238b(AbstractC0979d.a<T> aVar) {
        C9801m.m32346f(aVar, RoomNotification.KEY);
        return (T) this.f6482a.get(aVar);
    }

    /* renamed from: e */
    public final void m6239e() {
        if (!(!this.f6483b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0976a) {
            return C9801m.m32341a(this.f6482a, ((C0976a) obj).f6482a);
        }
        return false;
    }

    /* renamed from: f */
    public final void m6240f() {
        this.f6483b.set(true);
    }

    /* renamed from: g */
    public final void m6241g(AbstractC0979d.b<?>... bVarArr) {
        C9801m.m32346f(bVarArr, "pairs");
        m6239e();
        for (AbstractC0979d.b<?> bVar : bVarArr) {
            m6244j(bVar.m6252a(), bVar.m6253b());
        }
    }

    /* renamed from: h */
    public final <T> T m6242h(AbstractC0979d.a<T> aVar) {
        C9801m.m32346f(aVar, RoomNotification.KEY);
        m6239e();
        return (T) this.f6482a.remove(aVar);
    }

    public int hashCode() {
        return this.f6482a.hashCode();
    }

    /* renamed from: i */
    public final <T> void m6243i(AbstractC0979d.a<T> aVar, T t) {
        C9801m.m32346f(aVar, RoomNotification.KEY);
        m6244j(aVar, t);
    }

    /* renamed from: j */
    public final void m6244j(AbstractC0979d.a<?> aVar, Object obj) {
        C9801m.m32346f(aVar, RoomNotification.KEY);
        m6239e();
        if (obj == null) {
            m6242h(aVar);
            return;
        }
        if (!(obj instanceof Set)) {
            this.f6482a.put(aVar, obj);
            return;
        }
        Map<AbstractC0979d.a<?>, Object> map = this.f6482a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(C10782c0.m38574I0((Iterable) obj));
        C9801m.m32345e(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(aVar, setUnmodifiableSet);
    }

    public String toString() {
        return C10782c0.m38599e0(this.f6482a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f6484f, 24, null);
    }

    public C0976a(Map<AbstractC0979d.a<?>, Object> map, boolean z) {
        C9801m.m32346f(map, "preferencesMap");
        this.f6482a = map;
        this.f6483b = new AtomicBoolean(z);
    }
}
