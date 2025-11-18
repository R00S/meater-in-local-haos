package w4;

import P5.Q;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.InfoPair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: InfoPairAdapter.java */
/* loaded from: classes.dex */
public class u extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name */
    private final List<InfoPair> f51923E = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    private final LayoutInflater f51924F;

    /* renamed from: G, reason: collision with root package name */
    private T4.b f51925G;

    /* compiled from: InfoPairAdapter.java */
    public class a extends RecyclerView.G implements View.OnClickListener {

        /* renamed from: B, reason: collision with root package name */
        TextView f51926B;

        /* renamed from: C, reason: collision with root package name */
        TextView f51927C;

        a(View view) {
            super(view);
            this.f51926B = (TextView) view.findViewById(R.id.txtLeft);
            this.f51927C = (TextView) view.findViewById(R.id.txtRight);
            view.setOnClickListener(this);
        }

        public void a(InfoPair infoPair) {
            this.f51926B.setText(infoPair.heading);
            this.f51927C.setText(infoPair.detail);
            TextView textView = this.f51927C;
            textView.setTextColor(T5.c.u(textView.getContext(), infoPair.tag));
            if (infoPair.needToShowInfoImage) {
                this.f51927C.setTextColor(Q.i(R.color.primary_color));
                this.f51927C.setText(infoPair.detail + " " + u.this.K());
            } else {
                this.f51927C.setText(infoPair.detail);
            }
            String str = infoPair.detail;
            if (str == null || str.isEmpty()) {
                this.f51927C.setVisibility(8);
                this.f51926B.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (u.this.f51925G == null || bindingAdapterPosition < 0 || u.this.f51923E.size() <= bindingAdapterPosition) {
                return;
            }
            u.this.f51925G.p(view, ((InfoPair) u.this.f51923E.get(bindingAdapterPosition)).tag);
        }
    }

    public u(Context context) {
        this.f51924F = LayoutInflater.from(context);
    }

    public String K() {
        return new String(Character.toChars(9432));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void w(a aVar, int i10) {
        aVar.a(this.f51923E.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup viewGroup, int i10) {
        return new a(this.f51924F.inflate(R.layout.item_left_right, viewGroup, false));
    }

    public void N(T4.b bVar) {
        this.f51925G = bVar;
    }

    public void O(List<InfoPair> list) {
        this.f51923E.clear();
        this.f51923E.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f51923E.size();
    }
}
