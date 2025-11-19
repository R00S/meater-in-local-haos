package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: B, reason: collision with root package name */
    protected Context f20948B;

    /* renamed from: C, reason: collision with root package name */
    protected Context f20949C;

    /* renamed from: D, reason: collision with root package name */
    protected e f20950D;

    /* renamed from: E, reason: collision with root package name */
    protected LayoutInflater f20951E;

    /* renamed from: F, reason: collision with root package name */
    protected LayoutInflater f20952F;

    /* renamed from: G, reason: collision with root package name */
    private j.a f20953G;

    /* renamed from: H, reason: collision with root package name */
    private int f20954H;

    /* renamed from: I, reason: collision with root package name */
    private int f20955I;

    /* renamed from: J, reason: collision with root package name */
    protected k f20956J;

    /* renamed from: K, reason: collision with root package name */
    private int f20957K;

    public a(Context context, int i10, int i11) {
        this.f20948B = context;
        this.f20951E = LayoutInflater.from(context);
        this.f20954H = i10;
        this.f20955I = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f20956J).addView(view, i10);
    }

    public abstract void b(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public int c() {
        return this.f20957K;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(e eVar, boolean z10) {
        j.a aVar = this.f20953G;
        if (aVar != null) {
            aVar.d(eVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f20956J;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f20950D;
        int i10 = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList<g> arrayListG = this.f20950D.G();
            int size = arrayListG.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = arrayListG.get(i12);
                if (t(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewQ = q(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewQ.setPressed(false);
                        viewQ.jumpDrawablesToCurrentState();
                    }
                    if (viewQ != childAt) {
                        a(viewQ, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!o(viewGroup, i10)) {
                i10++;
            }
        }
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
        this.f20953G = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void j(Context context, e eVar) {
        this.f20949C = context;
        this.f20952F = LayoutInflater.from(context);
        this.f20950D = eVar;
    }

    public k.a l(ViewGroup viewGroup) {
        return (k.a) this.f20951E.inflate(this.f20955I, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean m(m mVar) {
        j.a aVar = this.f20953G;
        m mVar2 = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            mVar2 = this.f20950D;
        }
        return aVar.e(mVar2);
    }

    protected boolean o(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a p() {
        return this.f20953G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View q(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarL = view instanceof k.a ? (k.a) view : l(viewGroup);
        b(gVar, aVarL);
        return (View) aVarL;
    }

    public k r(ViewGroup viewGroup) {
        if (this.f20956J == null) {
            k kVar = (k) this.f20951E.inflate(this.f20954H, viewGroup, false);
            this.f20956J = kVar;
            kVar.b(this.f20950D);
            e(true);
        }
        return this.f20956J;
    }

    public void s(int i10) {
        this.f20957K = i10;
    }

    public abstract boolean t(int i10, g gVar);
}
