package cm.aptoide.p092pt;

import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesCaptionBackgroundPainterFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCaptionBackgroundPainterFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesCaptionBackgroundPainterFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesCaptionBackgroundPainterFactory(applicationModule);
    }

    public static CaptionBackgroundPainter providesCaptionBackgroundPainter(ApplicationModule applicationModule) {
        return (CaptionBackgroundPainter) C9055b.m29112c(applicationModule.providesCaptionBackgroundPainter());
    }

    @Override // javax.inject.Provider
    public CaptionBackgroundPainter get() {
        return providesCaptionBackgroundPainter(this.module);
    }
}
