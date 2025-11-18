package cm.aptoide.p092pt.view.fragment;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.FragmentResultNavigator;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.util.ScreenTrackingUtils;
import cm.aptoide.p092pt.view.BaseFragment;
import com.trello.rxlifecycle.C8757c;
import com.trello.rxlifecycle.InterfaceC8756b;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public abstract class FragmentView extends BaseFragment implements View {
    private static final String TAG = FragmentView.class.getName();
    private ActivityResultNavigator activityResultNavigator;
    private boolean startActivityForResultCalled;

    /* renamed from: cm.aptoide.pt.view.fragment.FragmentView$1 */
    static /* synthetic */ class C48141 {
        static final /* synthetic */ int[] $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent;

        static {
            int[] iArr = new int[EnumC8762b.values().length];
            $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent = iArr;
            try {
                iArr[EnumC8762b.ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.CREATE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.DESTROY_VIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.DETACH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.DESTROY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToEvent, reason: merged with bridge method [inline-methods] */
    public C11234e<View.LifecycleEvent> m8993d(EnumC8762b enumC8762b) {
        switch (C48141.$SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[enumC8762b.ordinal()]) {
            case 1:
            case 2:
                return C11234e.m40016B();
            case 3:
                return C11234e.m40025S(View.LifecycleEvent.CREATE);
            case 4:
                return C11234e.m40025S(View.LifecycleEvent.START);
            case 5:
                return C11234e.m40025S(View.LifecycleEvent.RESUME);
            case 6:
                return C11234e.m40025S(View.LifecycleEvent.PAUSE);
            case 7:
                return C11234e.m40025S(View.LifecycleEvent.STOP);
            case 8:
                return C11234e.m40025S(View.LifecycleEvent.DESTROY);
            case 9:
            case 10:
                return C11234e.m40016B();
            default:
                throw new IllegalStateException("Unrecognized event: " + enumC8762b.name());
        }
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public void attachPresenter(Presenter presenter) {
        presenter.present();
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public final <T> InterfaceC8756b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return C8757c.m27898b(getLifecycleEvent(), lifecycleEvent);
    }

    public ActivityNavigator getActivityNavigator() {
        return this.activityResultNavigator.getActivityNavigator();
    }

    public FragmentNavigator getFragmentChildNavigator(int i2) {
        return new FragmentResultNavigator(getChildFragmentManager(), i2, R.anim.fade_in, R.anim.fade_out, this.activityResultNavigator.getFragmentResultMap(), this.activityResultNavigator.getFragmentResultRelay());
    }

    public FragmentNavigator getFragmentNavigator() {
        return this.activityResultNavigator.getFragmentNavigator();
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public C11234e<View.LifecycleEvent> getLifecycleEvent() {
        return lifecycle().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.fragment.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11841f.m8993d((EnumC8762b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hideKeyboard() {
        ActivityC0468d activity = getActivity();
        android.view.View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    public boolean isStartActivityForResultCalled() {
        return this.startActivityForResultCalled;
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.activityResultNavigator = (ActivityResultNavigator) activity;
        } catch (ClassCastException unused) {
            Logger.getInstance().m8277e(TAG, String.format("Parent activity must implement %s interface", ActivityResultNavigator.class.getName()));
        }
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ScreenTrackingUtils.getInstance().incrementNumberOfScreens();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ScreenTrackingUtils.getInstance().decrementNumberOfScreens();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (getFragmentNavigator().popBackStack()) {
            return true;
        }
        getActivityNavigator().navigateBack();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            ScreenTrackingUtils.getInstance().addScreenToHistory(getClass().getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivityForResult(Intent intent, int i2) {
        this.startActivityForResultCalled = true;
        super.startActivityForResult(intent, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        this.startActivityForResultCalled = true;
        super.startActivityForResult(intent, i2, bundle);
    }
}
