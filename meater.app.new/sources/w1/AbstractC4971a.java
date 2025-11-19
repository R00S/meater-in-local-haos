package w1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import w1.C4972b;

/* compiled from: CursorAdapter.java */
/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4971a extends BaseAdapter implements Filterable, C4972b.a {

    /* renamed from: B, reason: collision with root package name */
    protected boolean f51785B;

    /* renamed from: C, reason: collision with root package name */
    protected boolean f51786C;

    /* renamed from: D, reason: collision with root package name */
    protected Cursor f51787D;

    /* renamed from: E, reason: collision with root package name */
    protected Context f51788E;

    /* renamed from: F, reason: collision with root package name */
    protected int f51789F;

    /* renamed from: G, reason: collision with root package name */
    protected C0748a f51790G;

    /* renamed from: H, reason: collision with root package name */
    protected DataSetObserver f51791H;

    /* renamed from: I, reason: collision with root package name */
    protected C4972b f51792I;

    /* compiled from: CursorAdapter.java */
    /* renamed from: w1.a$a, reason: collision with other inner class name */
    private class C0748a extends ContentObserver {
        C0748a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AbstractC4971a.this.i();
        }
    }

    /* compiled from: CursorAdapter.java */
    /* renamed from: w1.a$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC4971a abstractC4971a = AbstractC4971a.this;
            abstractC4971a.f51785B = true;
            abstractC4971a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC4971a abstractC4971a = AbstractC4971a.this;
            abstractC4971a.f51785B = false;
            abstractC4971a.notifyDataSetInvalidated();
        }
    }

    public AbstractC4971a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    @Override // w1.C4972b.a
    public Cursor b() {
        return this.f51787D;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f51786C = true;
        } else {
            this.f51786C = false;
        }
        boolean z10 = cursor != null;
        this.f51787D = cursor;
        this.f51785B = z10;
        this.f51788E = context;
        this.f51789F = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f51790G = new C0748a();
            this.f51791H = new b();
        } else {
            this.f51790G = null;
            this.f51791H = null;
        }
        if (z10) {
            C0748a c0748a = this.f51790G;
            if (c0748a != null) {
                cursor.registerContentObserver(c0748a);
            }
            DataSetObserver dataSetObserver = this.f51791H;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f51785B || (cursor = this.f51787D) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f51785B) {
            return null;
        }
        this.f51787D.moveToPosition(i10);
        if (view == null) {
            view = g(this.f51788E, this.f51787D, viewGroup);
        }
        e(view, this.f51788E, this.f51787D);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f51792I == null) {
            this.f51792I = new C4972b(this);
        }
        return this.f51792I;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f51785B || (cursor = this.f51787D) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f51787D;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f51785B && (cursor = this.f51787D) != null && cursor.moveToPosition(i10)) {
            return this.f51787D.getLong(this.f51789F);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f51785B) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f51787D.moveToPosition(i10)) {
            if (view == null) {
                view = h(this.f51788E, this.f51787D, viewGroup);
            }
            e(view, this.f51788E, this.f51787D);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f51786C || (cursor = this.f51787D) == null || cursor.isClosed()) {
            return;
        }
        this.f51785B = this.f51787D.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f51787D;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0748a c0748a = this.f51790G;
            if (c0748a != null) {
                cursor2.unregisterContentObserver(c0748a);
            }
            DataSetObserver dataSetObserver = this.f51791H;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f51787D = cursor;
        if (cursor != null) {
            C0748a c0748a2 = this.f51790G;
            if (c0748a2 != null) {
                cursor.registerContentObserver(c0748a2);
            }
            DataSetObserver dataSetObserver2 = this.f51791H;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f51789F = cursor.getColumnIndexOrThrow("_id");
            this.f51785B = true;
            notifyDataSetChanged();
        } else {
            this.f51789F = -1;
            this.f51785B = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
