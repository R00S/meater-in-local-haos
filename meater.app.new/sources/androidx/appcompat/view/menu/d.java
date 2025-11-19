package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: B, reason: collision with root package name */
    e f21007B;

    /* renamed from: C, reason: collision with root package name */
    private int f21008C = -1;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21009D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f21010E;

    /* renamed from: F, reason: collision with root package name */
    private final LayoutInflater f21011F;

    /* renamed from: G, reason: collision with root package name */
    private final int f21012G;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f21010E = z10;
        this.f21011F = layoutInflater;
        this.f21007B = eVar;
        this.f21012G = i10;
        a();
    }

    void a() {
        g gVarX = this.f21007B.x();
        if (gVarX != null) {
            ArrayList<g> arrayListB = this.f21007B.B();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayListB.get(i10) == gVarX) {
                    this.f21008C = i10;
                    return;
                }
            }
        }
        this.f21008C = -1;
    }

    public e b() {
        return this.f21007B;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList<g> arrayListB = this.f21010E ? this.f21007B.B() : this.f21007B.G();
        int i11 = this.f21008C;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListB.get(i10);
    }

    public void d(boolean z10) {
        this.f21009D = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f21008C < 0 ? (this.f21010E ? this.f21007B.B() : this.f21007B.G()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f21011F.inflate(this.f21012G, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f21007B.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f21009D) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
