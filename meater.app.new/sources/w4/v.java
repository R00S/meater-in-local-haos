package w4;

import T4.InterfaceC1713a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.WebLink;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LinkAdapter.java */
/* loaded from: classes.dex */
public class v extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name */
    private final List<WebLink> f51929E = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    private final LayoutInflater f51930F;

    /* renamed from: G, reason: collision with root package name */
    private InterfaceC1713a f51931G;

    /* compiled from: LinkAdapter.java */
    class a extends RecyclerView.G implements View.OnClickListener {

        /* renamed from: B, reason: collision with root package name */
        TextView f51932B;

        a(View view) {
            super(view);
            this.f51932B = (TextView) view.findViewById(R.id.text1);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (v.this.f51931G != null) {
                v.this.f51931G.a(view, getBindingAdapterPosition());
            }
        }
    }

    public v(Context context) {
        this.f51930F = LayoutInflater.from(context);
    }

    public WebLink J(int i10) {
        List<WebLink> list = this.f51929E;
        if (list == null || list.isEmpty() || this.f51929E.size() <= i10) {
            return null;
        }
        return this.f51929E.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void w(a aVar, int i10) {
        String str = this.f51929E.get(i10).title;
        TextView textView = aVar.f51932B;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        M(this.f51931G);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup viewGroup, int i10) {
        return new a(this.f51930F.inflate(R.layout.list_link_instruction, viewGroup, false));
    }

    public void M(InterfaceC1713a interfaceC1713a) {
        this.f51931G = interfaceC1713a;
    }

    public void N(List<WebLink> list) {
        this.f51929E.clear();
        this.f51929E.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.f51929E.size();
    }
}
