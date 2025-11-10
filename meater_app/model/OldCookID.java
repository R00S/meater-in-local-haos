package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.LocalStorage;

/* loaded from: /tmp/meat/meat/classes.dex */
public class OldCookID {
    public long cookId;
    public int sequenceNumber;

    public static boolean isOldCookID(long j10) {
        if (LocalStorage.sharedStorage().oldCookIDDAO().d(j10) != null) {
            return true;
        }
        return false;
    }

    public static boolean isOldCookIDAndSeqNum(long j10, int i10) {
        if (LocalStorage.sharedStorage().oldCookIDDAO().b(j10, i10) != null) {
            return true;
        }
        return false;
    }

    public static void recordCookIDWithSeqNum(long j10, int i10) {
        OldCookID oldCookID = new OldCookID();
        oldCookID.setCookId(j10);
        oldCookID.setSequenceNumber(i10);
        LocalStorage.sharedStorage().oldCookIDDAO().c(oldCookID);
    }

    private void setCookId(long j10) {
        this.cookId = j10;
    }

    private void setSequenceNumber(int i10) {
        this.sequenceNumber = i10;
    }

    public long getCookId() {
        return this.cookId;
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }
}
