package cm.aptoide.p092pt.view.wizard;

import android.R;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.viewpager.widget.ViewPager;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.view.LoginBottomSheet;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.custom.AptoideViewPager;
import cm.aptoide.p092pt.view.fragment.NavigationTrackFragment;
import cm.aptoide.p092pt.view.fragment.UIComponentFragment;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class WizardFragment extends UIComponentFragment implements WizardView, NotBottomNavigationView {
    public static final int LAYOUT = 2131493045;
    private static final String PAGE_INDEX = "page_index";
    private View animatedColorView;
    private int currentPosition;
    private boolean isInPortraitMode;
    private boolean isUserLoggedIn;
    private LoginBottomSheet loginBottomSheet;
    private ViewPager.C0692m pageChangeListener;
    private RadioGroup radioGroup;
    private Runnable registerViewpagerCurrentItem;
    private View skipButton;
    private View skipOrNextLayout;
    private Integer[] transitionColors;
    private AptoideViewPager viewPager;
    private WizardPagerAdapter viewPagerAdapter;
    private List<RadioButton> wizardButtons;

    @Inject
    WizardFragmentProvider wizardFragmentProvider;

    @Inject
    WizardPresenter wizardPresenter;

    private void createRadioButtons() {
        int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(10, getResources());
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(pixelsForDip, pixelsForDip);
        int pixelsForDip2 = AptoideUtils.ScreenU.getPixelsForDip(2, getResources());
        layoutParams.setMargins(pixelsForDip2, pixelsForDip2, pixelsForDip2, pixelsForDip2);
        int count = this.viewPagerAdapter.getCount();
        this.wizardButtons = new ArrayList(count);
        Context context = getContext();
        for (int i2 = 0; i2 < count; i2++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setLayoutParams(layoutParams);
            radioButton.setButtonDrawable(R.color.transparent);
            radioButton.setBackgroundResource(C1146R.drawable.wizard_custom_indicator);
            radioButton.setClickable(false);
            this.radioGroup.addView(radioButton);
            this.wizardButtons.add(radioButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createWizardAdapter$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9115e(boolean z) throws Resources.NotFoundException {
        this.viewPagerAdapter = new WizardPagerAdapter(getChildFragmentManager(), Boolean.valueOf(z), this.wizardFragmentProvider);
        createRadioButtons();
        this.viewPager.setAdapter(this.viewPagerAdapter);
        this.viewPager.setCurrentItem(this.currentPosition);
        handleSelectedPage(this.currentPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupViews$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9116f(LoginBottomSheet.State state) {
        if (this.isInPortraitMode && LoginBottomSheet.State.EXPANDED.equals(state)) {
            this.skipOrNextLayout.setVisibility(8);
        } else if (LoginBottomSheet.State.COLLAPSED.equals(state)) {
            this.skipOrNextLayout.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupViews$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9117g() {
        AptoideViewPager aptoideViewPager = this.viewPager;
        if (aptoideViewPager != null) {
            this.pageChangeListener.onPageSelected(aptoideViewPager.getCurrentItem());
        }
    }

    public static WizardFragment newInstance() {
        return new WizardFragment();
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        this.viewPager = (AptoideViewPager) view.findViewById(C1146R.id.view_pager);
        this.skipOrNextLayout = view.findViewById(C1146R.id.skip_next_layout);
        this.radioGroup = (RadioGroup) view.findViewById(C1146R.id.view_pager_radio_group);
        this.skipButton = view.findViewById(C1146R.id.skip_button);
        this.isInPortraitMode = getActivity().getResources().getConfiguration().orientation == 1;
        this.animatedColorView = view.findViewById(C1146R.id.animated_color_view);
    }

    @Override // cm.aptoide.p092pt.view.wizard.WizardView
    public C11231b createWizardAdapter(final boolean z) {
        this.isUserLoggedIn = z;
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.wizard.b
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() throws Resources.NotFoundException {
                this.f12093f.m9115e(z);
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.fragment_wizard;
    }

    @Override // cm.aptoide.p092pt.view.wizard.WizardView
    public int getCount() {
        return this.wizardFragmentProvider.getCount(Boolean.valueOf(this.isUserLoggedIn));
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.wizard.WizardView
    public void handleColorTransitions(int i2, float f2, int i3) {
        if (this.animatedColorView != null) {
            if (i2 < this.viewPagerAdapter.getCount() - 1 && i2 < this.transitionColors.length - 1) {
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                Integer[] numArr = this.transitionColors;
                this.animatedColorView.setBackgroundColor(((Integer) argbEvaluator.evaluate(f2, numArr[i2], numArr[i2 + 1])).intValue());
                return;
            }
            if (this.viewPagerAdapter.isLoggedIn()) {
                this.animatedColorView.setBackgroundColor(this.transitionColors[r4.length - 2].intValue());
            } else {
                this.animatedColorView.setBackgroundColor(this.transitionColors[r4.length - 1].intValue());
            }
        }
    }

    @Override // cm.aptoide.p092pt.view.wizard.WizardView
    public void handleSelectedPage(int i2) {
        RadioButton radioButton;
        List<RadioButton> list = this.wizardButtons;
        if (list == null || i2 >= list.size() || (radioButton = this.wizardButtons.get(i2)) == null) {
            return;
        }
        radioButton.setChecked(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.currentPosition = 0;
        if (bundle != null) {
            this.currentPosition = bundle.getInt(PAGE_INDEX, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cm.aptoide.p092pt.view.BackButtonFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof LoginBottomSheet) {
            this.loginBottomSheet = (LoginBottomSheet) context;
            return;
        }
        throw new IllegalStateException("Context should implement " + LoginBottomSheet.class.getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        Integer[] transitionColors = this.wizardFragmentProvider.getTransitionColors();
        this.transitionColors = new Integer[transitionColors.length];
        for (int i2 = 0; i2 < transitionColors.length; i2++) {
            this.transitionColors[i2] = Integer.valueOf(getContext().getResources().getColor(transitionColors[i2].intValue()));
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() throws Resources.NotFoundException {
        this.viewPager.removeOnPageChangeListener(this.pageChangeListener);
        this.viewPager.setAdapter(null);
        this.viewPager.removeCallbacks(this.registerViewpagerCurrentItem);
        this.viewPager.removeOnPageChangeListener(null);
        this.registerViewpagerCurrentItem = null;
        this.viewPager = null;
        this.skipOrNextLayout = null;
        this.wizardButtons = null;
        this.radioGroup = null;
        this.skipButton = null;
        this.animatedColorView = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AptoideViewPager aptoideViewPager = this.viewPager;
        if (aptoideViewPager != null) {
            bundle.putInt(PAGE_INDEX, aptoideViewPager.getCurrentItem());
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        attachPresenter(this.wizardPresenter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        loadExtras(bundle);
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() {
        this.loginBottomSheet.state().m40095j0(C11250a.m40156b()).m40091f(bindUntilEvent(EnumC8762b.DESTROY_VIEW)).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.wizard.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12092f.m9116f((LoginBottomSheet.State) obj);
            }
        });
        this.pageChangeListener = new ViewPager.C0692m() { // from class: cm.aptoide.pt.view.wizard.WizardFragment.1
            @Override // androidx.viewpager.widget.ViewPager.C0692m, androidx.viewpager.widget.ViewPager.InterfaceC0689j
            public void onPageSelected(int i2) {
                if (i2 == 0) {
                    ((NavigationTrackFragment) WizardFragment.this).navigationTracker.registerScreen(ScreenTagHistory.Builder.build(WizardPageOneFragment.class.getSimpleName(), "0"));
                }
            }
        };
        this.viewPager.addOnPageChangeListener(this.wizardPresenter);
        this.viewPager.addOnPageChangeListener(this.pageChangeListener);
        Runnable runnable = new Runnable() { // from class: cm.aptoide.pt.view.wizard.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f12095f.m9117g();
            }
        };
        this.registerViewpagerCurrentItem = runnable;
        this.viewPager.post(runnable);
    }

    @Override // cm.aptoide.p092pt.view.wizard.WizardView
    public void skipWizard() {
        getActivity().onBackPressed();
    }

    @Override // cm.aptoide.p092pt.view.wizard.WizardView
    public C11234e<Void> skipWizardClick() {
        return C8975a.m28573a(this.skipButton);
    }
}
