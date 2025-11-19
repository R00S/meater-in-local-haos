package B5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import v5.C4894b;

/* compiled from: IngredientsTipDialog.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"LB5/f;", "LB5/b;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Loa/F;", "Y2", "(Landroid/view/View;)V", "Lv5/b;", "Z0", "Lv5/b;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "a1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "b1", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends AbstractC0884b {

    /* renamed from: b1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c1, reason: collision with root package name */
    public static final int f1631c1 = 8;

    /* renamed from: d1, reason: collision with root package name */
    private static List<String> f1632d1;

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    private C4894b adapter;

    /* renamed from: a1, reason: collision with root package name and from kotlin metadata */
    private LinearLayoutManager linearLayoutManager;

    /* compiled from: IngredientsTipDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"LB5/f$a;", "", "<init>", "()V", "", "", "ingredientList", "LB5/f;", "a", "(Ljava/util/List;)LB5/f;", "Ljava/util/List;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final f a(List<String> ingredientList) {
            C3862t.g(ingredientList, "ingredientList");
            f fVar = new f();
            Bundle bundle = new Bundle();
            f.f1632d1 = ingredientList;
            fVar.k2(bundle);
            return fVar;
        }

        private Companion() {
        }
    }

    public f() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z2(f fVar, View view) {
        fVar.A2();
    }

    public void Y2(View view) {
        C3862t.g(view, "view");
        TextView textView = (TextView) view.findViewById(R.id.titleText);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        textView.setText(A0(R.string.ingredients));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(e2());
        this.linearLayoutManager = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        C4894b c4894b = new C4894b();
        this.adapter = c4894b;
        List<String> list = f1632d1;
        C4894b c4894b2 = null;
        if (list == null) {
            C3862t.u("ingredientList");
            list = null;
        }
        c4894b.I(list);
        C4894b c4894b3 = this.adapter;
        if (c4894b3 == null) {
            C3862t.u("adapter");
        } else {
            c4894b2 = c4894b3;
        }
        recyclerView.setAdapter(c4894b2);
        ((ImageView) view.findViewById(R.id.closeButton)).setOnClickListener(new View.OnClickListener() { // from class: B5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f.Z2(this.f1629B, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.recipe_ingredient_tip_dialog, container, false);
        C3862t.f(viewInflate, "inflate(...)");
        K2(true);
        Y2(viewInflate);
        return viewInflate;
    }
}
