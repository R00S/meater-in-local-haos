package cm.aptoide.accountmanager;

import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface AdultContent {
    C11231b disable(boolean z);

    C11231b enable(int i2);

    C11231b enable(boolean z);

    C11234e<Boolean> enabled();

    C11234e<Boolean> pinRequired();

    C11231b removePin(int i2);

    C11231b requirePin(int i2);
}
