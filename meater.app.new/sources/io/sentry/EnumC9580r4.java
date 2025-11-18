package io.sentry;

import io.sentry.clientreport.C9398b;
import io.sentry.protocol.C9565x;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryItemType.java */
@ApiStatus.Internal
/* renamed from: io.sentry.r4 */
/* loaded from: classes2.dex */
public enum EnumC9580r4 implements InterfaceC9578r2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    CheckIn("check_in"),
    Unknown("__unknown__");

    private final String itemType;

    /* compiled from: SentryItemType.java */
    /* renamed from: io.sentry.r4$a */
    static final class a implements InterfaceC9504l2<EnumC9580r4> {
        a() {
        }

        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC9580r4 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            return EnumC9580r4.valueOfLabel(c9518n2.m31881J().toLowerCase(Locale.ROOT));
        }
    }

    EnumC9580r4(String str) {
        this.itemType = str;
    }

    public static EnumC9580r4 resolve(Object obj) {
        return obj instanceof C9506l4 ? Event : obj instanceof C9565x ? Transaction : obj instanceof C9422d5 ? Session : obj instanceof C9398b ? ClientReport : Attachment;
    }

    public static EnumC9580r4 valueOfLabel(String str) {
        for (EnumC9580r4 enumC9580r4 : values()) {
            if (enumC9580r4.itemType.equals(str)) {
                return enumC9580r4;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30819b(this.itemType);
    }
}
