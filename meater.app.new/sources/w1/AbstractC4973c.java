package w1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4973c extends AbstractC4971a {

    /* renamed from: J, reason: collision with root package name */
    private int f51796J;

    /* renamed from: K, reason: collision with root package name */
    private int f51797K;

    /* renamed from: L, reason: collision with root package name */
    private LayoutInflater f51798L;

    @Deprecated
    public AbstractC4973c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f51797K = i10;
        this.f51796J = i10;
        this.f51798L = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // w1.AbstractC4971a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f51798L.inflate(this.f51797K, viewGroup, false);
    }

    @Override // w1.AbstractC4971a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f51798L.inflate(this.f51796J, viewGroup, false);
    }
}
