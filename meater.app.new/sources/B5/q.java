package B5;

import Xb.C1841i;
import Xb.C1854o0;
import Xb.I;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import x5.EnumC5061f;

/* compiled from: RecipeLocaleSelectionDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"LB5/q;", "Lcom/google/android/material/bottomsheet/b;", "Lw5/e;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Loa/F;", "V2", "(Landroid/view/View;)V", "", "locale", "u", "(Ljava/lang/String;)V", "Lv5/d;", "X0", "Lv5/d;", "adapter", "Y0", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class q extends com.google.android.material.bottomsheet.b implements w5.e {

    /* renamed from: Y0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: Z0, reason: collision with root package name */
    public static final int f1657Z0 = 8;

    /* renamed from: a1, reason: collision with root package name */
    private static T5.d f1658a1;

    /* renamed from: b1, reason: collision with root package name */
    private static w5.e f1659b1;

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    private v5.d adapter;

    /* compiled from: RecipeLocaleSelectionDialog.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"LB5/q$a;", "", "<init>", "()V", "LT5/d;", "viewModel", "Lw5/e;", "callback", "LB5/q;", "a", "(LT5/d;Lw5/e;)LB5/q;", "LT5/d;", "Lw5/e;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.q$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final q a(T5.d viewModel, w5.e callback) {
            C3862t.g(viewModel, "viewModel");
            C3862t.g(callback, "callback");
            q qVar = new q();
            Bundle bundle = new Bundle();
            q.f1658a1 = viewModel;
            q.f1659b1 = callback;
            qVar.k2(bundle);
            return qVar;
        }

        private Companion() {
        }
    }

    /* compiled from: RecipeLocaleSelectionDialog.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.dialogs.RecipeLocaleSelectionDialog$onLocaleSelected$1", f = "RecipeLocaleSelectionDialog.kt", l = {89}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f1661B;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f1661B;
            if (i10 == 0) {
                C4173r.b(obj);
                K4.a aVar = K4.a.f8678a;
                this.f1661B = 1;
                if (aVar.a(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(q qVar, View view) {
        qVar.A2();
    }

    public final void V2(View view) {
        C3862t.g(view, "view");
        TextView textView = (TextView) view.findViewById(R.id.titleText);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        textView.setText("Locale");
        recyclerView.setLayoutManager(new LinearLayoutManager(e2()));
        EnumC5061f[] enumC5061fArrValues = EnumC5061f.values();
        ArrayList arrayList = new ArrayList(enumC5061fArrValues.length);
        for (EnumC5061f enumC5061f : enumC5061fArrValues) {
            arrayList.add(enumC5061f.name());
        }
        T5.d dVar = f1658a1;
        v5.d dVar2 = null;
        if (dVar == null) {
            C3862t.u("viewModel");
            dVar = null;
        }
        String strJ = dVar.j();
        if (Ub.n.a0(strJ)) {
            strJ = "System";
        }
        v5.d dVar3 = new v5.d(this);
        this.adapter = dVar3;
        dVar3.K(arrayList, strJ);
        v5.d dVar4 = this.adapter;
        if (dVar4 == null) {
            C3862t.u("adapter");
        } else {
            dVar2 = dVar4;
        }
        recyclerView.setAdapter(dVar2);
        ((ImageView) view.findViewById(R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q.W2(this.f1655B, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.recipe_locale_dialog, container, false);
        C3862t.f(viewInflate, "inflate(...)");
        K2(true);
        V2(viewInflate);
        return viewInflate;
    }

    @Override // w5.e
    public void u(String locale) {
        C3862t.g(locale, "locale");
        if (C3862t.b(locale, "System")) {
            x4.g.t().h0();
        } else {
            x4.g.t().W0(locale);
        }
        w5.e eVar = null;
        C1841i.d(C1854o0.f19099B, null, null, new b(null), 3, null);
        T5.d dVar = f1658a1;
        if (dVar == null) {
            C3862t.u("viewModel");
            dVar = null;
        }
        dVar.h();
        w5.e eVar2 = f1659b1;
        if (eVar2 == null) {
            C3862t.u("callback");
        } else {
            eVar = eVar2;
        }
        eVar.u(locale);
        A2();
    }
}
