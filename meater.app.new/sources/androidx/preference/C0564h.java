package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0311u;
import androidx.preference.C0566j;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.C0625f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024c.p025a.p026k.p027a.C0833a;

/* compiled from: PreferenceGroupAdapter.java */
/* renamed from: androidx.preference.h */
/* loaded from: classes.dex */
public class C0564h extends RecyclerView.AbstractC0594g<C0568l> implements Preference.InterfaceC0542b, PreferenceGroup.InterfaceC0550c {

    /* renamed from: f */
    private PreferenceGroup f3679f;

    /* renamed from: g */
    private List<Preference> f3680g;

    /* renamed from: h */
    private List<Preference> f3681h;

    /* renamed from: i */
    private List<d> f3682i;

    /* renamed from: k */
    private Runnable f3684k = new a();

    /* renamed from: j */
    private Handler f3683j = new Handler();

    /* compiled from: PreferenceGroupAdapter.java */
    /* renamed from: androidx.preference.h$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0564h.this.m4129n();
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    /* renamed from: androidx.preference.h$b */
    class b extends C0625f.b {

        /* renamed from: a */
        final /* synthetic */ List f3686a;

        /* renamed from: b */
        final /* synthetic */ List f3687b;

        b(List list, List list2, C0566j.d dVar) {
            this.f3686a = list;
            this.f3687b = list2;
        }

