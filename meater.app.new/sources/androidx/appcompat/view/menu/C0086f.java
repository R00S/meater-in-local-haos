package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0094n;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class C0086f extends BaseAdapter {

    /* renamed from: f */
    C0087g f570f;

    /* renamed from: g */
    private int f571g = -1;

    /* renamed from: h */
    private boolean f572h;

    /* renamed from: i */
    private final boolean f573i;

    /* renamed from: j */
    private final LayoutInflater f574j;

    /* renamed from: k */
    private final int f575k;

    public C0086f(C0087g c0087g, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f573i = z;
        this.f574j = layoutInflater;
        this.f570f = c0087g;
        this.f575k = i2;
        m542a();
    }

    /* renamed from: a */
    void m542a() {
        C0089i c0089iM603x = this.f570f.m603x();
        if (c0089iM603x != null) {
            ArrayList<C0089i> arrayListM557B = this.f570f.m557B();
            int size = arrayListM557B.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayListM557B.get(i2) == c0089iM603x) {
                    this.f571g = i2;
                    return;
                }
            }
        }
        this.f571g = -1;
    }

    /* renamed from: b */
    public C0087g m543b() {
        return this.f570f;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0089i getItem(int i2) {
        ArrayList<C0089i> arrayListM557B = this.f573i ? this.f570f.m557B() : this.f570f.m561G();
        int i3 = this.f571g;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayListM557B.get(i2);
    }

    /* renamed from: d */
    public void m545d(boolean z) {
        this.f572h = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f571g < 0 ? (this.f573i ? this.f570f.m557B() : this.f570f.m561G()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f574j.inflate(this.f575k, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f570f.mo562H() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        InterfaceC0094n.a aVar = (InterfaceC0094n.a) view;
        if (this.f572h) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo472e(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m542a();
        super.notifyDataSetChanged();
    }
}
