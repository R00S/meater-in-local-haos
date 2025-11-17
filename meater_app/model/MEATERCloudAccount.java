package com.apptionlabs.meater_app.model;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERCloudAccount {
    public String accessToken;
    public String email;
    public String name;
    public String password;
    public AccountType type;

    /* renamed from: com.apptionlabs.meater_app.model.MEATERCloudAccount$1, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$model$MEATERCloudAccount$AccountType;

        static {
            int[] iArr = new int[AccountType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$model$MEATERCloudAccount$AccountType = iArr;
            try {
                iArr[AccountType.Facebook.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERCloudAccount$AccountType[AccountType.Google.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum AccountType {
        EmailAndPassword,
        Facebook,
        Google
    }

    public String passwordForConnection() {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$model$MEATERCloudAccount$AccountType[this.type.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return this.password;
            }
            return "==google-token==" + this.password;
        }
        return "==facebook-token==" + this.password;
    }
}
