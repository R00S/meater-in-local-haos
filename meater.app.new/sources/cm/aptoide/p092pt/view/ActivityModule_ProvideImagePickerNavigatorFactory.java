package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.ImagePickerNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideImagePickerNavigatorFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvideImagePickerNavigatorFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideImagePickerNavigatorFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideImagePickerNavigatorFactory(activityModule);
    }

    public static ImagePickerNavigator provideImagePickerNavigator(ActivityModule activityModule) {
        return (ImagePickerNavigator) C9055b.m29112c(activityModule.provideImagePickerNavigator());
    }

    @Override // javax.inject.Provider
    public ImagePickerNavigator get() {
        return provideImagePickerNavigator(this.module);
    }
}
