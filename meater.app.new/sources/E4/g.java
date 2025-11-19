package E4;

/* compiled from: MEATERCloudErrorCode.java */
/* loaded from: classes.dex */
public enum g {
    BAD_CREDENTIALS(1),
    INVALID_TOKEN(2),
    USER_ALREADY_EXISTS(3),
    BAD_PARAMETERS(4),
    NO_ACCOUNT(5),
    DISALLOWED_PASSWORD(6),
    TOO_MANY_REQUESTS(7),
    MUST_AGREE_TO_UPDATED_TERMS_AND_CONDITIONS(8),
    APP_UPDATE_NEEDED(9),
    USER_MUST_ADD_PASSWORD(10),
    INTERNAL_ERROR(1000),
    NOT_IMPLEMENTED_YET(1001);


    /* renamed from: B, reason: collision with root package name */
    private final int f3890B;

    g(int i10) {
        this.f3890B = i10;
    }

    public static g j(int i10) {
        if (i10 == 1000) {
            return INTERNAL_ERROR;
        }
        if (i10 == 1001) {
            return NOT_IMPLEMENTED_YET;
        }
        switch (i10) {
            case 1:
                return BAD_CREDENTIALS;
            case 2:
                return INVALID_TOKEN;
            case 3:
                return USER_ALREADY_EXISTS;
            case 4:
                return BAD_PARAMETERS;
            case 5:
                return NO_ACCOUNT;
            case 6:
                return DISALLOWED_PASSWORD;
            case 7:
                return TOO_MANY_REQUESTS;
            case 8:
                return MUST_AGREE_TO_UPDATED_TERMS_AND_CONDITIONS;
            case 9:
                return APP_UPDATE_NEEDED;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return USER_MUST_ADD_PASSWORD;
            default:
                return null;
        }
    }

    public int n() {
        return this.f3890B;
    }
}
