package cm.aptoide.p092pt.view.feedback;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.core.content.FileProvider;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.fragment.BaseToolbarFragment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.InterfaceC11246k;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class SendFeedbackFragment extends BaseToolbarFragment implements NotBottomNavigationView {
    private static final String CARD_ID = "card_id";
    public static final String LOGS_FILE_NAME = "logs.txt";
    public static final String SCREENSHOT_PATH = "SCREENSHOT_PATH";
    private final String KEY_SCREENSHOT_PATH = "screenShotPath";

    @Inject
    AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private NavigationTracker aptoideNavigationTracker;
    private String cardId;
    private CrashReport crashReport;
    private CheckBox logsAndScreenshotsCb;
    private EditText messageBodyEdit;
    private String screenShotPath;
    private Button sendFeedbackBtn;
    private EditText subgectEdit;
    private InterfaceC11246k unManagedSubscription;

    private Uri getUriFromFile(File file) {
        return Build.VERSION.SDK_INT > 23 ? FileProvider.m1666e(getContext(), "cm.aptoide.pt.provider", file) : Uri.fromFile(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendFeedback$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8986e(Intent intent, String str, RoomInstalled roomInstalled) throws IOException {
        intent.putExtra("android.intent.extra.SUBJECT", "[Feedback]-" + (roomInstalled != null ? roomInstalled.getVersionName() : HttpUrl.FRAGMENT_ENCODE_SET) + ": " + this.subgectEdit.getText().toString());
        intent.putExtra("android.intent.extra.TEXT", this.messageBodyEdit.getText().toString());
        if (this.logsAndScreenshotsCb.isChecked()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (this.screenShotPath != null) {
                arrayList.add(getUriFromFile(new File(this.screenShotPath)));
            }
            String prettyScreenHistory = this.cardId;
            if (prettyScreenHistory == null) {
                prettyScreenHistory = this.aptoideNavigationTracker.getPrettyScreenHistory();
            }
            File logs = AptoideUtils.SystemU.readLogs(str, LOGS_FILE_NAME, prettyScreenHistory);
            if (logs != null) {
                arrayList.add(getUriFromFile(logs));
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        try {
            getActivity().getSupportFragmentManager().m3493m().mo3554p(this).mo3548i();
            startActivity(intent);
            getActivity().onBackPressed();
        } catch (ActivityNotFoundException unused) {
            ShowMessage.asSnack(getView(), C1146R.string.feedback_no_email);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendFeedback$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8987f(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupViews$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8988g(Void r1) {
        sendFeedback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupViews$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8989h(Throwable th) {
        this.crashReport.log(th);
    }

    public static SendFeedbackFragment newInstance(String str) {
        SendFeedbackFragment sendFeedbackFragment = new SendFeedbackFragment();
        Bundle bundle = new Bundle();
        bundle.putString(SCREENSHOT_PATH, str);
        sendFeedbackFragment.setArguments(bundle);
        return sendFeedbackFragment;
    }

    private void sendFeedback() {
        if (!isContentValid()) {
            ShowMessage.asSnack(getView(), C1146R.string.feedback_not_valid);
            return;
        }
        final Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{((AptoideApplication) getContext().getApplicationContext()).getFeedbackEmail()});
        final String path = getContext().getApplicationContext().getCacheDir().getPath();
        this.unManagedSubscription = this.aptoideInstalledAppsRepository.getInstalled(getContext().getPackageName()).m40057E().m40095j0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.feedback.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) throws IOException {
                this.f11833f.m8986e(intent, path, (RoomInstalled) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.feedback.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11832f.m8987f((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        this.subgectEdit = (EditText) view.findViewById(C1146R.id.FeedBackSubject);
        this.messageBodyEdit = (EditText) view.findViewById(C1146R.id.FeedBacktext);
        this.sendFeedbackBtn = (Button) view.findViewById(C1146R.id.FeedBackSendButton);
        this.logsAndScreenshotsCb = (CheckBox) view.findViewById(C1146R.id.FeedBackCheckBox);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.activity_feed_back;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    public boolean isContentValid() {
        return !TextUtils.isEmpty(this.subgectEdit.getText().toString());
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.aptoideNavigationTracker = ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker();
        this.crashReport = CrashReport.getInstance();
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC11246k interfaceC11246k = this.unManagedSubscription;
        if (interfaceC11246k != null) {
            interfaceC11246k.unsubscribe();
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("screenShotPath", this.screenShotPath);
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.screenShotPath = bundle.getString("screenShotPath");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
        this.screenShotPath = bundle.getString(SCREENSHOT_PATH);
        this.cardId = bundle.getString(CARD_ID);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() {
        super.setupViews();
        C8975a.m28573a(this.sendFeedbackBtn).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.feedback.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11836f.m8988g((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.feedback.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11837f.m8989h((Throwable) obj);
            }
        });
    }

    public static SendFeedbackFragment newInstance() {
        return new SendFeedbackFragment();
    }

    public static SendFeedbackFragment newInstance(String str, String str2) {
        SendFeedbackFragment sendFeedbackFragment = new SendFeedbackFragment();
        Bundle bundle = new Bundle();
        bundle.putString(SCREENSHOT_PATH, str);
        bundle.putString(CARD_ID, str2);
        sendFeedbackFragment.setArguments(bundle);
        return sendFeedbackFragment;
    }
}
