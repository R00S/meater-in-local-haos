package cm.aptoide.p092pt.utils.design;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.logger.Logger;
import com.google.android.material.snackbar.Snackbar;
import p456rx.C11231b;
import p456rx.InterfaceC11232c;

@Deprecated
/* loaded from: classes.dex */
public class ShowMessage {
    private static final String TAG = "ShowMessage";

    public static C11231b asLongObservableSnack(Activity activity, int i2) {
        return asSnackObservableInternal(asLongSnackInternal(activity, i2));
    }

    public static void asLongSnack(Activity activity, String str) {
        asSnackInternal(activity, str, 0).mo24744P();
    }

    private static Snackbar asLongSnackInternal(View view, String str) {
        return Snackbar.m24764a0(view, str, 0);
    }

    public static C11231b asObservableSnack(View view, String str, String str2, View.OnClickListener onClickListener) {
        return asSnackObservableInternal(asSnackInternal(view, str, str2, onClickListener, -1));
    }

    public static void asSnack(View view, String str, String str2, View.OnClickListener onClickListener, int i2) {
        asSnackInternal(view, str, str2, onClickListener, i2).mo24744P();
    }

    public static void asSnackIndefiniteTime(Activity activity, String str, int i2, View.OnClickListener onClickListener) {
        Snackbar snackbarAsSnackInternal = asSnackInternal(activity, str, i2, onClickListener, -2);
        if (snackbarAsSnackInternal != null) {
            snackbarAsSnackInternal.mo24744P();
        }
    }

    private static Snackbar asSnackInternal(View view, String str, String str2, View.OnClickListener onClickListener, int i2) {
        return Snackbar.m24764a0(view, str, i2).m24766c0(str2, onClickListener);
    }

