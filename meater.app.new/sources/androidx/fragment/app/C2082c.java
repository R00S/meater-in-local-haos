package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: BackStackState.java */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2082c implements Parcelable {
    public static final Parcelable.Creator<C2082c> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    final List<String> f25613B;

    /* renamed from: C, reason: collision with root package name */
    final List<C2081b> f25614C;

    /* compiled from: BackStackState.java */
    /* renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator<C2082c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2082c createFromParcel(Parcel parcel) {
            return new C2082c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2082c[] newArray(int i10) {
            return new C2082c[i10];
        }
    }

    C2082c(List<String> list, List<C2081b> list2) {
        this.f25613B = list;
        this.f25614C = list2;
    }

    List<C2080a> a(v vVar, Map<String, Fragment> map) {
        HashMap map2 = new HashMap(this.f25613B.size());
        for (String str : this.f25613B) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                map2.put(fragment.f25458G, fragment);
            } else {
                Bundle bundleB = vVar.B0().B(str, null);
                if (bundleB != null) {
                    ClassLoader classLoader = vVar.D0().getContext().getClassLoader();
                    Fragment fragmentA = ((z) bundleB.getParcelable("state")).a(vVar.A0(), classLoader);
                    fragmentA.f25451C = bundleB;
                    if (bundleB.getBundle("savedInstanceState") == null) {
                        fragmentA.f25451C.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleB.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentA.k2(bundle);
                    map2.put(fragmentA.f25458G, fragmentA);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C2081b> it = this.f25614C.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c(vVar, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f25613B);
        parcel.writeTypedList(this.f25614C);
    }

    C2082c(Parcel parcel) {
        this.f25613B = parcel.createStringArrayList();
        this.f25614C = parcel.createTypedArrayList(C2081b.CREATOR);
    }
}
