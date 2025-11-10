package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.LocalStorage;

/* loaded from: /tmp/meat/meat/classes.dex */
public class PendingRequest {
    public String requestBody;
    public long requestID;
    public String requestMethod;

    static void addPendingRequest(String str, String str2) {
        PendingRequest pendingRequest = new PendingRequest();
        pendingRequest.setRequestMethod("");
        pendingRequest.setRequestBody("");
        LocalStorage.sharedStorage().pendingRequestDAO().b(pendingRequest);
    }

    private void setRequestBody(String str) {
        this.requestBody = str;
    }

    private void setRequestMethod(String str) {
        this.requestMethod = str;
    }

    public String getRequestBody() {
        return this.requestBody;
    }

    public long getRequestID() {
        return this.requestID;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }
}
