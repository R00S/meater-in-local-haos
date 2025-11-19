package w4;

import P5.Q;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class w extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name */
    private final List<T4.q> f51934E = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    private final Set<T4.q> f51935F = new TreeSet();

    /* renamed from: G, reason: collision with root package name */
    private final Map<T4.q, List<Integer>> f51936G = new HashMap();

    /* renamed from: H, reason: collision with root package name */
    private final LayoutInflater f51937H;

    /* renamed from: I, reason: collision with root package name */
    private T4.b f51938I;

    /* renamed from: J, reason: collision with root package name */
    private final Context f51939J;

    /* compiled from: MenuAdapter.java */
    class a extends RecyclerView.G implements View.OnClickListener {

        /* renamed from: B, reason: collision with root package name */
        TextView f51940B;

        /* renamed from: C, reason: collision with root package name */
        TextView f51941C;

        /* renamed from: D, reason: collision with root package name */
        ImageView f51942D;

        /* renamed from: E, reason: collision with root package name */
        ImageView f51943E;

        /* renamed from: F, reason: collision with root package name */
        ImageView f51944F;

        /* renamed from: G, reason: collision with root package name */
        View f51945G;

        /* renamed from: H, reason: collision with root package name */
        View f51946H;

        /* renamed from: I, reason: collision with root package name */
        View[] f51947I;

        /* renamed from: J, reason: collision with root package name */
        boolean f51948J;

        a(View view) {
            super(view);
            this.f51948J = true;
            this.f51940B = (TextView) view.findViewById(R.id.txtOption1);
            this.f51941C = (TextView) view.findViewById(R.id.txtOption2);
            this.f51942D = (ImageView) view.findViewById(R.id.imgIcon1);
            this.f51943E = (ImageView) view.findViewById(R.id.imgIconA);
            this.f51944F = (ImageView) view.findViewById(R.id.imgIconB);
            this.f51945G = view.findViewById(R.id.layoutStandard);
            View viewFindViewById = view.findViewById(R.id.layoutVertical);
            this.f51946H = viewFindViewById;
            this.f51947I = new View[]{this.f51940B, this.f51941C, this.f51942D, this.f51943E, this.f51944F, this.f51945G, viewFindViewById};
            view.setOnClickListener(this);
        }

        void a(boolean z10, int i10, int i11) {
            this.f51948J = z10;
            for (View view : this.f51947I) {
                if (view != null) {
                    view.setEnabled(z10);
                    if (view instanceof TextView) {
                        if (z10) {
                            androidx.core.widget.j.q((TextView) view, R.style.fontBody_2);
                        } else {
                            ((TextView) view).setTextColor(Q.i(i11));
                        }
                    }
                    if (view instanceof ImageView) {
                        ((ImageView) view).setColorFilter(Q.j(w.this.f51939J, z10 ? i10 : i11), PorterDuff.Mode.SRC_ATOP);
                    }
                }
            }
        }

        void b(List<Integer> list) {
            if (list == null || list.size() < 1) {
                return;
            }
            this.f51942D.setImageResource(list.get(0).intValue());
            this.f51943E.setImageResource(list.get(0).intValue());
            if (list.size() <= 1 || list.get(1).intValue() <= 0) {
                this.f51946H.setVisibility(8);
            } else {
                this.f51944F.setImageResource(list.get(1).intValue());
                this.f51946H.setVisibility(0);
            }
        }

        void c(Integer... numArr) {
            b(Arrays.asList(numArr));
        }

        void d(String str) {
            this.f51940B.setText(str);
            this.f51941C.setText(str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (w.this.f51938I != null && this.f51948J && w.this.M(getBindingAdapterPosition(), w.this.f51934E.size())) {
                w.this.f51938I.p(view, w.this.f51934E.get(getBindingAdapterPosition()));
            }
        }
    }

    public w(Context context) {
        this.f51937H = LayoutInflater.from(context);
        this.f51939J = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M(int i10, int i11) {
        return i10 >= 0 && i10 < i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void w(a aVar, int i10) {
        T4.q qVar = this.f51934E.get(i10);
        aVar.d(P5.H.g(qVar.getText(this.f51937H.getContext())));
        aVar.c(Integer.valueOf(qVar.getImage()), Integer.valueOf(qVar.getImage2()));
        if (this.f51936G.containsKey(qVar)) {
            aVar.b(this.f51936G.get(qVar));
        }
        aVar.a(!this.f51935F.contains(qVar), Q.v(this.f51939J) ? R.color.black_color : qVar.getColor(), R.color.grey_9);
        P(this.f51938I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup viewGroup, int i10) {
        return new a(this.f51937H.inflate(R.layout._menu_option_layout, viewGroup, false));
    }

    public void P(T4.b bVar) {
        this.f51938I = bVar;
    }

    public void Q(List<T4.q> list) {
        this.f51934E.clear();
        this.f51934E.addAll(list);
    }

    public void R(boolean z10, List<T4.q> list) {
        if (!z10) {
            this.f51935F.clear();
            this.f51935F.addAll(list);
        } else {
            this.f51935F.clear();
            this.f51935F.addAll(this.f51934E);
            this.f51935F.removeAll(list);
        }
    }

    public void S(T4.q qVar, int... iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        this.f51936G.put(qVar, arrayList);
    }

    public void T(T4.q qVar, String str) {
        int i10 = 0;
        for (T4.q qVar2 : this.f51934E) {
            if (qVar2.equals(qVar)) {
                String text = qVar2.getText(this.f51937H.getContext());
                if (text.length() > str.length()) {
                    qVar2.setText(text.substring(0, text.length() - str.length()) + str);
                    o(i10);
                    return;
                }
            }
            i10++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f51934E.size();
    }
}
