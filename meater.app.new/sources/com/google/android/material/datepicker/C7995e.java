package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.C0280a;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import androidx.recyclerview.widget.C0630k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p024c.p052i.p059j.C0955e;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.C8913g;
import p241e.p254e.p256b.p271c.C8914h;
import p241e.p254e.p256b.p271c.C8916j;

/* compiled from: MaterialCalendar.java */
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes2.dex */
public final class C7995e<S> extends AbstractC8002l<S> {

    /* renamed from: g */
    static final Object f30104g = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: h */
    static final Object f30105h = "NAVIGATION_PREV_TAG";

    /* renamed from: i */
    static final Object f30106i = "NAVIGATION_NEXT_TAG";

    /* renamed from: j */
    static final Object f30107j = "SELECTOR_TOGGLE_TAG";

    /* renamed from: k */
    private int f30108k;

    /* renamed from: l */
    private DateSelector<S> f30109l;

    /* renamed from: m */
    private CalendarConstraints f30110m;

    /* renamed from: n */
    private Month f30111n;

    /* renamed from: o */
    private k f30112o;

    /* renamed from: p */
    private C7992b f30113p;

    /* renamed from: q */
    private RecyclerView f30114q;

    /* renamed from: r */
    private RecyclerView f30115r;

    /* renamed from: s */
    private View f30116s;

    /* renamed from: t */
    private View f30117t;

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f30118f;

