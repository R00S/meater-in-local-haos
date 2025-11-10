package com.apptionlabs.meater_app.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.SearchableMeatCut;
import com.apptionlabs.meater_app.views.l1;
import f8.l0;
import f8.q0;
import java.util.ArrayList;
import java.util.List;
import lm.b;

/* loaded from: /tmp/meat/meat/classes.dex */
public class SearchActivity extends OrientationActivity {
    private d S;
    private TextView T;
    c U = new b();

    /* loaded from: /tmp/meat/meat/classes.dex */
    class b implements c {
        b() {
        }

        @Override // com.apptionlabs.meater_app.activities.SearchActivity.c
        public void a(View view, int i10) {
            MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(SearchActivity.this.S.J(i10).id.intValue());
            if (meatCut != null && meatCut.id != null) {
                Intent intent = new Intent();
                intent.putExtra(MEATERIntent.EXTRA_CUT_ID, meatCut.id);
                SearchActivity.this.setResult(-1, intent);
                SearchActivity.this.finish();
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface c {
        void a(View view, int i10);
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public class d extends RecyclerView.h<a> {

        /* renamed from: t, reason: collision with root package name */
        private final List<SearchableMeatCut> f9519t = new ArrayList();

        /* renamed from: u, reason: collision with root package name */
        private final LayoutInflater f9520u;

        /* renamed from: v, reason: collision with root package name */
        private c f9521v;

        /* loaded from: /tmp/meat/meat/classes.dex */
        public class a extends RecyclerView.f0 implements View.OnClickListener {

            /* renamed from: q, reason: collision with root package name */
            TextView f9523q;

            a(View view) {
                super(view);
                this.f9523q = (TextView) view.findViewById(2131363441);
                view.setOnClickListener(this);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (d.this.f9521v != null) {
                    d.this.f9521v.a(view, getBindingAdapterPosition());
                }
            }
        }

        d(Context context) {
            this.f9520u = LayoutInflater.from(context);
        }

        SearchableMeatCut J(int i10) {
            if (i10 < this.f9519t.size()) {
                return this.f9519t.get(i10);
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public void w(a aVar, int i10) {
            CharSequence a10;
            String pathResult = this.f9519t.get(i10).getPathResult();
            TextView textView = aVar.f9523q;
            if (pathResult == null) {
                a10 = "";
            } else {
                a10 = androidx.core.text.b.a(pathResult, 0);
            }
            textView.setText(a10);
            M(SearchActivity.this.U);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public a y(ViewGroup viewGroup, int i10) {
            return new a(this.f9520u.inflate(2131558586, viewGroup, false));
        }

        void M(c cVar) {
            this.f9521v = cVar;
        }

        public void N(List<SearchableMeatCut> list) {
            this.f9519t.clear();
            this.f9519t.addAll(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f9519t.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(String str) {
        boolean z10;
        List<SearchableMeatCut> search = MeatCutsHelper.getInstance().search(str.trim());
        this.S.N(search);
        this.S.n();
        if (str.length() > 0 && search.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        q0.g(z10, this.T);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558452);
        final EditText editText = (EditText) findViewById(2131362397);
        editText.addTextChangedListener(new a());
        editText.requestFocus();
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(editText, 1);
        findViewById(2131363560).setOnClickListener(new View.OnClickListener() { // from class: p5.b4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                editText.setText("");
            }
        });
        this.T = (TextView) findViewById(2131363582);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131362776);
        this.S = new d(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.S);
        recyclerView.j(new l1());
        recyclerView.setItemAnimator(null);
        this.T.setText(l0.o(getString(2132018599), "\n" + getString(2132018598)));
        lm.b.g(b.EnumC0292b.A0.title, "", "");
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchActivity.this.P0(charSequence.toString());
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
