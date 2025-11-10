package com.apptionlabs.meater_app.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.apptionlabs.meater_app.activities.WebViewActivity;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.versions.DeviceJson;
import i6.HelpUserData;
import java.util.ArrayList;
import kotlin.Metadata;
import lm.b;

/* compiled from: NeedHelpPrompt.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/apptionlabs/meater_app/views/e1;", "", "Landroid/app/Activity;", "activity", "", "body", "Lih/u;", "d", "articleLinkPage", "activityName", "a", "Landroid/view/View;", "view", "c", "Li6/c;", "articleLink", "b", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "Landroid/view/animation/Animation;", "needHelpSlideAnimation", "Landroid/content/Context;", "context", "helpButtonView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Animation needHelpSlideAnimation;

    public e1(Context context, View view) {
        wh.m.f(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(context, 2130772020);
        loadAnimation.setAnimationListener(new a(view, context));
        this.needHelpSlideAnimation = loadAnimation;
    }

    private final String a(String articleLinkPage, String activityName) {
        String str;
        MEATERCloudAccount k10;
        ArrayList<i6.a> b10 = new f8.i().b();
        wh.m.e(b10, "getDevices(...)");
        DeviceJson deviceJson = new DeviceJson();
        w7.a u10 = com.apptionlabs.meater_app.app.a.u();
        if (u10 != null && (k10 = u10.k()) != null) {
            str = k10.email;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String userUnitString = Temperature.getUserUnitString();
        wh.m.e(userUnitString, "getUserUnitString(...)");
        return new HelpUserData(articleLinkPage, activityName, b10, deviceJson, str, userUnitString).a();
    }

    private final void d(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", i6.c.f14113t);
        intent.putExtra(WebViewActivity.c.BODY.name(), str);
        intent.putExtra(WebViewActivity.c.IS_POST_METHOD.name(), true);
        intent.putExtra(WebViewActivity.c.OFFER_REQUEST.name(), false);
        activity.startActivityForResult(intent, lm.a.HELP_SCREEN.i());
    }

    public final void b(i6.c cVar, Activity activity) {
        wh.m.f(cVar, "articleLink");
        wh.m.f(activity, "activity");
        lm.b.k(lm.b.f17297a.c(cVar), b.a.f17298r.title, b.c.f17374v.title, null, 8, null);
        String page = cVar.getPage();
        String localClassName = activity.getLocalClassName();
        wh.m.e(localClassName, "getLocalClassName(...)");
        d(activity, a(page, localClassName));
    }

    /* compiled from: NeedHelpPrompt.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/apptionlabs/meater_app/views/e1$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Lih/u;", "onAnimationRepeat", "onAnimationStart", "onAnimationEnd", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10525a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f10526b;

        a(View view, Context context) {
            this.f10525a = view;
            this.f10526b = context;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            View view = this.f10525a;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f10525a;
            if (view2 != null) {
                view2.startAnimation(AnimationUtils.loadAnimation(this.f10526b, 2130772030));
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public final void c(View view) {
    }
}