        @Override // androidx.recyclerview.widget.C0625f.b
        public boolean areContentsTheSame(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.C0625f.b
        public boolean areItemsTheSame(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.C0625f.b
        public int getNewListSize() {
            return this.f3687b.size();
        }

        @Override // androidx.recyclerview.widget.C0625f.b
        public int getOldListSize() {
            return this.f3686a.size();
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    /* renamed from: androidx.preference.h$c */
    class c implements Preference.InterfaceC0544d {

        /* renamed from: a */
        final /* synthetic */ PreferenceGroup f3689a;

        c(PreferenceGroup preferenceGroup) {
            this.f3689a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.InterfaceC0544d
        public boolean onPreferenceClick(Preference preference) {
            this.f3689a.m4065k1(Integer.MAX_VALUE);
            C0564h.this.mo4050a(preference);
            PreferenceGroup.InterfaceC0549b interfaceC0549bM4059d1 = this.f3689a.m4059d1();
            if (interfaceC0549bM4059d1 == null) {
                return true;
            }
            interfaceC0549bM4059d1.m4070a();
            return true;
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    /* renamed from: androidx.preference.h$d */
    private static class d {

        /* renamed from: a */
        int f3691a;

        /* renamed from: b */
        int f3692b;

        /* renamed from: c */
        String f3693c;

        d(Preference preference) {
            this.f3693c = preference.getClass().getName();
            this.f3691a = preference.m3999K();
            this.f3692b = preference.m4021X();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f3691a == dVar.f3691a && this.f3692b == dVar.f3692b && TextUtils.equals(this.f3693c, dVar.f3693c);
        }

        public int hashCode() {
            return ((((527 + this.f3691a) * 31) + this.f3692b) * 31) + this.f3693c.hashCode();
        }
    }

    public C0564h(PreferenceGroup preferenceGroup) {
        this.f3679f = preferenceGroup;
        this.f3679f.m4004M0(this);
        this.f3680g = new ArrayList();
        this.f3681h = new ArrayList();
        this.f3682i = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f3679f;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup2).m4073n1());
        } else {
            setHasStableIds(true);
        }
        m4129n();
    }

    /* renamed from: g */
    private C0558b m4122g(PreferenceGroup preferenceGroup, List<Preference> list) {
        C0558b c0558b = new C0558b(preferenceGroup.m3987D(), list, preferenceGroup.mo3994H());
        c0558b.m4006N0(new c(preferenceGroup));
        return c0558b;
    }

    /* renamed from: h */
    private List<Preference> m4123h(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iM4061f1 = preferenceGroup.m4061f1();
        int i2 = 0;
        for (int i3 = 0; i3 < iM4061f1; i3++) {
            Preference preferenceM4060e1 = preferenceGroup.m4060e1(i3);
            if (preferenceM4060e1.m4027d0()) {
                if (!m4125k(preferenceGroup) || i2 < preferenceGroup.m4058c1()) {
                    arrayList.add(preferenceM4060e1);
                } else {
                    arrayList2.add(preferenceM4060e1);
                }
                if (preferenceM4060e1 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM4060e1;
                    if (!preferenceGroup2.mo4062g1()) {
                        continue;
                    } else {
                        if (m4125k(preferenceGroup) && m4125k(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : m4123h(preferenceGroup2)) {
                            if (!m4125k(preferenceGroup) || i2 < preferenceGroup.m4058c1()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        if (m4125k(preferenceGroup) && i2 > preferenceGroup.m4058c1()) {
            arrayList.add(m4122g(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    /* renamed from: i */
    private void m4124i(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.m4067m1();
        int iM4061f1 = preferenceGroup.m4061f1();
        for (int i2 = 0; i2 < iM4061f1; i2++) {
            Preference preferenceM4060e1 = preferenceGroup.m4060e1(i2);
            list.add(preferenceM4060e1);
            d dVar = new d(preferenceM4060e1);
            if (!this.f3682i.contains(dVar)) {
                this.f3682i.add(dVar);
            }
            if (preferenceM4060e1 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceM4060e1;
                if (preferenceGroup2.mo4062g1()) {
                    m4124i(list, preferenceGroup2);
                }
            }
            preferenceM4060e1.m4004M0(this);
        }
    }

    /* renamed from: k */
    private boolean m4125k(PreferenceGroup preferenceGroup) {
        return preferenceGroup.m4058c1() != Integer.MAX_VALUE;
    }

    @Override // androidx.preference.Preference.InterfaceC0542b
    /* renamed from: a */
    public void mo4050a(Preference preference) {
        this.f3683j.removeCallbacks(this.f3684k);
        this.f3683j.post(this.f3684k);
    }

    @Override // androidx.preference.Preference.InterfaceC0542b
    /* renamed from: b */
    public void mo4051b(Preference preference) {
        mo4050a(preference);
    }

    @Override // androidx.preference.PreferenceGroup.InterfaceC0550c
    /* renamed from: c */
    public int mo4071c(Preference preference) {
        int size = this.f3681h.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference2 = this.f3681h.get(i2);
            if (preference2 != null && preference2.equals(preference)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.InterfaceC0542b
    /* renamed from: e */
    public void mo4052e(Preference preference) {
        int iIndexOf = this.f3681h.indexOf(preference);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, preference);
        }
    }

    @Override // androidx.preference.PreferenceGroup.InterfaceC0550c
    /* renamed from: f */
    public int mo4072f(String str) {
        int size = this.f3681h.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(str, this.f3681h.get(i2).m3997J())) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.f3681h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public long getItemId(int i2) {
        if (hasStableIds()) {
            return m4126j(i2).mo3994H();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        d dVar = new d(m4126j(i2));
        int iIndexOf = this.f3682i.indexOf(dVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.f3682i.size();
        this.f3682i.add(dVar);
        return size;
    }

    /* renamed from: j */
    public Preference m4126j(int i2) {
        if (i2 < 0 || i2 >= getItemCount()) {
            return null;
        }
        return this.f3681h.get(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0568l c0568l, int i2) {
        m4126j(i2).mo3931k0(c0568l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0568l onCreateViewHolder(ViewGroup viewGroup, int i2) {
        d dVar = this.f3682i.get(i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C0576t.f3880p);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C0576t.f3883q);
        if (drawable == null) {
            drawable = C0833a.m5262d(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(dVar.f3691a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            C0311u.m2139m0(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = dVar.f3692b;
            if (i3 != 0) {
                layoutInflaterFrom.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C0568l(viewInflate);
    }

    /* renamed from: n */
    void m4129n() {
        Iterator<Preference> it = this.f3680g.iterator();
        while (it.hasNext()) {
            it.next().m4004M0(null);
        }
        ArrayList arrayList = new ArrayList(this.f3680g.size());
        this.f3680g = arrayList;
        m4124i(arrayList, this.f3679f);
        List<Preference> list = this.f3681h;
        List<Preference> listM4123h = m4123h(this.f3679f);
        this.f3681h = listM4123h;
        C0566j c0566jM4014S = this.f3679f.m4014S();
        if (c0566jM4014S == null || c0566jM4014S.m4148g() == null) {
            notifyDataSetChanged();
        } else {
            C0625f.m4469a(new b(list, listM4123h, c0566jM4014S.m4148g())).m4482e(this);
        }
        Iterator<Preference> it2 = this.f3680g.iterator();
        while (it2.hasNext()) {
            it2.next().m4038q();
        }
    }
}