        a(int i2) {
            this.f30118f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7995e.this.f30115r.smoothScrollToPosition(this.f30118f);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$b */
    class b extends C0280a {
        b() {
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            c0289c.m1973a0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$c */
    class c extends C8003m {

        /* renamed from: a */
        final /* synthetic */ int f30121a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i2, boolean z, int i3) {
            super(context, i2, z);
            this.f30121a = i3;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(RecyclerView.C0613z c0613z, int[] iArr) {
            if (this.f30121a == 0) {
                iArr[0] = C7995e.this.f30115r.getWidth();
                iArr[1] = C7995e.this.f30115r.getWidth();
            } else {
                iArr[0] = C7995e.this.f30115r.getHeight();
                iArr[1] = C7995e.this.f30115r.getHeight();
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$d */
    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.C7995e.l
        /* renamed from: a */
        public void mo24378a(long j2) {
            if (C7995e.this.f30110m.m24310f().mo24316F0(j2)) {
                C7995e.this.f30109l.m24327f1(j2);
                Iterator<AbstractC8001k<S>> it = C7995e.this.f30179f.iterator();
                while (it.hasNext()) {
                    it.next().mo24399a(C7995e.this.f30109l.m24326V0());
                }
                C7995e.this.f30115r.getAdapter().notifyDataSetChanged();
                if (C7995e.this.f30114q != null) {
                    C7995e.this.f30114q.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$e */
    class e extends RecyclerView.AbstractC0601n {

        /* renamed from: a */
        private final Calendar f30124a = C8005o.m24434l();

        /* renamed from: b */
        private final Calendar f30125b = C8005o.m24434l();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
            if ((recyclerView.getAdapter() instanceof C8006p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C8006p c8006p = (C8006p) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C0955e<Long, Long> c0955e : C7995e.this.f30109l.m24322D()) {
                    Long l = c0955e.f6405a;
                    if (l != null && c0955e.f6406b != null) {
                        this.f30124a.setTimeInMillis(l.longValue());
                        this.f30125b.setTimeInMillis(c0955e.f6406b.longValue());
                        int iM24441i = c8006p.m24441i(this.f30124a.get(1));
                        int iM24441i2 = c8006p.m24441i(this.f30125b.get(1));
                        View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iM24441i);
                        View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(iM24441i2);
                        int spanCount = iM24441i / gridLayoutManager.getSpanCount();
                        int spanCount2 = iM24441i2 / gridLayoutManager.getSpanCount();
                        int i2 = spanCount;
                        while (i2 <= spanCount2) {
                            if (gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i2) != null) {
                                canvas.drawRect(i2 == spanCount ? viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2) : 0, r9.getTop() + C7995e.this.f30113p.f30095d.m24350c(), i2 == spanCount2 ? viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2) : recyclerView.getWidth(), r9.getBottom() - C7995e.this.f30113p.f30095d.m24349b(), C7995e.this.f30113p.f30099h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$f */
    class f extends C0280a {
        f() {
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            c0289c.m1987j0(C7995e.this.f30117t.getVisibility() == 0 ? C7995e.this.getString(C8916j.f33974r) : C7995e.this.getString(C8916j.f33972p));
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$g */
    class g extends RecyclerView.AbstractC0607t {

        /* renamed from: a */
        final /* synthetic */ C8000j f30128a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f30129b;

        g(C8000j c8000j, MaterialButton materialButton) {
            this.f30128a = c8000j;
            this.f30129b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
            if (i2 == 0) {
                CharSequence text = this.f30129b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(RecyclerView.AbstractC0599l.FLAG_MOVED);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            int iFindFirstVisibleItemPosition = i2 < 0 ? C7995e.this.m24374t().findFirstVisibleItemPosition() : C7995e.this.m24374t().findLastVisibleItemPosition();
            C7995e.this.f30111n = this.f30128a.m24413h(iFindFirstVisibleItemPosition);
            this.f30129b.setText(this.f30128a.m24414i(iFindFirstVisibleItemPosition));
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$h */
    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7995e.this.m24377y();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$i */
    class i implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C8000j f30132f;

        i(C8000j c8000j) {
            this.f30132f = c8000j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindFirstVisibleItemPosition = C7995e.this.m24374t().findFirstVisibleItemPosition() + 1;
            if (iFindFirstVisibleItemPosition < C7995e.this.f30115r.getAdapter().getItemCount()) {
                C7995e.this.m24375w(this.f30132f.m24413h(iFindFirstVisibleItemPosition));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$j */
    class j implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C8000j f30134f;

        j(C8000j c8000j) {
            this.f30134f = c8000j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindLastVisibleItemPosition = C7995e.this.m24374t().findLastVisibleItemPosition() - 1;
            if (iFindLastVisibleItemPosition >= 0) {
                C7995e.this.m24375w(this.f30134f.m24413h(iFindLastVisibleItemPosition));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$k */
    enum k {
        DAY,
        YEAR
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$l */
    interface l {
        /* renamed from: a */
        void mo24378a(long j2);
    }

    /* renamed from: m */
    private void m24365m(View view, C8000j c8000j) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C8912f.f33920j);
        materialButton.setTag(f30107j);
        C0311u.m2131i0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C8912f.f33922l);
        materialButton2.setTag(f30105h);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C8912f.f33921k);
        materialButton3.setTag(f30106i);
        this.f30116s = view.findViewById(C8912f.f33929s);
        this.f30117t = view.findViewById(C8912f.f33924n);
        m24376x(k.DAY);
        materialButton.setText(this.f30111n.m24345y());
        this.f30115r.addOnScrollListener(new g(c8000j, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(c8000j));
        materialButton2.setOnClickListener(new j(c8000j));
    }

    /* renamed from: n */
    private RecyclerView.AbstractC0601n m24366n() {
        return new e();
    }

    /* renamed from: s */
    static int m24367s(Context context) {
        return context.getResources().getDimensionPixelSize(C8910d.f33890y);
    }

    /* renamed from: u */
    static <T> C7995e<T> m24368u(DateSelector<T> dateSelector, int i2, CalendarConstraints calendarConstraints) {
        C7995e<T> c7995e = new C7995e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m24313i());
        c7995e.setArguments(bundle);
        return c7995e;
    }

    /* renamed from: v */
    private void m24369v(int i2) {
        this.f30115r.post(new a(i2));
    }

    /* renamed from: o */
    CalendarConstraints m24370o() {
        return this.f30110m;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f30108k = bundle.getInt("THEME_RES_ID_KEY");
        this.f30109l = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f30110m = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f30111n = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalStateException, Resources.NotFoundException {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f30108k);
        this.f30113p = new C7992b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthM24314j = this.f30110m.m24314j();
        if (C7996f.m24392s(contextThemeWrapper)) {
            i2 = C8914h.f33950l;
            i3 = 1;
        } else {
            i2 = C8914h.f33948j;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(C8912f.f33925o);
        C0311u.m2131i0(gridView, new b());
        gridView.setAdapter((ListAdapter) new C7994d());
        gridView.setNumColumns(monthM24314j.f30083j);
        gridView.setEnabled(false);
        this.f30115r = (RecyclerView) viewInflate.findViewById(C8912f.f33928r);
        this.f30115r.setLayoutManager(new c(getContext(), i3, false, i3));
        this.f30115r.setTag(f30104g);
        C8000j c8000j = new C8000j(contextThemeWrapper, this.f30109l, this.f30110m, new d());
        this.f30115r.setAdapter(c8000j);
        int integer = contextThemeWrapper.getResources().getInteger(C8913g.f33938b);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C8912f.f33929s);
        this.f30114q = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f30114q.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f30114q.setAdapter(new C8006p(this));
            this.f30114q.addItemDecoration(m24366n());
        }
        if (viewInflate.findViewById(C8912f.f33920j) != null) {
            m24365m(viewInflate, c8000j);
        }
        if (!C7996f.m24392s(contextThemeWrapper)) {
            new C0630k().attachToRecyclerView(this.f30115r);
        }
        this.f30115r.scrollToPosition(c8000j.m24415j(this.f30111n));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f30108k);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f30109l);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f30110m);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f30111n);
    }

    /* renamed from: p */
    C7992b m24371p() {
        return this.f30113p;
    }

    /* renamed from: q */
    Month m24372q() {
        return this.f30111n;
    }

    /* renamed from: r */
    public DateSelector<S> m24373r() {
        return this.f30109l;
    }

    /* renamed from: t */
    LinearLayoutManager m24374t() {
        return (LinearLayoutManager) this.f30115r.getLayoutManager();
    }

    /* renamed from: w */
    void m24375w(Month month) {
        C8000j c8000j = (C8000j) this.f30115r.getAdapter();
        int iM24415j = c8000j.m24415j(month);
        int iM24415j2 = iM24415j - c8000j.m24415j(this.f30111n);
        boolean z = Math.abs(iM24415j2) > 3;
        boolean z2 = iM24415j2 > 0;
        this.f30111n = month;
        if (z && z2) {
            this.f30115r.scrollToPosition(iM24415j - 3);
            m24369v(iM24415j);
        } else if (!z) {
            m24369v(iM24415j);
        } else {
            this.f30115r.scrollToPosition(iM24415j + 3);
            m24369v(iM24415j);
        }
    }

    /* renamed from: x */
    void m24376x(k kVar) {
        this.f30112o = kVar;
        if (kVar == k.YEAR) {
            this.f30114q.getLayoutManager().scrollToPosition(((C8006p) this.f30114q.getAdapter()).m24441i(this.f30111n.f30082i));
            this.f30116s.setVisibility(0);
            this.f30117t.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f30116s.setVisibility(8);
            this.f30117t.setVisibility(0);
            m24375w(this.f30111n);
        }
    }

    /* renamed from: y */
    void m24377y() {
        k kVar = this.f30112o;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            m24376x(k.DAY);
        } else if (kVar == k.DAY) {
            m24376x(kVar2);
        }
    }
}
