package cm.aptoide.accountmanager;

import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV3Exception;
import cm.aptoide.p092pt.dataprovider.model.p095v3.ErrorResponse;
import cm.aptoide.p092pt.dataprovider.model.p095v3.OAuth;
import cm.aptoide.p092pt.dataprovider.p097ws.p100v3.GenericResponseV3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AccountException extends Exception {
    private String code;
    private final String error;
    private final Map<String, String> errors;

    public AccountException(List<ErrorResponse> list) {
        HashMap map = new HashMap();
        this.errors = map;
        if (list == null || list.isEmpty()) {
            this.code = null;
        } else {
            this.code = list.get(0).code;
        }
        if (list == null || list.isEmpty()) {
            this.error = null;
        } else {
            this.error = list.get(0).msg;
        }
        map.put(String.valueOf(this.error), String.valueOf(this.code));
    }

    private Map<String, String> createErrorList(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    private Map<String, String> createErrorsList(OAuth oAuth) {
        return (oAuth.getErrors() == null || oAuth.getErrors().isEmpty()) ? createErrorList(oAuth.getError(), oAuth.getErrorDescription()) : getErrorsList(oAuth.getErrors());
    }

    private Map<String, String> getErrorsList(List<ErrorResponse> list) {
        HashMap map = new HashMap();
        for (ErrorResponse errorResponse : list) {
            map.put(String.valueOf(errorResponse.code), String.valueOf(errorResponse.msg));
        }
        return map;
    }

    public String getCode() {
        return this.code;
    }

    public String getError() {
        return this.error;
    }

    public Map<String, String> getErrors() {
        return this.errors;
    }

    public boolean hasCode() {
        return this.code != null;
    }

    private Map<String, String> createErrorsList(GenericResponseV3 genericResponseV3) {
        if (genericResponseV3.getErrors() != null && !genericResponseV3.getErrors().isEmpty()) {
            return getErrorsList(genericResponseV3.getErrors());
        }
        return createErrorList(genericResponseV3.getError(), genericResponseV3.getErrorDescription());
    }

    public AccountException(AptoideWsV3Exception aptoideWsV3Exception) {
        this.error = aptoideWsV3Exception.getBaseResponse().getError();
        this.errors = createErrorsList(aptoideWsV3Exception.getBaseResponse());
    }

    public AccountException(OAuth oAuth) {
        this.error = oAuth.getError();
        this.errors = createErrorsList(oAuth);
    }
}
