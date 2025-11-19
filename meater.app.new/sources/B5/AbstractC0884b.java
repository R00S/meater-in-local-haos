package B5;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.apptionlabs.meater_app.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import x5.EnumC5056a;

/* compiled from: BaseBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0003\u0082\u0001\b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"LB5/b;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "", "T2", "()Ljava/lang/Integer;", "", "U2", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Loa/F;", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "E2", "()I", "x1", "X0", "a", "LB5/d;", "LB5/f;", "LB5/h;", "LB5/m;", "LB5/o;", "LB5/s;", "LB5/w;", "LB5/A;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: B5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0884b extends com.google.android.material.bottomsheet.b {

    /* renamed from: Y0, reason: collision with root package name */
    private static EnumC5056a f1624Y0 = EnumC5056a.f52804F;

    /* compiled from: BaseBottomSheetDialogFragment.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: B5.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0028b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1625a;

        static {
            int[] iArr = new int[EnumC5056a.values().length];
            try {
                iArr[EnumC5056a.f52802D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5056a.f52803E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5056a.f52804F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1625a = iArr;
        }
    }

    public /* synthetic */ AbstractC0884b(C3854k c3854k) {
        this();
    }

    private final Integer T2() {
        WindowManager windowManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            F3.l lVarA = F3.l.INSTANCE.a();
            androidx.fragment.app.o oVarC2 = c2();
            C3862t.f(oVarC2, "requireActivity(...)");
            return Integer.valueOf(lVarA.a(oVarC2).a().height());
        }
        androidx.fragment.app.o oVarT = T();
        Display defaultDisplay = (oVarT == null || (windowManager = oVarT.getWindowManager()) == null) ? null : windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        if (defaultDisplay != null) {
            return Integer.valueOf(defaultDisplay.getHeight());
        }
        return null;
    }

    private final boolean U2() {
        return u0().getBoolean(R.bool.is_tablet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(AbstractC0884b abstractC0884b, DialogInterface dialogInterface) {
        C3862t.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        View viewFindViewById = aVar.findViewById(R.id.design_bottom_sheet);
        if (viewFindViewById != null) {
            if (abstractC0884b.U2()) {
                BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(viewFindViewById);
                C3862t.f(bottomSheetBehaviorQ0, "from(...)");
                viewFindViewById.setLayoutParams(viewFindViewById.getLayoutParams());
                bottomSheetBehaviorQ0.W0(3);
                bottomSheetBehaviorQ0.J0(false);
                return;
            }
            int i10 = C0028b.f1625a[f1624Y0.ordinal()];
            if (i10 == 1) {
                Integer numT2 = abstractC0884b.T2();
                if (numT2 != null) {
                    int iIntValue = numT2.intValue();
                    aVar.r().R0(iIntValue);
                    viewFindViewById.getLayoutParams().height = iIntValue;
                }
            } else if (i10 == 2) {
                aVar.r().R0(viewFindViewById.getHeight() - 150);
                viewFindViewById.getLayoutParams().height = viewFindViewById.getHeight() - 150;
            } else if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            viewFindViewById.getParent().getParent().requestLayout();
            viewFindViewById.invalidate();
        }
    }

    @Override // androidx.fragment.app.n
    public int E2() {
        return R.style.VT_BottomSheet;
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public void x1() {
        super.x1();
        Object parent = f2().getParent();
        C3862t.e(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0((View) parent);
        C3862t.f(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.W0(3);
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        Dialog dialogD2 = D2();
        if (dialogD2 != null) {
            dialogD2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: B5.a
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    AbstractC0884b.V2(this.f1622a, dialogInterface);
                }
            });
        }
    }

    private AbstractC0884b() {
    }
}
