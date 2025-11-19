package v5;

import B5.s;
import B5.u;
import L4.h1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.v;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.TextStepView;
import j.C3699a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.Recipe;
import v5.p;

/* compiled from: StepsAdapter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u000f0(j\b\u0012\u0004\u0012\u00020\u000f`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lv5/p;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Lo4/o;", "recipe", "Landroidx/fragment/app/v;", "supportFragmentManager", "<init>", "(Lo4/o;Landroidx/fragment/app/v;)V", "", "stepNumber", "", "L", "(I)Z", "", "", "list", "currentStep", "", "probeID", "Loa/F;", "M", "(Ljava/util/List;IJ)V", "Landroid/view/ViewGroup;", "parent", "viewType", "y", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$G;", "viewHolder", "position", "w", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "h", "()I", "i", "(I)J", "E", "Lo4/o;", "F", "Landroidx/fragment/app/v;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "G", "Ljava/util/ArrayList;", "ingredientList", "H", "I", "J", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class p extends RecyclerView.h<RecyclerView.G> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Recipe recipe;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final v supportFragmentManager;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private ArrayList<String> ingredientList;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private int currentStep;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private long probeID;

    /* compiled from: StepsAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lv5/p$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/h1;", "binding", "<init>", "(Lv5/p;Landroid/view/View;LL4/h1;)V", "", "data", "Loa/F;", "b", "(Ljava/lang/String;)V", "B", "LL4/h1;", "getBinding", "()LL4/h1;", "setBinding", "(LL4/h1;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private h1 binding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p f51480C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, View itemView, h1 binding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(binding, "binding");
            this.f51480C = pVar;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, p pVar, View view) {
            if (aVar.binding.f10135c.getContext().getResources().getBoolean(R.bool.is_tablet)) {
                u.INSTANCE.a(aVar.getBindingAdapterPosition()).N2(pVar.supportFragmentManager, "recipeStepPreview");
            } else {
                s.INSTANCE.a(aVar.getBindingAdapterPosition()).N2(pVar.supportFragmentManager, "recipeStepPreview");
            }
        }

        public final void b(String data) {
            C3862t.g(data, "data");
            this.binding.f10134b.setText(String.valueOf(getBindingAdapterPosition() + 1));
            this.binding.f10136d.setData(data);
            if (this.f51480C.currentStep == getBindingAdapterPosition()) {
                h1 h1Var = this.binding;
                h1Var.f10134b.setBackground(C3699a.b(h1Var.f10136d.getContext(), R.drawable.circle_red_fill));
                TextStepView textStepView = this.binding.f10136d;
                textStepView.setTextColor(textStepView.getContext().getColor(R.color.steps_title));
                this.binding.f10136d.setTypeface(i1.h.g(x4.g.h(), R.font.roboto_bold));
                this.binding.f10136d.setTextSize(18.0f);
            } else if (getBindingAdapterPosition() < this.f51480C.currentStep) {
                TextStepView textStepView2 = this.binding.f10136d;
                textStepView2.setTextColor(textStepView2.getContext().getColor(R.color.grey_9));
                h1 h1Var2 = this.binding;
                h1Var2.f10134b.setBackground(C3699a.b(h1Var2.f10136d.getContext(), R.drawable.circle_grey));
            }
            if (this.f51480C.L(getBindingAdapterPosition())) {
                this.binding.f10136d.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_right, 0);
                ConstraintLayout constraintLayout = this.binding.f10135c;
                final p pVar = this.f51480C;
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: v5.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        p.a.c(this.f51472B, pVar, view);
                    }
                });
            }
        }
    }

    public p(Recipe recipe, v supportFragmentManager) {
        C3862t.g(recipe, "recipe");
        C3862t.g(supportFragmentManager, "supportFragmentManager");
        this.recipe = recipe;
        this.supportFragmentManager = supportFragmentManager;
        this.ingredientList = new ArrayList<>();
        this.probeID = -1L;
        F(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(int r7) {
        /*
            r6 = this;
            o4.o r0 = r6.recipe
            java.util.List r0 = r0.n()
            java.lang.Object r7 = r0.get(r7)
            o4.x r7 = (o4.Step) r7
            java.util.List r7 = r7.d()
            r0 = 0
            if (r7 == 0) goto L5f
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L19:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r7.next()
            r2 = r1
            o4.y r2 = (o4.StepContent) r2
            o4.A r3 = r2.getType()
            o4.A r4 = o4.EnumC4125A.f46418O
            if (r3 != r4) goto L3c
            o4.z r3 = r2.getMeta()
            if (r3 == 0) goto L39
            java.lang.Boolean r3 = r3.getCompact()
            goto L3a
        L39:
            r3 = r0
        L3a:
            if (r3 == 0) goto L5c
        L3c:
            o4.A r3 = r2.getType()
            o4.A r4 = o4.EnumC4125A.f46417N
            if (r3 == r4) goto L5c
            o4.A r3 = r2.getType()
            o4.A r4 = o4.EnumC4125A.f46416M
            if (r3 == r4) goto L5c
            o4.A r2 = r2.getType()
            o4.A r3 = o4.EnumC4125A.f46414K
            if (r2 != r3) goto L19
            long r2 = r6.probeID
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L19
        L5c:
            r0 = r1
        L5d:
            o4.y r0 = (o4.StepContent) r0
        L5f:
            if (r0 != 0) goto L63
            r7 = 1
            goto L64
        L63:
            r7 = 0
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.p.L(int):boolean");
    }

    public final void M(List<String> list, int currentStep, long probeID) {
        C3862t.g(list, "list");
        this.ingredientList.clear();
        this.ingredientList = (ArrayList) list;
        this.currentStep = currentStep;
        this.probeID = probeID;
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.ingredientList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void w(RecyclerView.G viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        String str = this.ingredientList.get(position);
        C3862t.f(str, "get(...)");
        ((a) viewHolder).b(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.G y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        h1 h1VarB = h1.b(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(h1VarB, "inflate(...)");
        ConstraintLayout rootView = h1VarB.f10135c;
        C3862t.f(rootView, "rootView");
        return new a(this, rootView, h1VarB);
    }
}
