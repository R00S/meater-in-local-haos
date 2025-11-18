package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.view.menu.InterfaceC0094n;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0082b implements InterfaceC0093m {

    /* renamed from: f */
    protected Context f508f;

    /* renamed from: g */
    protected Context f509g;

    /* renamed from: h */
    protected C0087g f510h;

    /* renamed from: i */
    protected LayoutInflater f511i;

    /* renamed from: j */
    protected LayoutInflater f512j;

    /* renamed from: k */
    private InterfaceC0093m.a f513k;

    /* renamed from: l */
    private int f514l;

    /* renamed from: m */
    private int f515m;

    /* renamed from: n */
    protected InterfaceC0094n f516n;

    /* renamed from: o */
    private int f517o;

    public AbstractC0082b(Context context, int i2, int i3) {
        this.f508f = context;
        this.f511i = LayoutInflater.from(context);
        this.f514l = i2;
        this.f515m = i3;
    }

    /* renamed from: a */
    protected void m491a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f516n).addView(view, i2);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: b */
    public void mo492b(C0087g c0087g, boolean z) {
        InterfaceC0093m.a aVar = this.f513k;
        if (aVar != null) {
            aVar.mo366b(c0087g, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: c */
    public void mo493c(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f516n;
        if (viewGroup == null) {
            return;
        }
        C0087g c0087g = this.f510h;
        int i2 = 0;
        if (c0087g != null) {
            c0087g.m599t();
            ArrayList<C0089i> arrayListM561G = this.f510h.m561G();
            int size = arrayListM561G.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C0089i c0089i = arrayListM561G.get(i4);
                if (mo506s(i3, c0089i)) {
                    View childAt = viewGroup.getChildAt(i3);
                    C0089i itemData = childAt instanceof InterfaceC0094n.a ? ((InterfaceC0094n.a) childAt).getItemData() : null;
                    View viewMo503p = mo503p(c0089i, childAt, viewGroup);
                    if (c0089i != itemData) {
                        viewMo503p.setPressed(false);
                        viewMo503p.jumpDrawablesToCurrentState();
                    }
                    if (viewMo503p != childAt) {
                        m491a(viewMo503p, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!mo501n(viewGroup, i2)) {
                i2++;
            }
        }
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
        this.f513k = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    public int getId() {
        return this.f517o;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: h */
    public void mo497h(Context context, C0087g c0087g) {
        this.f509g = context;
        this.f512j = LayoutInflater.from(context);
        this.f510h = c0087g;
    }

    /* renamed from: j */
    public abstract void mo498j(C0089i c0089i, InterfaceC0094n.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: k */
    public boolean mo499k(SubMenuC0098r subMenuC0098r) {
        InterfaceC0093m.a aVar = this.f513k;
        SubMenuC0098r subMenuC0098r2 = subMenuC0098r;
        if (aVar == null) {
            return false;
        }
        if (subMenuC0098r == null) {
            subMenuC0098r2 = this.f510h;
        }
        return aVar.mo367c(subMenuC0098r2);
    }

    /* renamed from: m */
    public InterfaceC0094n.a m500m(ViewGroup viewGroup) {
        return (InterfaceC0094n.a) this.f511i.inflate(this.f515m, viewGroup, false);
    }

    /* renamed from: n */
    protected boolean mo501n(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    /* renamed from: o */
    public InterfaceC0093m.a m502o() {
        return this.f513k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public View mo503p(C0089i c0089i, View view, ViewGroup viewGroup) {
        InterfaceC0094n.a aVarM500m = view instanceof InterfaceC0094n.a ? (InterfaceC0094n.a) view : m500m(viewGroup);
        mo498j(c0089i, aVarM500m);
        return (View) aVarM500m;
    }

    /* renamed from: q */
    public InterfaceC0094n mo504q(ViewGroup viewGroup) {
        if (this.f516n == null) {
            InterfaceC0094n interfaceC0094n = (InterfaceC0094n) this.f511i.inflate(this.f514l, viewGroup, false);
            this.f516n = interfaceC0094n;
            interfaceC0094n.mo478b(this.f510h);
            mo493c(true);
        }
        return this.f516n;
    }

    /* renamed from: r */
    public void m505r(int i2) {
        this.f517o = i2;
    }

    /* renamed from: s */
    public abstract boolean mo506s(int i2, C0089i c0089i);
}
