package s1;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import s1.O;

/* compiled from: SoftwareKeyboardControllerCompat.java */
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private final c f49068a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SoftwareKeyboardControllerCompat.java */
    static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final View f49069a;

        a(View view) {
            this.f49069a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // s1.O.c
        void a() {
            final View viewFindViewById = this.f49069a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f49069a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: s1.N
                @Override // java.lang.Runnable
                public final void run() {
                    O.a.c(viewFindViewById);
                }
            });
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    private static class c {
        c() {
        }

        void a() {
            throw null;
        }
    }

    public O(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f49068a = new b(view);
        } else {
            this.f49068a = new a(view);
        }
    }

    public void a() {
        this.f49068a.a();
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    private static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private View f49070b;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsetsController f49071c;

        b(View view) {
            super(view);
            this.f49070b = view;
        }

        @Override // s1.O.a, s1.O.c
        void a() {
            View view = this.f49070b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f49071c;
            if (windowInsetsController == null) {
                View view2 = this.f49070b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.a();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f49071c = windowInsetsController;
        }
    }

    @Deprecated
    O(WindowInsetsController windowInsetsController) {
        this.f49068a = new b(windowInsetsController);
    }
}
