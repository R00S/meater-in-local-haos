package cm.aptoide.p092pt;

import java.text.DecimalFormat;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDecimalFormatFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDecimalFormatFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDecimalFormatFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDecimalFormatFactory(applicationModule);
    }

    public static DecimalFormat providesDecimalFormat(ApplicationModule applicationModule) {
        return (DecimalFormat) C9055b.m29112c(applicationModule.providesDecimalFormat());
    }

    @Override // javax.inject.Provider
    public DecimalFormat get() {
        return providesDecimalFormat(this.module);
    }
}
