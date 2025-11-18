package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: SavedStateHandle.java */
/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public final class C0525u {

    /* renamed from: a */
    private static final Class[] f3495a;

    /* renamed from: b */
    final Map<String, Object> f3496b;

    /* renamed from: c */
    final Map<String, SavedStateRegistry.InterfaceC0671b> f3497c;

    /* renamed from: d */
    private final Map<String, ?> f3498d;

    /* renamed from: e */
    private final SavedStateRegistry.InterfaceC0671b f3499e;

    /* compiled from: SavedStateHandle.java */
    /* renamed from: androidx.lifecycle.u$a */
    class a implements SavedStateRegistry.InterfaceC0671b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0671b
        /* renamed from: a */
        public Bundle mo3613a() {
            for (Map.Entry entry : new HashMap(C0525u.this.f3497c).entrySet()) {
                C0525u.this.m3901c((String) entry.getKey(), ((SavedStateRegistry.InterfaceC0671b) entry.getValue()).mo3613a());
            }
            Set<String> setKeySet = C0525u.this.f3496b.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(setKeySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : setKeySet) {
                arrayList.add(str);
                arrayList2.add(C0525u.this.f3496b.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i2 = Build.VERSION.SDK_INT;
        clsArr[27] = i2 >= 21 ? Size.class : cls;
        if (i2 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f3495a = clsArr;
    }

    public C0525u(Map<String, Object> map) {
        this.f3497c = new HashMap();
        this.f3498d = new HashMap();
        this.f3499e = new a();
        this.f3496b = new HashMap(map);
    }

    /* renamed from: a */
    static C0525u m3898a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C0525u();
        }
        HashMap map = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                map.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C0525u(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
            map.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
        }
        return new C0525u(map);
    }

    /* renamed from: d */
    private static void m3899d(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : f3495a) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    /* renamed from: b */
    SavedStateRegistry.InterfaceC0671b m3900b() {
        return this.f3499e;
    }

    /* renamed from: c */
    public <T> void m3901c(String str, T t) {
        m3899d(t);
        C0521q c0521q = (C0521q) this.f3498d.get(str);
        if (c0521q != null) {
            c0521q.mo3822n(t);
        } else {
            this.f3496b.put(str, t);
        }
    }

    public C0525u() {
        this.f3497c = new HashMap();
        this.f3498d = new HashMap();
        this.f3499e = new a();
        this.f3496b = new HashMap();
    }
}