    private static C11231b asSnackObservableInternal(final Snackbar snackbar) {
        return C11231b.m39948h(new C11231b.w() { // from class: cm.aptoide.pt.utils.design.ShowMessage.1
            @Override // p456rx.p460m.InterfaceC11253b
            public void call(final InterfaceC11232c interfaceC11232c) {
                snackbar.m24746p(new Snackbar.C8058b() { // from class: cm.aptoide.pt.utils.design.ShowMessage.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.android.material.snackbar.Snackbar.C8058b, com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC8052r
                    public void onDismissed(Snackbar snackbar2, int i2) {
                        super.onDismissed(snackbar2, i2);
                        snackbar2.m24741K(this);
                        interfaceC11232c.onCompleted();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.android.material.snackbar.Snackbar.C8058b, com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC8052r
                    public void onShown(Snackbar snackbar2) {
                        super.onShown(snackbar2);
                    }
                });
                snackbar.mo24744P();
            }
        });
    }

    @Deprecated
    public static void asToast(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    private static View getViewFromActivity(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = activity.findViewById(R.id.content);
        }
        if (currentFocus != null) {
            return currentFocus;
        }
        Logger.getInstance().m8279e(TAG, (Throwable) new IllegalStateException("Unable to find a view to bind this snack too"));
        return null;
    }

    public static C11231b asLongObservableSnack(View view, int i2) {
        return asSnackObservableInternal(asLongSnackInternal(view, i2));
    }

    public static void asLongSnack(Fragment fragment, String str) {
        asLongSnackInternal(fragment, str).mo24744P();
    }

    private static Snackbar asLongSnackInternal(View view, int i2) {
        return Snackbar.m24763Z(view, i2, 0);
    }

    public static void asSnack(View view, String str) {
        asSnackInternal(view, str).mo24744P();
    }

    public static C11231b asLongObservableSnack(View view, String str) {
        return asSnackObservableInternal(asLongSnackInternal(view, str));
    }

    public static void asLongSnack(Fragment fragment, int i2) {
        asLongSnackInternal(fragment, i2).mo24744P();
    }

    private static Snackbar asLongSnackInternal(Fragment fragment, int i2) {
        return asLongSnackInternal(fragment.getView(), i2);
    }

    public static C11231b asObservableSnack(View view, String str) {
        return asSnackObservableInternal(asSnackInternal(view, str));
    }

    public static void asSnack(View view, int i2, int i3, View.OnClickListener onClickListener) {
        asSnackInternal(view, i2, i3, onClickListener).mo24744P();
    }

    private static Snackbar asSnackInternal(View view, String str) {
        return Snackbar.m24764a0(view, str, -1);
    }

    @Deprecated
    public static void asToast(Context context, int i2) {
        Toast.makeText(context, i2, 0).show();
    }

    public static C11231b asLongObservableSnack(Fragment fragment, int i2) {
        return asSnackObservableInternal(asLongSnackInternal(fragment, i2));
    }

    private static Snackbar asLongSnackInternal(Fragment fragment, String str) {
        return asLongSnackInternal(fragment.getView(), str);
    }

    public static C11231b asObservableSnack(View view, int i2, int i3, View.OnClickListener onClickListener) {
        return asSnackObservableInternal(asSnackInternal(view, i2, i3, onClickListener));
    }

    public static void asSnack(View view, int i2) {
        asSnackInternal(view, i2).mo24744P();
    }

    private static Snackbar asSnackInternal(View view, int i2, int i3, View.OnClickListener onClickListener) {
        return Snackbar.m24763Z(view, i2, -1).m24765b0(i3, onClickListener);
    }

    private static Snackbar asLongSnackInternal(Activity activity, int i2) {
        return asLongSnackInternal(getViewFromActivity(activity), i2);
    }

    public static C11231b asObservableSnack(View view, int i2) {
        return asSnackObservableInternal(asSnackInternal(view, i2));
    }

    public static void asSnack(Activity activity, String str) {
        asSnackInternal(activity, str).mo24744P();
    }

    public static C11231b asObservableSnack(Activity activity, String str) {
        return asSnackObservableInternal(asSnackInternal(activity, str));
    }

    public static void asSnack(Activity activity, int i2) {
        asSnackInternal(activity, i2).mo24744P();
    }

    private static Snackbar asSnackInternal(View view, int i2) {
        return Snackbar.m24763Z(view, i2, -1);
    }

    public static C11231b asObservableSnack(Activity activity, int i2) {
        return asSnackObservableInternal(asSnackInternal(activity, i2));
    }

    public static void asSnack(Fragment fragment, String str) {
        asSnackInternal(fragment, str).mo24744P();
    }

    private static Snackbar asSnackInternal(Activity activity, String str, int i2) {
        return Snackbar.m24764a0(getViewFromActivity(activity), str, i2);
    }

    public static C11231b asObservableSnack(Fragment fragment, String str) {
        return asSnackObservableInternal(asSnackInternal(fragment, str));
    }

    public static void asSnack(Fragment fragment, int i2) {
        asSnackInternal(fragment, i2).mo24744P();
    }

    public static C11231b asObservableSnack(Fragment fragment, int i2) {
        return asSnackObservableInternal(asSnackInternal(fragment, i2));
    }

    public static void asSnack(Activity activity, int i2, int i3, View.OnClickListener onClickListener, int i4) {
        Snackbar snackbarAsSnackInternal = asSnackInternal(activity, i2, i3, onClickListener, i4);
        if (snackbarAsSnackInternal != null) {
            snackbarAsSnackInternal.mo24744P();
        }
    }

    private static Snackbar asSnackInternal(Activity activity, String str) {
        return asSnackInternal(activity, str, -1);
    }

    public static C11231b asObservableSnack(Activity activity, int i2, int i3, View.OnClickListener onClickListener) {
        Snackbar snackbarAsSnackInternal = asSnackInternal(activity, i2, i3, onClickListener, -1);
        if (snackbarAsSnackInternal != null) {
            return asSnackObservableInternal(snackbarAsSnackInternal);
        }
        return C11231b.m39951s(new IllegalStateException("Extracted view from activity is null"));
    }

    private static Snackbar asSnackInternal(Activity activity, int i2) {
        return Snackbar.m24763Z(getViewFromActivity(activity), i2, -1);
    }

    public static void asSnack(android.app.Fragment fragment, int i2) {
        asSnackInternal(fragment, i2).mo24744P();
    }

    private static Snackbar asSnackInternal(Fragment fragment, String str) {
        return Snackbar.m24764a0(fragment.getView(), str, -1);
    }

    public static C11231b asObservableSnack(android.app.Fragment fragment, int i2) {
        return asSnackObservableInternal(asSnackInternal(fragment, i2));
    }

    private static Snackbar asSnackInternal(Fragment fragment, int i2) {
        return Snackbar.m24763Z(fragment.getView(), i2, -1);
    }

    private static Snackbar asSnackInternal(Activity activity, String str, int i2, View.OnClickListener onClickListener, int i3) {
        View viewFromActivity = getViewFromActivity(activity);
        if (viewFromActivity == null) {
            return null;
        }
        return Snackbar.m24764a0(viewFromActivity, str, i3).m24765b0(i2, onClickListener);
    }

    private static Snackbar asSnackInternal(Activity activity, int i2, int i3, View.OnClickListener onClickListener, int i4) {
        View viewFromActivity = getViewFromActivity(activity);
        if (viewFromActivity == null) {
            return null;
        }
        return Snackbar.m24763Z(viewFromActivity, i2, i4).m24765b0(i3, onClickListener);
    }

    @TargetApi(11)
    private static Snackbar asSnackInternal(android.app.Fragment fragment, int i2) {
        return Snackbar.m24763Z(fragment.getView(), i2, -1);
    }
}
