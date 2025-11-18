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
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: B, reason: collision with root package name */
    Context f20995B;

    /* renamed from: C, reason: collision with root package name */
    LayoutInflater f20996C;

    /* renamed from: D, reason: collision with root package name */
    e f20997D;

    /* renamed from: E, reason: collision with root package name */
    ExpandedMenuView f20998E;

    /* renamed from: F, reason: collision with root package name */
    int f20999F;

    /* renamed from: G, reason: collision with root package name */
    int f21000G;

    /* renamed from: H, reason: collision with root package name */
    int f21001H;

    /* renamed from: I, reason: collision with root package name */
    private j.a f21002I;

    /* renamed from: J, reason: collision with root package name */
    a f21003J;

    /* renamed from: K, reason: collision with root package name */
    private int f21004K;

    /* compiled from: ListMenuPresenter.java */
    private class a extends BaseAdapter {

        /* renamed from: B, reason: collision with root package name */
        private int f21005B = -1;

        public a() {
            a();
        }

        void a() {
            g gVarX = c.this.f20997D.x();
            if (gVarX != null) {
                ArrayList<g> arrayListB = c.this.f20997D.B();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayListB.get(i10) == gVarX) {
                        this.f21005B = i10;
                        return;
                    }
                }
            }
            this.f21005B = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList<g> arrayListB = c.this.f20997D.B();
            int i11 = i10 + c.this.f20999F;
            int i12 = this.f21005B;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayListB.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f20997D.B().size() - c.this.f20999F;
            return this.f21005B < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f20996C.inflate(cVar.f21001H, viewGroup, false);
            }
            ((k.a) view).e(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f20995B = context;
        this.f20996C = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f21003J == null) {
            this.f21003J = new a();
        }
        return this.f21003J;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f20998E == null) {
            this.f20998E = (ExpandedMenuView) this.f20996C.inflate(i.g.f42532g, viewGroup, false);
            if (this.f21003J == null) {
                this.f21003J = new a();
            }
            this.f20998E.setAdapter((ListAdapter) this.f21003J);
            this.f20998E.setOnItemClickListener(this);
        }
        return this.f20998E;
    }

    @Override // androidx.appcompat.view.menu.j
    public int c() {
        return this.f21004K;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(e eVar, boolean z10) {
        j.a aVar = this.f21002I;
        if (aVar != null) {
            aVar.d(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z10) {
        a aVar = this.f21003J;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(j.a aVar) {
        this.f21002I = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void j(Context context, e eVar) {
        if (this.f21000G != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f21000G);
            this.f20995B = contextThemeWrapper;
            this.f20996C = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f20995B != null) {
            this.f20995B = context;
            if (this.f20996C == null) {
                this.f20996C = LayoutInflater.from(context);
            }
        }
        this.f20997D = eVar;
        a aVar = this.f21003J;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Parcelable parcelable) {
        l((Bundle) parcelable);
    }

    public void l(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f20998E.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean m(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).b(null);
        j.a aVar = this.f21002I;
        if (aVar == null) {
            return true;
        }
        aVar.e(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable n() {
        if (this.f20998E == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o(bundle);
        return bundle;
    }

    public void o(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f20998E;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f20997D.P(this.f21003J.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f21001H = i10;
        this.f21000G = i11;
    }
}
