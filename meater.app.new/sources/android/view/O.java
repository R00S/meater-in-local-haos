package android.view;

import ac.t;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import n1.d;
import oa.v;
import t3.C4547d;

/* compiled from: SavedStateHandle.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0002\u0015\u0018B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u000eR\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R(\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 ¨\u0006\""}, d2 = {"Landroidx/lifecycle/O;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Lt3/d$c;", "g", "()Lt3/d$c;", "T", "key", "e", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "Loa/F;", "i", "(Ljava/lang/String;Ljava/lang/Object;)V", "f", "", "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "Landroidx/lifecycle/O$b;", "c", "liveDatas", "Lac/t;", "d", "flows", "Lt3/d$c;", "savedStateProvider", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Class<? extends Object>[] f25892g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> regular;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, C4547d.c> savedStateProviders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b<?>> liveDatas;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, t<Object>> flows;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C4547d.c savedStateProvider;

    /* compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/O$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/O;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/O;", "value", "", "b", "(Ljava/lang/Object;)Z", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.O$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final O a(Bundle restoredState, Bundle defaultState) {
            if (restoredState == null) {
                if (defaultState == null) {
                    return new O();
                }
                HashMap map = new HashMap();
                for (String key : defaultState.keySet()) {
                    C3862t.f(key, "key");
                    map.put(key, defaultState.get(key));
                }
                return new O(map);
            }
            ClassLoader classLoader = O.class.getClassLoader();
            C3862t.d(classLoader);
            restoredState.setClassLoader(classLoader);
            ArrayList parcelableArrayList = restoredState.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = restoredState.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                C3862t.e(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new O(linkedHashMap);
        }

        public final boolean b(Object value) {
            if (value == null) {
                return true;
            }
            for (Class cls : O.f25892g) {
                C3862t.d(cls);
                if (cls.isInstance(value)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/O$b;", "T", "Landroidx/lifecycle/D;", "value", "Loa/F;", "o", "(Ljava/lang/Object;)V", "p", "()V", "", "l", "Ljava/lang/String;", "key", "Landroidx/lifecycle/O;", "m", "Landroidx/lifecycle/O;", "handle", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> extends D<T> {

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private String key;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private O handle;

        @Override // android.view.D, android.view.B
        public void o(T value) {
            O o10 = this.handle;
            if (o10 != null) {
                o10.regular.put(this.key, value);
                t tVar = (t) o10.flows.get(this.key);
                if (tVar != null) {
                    tVar.setValue(value);
                }
            }
            super.o(value);
        }

        public final void p() {
            this.handle = null;
        }
    }

    public O(Map<String, ? extends Object> initialState) {
        C3862t.g(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C4547d.c() { // from class: androidx.lifecycle.N
            @Override // t3.C4547d.c
            public final Bundle a() {
                return O.h(this.f25890a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle h(O this$0) {
        C3862t.g(this$0, "this$0");
        for (Map.Entry entry : M.r(this$0.savedStateProviders).entrySet()) {
            this$0.i((String) entry.getKey(), ((C4547d.c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return d.a(v.a("keys", arrayList), v.a("values", arrayList2));
    }

    public final <T> T e(String key) {
        C3862t.g(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            f(key);
            return null;
        }
    }

    public final <T> T f(String key) {
        C3862t.g(key, "key");
        T t10 = (T) this.regular.remove(key);
        b<?> bVarRemove = this.liveDatas.remove(key);
        if (bVarRemove != null) {
            bVarRemove.p();
        }
        this.flows.remove(key);
        return t10;
    }

    /* renamed from: g, reason: from getter */
    public final C4547d.c getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> void i(String key, T value) {
        C3862t.g(key, "key");
        if (!INSTANCE.b(value)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            C3862t.d(value);
            sb2.append(value.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        b<?> bVar = this.liveDatas.get(key);
        b<?> bVar2 = bVar instanceof D ? bVar : null;
        if (bVar2 != null) {
            bVar2.o(value);
        } else {
            this.regular.put(key, value);
        }
        t<Object> tVar = this.flows.get(key);
        if (tVar == null) {
            return;
        }
        tVar.setValue(value);
    }

    public O() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C4547d.c() { // from class: androidx.lifecycle.N
            @Override // t3.C4547d.c
            public final Bundle a() {
                return O.h(this.f25890a);
            }
        };
    }
}
