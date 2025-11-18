package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.view.menu.InterfaceC0094n;
import java.util.ArrayList;
import p024c.p025a.C0829g;

/* compiled from: ListMenuPresenter.java */
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0085e implements InterfaceC0093m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    Context f558f;

    /* renamed from: g */
    LayoutInflater f559g;

    /* renamed from: h */
    C0087g f560h;

    /* renamed from: i */
    ExpandedMenuView f561i;

    /* renamed from: j */
    int f562j;

    /* renamed from: k */
    int f563k;

    /* renamed from: l */
    int f564l;

    /* renamed from: m */
    private InterfaceC0093m.a f565m;

    /* renamed from: n */
    a f566n;

    /* renamed from: o */
    private int f567o;

    /* compiled from: ListMenuPresenter.java */
    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class a extends BaseAdapter {

        /* renamed from: f */
        private int f568f = -1;

        public a() {
            m540a();
        }

        /* renamed from: a */
        void m540a() {
            C0089i c0089iM603x = C0085e.this.f560h.m603x();
            if (c0089iM603x != null) {
                ArrayList<C0089i> arrayListM557B = C0085e.this.f560h.m557B();
                int size = arrayListM557B.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayListM557B.get(i2) == c0089iM603x) {
                        this.f568f = i2;
                        return;
                    }
                }
            }
            this.f568f = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0089i getItem(int i2) {
            ArrayList<C0089i> arrayListM557B = C0085e.this.f560h.m557B();
            int i3 = i2 + C0085e.this.f562j;
            int i4 = this.f568f;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayListM557B.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0085e.this.f560h.m557B().size() - C0085e.this.f562j;
            return this.f568f < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0085e c0085e = C0085e.this;
                view = c0085e.f559g.inflate(c0085e.f564l, viewGroup, false);
            }
            ((InterfaceC0094n.a) view).mo472e(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m540a();
            super.notifyDataSetChanged();
        }
    }

    public C0085e(Context context, int i2) {
        this(i2, 0);
        this.f558f = context;
        this.f559g = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m536a() {
        if (this.f566n == null) {
            this.f566n = new a();
        }
        return this.f566n;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: b */
    public void mo492b(C0087g c0087g, boolean z) {
        InterfaceC0093m.a aVar = this.f565m;
        if (aVar != null) {
            aVar.mo366b(c0087g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: c */
    public void mo493c(boolean z) {
        a aVar = this.f566n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: d */
    public boolean mo520d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: e */
    public boolean mo494e(C0087g c0087g, C0089i c0089i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: f */
    public boolean mo495f(C0087g c0087g, C0089i c0089i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: g */
    public void mo496g(InterfaceC0093m.a aVar) {
        this.f565m = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    public int getId() {
        return this.f567o;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: h */
    public void mo497h(Context context, C0087g c0087g) {
        if (this.f563k != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f563k);
            this.f558f = contextThemeWrapper;
            this.f559g = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f558f != null) {
            this.f558f = context;
            if (this.f559g == null) {
                this.f559g = LayoutInflater.from(context);
            }
        }
        this.f560h = c0087g;
        a aVar = this.f566n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: i */
    public void mo521i(Parcelable parcelable) {
        m538m((Bundle) parcelable);
    }

    /* renamed from: j */
    public InterfaceC0094n m537j(ViewGroup viewGroup) {
        if (this.f561i == null) {
            this.f561i = (ExpandedMenuView) this.f559g.inflate(C0829g.f5168g, viewGroup, false);
            if (this.f566n == null) {
                this.f566n = new a();
            }
            this.f561i.setAdapter((ListAdapter) this.f566n);
            this.f561i.setOnItemClickListener(this);
        }
        return this.f561i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: k */
    public boolean mo499k(SubMenuC0098r subMenuC0098r) {
        if (!subMenuC0098r.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0088h(subMenuC0098r).m607d(null);
        InterfaceC0093m.a aVar = this.f565m;
        if (aVar == null) {
            return true;
        }
        aVar.mo367c(subMenuC0098r);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: l */
    public Parcelable mo523l() {
        if (this.f561i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m539n(bundle);
        return bundle;
    }

    /* renamed from: m */
    public void m538m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f561i.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: n */
    public void m539n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f561i;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f560h.m569O(this.f566n.getItem(i2), this, 0);
    }

    public C0085e(int i2, int i3) {
        this.f564l = i2;
        this.f563k = i3;
    }
}
