package p024c.p060j.p061a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* renamed from: c.j.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC0963c extends AbstractC0961a {

    /* renamed from: f */
    private int f6415f;

    /* renamed from: g */
    private int f6416g;

    /* renamed from: h */
    private LayoutInflater f6417h;

    @Deprecated
    public AbstractC0963c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f6416g = i2;
        this.f6415f = i2;
        this.f6417h = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p024c.p060j.p061a.AbstractC0961a
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f6417h.inflate(this.f6416g, viewGroup, false);
    }

    @Override // p024c.p060j.p061a.AbstractC0961a
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f6417h.inflate(this.f6415f, viewGroup, false);
    }
}
